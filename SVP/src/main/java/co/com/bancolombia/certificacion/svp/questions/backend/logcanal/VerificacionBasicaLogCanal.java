package co.com.bancolombia.certificacion.svp.questions.backend.logcanal;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityManager.addZerosLeft;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.validateField;

public class VerificacionBasicaLogCanal {

    private VerificacionBasicaLogCanal() {
        throw new IllegalStateException(ConstantTypeClass.QUESTION_CLASS);
    }

    public static boolean verificacionBasicaLogCanal(Map<String, String> resultadoEsperado, List<Map<String, Object>> registros) {

        List<Map<String, Object>> resultadoObtenido = registros;
        String trama0220 = resultadoObtenido.get(0).toString().replace("datos=", "");
        String trama0230 = resultadoObtenido.get(1).toString().replace("datos=", "");
        boolean resultadoVerificacion = false;
        boolean resultadoEntrada = true;
        boolean resultadoSalida = true;

        resultadoEntrada = validateField("Documento " + TRAMA_INPUT, trama0220.substring(5, 20), resultadoEsperado.get(Log.DOCUMENTO.getName()), resultadoEntrada);
        resultadoEntrada = validateField("Trace " + TRAMA_INPUT, trama0220.substring(301, 313), resultadoEsperado.get(Log.TRACE.getName()), resultadoEntrada);
        resultadoEntrada = validateField("Codigo Transaccion " + TRAMA_INPUT, trama0220.substring(313, 317), resultadoEsperado.get(Log.CODIGO_TRANSACCION.getName()), resultadoEntrada);
        resultadoEntrada = validateField("Documento " + TRAMA_INPUT, trama0220.substring(317, 332), resultadoEsperado.get(Log.DOCUMENTO.getName()), resultadoEntrada);
        if (!CODIGO_TRANSACCION_AUTENTICACION.equalsIgnoreCase(resultadoEsperado.get(Log.CODIGO_TRANSACCION.getName()))) {
            resultadoEntrada = validateField("Tipo documento " + TRAMA_INPUT, trama0220.substring(332, 333), resultadoEsperado.get(Log.TIPO_DOCUMENTO.getName()), resultadoEntrada);
        }
        resultadoEntrada = validateField("Fecha " + TRAMA_INPUT, trama0220.substring(359, 367), resultadoEsperado.get(Log.FECHA.getName()), resultadoEntrada);
        resultadoSalida = validateField("Documento " + TRAMA_OUTPUT, trama0230.substring(5, 20), resultadoEsperado.get(Log.DOCUMENTO.getName()), resultadoSalida);
        resultadoSalida = validateField("Codigo Error " + TRAMA_OUTPUT, trama0230.substring(69, 72), resultadoEsperado.get(Log.CODIGO_ERROR.getName()), resultadoSalida);
        resultadoSalida = validateField("Trace " + TRAMA_OUTPUT, trama0230.substring(301, 313), resultadoEsperado.get(Log.TRACE.getName()), resultadoSalida);
        resultadoSalida = validateField("Codigo Transaccion " + TRAMA_OUTPUT, trama0230.substring(313, 317), resultadoEsperado.get(Log.CODIGO_TRANSACCION.getName()), resultadoSalida);
        resultadoSalida = validateField("Documento " + TRAMA_OUTPUT, trama0230.substring(317, 332), resultadoEsperado.get(Log.DOCUMENTO.getName()), resultadoSalida);
        resultadoSalida = validateField("Tipo documento " + TRAMA_OUTPUT, trama0230.substring(332, 333), resultadoEsperado.get(Log.TIPO_DOCUMENTO.getName()), resultadoSalida);
        resultadoSalida = validateField("Fecha " + TRAMA_OUTPUT, trama0230.substring(349, 357), resultadoEsperado.get(Log.FECHA.getName()), resultadoSalida);

        if (resultadoEntrada && resultadoSalida) {
            resultadoVerificacion = true;
        }
        return resultadoVerificacion;
    }

    public static Map<String, String> obtenerDatosBasicosTransaccion() {
        Map<String, String> mapaDatos = new HashMap<>();
        mapaDatos.put(Log.DOCUMENTO.getName(), addZerosLeft(DatosPrueba.getMap().get("numeroDocumento").toString(), 15));
        mapaDatos.put(Log.TIPO_DOCUMENTO.getName(), DatosPrueba.getMap().get("tipoDocumento").toString());
        mapaDatos.put(Log.CODIGO_TRANSACCION.getName(), DatosPrueba.getMap().get("codigoTransaccion").toString());
        mapaDatos.put(Log.FECHA.getName(), DatosPrueba.getMap().get("fechaTransaccion").toString());
        mapaDatos.put(Log.CODIGO_ERROR.getName(), DatosPrueba.getMap().get("codigoError").toString());
        mapaDatos.put(Log.TRACE.getName(), DatosPrueba.getMap().get("trace").toString());
        return mapaDatos;
    }
}
