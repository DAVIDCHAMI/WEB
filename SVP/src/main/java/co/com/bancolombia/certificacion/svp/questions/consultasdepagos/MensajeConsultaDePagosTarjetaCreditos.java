package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeConsultaDePagosTarjetaCreditos implements Question<Boolean> {

    public static MensajeConsultaDePagosTarjetaCreditos mensajeProductoNoDisponible() {
        return new MensajeConsultaDePagosTarjetaCreditos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}