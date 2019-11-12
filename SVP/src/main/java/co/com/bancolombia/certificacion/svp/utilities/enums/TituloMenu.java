package co.com.bancolombia.certificacion.svp.utilities.enums;

public enum TituloMenu {
    /**
     * ****************
     * Menu en español
     * ****************
     */
    INICIO("Inicio"),
    PRODUCTOS("Productos"),
    TRANSFERENCIAS("Transferencias"),
    PAGOS("Pagos"),
    SEGURIDAD("Seguridad"),
    DOCUMENTOS("Documentos"),
    SOLICITUD_DE_PRODUCTOS("Solicitud de productos"),
    PUNTOS_COLOMBIA("Puntos Colombia");

    private String name;

    private TituloMenu(String menuPrincipal) {
        this.name = menuPrincipal;
    }

    public String getName() {
        return name;
    }
}
