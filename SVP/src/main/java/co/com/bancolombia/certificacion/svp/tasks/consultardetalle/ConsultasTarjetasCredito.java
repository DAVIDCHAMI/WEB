package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultasTarjetasCredito implements Task {


    public static ConsultasTarjetasCredito consultarDetalleTarjetaCredito() {
        return instrumented(ConsultasTarjetasCredito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(

      );
    }
}
