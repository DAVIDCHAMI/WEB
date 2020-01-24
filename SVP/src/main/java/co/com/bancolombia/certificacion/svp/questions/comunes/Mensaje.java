package co.com.bancolombia.certificacion.svp.questions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.TXT_MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;

public class Mensaje implements Question<Boolean> {

    public static Mensaje mensajeDeRespuesta() {
        return new Mensaje();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_RESPUESTA.of(obtener(MENSAJE_RESPUESTA)).resolveFor(actor).isVisible();
    }
}
