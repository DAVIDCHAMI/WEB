package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeCrediagil implements Question<Boolean> {

    public static CaracteristicasDeCrediagil lasCaracteristicasDeCrediagil() {
        return new CaracteristicasDeCrediagil();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
