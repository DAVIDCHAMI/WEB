package co.com.bancolombia.certificacion.svp.utilities.managers;


import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.text.*;
import java.text.Normalizer.Form;
import java.util.*;
import java.util.regex.Pattern;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.EMPTY;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.REMOVE_MIDDLE_SCRIPT;


public class UtilityManager {

    private static final Logger LOGGER = LogManager.getLogger(UtilityManager.class.getName());

    private UtilityManager() {
        throw new IllegalStateException(ConstantTypeClass.UTILITY_CLASS);
    }


    public static String depositAccountFormat(String depositAccount) {
        String depositAccountCeros = String.format("%011d", Long.parseLong(depositAccount));
        return depositAccountCeros.replaceFirst("(\\d{3})(\\d{6})(\\d{2})", "$1-$2-$3");

    }

    public static String castTypeAccountLetter(String typeAccount) {
        String typeAccountUpper = typeAccount.toUpperCase();
        String castTypeAccount = "";
        if (typeAccountUpper.contains("AHORRO")) {
            castTypeAccount = "S";
        } else if (typeAccountUpper.contains("CORRIENTE")) {
            castTypeAccount = "D";
        }
        return castTypeAccount;

    }


    public static String castTypeAccountNumber(String typeAccount) {
        String typeAccountUpper = typeAccount.toUpperCase();
        String castTypeAccount = "";
        if (typeAccountUpper.contains("AHORRO")) {
            castTypeAccount = "7";
        } else if (typeAccountUpper.contains("CORRIENTE")) {
            castTypeAccount = "1";
        }
        return castTypeAccount;

    }

    public static String searchProductFormat(String numberFormat, String typeFormat) {
        return String.format("%s - %s", typeFormat, numberFormat);
    }

    public static String addZerosLeft(String data, int sizeTotal) {
        return StringUtils.leftPad(data, sizeTotal, "0");
    }

    public static String concatZerosRight(String data, int size) {
        return StringUtils.rightPad(data, data.length() + size, "0");
    }


    public static String castTypeDocument(String typeDocument) {
        String typeDocumentUpper = typeDocument.toUpperCase();
        String castTypeDocument = "";
        if (typeDocumentUpper.contains("CÉDULA") || typeDocumentUpper.contains("CEDULA")) {
            castTypeDocument = "1";
        } else if (typeDocumentUpper.contains("NIT")) {
            castTypeDocument = "3";
        }
        return castTypeDocument;

    }

    public static String subStringNumberCreditCard(String data) {
        return StringUtils.substring(data, data.length() - 4, data.length());
    }

    public static String creditCardFormat(String number, String accountType) {
        return accountType + " " + "****" + subStringNumberCreditCard(number);
    }

    public static String typeCreditCardInNumber(String accountType) {
        String accountTypeUpper = accountType.toUpperCase();
        String castAccountType = "";
        if (accountTypeUpper.contains("AMERICAN EXPRESS") || accountTypeUpper.contains("MASTERCARD") || accountTypeUpper.contains("VISA")) {
            castAccountType = "1";
        }
        return castAccountType;
    }

    public static String detailCreditCardFormatValue(String dato) {
        return StringUtils.removePattern(dato, "[/.|/,$USD-]");
    }


    public static String detailDepositAccountFormatValue(String dato) {
        return StringUtils.removePattern(dato, "[/.|/,$USD-]");
    }

    public static String deleteTilda(String cad) {
        String normalizedCad = Normalizer.normalize(cad, Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizedCad).replaceAll("");
    }

    public static String removeMiddleScriptForEmpty(String dataToRemove) {
        return dataToRemove.replaceAll(REMOVE_MIDDLE_SCRIPT, EMPTY);
    }

    public static String getNumero(String cadena) {
        String cadenaFinal;
        char[] arrayCadena = cadena.toCharArray();
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < arrayCadena.length; i++) {
            if (Character.isDigit(arrayCadena[i])) {
                n.append(arrayCadena[i]);
            }
        }
        cadenaFinal = n.toString();
        return cadenaFinal;
    }

    public static String getNumeroRegex(String cadena) {
        return cadena.replaceAll("[a-zA-Z]*[-.,:$*+^´'`<>}?¿/\\]\\[\\s]*", "");
    }

    public static void posicionarElementoInicioPantalla(WebElement elemento, Actor actor) {
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].scrollIntoView();", elemento, true);
    }

    public static String castCurrency(String currency) {
        String currencyUpper = currency.toUpperCase().trim();
        String castCurrency = "";
        if (("$").equals(currencyUpper)) {
            castCurrency = "1";
        } else if (("USD $").equals(currencyUpper)) {
            castCurrency = "2";
        }
        return castCurrency;
    }

    public static List<Map<String, String>> ordenarListMapPorLlave(List<Map<String, String>> listMapOrdenar, String llaveOrdenar) {
        List<Map<String, String>> listaTemporal = listMapOrdenar;
        Collections.sort(listaTemporal, new Comparator<Map<String, String>>() {
            public int compare(final Map<String, String> m1, final Map<String, String> m2) {
                return m1.get(llaveOrdenar).compareTo(m2.get(llaveOrdenar));
            }
        });
        return listaTemporal;
    }

    public static String darFormatocondecimales(String valor) {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat asignarFormato = new DecimalFormat("0,000.00", simbolo);
        return "$" + " " + asignarFormato.format(Double.parseDouble(valor));
    }


    public static String eliminarDosDecimales(String valor) {
        if (valor.contains(".")) {
            valor = valor.replace(".", "").substring(0, valor.length() - 3);
        }
        return valor;
    }

    public static String removeAccents(String text) {
        return text == null ? null : Normalizer.normalize(text, Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static String formatearMoneda(String moneda) {
        String monedaMayuscula = moneda.toUpperCase().trim();
        String monedaActual = "";
        if (("$").equals(monedaMayuscula)) {
            monedaActual = "COP";
        } else if (("USD $").equals(monedaMayuscula)) {
            monedaActual = "USD";
        }
        return monedaActual;
    }

    public static String formatearFecha(String fecha, String formatoActual, String formatoNuevo) {

        SimpleDateFormat actualFormato = new SimpleDateFormat(formatoActual);
        SimpleDateFormat nuevoFormato = new SimpleDateFormat(formatoNuevo);
        String fechaFormateada = "";
        try {
            Date fFormato = actualFormato.parse(fecha);
            fechaFormateada = nuevoFormato.format(fFormato);
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return fechaFormateada;
    }


}