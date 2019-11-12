package co.com.bancolombia.certificacion.svp.utilities.managers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UTILITY_CLASS;


public abstract class ValidatorManager {

    private static final Logger LOGGER = LogManager.getLogger(ValidatorManager.class.getName());
    private static final String VALUE_MESSAGE = "\n{} : el valor esperado es  {} es diferente al valor encontrado {}";

    private ValidatorManager() {
        throw new IllegalStateException(UTILITY_CLASS);
    }


    public static boolean compararDiferencias(String esperado, String recibido, String tituloCampo) {
        boolean esFalso = true;
        if (esperado != null || recibido != null) {
            if (!esperado.equalsIgnoreCase(recibido)) {
                LOGGER.error(VALUE_MESSAGE, tituloCampo, esperado, recibido);
                esFalso = false;
            }
        } else {
            if (esperado != recibido) {
                LOGGER.error(VALUE_MESSAGE, tituloCampo, esperado, recibido);
            }
        }
        return esFalso;
    }

    /*
     * Metodo que compara los booleanos dentro del array.
     */
    public static boolean isFalse(Boolean[] verificaciones) {
        boolean result = true;
        for (Boolean e : verificaciones) {
            result = result && e;
        }
        return result;
    }

}
