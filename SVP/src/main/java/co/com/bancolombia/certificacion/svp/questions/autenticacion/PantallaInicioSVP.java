package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PantallaInicioSVP implements Question<Boolean> {

    public static PantallaInicioSVP esVisible(){
        return new PantallaInicioSVP();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
