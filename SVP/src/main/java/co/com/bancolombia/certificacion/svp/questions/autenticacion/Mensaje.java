package co.com.bancolombia.certificacion.svp.questions.autenticacion;


import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Mensaje implements Question<String> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(LBL_CLAVE_INVALIDA, isVisible());
        return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO)? Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString():"";
    }
}