package co.com.bancolombia.certificacion.svp.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComunesStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) Upload SVP properties$")
    public void systemUploadSVPEnvironment(String actor) {
        theActorCalled(actor).wasAbleTo(Cargar.environmentProperties());
    }
}