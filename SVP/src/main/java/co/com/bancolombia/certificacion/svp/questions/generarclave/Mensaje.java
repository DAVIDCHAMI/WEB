package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClave.LBL_CONFIRMACION_GENERAR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_ESPERADO;

public class Mensaje implements Question<Boolean> {

    public static Mensaje alGenerarClave() {
        return new Mensaje();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION_GENERAR.of(obtener(MENSAJE_ESPERADO)).resolveFor(actor).isVisible();
    }
}