package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeCreditosOcultos implements Question<String> {

    public static MensajeCreditosOcultos mensajeCreditosOcultos() {
        return new MensajeCreditosOcultos();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}