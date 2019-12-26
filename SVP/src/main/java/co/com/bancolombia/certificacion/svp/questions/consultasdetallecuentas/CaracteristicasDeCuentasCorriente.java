package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeCuentasCorriente  implements Question<Boolean> {

    public static CaracteristicasDeCuentasCorriente lasCaracteristicasDeLasCuentasCorriente() {
        return new CaracteristicasDeCuentasCorriente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}