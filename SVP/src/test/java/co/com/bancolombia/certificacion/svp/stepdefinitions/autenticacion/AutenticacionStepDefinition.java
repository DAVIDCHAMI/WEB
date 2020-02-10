package co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.Clave.mensajeClaveBloqueada;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.Mensaje.mensajeClaveInvalida;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.MensajeUsuarioInexistente.mensajeUsuarioInexistentes;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.PantallaInicioSVP.esVisible;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.UsuarioRegistrado.mensajeUsuarioRegistrado;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionConDocumento.autenticarseConDocumentoEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionSinImagenSinFrase.autenticarseEnLaSVPSinImagen;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.RESULTADO_ESPERADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AutenticacionStepDefinition {

    @Cuando("^el realiza la autenticacion en la SVP$")
    public void elRealizaLaAutenticacionEnLaSVP() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP con numero de documento$")
    public void elRealizaLaAutenticacionEnLaSVPConNumeroDeDocumento() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseConDocumentoEnLaSVP()
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP con clave bloqueada$")
    public void elRealizaLaAutenticacionEnLaSVPConClaveBloqueada() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseConDocumentoEnLaSVP()
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP con usuario inexistente$")
    public void elRealizaLaAutenticacionEnLaSVPConUsuarioInexistente() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Entonces("^el deberia de visualizar un mensaje de Usuario o clave invalida$")
    public void elDeberiaDeVisualizarUnMensajeUsuariosClaveInvalida() {
        theActorInTheSpotlight().should(seeThat(
                mensajeUsuarioInexistentes(), equalTo(obtener(RESULTADO_ESPERADO)))
        );
    }

    @Entonces("^el deberia de ver un mensaje Usuario o clave invalida. Intentalo nuevamente$")
    public void elDeberiaDeVerUnMensajeUsuarioIntentaloNuevamente() {
        theActorInTheSpotlight().should(seeThat(
                mensajeUsuarioRegistrado(), equalTo(obtener(RESULTADO_ESPERADO)))
        );
    }

    @Entonces("^el deberia de ver la pantalla de inicio de la SVP$")
    public void elDeberiaDeVerLaPantallaDeInicioDeLaSVP() {
        theActorInTheSpotlight().should(seeThat(
                esVisible(),  equalTo((obtener(RESULTADO_ESPERADO))))
        );
    }

    @Entonces("^el deberia de ver mensaje de clave bloqueada$")
    public void elDeberiaDeVerMensajeDeClaveBloqueada() {
        theActorInTheSpotlight().should(seeThat(
                mensajeClaveBloqueada(), equalTo(obtener(RESULTADO_ESPERADO)))
        );
    }

    @Entonces("^el deberia de observar un mensaje de Usuario o clave invalida. Intentalo nuevamente$")
    public void elDeberiaDeObservarUnMensajeDeUsuarioOClaveInvalidaIntentaloNuevamente() {
        theActorInTheSpotlight().should(seeThat(
                mensajeClaveInvalida(), equalTo(obtener(RESULTADO_ESPERADO)))
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP sin imagen$")
    public void elRealizaLaAutenticacionEnLaSVPSinImagen() {
        theActorInTheSpotlight().attemptsTo(autenticarseEnLaSVPSinImagen()
        );
    }
}