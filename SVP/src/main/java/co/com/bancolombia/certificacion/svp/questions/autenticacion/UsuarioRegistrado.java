package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.LBL_CLAVE_INVALIDA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.ORIENTACION;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;

public class UsuarioRegistrado implements Question<String> {

    public static UsuarioRegistrado mensajeUsuarioRegistrado() {
        return new UsuarioRegistrado();
    }

    @Override
    public String answeredBy(Actor actor) {
        unTiempo();
        return obtener(ORIENTACION).equalsIgnoreCase(ACIERTO) ? Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString() : "";
    }
}