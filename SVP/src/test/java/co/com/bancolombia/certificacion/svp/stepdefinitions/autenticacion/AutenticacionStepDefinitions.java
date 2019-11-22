package co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.svp.interactions.comunes.AbrirNavegador;
import cucumber.api.java.es.Cuando;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.conLaSiguiente;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {

    @Cuando("^el intenta autenticarse utilizando sus credenciales$")
    public void intentoAutenticarmeUtilizandoMisCredenciales( List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                AbrirNavegador.paraSVP(),
                conLaSiguiente(informacion),
                autenticarseEnLaSVP());
    }

    @Cuando("^el realiza la autenticacion$")
    public void realizaLaAutenticacion() {
        theActorInTheSpotlight().attemptsTo(
                AbrirNavegador.paraSVP(),
                autenticarseEnLaSVP());
    }
}