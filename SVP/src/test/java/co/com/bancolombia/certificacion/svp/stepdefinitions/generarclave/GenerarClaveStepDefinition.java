package co.com.bancolombia.certificacion.svp.stepdefinitions.generarclave;

import co.com.bancolombia.certificacion.svp.exceptions.generarclave.FechaComprobanteDiferenteDelSistemaException;
import co.com.bancolombia.certificacion.svp.exceptions.generarclave.NoSeVisualizaMensajeGeneracionClaveException;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.questions.generarclave.ClaveUsuario;
import co.com.bancolombia.certificacion.svp.questions.generarclave.FechaComprobante;
import co.com.bancolombia.certificacion.svp.questions.generarclave.Mensaje;
import co.com.bancolombia.certificacion.svp.tasks.generarclave.Generar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.bancolombia.certificacion.svp.exceptions.generarclave.FechaComprobanteDiferenteDelSistemaException.MENSAJE_FECHA_COMPROBANTE;
import static co.com.bancolombia.certificacion.svp.exceptions.generarclave.NoSeVisualizaMensajeGeneracionClaveException.MENSAJE_ERROR_GENERAR_CLAVE;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.Clave.mensajeClaveBloqueada;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.UsuarioRegistrado.mensajeUsuarioRegistrado;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.RESULTADO_ESPERADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class GenerarClaveStepDefinition {

    @Cuando("^el genera la clave para svp usando la misma que posee actualmente$")
    public void elGeneraLaClaveParaSvpUsandoMismaClave() {
        theActorInTheSpotlight().attemptsTo(
                Generar.clave()
        );
    }

    @Cuando("^el genera la clave para svp$")
    public void elGeneraLaClaveParaSvp() {
        theActorInTheSpotlight().attemptsTo(
                Generar.clave()
        );
    }

    @Cuando("^el genera la clave para svp con clave bloqueada por (intentos|el usuario|seguridad)$")
    public void elGeneraLaClaveParaSvpConClaveBloqueada(String parametroBloqueo) {
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

    @Entonces("^el deberia de ver un mensaje Usuario o clave invalida$")
    public void elDeberiaDeVerUnMensajeUsuarioIntentaloNuevamente() {
        theActorInTheSpotlight().should(seeThat(ClaveUsuario.bloqueada()
                )
        );
    }

    @Entonces("^el deberia de ver mensaje de su clave esta bloqueada$")
    public void elDeberiaDeVerMensajeDeClaveBloqueada() {
        theActorInTheSpotlight().should(seeThat(
                mensajeClaveBloqueada(), equalTo(DatosPrueba.getMap().get(RESULTADO_ESPERADO).toString()))
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
