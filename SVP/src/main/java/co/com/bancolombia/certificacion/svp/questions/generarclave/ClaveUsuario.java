package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;

public class ClaveUsuario implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CLAVE_INVALIDA.resolveFor(actor).isVisible();
    }

    public static ClaveUsuario bloqueada(){
        return new ClaveUsuario();
    }
}
