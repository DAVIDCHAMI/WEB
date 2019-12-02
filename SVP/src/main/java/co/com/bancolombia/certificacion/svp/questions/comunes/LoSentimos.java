package co.com.bancolombia.certificacion.svp.questions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoSentimos implements Question<Boolean> {

    public static LoSentimos mensajeLoSentimos(){
        return new LoSentimos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}