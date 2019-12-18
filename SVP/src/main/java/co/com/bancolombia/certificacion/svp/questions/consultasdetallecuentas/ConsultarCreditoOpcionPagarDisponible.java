package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ConsultarCreditoOpcionPagarDisponible implements Question<Boolean> {

    public static ConsultarCreditoOpcionPagarDisponible laOpcionDePagarDisponible() {
        return new ConsultarCreditoOpcionPagarDisponible();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
