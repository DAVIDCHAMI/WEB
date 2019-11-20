package co.com.bancolombia.certificacion.svp.interactions.clavedinamica;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.TimeUnit;

import static co.com.bancolombia.certificacion.svp.integration.transversal.ClaveDinamica.consultarClaveDinamica;
import static co.com.bancolombia.certificacion.svp.tasks.comunes.CargarPagina.esperarAQueSeCargueLaPagina;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BOTON_ACEPTAR;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.CLAVE_DINAMICA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarClaveDinamica implements Interaction {
    public static Interaction ingresarClaveDinamica() {
        return instrumented(IngresarClaveDinamica.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (CLAVE_DINAMICA.resolveFor(actor).withTimeoutOf(40, TimeUnit.SECONDS).isVisible()) {
            String claveDinamica = consultarClaveDinamica();
            if (StringUtils.isNotBlank(claveDinamica)) {
                actor.attemptsTo(
                        Enter.theValue(claveDinamica).into(CLAVE_DINAMICA),
                        Click.on(BOTON_ACEPTAR),
                        esperarAQueSeCargueLaPagina()
                );
            }
        }
    }
}