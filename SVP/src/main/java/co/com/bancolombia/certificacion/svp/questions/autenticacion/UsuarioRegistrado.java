package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class UsuarioRegistrado implements Question<String> {

    public static UsuarioRegistrado mensajeUsuarioRegistrado() {
        return new UsuarioRegistrado();
    }

    @Override
    public String answeredBy(Actor actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ACIERTO)? Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString():"";
    }
}