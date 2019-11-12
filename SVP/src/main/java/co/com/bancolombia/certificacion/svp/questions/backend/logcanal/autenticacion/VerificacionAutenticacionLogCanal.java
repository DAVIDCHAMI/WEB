package co.com.bancolombia.certificacion.svp.questions.backend.logcanal.autenticacion;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.integration.logcanal.autenticacion.LogCanalAutenticacion.consultaAutenticacionLogCanal;
import static co.com.bancolombia.certificacion.svp.questions.backend.logcanal.VerificacionBasicaLogCanal.obtenerDatosBasicosTransaccion;
import static co.com.bancolombia.certificacion.svp.questions.backend.logcanal.VerificacionBasicaLogCanal.verificacionBasicaLogCanal;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.REPORTS_SERENITY;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.clearReport;

public class VerificacionAutenticacionLogCanal implements Question {

    public static VerificacionAutenticacionLogCanal verificacionAutenticacionLogCanal() {
        return new VerificacionAutenticacionLogCanal();
    }

    public static boolean verificacionLogCanal(Actor actor) {
        clearReport();
        List<Map<String, Object>> resultadoObtenido = consultaAutenticacionLogCanal();
        Map<String, String> resultadoEsperado = obtenerDatosBasicosTransaccion();
        boolean resultadoVerificacion = false;
        resultadoVerificacion = verificacionBasicaLogCanal(resultadoEsperado, resultadoObtenido);
        Serenity.recordReportData().withTitle("Resultado Verificación Log Canal").andContents(Serenity.sessionVariableCalled(REPORTS_SERENITY));
        return resultadoVerificacion;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return verificacionLogCanal(actor);
    }
}