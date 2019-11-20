package co.com.bancolombia.certificacion.svp.exceptions.autenticacion;

public class FalloAutenticacionException extends AssertionError {
    public static final String FALLO_LONGITUD_CLAVE = "La longitud de la clave no es valida";
    public static final String FALLO_SESSION = "Fallo el inicio de session en la SVP";

    public FalloAutenticacionException(String message, Throwable cause) {
        super(message, cause);
    }
}
