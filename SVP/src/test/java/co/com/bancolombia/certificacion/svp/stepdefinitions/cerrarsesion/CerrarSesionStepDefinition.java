package co.com.bancolombia.certificacion.svp.stepdefinitions.cerrarsesion;

import co.com.bancolombia.certificacion.svp.questions.cerrarsesion.ValidacionDeCierreDeSesion;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CerrarSesionStepDefinition {

    @Entonces("^el deberia ver la sesion cerrada\\.$")
    public void elDeberiaVerLaSesionCerrada() {
        theActorInTheSpotlight().should(seeThat(ValidacionDeCierreDeSesion.seCierreLaSesion()));
    }
}
