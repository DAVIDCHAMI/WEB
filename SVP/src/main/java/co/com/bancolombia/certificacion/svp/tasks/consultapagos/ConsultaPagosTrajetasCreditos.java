package co.com.bancolombia.certificacion.svp.tasks.consultapagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultaPagosTrajetasCreditos implements Task {

    public static ConsultaPagosTrajetasCreditos consultarLosPagosDeTarjetasDeCreditos() {
        return instrumented(ConsultaPagosTrajetasCreditos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}