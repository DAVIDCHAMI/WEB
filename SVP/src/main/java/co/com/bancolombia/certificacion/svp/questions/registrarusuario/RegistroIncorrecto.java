package co.com.bancolombia.certificacion.svp.questions.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistroIncorrecto implements Question<String> {

    public static RegistroIncorrecto enSVP() {
        return new RegistroIncorrecto();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
