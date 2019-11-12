package co.com.bancolombia.certificacion.svp.questions.comunes;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.interactions.espera.Esperar.esperar;
import static co.com.bancolombia.certificacion.svp.tasks.comunes.CargarPagina.esperarAQueSeCargueLaPagina;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.ACIERTO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.EXITOSO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PreguntaExitosa implements Question<Boolean> {
    private Target elemento;
    private boolean orientacion = false;
    private boolean comparacionResultado = false;

    public PreguntaExitosa(Target target) {
        this.elemento = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        esperar(4000);
        actor.attemptsTo(esperarAQueSeCargueLaPagina());
        actor.attemptsTo(WaitUntil.the(elemento, isVisible()));
        String resultadoObtenido = elemento.resolveFor(actor).getText();
        String resultadoEsperado = DatosPrueba.getMap().get("resultadoEsperado").toString();
        orientacion = DatosPrueba.getMap().get("orientacion").toString().equalsIgnoreCase(ACIERTO) || DatosPrueba.getMap().get("orientacion").toString().equalsIgnoreCase(EXITOSO);
        comparacionResultado = resultadoObtenido.contains(resultadoEsperado);
        return comparacionResultado && orientacion;
    }
}
