package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ALTERNO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ORIENTACION;

public class MensajeUsuarioInexistente implements Question<String> {

    public static MensajeUsuarioInexistente mensajeUsuarioInexistentes() {
        return new MensajeUsuarioInexistente();
    }

    @Override
    public String answeredBy(Actor actor) {
        unTiempo();
        return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO) ? Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString() : "";
    }
}