package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;


public class UsuarioRegistrado implements Question<String> {

    public static UsuarioRegistrado mensajeUsuarioRegistrado() {
        return new UsuarioRegistrado();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ACIERTO)? Text.of(MSG_CLAVE_INVALIDA).viewedBy(actor).asString():"";
    }
}