package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeTarjetasCreditosEcard implements Question {

    public static CaracteristicasDeTarjetasCreditosEcard lasCaracteristicasDeTarjetasCreditosECard() {
        return new CaracteristicasDeTarjetasCreditosEcard();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return null;
    }
}