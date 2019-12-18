package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeConsultaDePagosDeCreditos implements Question<Boolean> {

    public static MensajeConsultaDePagosDeCreditos mensajeUstedNoTienePagosDeCreditos() {
        return  new MensajeConsultaDePagosDeCreditos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}