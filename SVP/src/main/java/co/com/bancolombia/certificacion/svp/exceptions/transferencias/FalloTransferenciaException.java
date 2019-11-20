package co.com.bancolombia.certificacion.svp.exceptions.transferencias;

public class FalloTransferenciaException extends AssertionError {
    public static final String FALLO_TRANSFERENCIA = "El monto pagado no se dedujo de la cuenta de origen";
    public static final String FALLO_TRANSFERENCIA_CASO_ALTERNO = "No se pudo verificar el caso alternativo para la transferencia";

    public FalloTransferenciaException(String message, Throwable cause) {
        super(message, cause);
    }
}
