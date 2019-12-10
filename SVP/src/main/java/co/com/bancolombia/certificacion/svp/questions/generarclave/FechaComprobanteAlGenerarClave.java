package co.com.bancolombia.certificacion.svp.questions.generarclave;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClavePage.*;
import static co.com.bancolombia.certificacion.svp.utilities.administrador.UtileriaFechas.*;

public class FechaComprobanteAlGenerarClave implements Question<Boolean> {
    private String mensaje;

    public FechaComprobanteAlGenerarClave(String mensaje){
        this.mensaje = mensaje;
    }

    public static FechaComprobanteAlGenerarClave con(String mensaje){
        return new FechaComprobanteAlGenerarClave(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION_GENERAR.of(mensaje).resolveFor(actor).isVisible() && LBL_FECHA_HORA_GENERAR.resolveFor(actor).getText().contains(obtenerFechaComprobantes());
    }
}