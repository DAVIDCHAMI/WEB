package co.com.bancolombia.certificacion.svp.questions.comunes;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.ETIQUETA_MENSAJE_ERROR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ALTERNO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PreguntaFallida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ETIQUETA_MENSAJE_ERROR, isVisible()));
        String resultadoObtenido = ETIQUETA_MENSAJE_ERROR.resolveFor(actor).getText();
        String resultadoEsperado = DatosPrueba.getMap().get("resultadoEsperado").toString();
        boolean orientacion = DatosPrueba.getMap().get("orientacion").toString().equalsIgnoreCase(ALTERNO);
        boolean comparacionResultado = resultadoObtenido.contains(resultadoEsperado);
        return comparacionResultado && orientacion;
    }
}
