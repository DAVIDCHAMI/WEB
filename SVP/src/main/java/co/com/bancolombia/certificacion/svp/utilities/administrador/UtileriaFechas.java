package co.com.bancolombia.certificacion.svp.utilities.administrador;

import java.util.Calendar;

public class UtileriaFechas {

    private static String dia = Integer.toString(Calendar.getInstance().get(Calendar.DATE));
    private static String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
    private static String anio = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
    private static String mesLetra;
    private static String[] mesLetras = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

    private UtileriaFechas() {
        throw new IllegalStateException("Utileria Fechas");
    }

    public static String obtenerFechaComprobantes() {
        mesLetra = mesLetras[Integer.parseInt(mes) -1];
        return dia +"  "+ mesLetra + "  " + anio;
    }
}