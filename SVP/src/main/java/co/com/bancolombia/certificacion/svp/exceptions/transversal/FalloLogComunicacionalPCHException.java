package co.com.bancolombia.certificacion.svp.exceptions.transversal;

public class FalloLogComunicacionalPCHException extends AssertionError {

    public static final String FALLO_LOG_COMUNICACIONAL_PCH = "Los valores obtenidos para los registros TS, SN, RC y TR del log comunicacional PCH no son igual al valor esperado";

    public FalloLogComunicacionalPCHException(String message) {
        super(message);
    }

    public FalloLogComunicacionalPCHException(String message, Throwable cause) {
        super(message, cause);
    }
}
