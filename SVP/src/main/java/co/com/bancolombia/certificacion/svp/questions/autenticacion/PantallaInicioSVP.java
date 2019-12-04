package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.TEXT_NOMBRE_USUARIO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;

public class PantallaInicioSVP implements Question<Boolean> {

    public static PantallaInicioSVP esVisible(){
        return new PantallaInicioSVP();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (DatosPrueba.getMap().get("orientacion").toString().equalsIgnoreCase(ACIERTO))
            return TEXT_NOMBRE_USUARIO.resolveFor(actor).isVisible();
        return false;
    }

}
