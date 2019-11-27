package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Clave implements Question<String> {

    public static Clave mensajeClaveBloqueada(){
        return new Clave();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
