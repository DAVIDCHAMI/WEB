package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_USUARIO_REGISTRADO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;


public class UsuarioRegistrado implements Question<Boolean> {

    public static UsuarioRegistrado mensajeUsuarioRegistrado() {
        return new UsuarioRegistrado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(DatosPrueba.getMap().get("orientacion").toString().equalsIgnoreCase(ACIERTO))
            return MSG_USUARIO_REGISTRADO.resolveFor(actor).isVisible();
        return false;
    }
}
