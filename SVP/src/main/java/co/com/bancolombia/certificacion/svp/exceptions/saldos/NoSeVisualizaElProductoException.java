package co.com.bancolombia.certificacion.svp.exceptions.saldos;

public class NoSeVisualizaElProductoException extends RuntimeException {
    private static final String MENSAJE = "No se logra visualizar el tipo producto dentro de la lista presentada, producto: ";

    public NoSeVisualizaElProductoException(String producto) {
        super(MENSAJE + producto);
    }
}
