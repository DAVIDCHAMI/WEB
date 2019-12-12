package co.com.bancolombia.certificacion.svp.exceptions.saldos;

public class SeVisualizaUnaCategoriaSinProductosException extends RuntimeException{

    private static final String MENSAJE = "Se esta visualizando una categoria en la cual no posee productos: ";
    public SeVisualizaUnaCategoriaSinProductosException(String tipoProducto) {
        super(MENSAJE + tipoProducto);
    }
}
