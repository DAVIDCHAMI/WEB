package co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException;
import co.com.bancolombia.certificacion.svp.exceptions.transversal.FalloLogCanalException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException.FALLO_SESSION;
import static co.com.bancolombia.certificacion.svp.exceptions.transversal.FalloLogCanalException.FALLO_LOG_CANAL;
import static co.com.bancolombia.certificacion.svp.interactions.fabrica.Cambiar.cambiarFrame;
import static co.com.bancolombia.certificacion.svp.questions.backend.logcanal.autenticacion.VerificacionAutenticacionLogCanal.verificacionAutenticacionLogCanal;
import static co.com.bancolombia.certificacion.svp.questions.fabrica.ResultadoEsperado.elInicioDeSessionFueExitoso;
import static co.com.bancolombia.certificacion.svp.questions.fabrica.ResultadoEsperado.elInicioDeSessionFueExitoso2;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.comunes.Abrir.abrirElSitioDeLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.cargoLosDatosDeLaTransaccionConLaSiguiente;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.conLaSiguiente;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.FRAME_PRINCIPAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutenticacionStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) cargo los datos de la transaccion$")
    public void queCargoLosDatosDeLaTransaccion(String actor, List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(cargoLosDatosDeLaTransaccionConLaSiguiente(informacion));

    }

    @Cuando("^intento autenticarme utilizando mis credenciales$")
    public void intentoAutenticarmeUtilizandoMisCredenciales(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                abrirElSitioDeLaSVP(),
                conLaSiguiente(informacion),
                autenticarseEnLaSVP());

    }

    @Cuando("^intento autenticarme usando mis credenciales en el (.*)$")
    public void intentoAuteticarmeUsandoMisCredencialesEnElQA(String qa, List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                abrirElSitioDeLaSVP(qa),
                conLaSiguiente(informacion),
                autenticarseEnLaSVP());

    }

    @Entonces("^verifico el resultado de la autenticacion para inicio de session exitoso$")
    public void verificoElResultadoDeLaAutenticacionParaInicioDeSessionExitoso() {
        theActorInTheSpotlight().attemptsTo(cambiarFrame(FRAME_PRINCIPAL));
        theActorInTheSpotlight().should(seeThat(elInicioDeSessionFueExitoso()).orComplainWith(FalloAutenticacionException.class, FALLO_SESSION));
        theActorInTheSpotlight().should(seeThat(verificacionAutenticacionLogCanal()).orComplainWith(FalloLogCanalException.class, FALLO_LOG_CANAL));

    }

    @Dado("^que (.*) cargo los datos de la prueba$")
    public void queYoCargoLosDatosDeLaPrueba(String actor, List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(cargoLosDatosDeLaTransaccionConLaSiguiente(informacion));

    }

}