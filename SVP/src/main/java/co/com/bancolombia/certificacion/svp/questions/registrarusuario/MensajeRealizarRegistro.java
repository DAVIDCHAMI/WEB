package co.com.bancolombia.certificacion.svp.questions.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRealizarRegistro implements Question<Boolean> {

    public static MensajeRealizarRegistro deNuevo() {
        return new MensajeRealizarRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
