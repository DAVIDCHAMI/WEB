package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClave.LBL_FECHA_HORA_GENERAR;
import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClave.LBL_MENSAJE_GENERAR;
import static co.com.bancolombia.certificacion.svp.utilities.administrador.UtileriaFechas.obtenerFechaComprobantes;

public class FechaComprobante implements Question<Boolean> {

    public static FechaComprobante alGenerarClave() {
        return new FechaComprobante();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_GENERAR.resolveFor(actor).isVisible() &&
                LBL_FECHA_HORA_GENERAR.resolveFor(actor).getText().contains(obtenerFechaComprobantes());
    }
}