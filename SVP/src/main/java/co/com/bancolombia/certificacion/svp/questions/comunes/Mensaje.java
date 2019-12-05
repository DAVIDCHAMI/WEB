package co.com.bancolombia.certificacion.svp.questions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Mensaje implements Question<Boolean> {

    public static Mensaje mensajeDeRespuesta(){return new Mensaje();}

    @Override
    public Boolean answeredBy(Actor actor) {return null;}
}
