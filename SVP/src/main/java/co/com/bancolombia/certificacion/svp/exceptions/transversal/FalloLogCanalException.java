package co.com.bancolombia.certificacion.svp.exceptions.transversal;

public class FalloLogCanalException extends AssertionError {

    public static final String FALLO_LOG_CANAL = "El valor obtenido en el registro del log canal no es igual al valor esperado.";

    public FalloLogCanalException(String message) {
        super(message);
    }

    public FalloLogCanalException(String message, Throwable cause) {
        super(message, cause);
    }

}
