package co.com.bancolombia.certificacion.svp.utilities.managers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManager {

    private static final Logger LOGGER = LogManager.getLogger(DateManager.class);
    private static final String UTILS_MESSAGE = "Clase Utils";
    private static final String BAD_FORMAT = "Se produjo un error inesperado al crear el formato de la fecha";
    private static final String VACIO = "";

    private DateManager() {
        throw new IllegalStateException(UTILS_MESSAGE);
    }

    public static String obtenerFechaSistema(String strFormat) {
        String result = VACIO;
        SimpleDateFormat fechaActual;
        try {
            fechaActual = new SimpleDateFormat(strFormat);
            result = fechaActual.format(new Date());
        } catch (NumberFormatException e) {
            LOGGER.info(e.getMessage(), BAD_FORMAT);
        }
        return result;
    }

    public static Date stringToDate(String strFormat, String strDate) {
        Date resultDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat(strFormat);
        try {
            resultDate = formatter.parse(strDate);
        } catch (ParseException var5) {
            LOGGER.error(BAD_FORMAT);
        }
        return resultDate;
    }

    public static String dateToString(String strFormat, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(strFormat);
        String newDate = null;
        try {
            newDate = formatter.format(date);
        } catch (NumberFormatException e) {
            LOGGER.error(e.getMessage());
        }
        return newDate;
    }
}