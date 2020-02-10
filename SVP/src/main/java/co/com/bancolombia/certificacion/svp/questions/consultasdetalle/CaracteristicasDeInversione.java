package co.com.bancolombia.certificacion.svp.questions.consultasdetalle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeInversione implements Question<Boolean> {

    public static CaracteristicasDeInversione lasCaracteristicaDeInversiones() {
        return new CaracteristicasDeInversione();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}