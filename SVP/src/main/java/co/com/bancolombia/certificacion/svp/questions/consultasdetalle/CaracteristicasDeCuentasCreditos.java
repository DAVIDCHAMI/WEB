package co.com.bancolombia.certificacion.svp.questions.consultasdetalle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeCuentasCreditos implements Question<Boolean> {

    public static CaracteristicasDeCuentasCreditos lasCaracteristicasDeLosCreditos() {
        return new CaracteristicasDeCuentasCreditos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}