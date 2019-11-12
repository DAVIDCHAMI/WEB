package co.com.bancolombia.certificacion.svp.integration.logcomunicacional;

import co.com.bancolombia.backend.iseries.consultas.Consulta;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.ClavesConsultasSql;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class LogComunicacionalPCH {

    private static final Logger LOGGER = LogManager.getLogger(LogComunicacionalPCH.class.getName());

    private LogComunicacionalPCH() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static List<Map<String, Object>> consultaLogComunicacionalPCH(ResourceBundle query, ClavesConsultasSql key, String trace) {
        Map<String, Object> parametrosQuery = new HashMap<>();
        List<Map<String, Object>> listaResultado = new ArrayList<>();
        trace = String.format("%s%s%s", "%", trace, "%");
        parametrosQuery.put("TRACE", trace);
        String sql = query.getString(key.getQuery());
        listaResultado = Consulta.ejecutar(sql, parametrosQuery);
        if (listaResultado.size() == 4) {
            if (listaResultado.get(0).get(TIPO_MENSAJE).toString().equalsIgnoreCase(TS)
                    && listaResultado.get(1).get(TIPO_MENSAJE).toString().equalsIgnoreCase(SN)
                    && listaResultado.get(2).get(TIPO_MENSAJE).toString().equalsIgnoreCase(RC)
                    && listaResultado.get(3).get(TIPO_MENSAJE).toString().equalsIgnoreCase(TR)
            ) {
                listaResultado.get(0).remove(TIPO_MENSAJE);
                listaResultado.get(1).remove(TIPO_MENSAJE);
                listaResultado.get(2).remove(TIPO_MENSAJE);
                listaResultado.get(3).remove(TIPO_MENSAJE);
            }
        } else {
            LOGGER.error("Numero de registros obtenidos al ejecutar la consulta: " + listaResultado.size());
        }
        return listaResultado;
    }

}
