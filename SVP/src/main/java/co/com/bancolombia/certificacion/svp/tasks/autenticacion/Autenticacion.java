package co.com.bancolombia.certificacion.svp.tasks.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.svp.interactions.autenticacion.IngresarClave.ingresarClave;
import static co.com.bancolombia.certificacion.svp.interactions.espera.Esperar.esperar;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.TEXTO_NOMBRE_USUARIO;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BOTON_ACEPTAR;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.ETIQUETA_MENSAJE_ERROR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {
    private static final Logger LOGGER = LogManager.getLogger(Autenticacion.class.getName());

    public static Autenticacion autenticarseEnLaSVP() {
        return instrumented(Autenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(DatosPrueba.getMap().get("usuario").toString()).into(TEXTO_NOMBRE_USUARIO),
                    Click.on(BOTON_ACEPTAR),
                    ingresarClave()
            );
            while (BOTON_ACEPTAR.resolveFor(actor).isCurrentlyVisible() && !ETIQUETA_MENSAJE_ERROR.resolveFor(actor).isCurrentlyVisible()) {
                actor.attemptsTo(Click.on(BOTON_ACEPTAR),
                        esperar(4000)
                );
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}