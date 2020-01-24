package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.LBL_CLAVE_BLOQUEADA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.ORIENTACION;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ALTERNO;

public class Clave implements Question<String> {

    public static Clave mensajeClaveBloqueada() {
        return new Clave();
    }

    @Override
    public String answeredBy(Actor actor) {
        unTiempo();
        return obtener(ORIENTACION).equalsIgnoreCase(ALTERNO) ? Text.of(LBL_CLAVE_BLOQUEADA).viewedBy(actor).asString() : "";
    }
}