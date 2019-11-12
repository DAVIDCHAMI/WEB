package co.com.bancolombia.certificacion.svp.questions.backend.logsti;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TRAMA_TR;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityManager.addZerosLeft;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.clearReport;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.validateField;

public class VerificacionBasicaLogSti {

    private VerificacionBasicaLogSti() {
        throw new IllegalStateException(ConstantTypeClass.QUESTION_CLASS);
    }

    public static boolean verificacionLogSti(Map<String, String> resultadoEsperado, List<Map<String, Object>> registros) {
        clearReport();
        List<Map<String, Object>> resultadoObtenido = registros;
        String tramaTr = resultadoObtenido.get(0).toString().replace("mensaje=", "");
        boolean resultadoVerificacion = false;
        if (!resultadoObtenido.isEmpty()) {
            resultadoVerificacion = true;
            resultadoVerificacion = validateField("Documento " + TRAMA_TR, tramaTr.substring(197, 212), resultadoEsperado.get(Log.DOCUMENTO.getName()), resultadoVerificacion);
            resultadoVerificacion = validateField("Tipo documento " + TRAMA_TR, tramaTr.substring(212, 213), resultadoEsperado.get(Log.TIPO_DOCUMENTO.getName()), resultadoVerificacion);
            resultadoVerificacion = validateField("Trace " + TRAMA_TR, tramaTr.substring(97, 109), resultadoEsperado.get(Log.TRACE.getName()), resultadoVerificacion);
            resultadoVerificacion = validateField("Codigo Transaccion " + TRAMA_TR, tramaTr.substring(193, 197), resultadoEsperado.get(Log.CODIGO_TRANSACCION.getName()), resultadoVerificacion);
            resultadoVerificacion = validateField("Fecha " + TRAMA_TR, tramaTr.substring(229, 237), resultadoEsperado.get(Log.FECHA.getName()), resultadoVerificacion);
        }
        return resultadoVerificacion;
    }

    public static Map<String, String> obtenerDatosBasicosTransaccion() {
        Map<String, String> mapaDatos = new HashMap<>();
        mapaDatos.put(Log.DOCUMENTO.getName(), addZerosLeft(DatosPrueba.getMap().get("numeroDocumento").toString(), 15));
        mapaDatos.put(Log.TIPO_DOCUMENTO.getName(), DatosPrueba.getMap().get("tipoDocumento").toString());
        mapaDatos.put(Log.CODIGO_TRANSACCION.getName(), DatosPrueba.getMap().get("codigoTransaccion").toString());
        mapaDatos.put(Log.FECHA.getName(), DatosPrueba.getMap().get("fechaTransaccion").toString());
        mapaDatos.put(Log.TRACE.getName(), DatosPrueba.getMap().get("trace").toString());
        return mapaDatos;
    }
}