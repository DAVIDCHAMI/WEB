package co.com.bancolombia.certificacion.svp.exceptions.detallesproducto;

public class NoExisteEseCampoException extends RuntimeException {

    public NoExisteEseCampoException(String camposDetalle) {
        super("El campo " + camposDetalle + " no se encuentra mapeado en los detalles del fondo");
    }
}
