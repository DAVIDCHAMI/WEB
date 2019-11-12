package co.com.bancolombia.certificacion.svp.utilities.managers;


import java.util.ResourceBundle;

public abstract class QueryManager {
    public static final String UTILITY_MESSAGE = "Clase Utils - Query Manager";
    public static final ResourceBundle QUERY_ISERIES_AUTENTICAION = ResourceBundle.getBundle("queries/iseries/autenticacion");

    private QueryManager() {
        throw new IllegalStateException(UTILITY_MESSAGE);
    }
}