package co.com.bancolombia.certificacion.svp.exceptions.detallesproducto;

public class NoExisteEseCampoException extends RuntimeException {
    public NoExisteEseCampoException() {
        super("El campo indicado no se encuentra mapeado");
    }
}
