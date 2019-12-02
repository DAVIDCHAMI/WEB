package co.com.bancolombia.certificacion.svp.stepdefinitions.generarclave;

import co.com.bancolombia.certificacion.svp.questions.generarclave.ConfirmacionClave;
import co.com.bancolombia.certificacion.svp.tasks.generarclave.Generar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerarClaveStepDefinition {

    @Cuando("^el genera la clave para svp$")
    public void elGeneraLaClaveParaSvp() {
        theActorInTheSpotlight().attemptsTo(
                Generar.clave()
        );
    }

    @Entonces("^el deberia de ver el mensaje de confirmacion (.*) y fecha de la transaccion$")
    public void elDeberiaDeVerElMensajeDeConfirmacionClavePendienteDeActivacionYFechaDeLaTransaccion(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ConfirmacionClave.pendienteActivacion())
        );
    }
}
