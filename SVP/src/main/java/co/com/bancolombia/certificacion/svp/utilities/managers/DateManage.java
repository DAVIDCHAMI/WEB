package co.com.bancolombia.certificacion.svp.utilities.managers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static co.com.bancolombia.backend.utilidades.constant.ConstantStringFormat.FORMATO2CEROSIZQ;

public class DateManage {

    private static final String UTILS_MESSAGE = "Clase Utils";

    private DateManage() {
        throw new IllegalStateException(UTILS_MESSAGE);
    }

    public static String currentDate() {
        Calendar date = Calendar.getInstance();

        int intDay = date.get(Calendar.DATE);
        int intMounth = date.get(Calendar.MONTH) + 1;
        String year = Integer.toString(date.get(Calendar.YEAR));

        String strDay = String.format(FORMATO2CEROSIZQ, intDay);
        String strMounth = String.format(FORMATO2CEROSIZQ, intMounth);

        return strMounth + "/" + strDay + "/" + year.substring(2);
    }

    public static String previousDate() {
        Calendar date = Calendar.getInstance();

        int intMounth = (date.get(Calendar.MONTH));
        if (intMounth == 0) {
            intMounth = 12;
        }

        String year = Integer.toString(date.get(Calendar.YEAR));
        String strMounth = String.format(FORMATO2CEROSIZQ, intMounth);

        return (strMounth) + "/01/" + year.substring(2);
    }

    /*Método para cambia un formato de fechas al nuevo formato de la svp yyyy/MM/dd
    Se recibe dos parametros, la fecha a convertir y el formato de entrada.
    * */
    public static String dateFormatSvp(String date, String formatDate) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat(formatDate);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date data = parser.parse(date);

        return formatter.format(data).toString();
    }


}
