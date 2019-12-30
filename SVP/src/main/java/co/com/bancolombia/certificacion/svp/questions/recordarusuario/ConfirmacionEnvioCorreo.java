package co.com.bancolombia.certificacion.svp.questions.recordarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionEnvioCorreo implements Question<Boolean> {

    public static ConfirmacionEnvioCorreo alRecordarUsuario() {
        return new ConfirmacionEnvioCorreo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
