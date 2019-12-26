package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultasCrediagil  implements Task {

    public static ConsultasCrediagil consultarDetalleCrediagil() {
        return instrumented(ConsultasCrediagil.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}