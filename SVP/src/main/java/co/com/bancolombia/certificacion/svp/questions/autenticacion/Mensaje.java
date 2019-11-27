package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Mensaje implements Question<Boolean> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
