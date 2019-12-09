package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_CLAVE_BLOQUEADA;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class Clave implements Question<String> {

    public static Clave mensajeClaveBloqueada(){
        return new Clave();
    }

    @Override
    public String answeredBy(Actor actor) {
      return  DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO)? Text.of(MSG_CLAVE_BLOQUEADA).viewedBy(actor).asString():"";
    }
}