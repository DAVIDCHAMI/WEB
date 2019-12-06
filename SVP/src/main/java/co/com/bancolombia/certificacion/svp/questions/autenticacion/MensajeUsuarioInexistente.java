package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_USUARIO_REGISTRADO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ALTERNO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ORIENTACION;

public class MensajeUsuarioInexistente implements Question<String> {

    public static MensajeUsuarioInexistente mensajeUsuarioInexistentes() {
        return new MensajeUsuarioInexistente();
    }

    @Override
    public String answeredBy(Actor actor) {
        if(DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO))
            return Text.of(MSG_USUARIO_REGISTRADO).viewedBy(actor).asString();
        return "";
    }
}
