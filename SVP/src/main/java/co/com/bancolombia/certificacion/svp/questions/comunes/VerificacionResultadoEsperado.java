package co.com.bancolombia.certificacion.svp.questions.comunes;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.tasks.comunes.CargarPagina.esperarAQueSeCargueLaPagina;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.REPORTS_SERENITY;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.clearReport;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.validateField;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificacionResultadoEsperado implements Question<Boolean> {

    private Target elemento;

    public VerificacionResultadoEsperado(Target target) {
        this.elemento = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        clearReport();
        actor.attemptsTo(esperarAQueSeCargueLaPagina());
        actor.attemptsTo(WaitUntil.the(elemento, isVisible()));
        String resultadoObtenido = elemento.resolveFor(actor).getText();
        boolean result = true;
        result = validateField("Mensaje", resultadoObtenido, DatosPrueba.getMap().get("resultadoEsperado").toString(), result);
        Serenity.recordReportData().withTitle("Resultado esperado").andContents(Serenity.sessionVariableCalled(REPORTS_SERENITY));
        return result;
    }
}
