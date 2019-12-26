package co.com.bancolombia.certificacion.svp.questions.generarclave;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClavePage.*;
import static co.com.bancolombia.certificacion.svp.utilities.administrador.UtileriaFechas.obtenerFechaComprobantes;

public class Mensaje implements Question<Boolean> {

    public static Mensaje alGenerarClave() {
        return new Mensaje();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION_GENERAR.of(DatosPrueba.getMap().get("mensajeEsperado").toString()).resolveFor(actor).isVisible();
    }
}