package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultaPagosCreditos implements Question<Boolean> {

    public static ConsultaPagosCreditos pagosDisponiblesDeCreditos() {
        return new ConsultaPagosCreditos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}