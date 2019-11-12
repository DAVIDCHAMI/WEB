package co.com.bancolombia.certificacion.svp.utilities.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ConstantFound {


    public static final Map<String, String> LIBRARY_BY_CODE;

    static {
        Map<String, String> map = new HashMap<>();
        map.put("ALTERNATIVO DINAMICO", "FAD");
        map.put("FIDURENTA", "F16");
        map.put("FIDUCUENTA", "F01");
        map.put("FONDO RENTA BALANCEADO", "085");
        map.put("RENTA FIJA PLAZO", "R18");
        map.put("ACCIONES SECTORIAL", "FAS");
        map.put("FONDO ACCIONES UNIACCION", "FAU");
        map.put("FIDUEXCEDENTES", "FIE");
        map.put("C.C.A.P.P. INDEXADO ACCIONES", "FXP");
        map.put("RENTA TES", "RTE");
        map.put("RENTA DOLARES", "RUS");
        map.put("RENTA ACCIONES", "RAC");
        map.put("INDECCION", "FIN");
        map.put("FAD", "ALTERNATIVO DINAMICO");
        map.put("F16", "FIDURENTA");
        map.put("F01", "FIDUCUENTA");
        map.put("085", "FONDO RENTA BALANCEADO");
        map.put("R18", "RENTA FIJA PLAZO");
        map.put("FAS", "ACCIONES SECTORIAL");
        map.put("FAU", "FONDO ACCIONES UNIACCION");
        map.put("FIE", "FIDUEXCEDENTES");
        map.put("FXP", "C.C.A.P.P. INDEXADO ACCIONES");
        map.put("RTE", "RENTA TES");
        map.put("RUS", "RENTA DOLARES");
        map.put("RAC", "RENTA ACCIONES");
        map.put("FIN", "INDECCION");
        map.put("104", "104");


        LIBRARY_BY_CODE = Collections.unmodifiableMap(map);
    }

    private ConstantFound() {
        throw new IllegalStateException(ConstantTypeClass.CONSTANT_CLASS);
    }

}
