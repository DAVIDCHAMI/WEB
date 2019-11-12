package co.com.bancolombia.certificacion.svp.utilities.managers;


import java.util.ResourceBundle;

public abstract class QueryManager {
    public static final String UTILITY_MESSAGE = "Clase Utils - Query Manager";
    public static final ResourceBundle QUERY_ISERIES_AUTENTICAION = ResourceBundle.getBundle("queries/iseries/autenticacion");
    /*public static final ResourceBundle QUERY_ISERIES_CONSULTAS = ResourceBundle.getBundle("queries/iseries/consultas");
    public static final ResourceBundle QUERY_ISERIES_TRANSFERENCIAS = ResourceBundle.getBundle("queries/iseries/transferencias");
    public static final ResourceBundle QUERY_ISERIES_PAGOS = ResourceBundle.getBundle("queries/iseries/pagos");
    public static final ResourceBundle QUERY_ISERIES_INSCRIPCION = ResourceBundle.getBundle("queries/iseries/inscripcion");
    public static final ResourceBundle QUERY_ISERIES_SEGURIDAD = ResourceBundle.getBundle("queries/iseries/seguridad");
    public static final ResourceBundle QUERY_ISERIES_ACTUALIZACION = ResourceBundle.getBundle("queries/iseries/actualizacion");
    public static final ResourceBundle QUERY_ISERIES_SOLICITAR = ResourceBundle.getBundle("queries/iseries/solicitar");
    public static final ResourceBundle QUERY_ISERIES_CARGA = ResourceBundle.getBundle("queries/iseries/carga");
    public static final ResourceBundle QUERY_ISERIES_DESEMBOLSO = ResourceBundle.getBundle("queries/iseries/desembolso");
    public static final ResourceBundle QUERY_ISERIES_CANCELACION = ResourceBundle.getBundle("queries/iseries/cancelar");
    public static final ResourceBundle FINACLERECAUDOS_FACTURAS = ResourceBundle.getBundle("queries/oracle/FacturaFinacleRecaudos");*/

    private QueryManager() {
        throw new IllegalStateException(UTILITY_MESSAGE);
    }
}