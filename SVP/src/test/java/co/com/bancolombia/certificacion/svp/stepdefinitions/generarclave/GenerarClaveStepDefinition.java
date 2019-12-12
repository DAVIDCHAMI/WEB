package co.com.bancolombia.certificacion.svp.stepdefinitions.generarclave;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.questions.generarclave.FechaComprobanteAlGenerarClave;
import co.com.bancolombia.certificacion.svp.questions.generarclave.Mensaje;
import co.com.bancolombia.certificacion.svp.tasks.generarclave.Generar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerarClaveStepDefinition {

    @Cuando("^el genera la clave para svp$")
    public void elGeneraLaClaveParaSvp() {
        theActorInTheSpotlight().attemptsTo(
                Generar.clave()
        );
    }

    @Entonces("^el deberia de ver el mensaje (.*)$")
    public void elDeberiaDeVerElMensajeDeConfirmacionClavePendienteDeActivacionYFechaDeLaTransaccion(String mensaje)  {
        theActorInTheSpotlight().should(seeThat(
                FechaComprobanteAlGenerarClave.con(mensaje)
                )
        );
    }

    @Y("^el mensaje de confirmacion con fecha de la transaccion$")
    public void mensajeConfirmacionConFechaTransaccion()  {
        theActorInTheSpotlight().should(seeThat(
                Mensaje.alGenerarClave(), IsEqual.equalTo(DatosPrueba.getMap().get("mensajeEsperado").toString())
                )
        );
    }
}
