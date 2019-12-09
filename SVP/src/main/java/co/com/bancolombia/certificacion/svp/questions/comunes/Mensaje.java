package co.com.bancolombia.certificacion.svp.questions.comunes;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.TXT_MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.MENSAJE_RESPUESTA;

public class Mensaje implements Question<Boolean> {

    public static Mensaje mensajeDeRespuesta(){return new Mensaje();}

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_RESPUESTA.of(DatosPrueba.getMap().get(MENSAJE_RESPUESTA).toString()).resolveFor(actor).isVisible();
    }
}
