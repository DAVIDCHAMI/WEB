package co.com.bancolombia.certificacion.svp.tasks.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.GIF_CARGANDO_BANCOLOMBIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarPagina implements Task {
    public static CargarPagina esperarAQueSeCargueLaPagina() {
        return instrumented(CargarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (GIF_CARGANDO_BANCOLOMBIA.resolveFor(actor).isVisible()) {
            GIF_CARGANDO_BANCOLOMBIA.resolveFor(actor).waitUntilNotVisible();
        }
    }
}