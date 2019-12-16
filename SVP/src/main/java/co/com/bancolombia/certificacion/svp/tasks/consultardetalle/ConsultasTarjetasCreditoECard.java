package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultasTarjetasCreditoECard implements Task {

    public static ConsultasTarjetasCreditoECard consultarDetalleTarjetaCreditoECard() {
        return instrumented(ConsultasTarjetasCreditoECard.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
