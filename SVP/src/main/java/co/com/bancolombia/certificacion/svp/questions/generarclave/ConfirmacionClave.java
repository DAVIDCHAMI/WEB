package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionClave implements Question<Boolean> {

    public static ConfirmacionClave pendienteActivacion(){
        return new ConfirmacionClave();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
