package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultasCuentasCorriente implements Task {

    public static ConsultasCuentasCorriente consultaDeDetalleCorriente() {
        return instrumented(ConsultasCuentasCorriente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
}