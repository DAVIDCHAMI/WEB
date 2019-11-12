package co.com.bancolombia.certificacion.svp.utilities.managers;

import java.util.Map;

public class ValueTrasnformation {

    private ValueTrasnformation() {
    }

    public static String removeZerosTotheLeft(String number) {

        Double intNumber;
        intNumber = Double.parseDouble(number);
        String numberEnd = "";

        if (intNumber > 0) {
            String strPattern = "^0+";
            numberEnd = number.replaceAll(strPattern, "");
        } else {
            numberEnd = "0";
        }

        return numberEnd;
    }

    public static String convertNullToZero(Map<String, Object> dataNull, String nameKey) {
        if (dataNull.get(nameKey) == null) {
            return "0";
        } else {
            return dataNull.get(nameKey).toString();
        }
    }

    public static String convertDateNullToZeros(Map<String, Object> dataNull, String nameKey) {
        if (dataNull.get(nameKey) == null) {
            return "00000000";
        } else {
            return dataNull.get(nameKey).toString();
        }
    }

    public static String deleteLastZerosInTheBalance(String balance) {

        if (balance.contains(".0000")) {
            balance = balance.replace(".0000", "");
        } else if (balance.contains(".00")) {
            balance = balance.replace(".00", "");
        }

        return balance;

    }

    public static String convertirFormatoDecimal(String numero) {
        int index;
        index = numero.indexOf('.');
        numero = numero.substring(0, index);
        return numero;
    }


    public static String deleteZerosRightInTheBalance(String balance, int cantZeroDelete) {
        return balance.substring(0, balance.length() - cantZeroDelete);
    }

}
