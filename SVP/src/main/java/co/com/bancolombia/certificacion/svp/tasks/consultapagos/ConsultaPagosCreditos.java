package co.com.bancolombia.certificacion.svp.tasks.consultapagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultaPagosCreditos implements Task {

    public static ConsultaPagosCreditos consultarLosPagosDeCreditos() {
        return instrumented(ConsultaPagosCreditos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}