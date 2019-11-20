package co.com.bancolombia.certificacion.svp.models;

import java.util.Map;

public class DatosPrueba {
    private static Map<String, Object> map;

    private DatosPrueba() {
    }

    public static Map<String, Object> getMap() {
        return map;
    }

    public static void setMap(Map<String, Object> datosPrueba) {
        map = datosPrueba;
    }
}