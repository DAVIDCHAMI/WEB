package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultaDePagos implements Question<Boolean> {

    public static ConsultaDePagos pagosDisponibles() {
        return new ConsultaDePagos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}