package co.com.bancolombia.certificacion.svp.stepdefinitions.transferencias;

import co.com.bancolombia.certificacion.svp.exceptions.transferencias.FalloTransferenciaException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.exceptions.transferencias.FalloTransferenciaException.FALLO_TRANSFERENCIA;
import static co.com.bancolombia.certificacion.svp.questions.fabrica.ResultadoEsperado.laTransferenciaFueExitosa;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.comunes.Abrir.abrirElSitioDeLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.conLaSiguiente;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Transferencia.realizarTransferenciaEntreCuentasBancolombia;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaEntreCuentasBancolombiaStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Cuando("^realizo una transferencia entre cuentas bancolombia con la siguiente informacion$")
    public void realizoUnaTransferenciaEntreCuentasBancolombiaConLaSiguienteInformacion(List<Map<String, Object>> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                conLaSiguiente(informacion),
                realizarTransferenciaEntreCuentasBancolombia()

        );

    }

    @Cuando("^realizo una transferencia entre cuentas bancolombia$")
    public void realizoUnaTransferenciaEntreCuentasBancolombia() {
        theActorInTheSpotlight().attemptsTo(
                abrirElSitioDeLaSVP(),
                autenticarseEnLaSVP(),
                realizarTransferenciaEntreCuentasBancolombia());

    }
    @Entonces("^verifico el resultado esperado de la transferencia exitosa entre cuentas bancolombia$")
    public void verificoElResultadoEsperadoDeLaTransferenciaExitosaEntreCuentasBancolombia() {
        OnStage.theActorInTheSpotlight().should(seeThat(laTransferenciaFueExitosa()).orComplainWith(FalloTransferenciaException.class, FALLO_TRANSFERENCIA));
    }

}
