package co.com.bancolombia.certificacion.svp.exceptions.comunes;

public class ProductoNoManejadoPorElBancoException  extends RuntimeException{
    private static final String MENSAJE = " no pertenece a los productos del banco";

    public ProductoNoManejadoPorElBancoException(String producto) {
        super(producto+MENSAJE);
    }
}
