package co.com.bancolombia.certificacion.svp.questions.autenticacion;


import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.MSG_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class Mensaje implements Question<String> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        if(DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO))
             return Text.of(MSG_CLAVE_INVALIDA).viewedBy(actor).asString();
         return "";
    }
}