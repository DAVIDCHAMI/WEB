package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeCuentasAhorro implements Question<Boolean> {

    public static CaracteristicasDeCuentasAhorro lasCaracteristicasDeLasCuentasAhorro() {
        return new CaracteristicasDeCuentasAhorro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}