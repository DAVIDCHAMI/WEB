package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultasCuentaAhorro implements Task {

    public static ConsultasCuentaAhorro consultaDetalleCuentas() {
        return instrumented(ConsultasCuentaAhorro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
