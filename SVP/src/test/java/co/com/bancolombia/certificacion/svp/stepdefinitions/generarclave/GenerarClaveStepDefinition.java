package co.com.bancolombia.certificacion.svp.stepdefinitions.generarclave;

import co.com.bancolombia.certificacion.svp.exceptions.comunes.generarclave.FechaComprobanteDiferenteDelSistemaException;
import co.com.bancolombia.certificacion.svp.exceptions.comunes.generarclave.NoSeVisualizaMensajeGeneracionClaveException;
import co.com.bancolombia.certificacion.svp.questions.generarclave.FechaComprobante;
import co.com.bancolombia.certificacion.svp.questions.generarclave.Mensaje;
import co.com.bancolombia.certificacion.svp.tasks.generarclave.Generar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.bancolombia.certificacion.svp.exceptions.comunes.generarclave.FechaComprobanteDiferenteDelSistemaException.MENSAJE_FECHA_COMPROBANTE;
import static co.com.bancolombia.certificacion.svp.exceptions.comunes.generarclave.NoSeVisualizaMensajeGeneracionClaveException.MENSAJE_ERROR_GENERAR_CLAVE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerarClaveStepDefinition {

    @Cuando("^el genera la clave para svp$")
    public void elGeneraLaClaveParaSvp() {
        theActorInTheSpotlight().attemptsTo(
                Generar.clave()
        );
    }

    @Entonces("^el deberia de ver el mensaje ¡Clave pendiente de activacion!$")
    public void elDeberiaDeVerElMensajeDeConfirmacionClavePendienteDeActivacionYFechaDeLaTransaccion() {
        theActorInTheSpotlight().should(seeThat(Mensaje.alGenerarClave()).orComplainWith(
                NoSeVisualizaMensajeGeneracionClaveException.class, MENSAJE_ERROR_GENERAR_CLAVE
                )
        );
    }

    @Y("^el mensaje de confirmacion con fecha de la transaccion$")
    public void mensajeConfirmacionConFechaTransaccion() {
        theActorInTheSpotlight().should(seeThat(
                FechaComprobante.alGenerarClave()).orComplainWith(
                FechaComprobanteDiferenteDelSistemaException.class, MENSAJE_FECHA_COMPROBANTE
                )
        );
    }
}
