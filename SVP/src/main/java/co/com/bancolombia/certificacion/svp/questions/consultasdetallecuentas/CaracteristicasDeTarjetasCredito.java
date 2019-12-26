package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeTarjetasCredito implements Question<Boolean> {

    public static CaracteristicasDeTarjetasCredito lasCaracteristicasDeLasTarjetasDeCredito() {
        return  new CaracteristicasDeTarjetasCredito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}