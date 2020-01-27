package co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CaracteristicasDeFondosInversion implements Question<Boolean> {
    public static CaracteristicasDeFondosInversion lasCaracteristicasDeFondosInversion() {
        return new CaracteristicasDeFondosInversion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}