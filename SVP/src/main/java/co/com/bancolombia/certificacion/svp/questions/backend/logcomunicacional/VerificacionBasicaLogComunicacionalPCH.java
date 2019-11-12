package co.com.bancolombia.certificacion.svp.questions.backend.logcomunicacional;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TRAMA_TR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TRAMA_TS;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityManager.addZerosLeft;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityValidatorField.validateField;

public class VerificacionBasicaLogComunicacionalPCH {

    private VerificacionBasicaLogComunicacionalPCH() {
        throw new IllegalStateException(ConstantTypeClass.QUESTION_CLASS);
    }

    public static boolean verificacionBasicaLogComunicacional(Map<String, String> resultadoEsperado, List<Map<String, Object>> registros) {

        List<Map<String, Object>> resultadoObtenido = registros;
        String tramaTS = resultadoObtenido.get(0).toString().replace("mensaje=", "");
        String tramaTR = resultadoObtenido.get(3).toString().replace("mensaje=", "");

        boolean resultadoVerificacion = false;
        boolean resultadoTS = true;
        boolean resultadoTR = true;

        resultadoTS = validateField("Canal " + TRAMA_TS, tramaTS.substring(4, 7), resultadoEsperado.get(Log.CANAL.getName()), resultadoTS);

        resultadoTR = validateField("Canal " + TRAMA_TR, tramaTR.substring(4, 7), resultadoEsperado.get(Log.CANAL.getName()), resultadoTR);
        resultadoTR = validateField("Mensaje respuesta " + TRAMA_TR, tramaTR.substring(122, 181).trim(), resultadoEsperado.get(Log.MENSAJE.getName()), resultadoTR);

        if (resultadoTS && resultadoTR) {
            resultadoVerificacion = true;
        }
        return resultadoVerificacion;
    }

    public static Map<String, String> obtenerDatosBasicosTransaccion() {
        Map<String, String> mapaDatos = new HashMap<>();
        mapaDatos.put(Log.DOCUMENTO.getName(), addZerosLeft(DatosPrueba.getMap().get("numeroDocumento").toString(), 15));
        mapaDatos.put(Log.TIPO_DOCUMENTO.getName(), DatosPrueba.getMap().get("tipoDocumento").toString());
        mapaDatos.put(Log.CANAL.getName(), DatosPrueba.getMap().get("codigoCanal").toString());
        mapaDatos.put(Log.TRACE.getName(), DatosPrueba.getMap().get("trace").toString());
        mapaDatos.put(Log.MENSAJE.getName(), "SUCCESS");
        return mapaDatos;
    }
}
