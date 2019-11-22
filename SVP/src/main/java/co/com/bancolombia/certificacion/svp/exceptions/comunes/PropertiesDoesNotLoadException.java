package co.com.bancolombia.certificacion.svp.exceptions.comunes;

public class PropertiesDoesNotLoadException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PropertiesDoesNotLoadException(Exception e) {
		super(e);
	}
}
