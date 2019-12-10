package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClavePage.LBL_MENSAJE_GENERAR;

public class Mensaje implements Question<String> {

    public static Mensaje alGenerarClave(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE_GENERAR.resolveFor(actor).getText();
    }
}