package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.LBL_LOGIN_USUARIO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.ORIENTACION;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;

public class PantallaInicioSVP implements Question<String> {

    public static PantallaInicioSVP esVisible() {
        return new PantallaInicioSVP();
    }

    @Override
    public String answeredBy(Actor actor) {
        return obtener(ORIENTACION).equalsIgnoreCase(ACIERTO) ? Text.of(LBL_LOGIN_USUARIO).viewedBy(actor).asString().substring(0,4) : "";
    }
}