package co.com.bancolombia.certificacion.svp.exceptions.generarclave;

public class NoSeVisualizaMensajeGeneracionClaveException extends AssertionError {
    public static final String MENSAJE_ERROR_GENERAR_CLAVE = "No se ha enviado la solicitud para generar clave. El mensaje no es correcto o no cargo";

    public NoSeVisualizaMensajeGeneracionClaveException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}