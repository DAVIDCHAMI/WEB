package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.TEXT_LOGIN_USUARIO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ORIENTACION;

public class PantallaInicioSVP implements Question<String> {

    public static PantallaInicioSVP esVisible(){
        return new PantallaInicioSVP();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ACIERTO)? Text.of(TEXT_LOGIN_USUARIO).viewedBy(actor).asString():"";
    }
}