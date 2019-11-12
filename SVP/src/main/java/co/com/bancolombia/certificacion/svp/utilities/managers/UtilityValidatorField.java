package co.com.bancolombia.certificacion.svp.utilities.managers;


import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.REPORTS_SERENITY;

public class UtilityValidatorField {

    private static final Logger LOGGER = LogManager.getLogger("UTILITY VALIDATOR FIELD");
    private static String reportValidator = "";
    private static String resultadoCampo = "Resultado ";
    private static String respuestaOK = "  : OK";
    private static String respuestaERR = "  : ERROR";

    private UtilityValidatorField() {
        throw new IllegalStateException(ConstantTypeClass.UTILITY_CLASS);
    }

    public static boolean validateField(String field, String valueObtained, String valueExpected, Boolean result) {
        boolean resultAfter = result;
        LOGGER.info("Valor Obtenido Campo " + field + " : " + valueObtained);
        LOGGER.info("Valor Esperado Campo " + field + " : " + valueExpected);
        reportValidator += "\n" + "Valor Obtenido Campo " + field + " : " + valueObtained + "\n" +
                "Valor Esperado Campo " + field + " : " + valueExpected + "\n";

        try {
            if (valueObtained.equalsIgnoreCase(valueExpected)) {
                LOGGER.info(resultadoCampo + respuestaOK);
                reportValidator += resultadoCampo + respuestaOK + "\n\n";
                Serenity.setSessionVariable(REPORTS_SERENITY).to(reportValidator);
                result = true;
            } else {
                LOGGER.info(resultadoCampo + respuestaERR);
                reportValidator += resultadoCampo + respuestaERR + "\n\n";
                Serenity.setSessionVariable(REPORTS_SERENITY).to(reportValidator);
                result = false;
            }
        } catch (Exception e) {
            LOGGER.info(resultadoCampo + field + respuestaERR);
            LOGGER.error(e.getMessage(), e);
            reportValidator += resultadoCampo + respuestaERR + "\n\n";
            Serenity.setSessionVariable(REPORTS_SERENITY).to(reportValidator);
            result = false;
        }
        return result && resultAfter;
    }

    public static void clearReport() {
        reportValidator = "";
    }
}
