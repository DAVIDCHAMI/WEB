package co.com.bancolombia.certificacion.svp.exceptions.comunes.generarclave;

public class FechaComprobanteDiferenteDelSistemaException extends AssertionError {
    public static final String MENSAJE_FECHA_COMPROBANTE = "La fecha que se muestra en el comprobante no corresponde con la del sistema";

    public FechaComprobanteDiferenteDelSistemaException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}