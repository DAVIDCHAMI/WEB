package co.com.bancolombia.certificacion.svp.questions.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistroExitoso implements Question<Boolean> {

    public static RegistroExitoso enSVP() {
        return new RegistroExitoso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
