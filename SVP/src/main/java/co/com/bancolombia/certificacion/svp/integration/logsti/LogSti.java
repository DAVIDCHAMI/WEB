package co.com.bancolombia.certificacion.svp.integration.logsti;

import co.com.bancolombia.backend.iseries.consultas.Consulta;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.ClavesConsultasSql;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TIPO_MENSAJE;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TR;

public class LogSti {

    private static final Logger LOGGER = LogManager.getLogger(LogSti.class.getName());

    private LogSti() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static List<Map<String, Object>> consultaLogSti(ResourceBundle query, ClavesConsultasSql key) {
        Map<String, Object> parametrosQuery = new HashMap<>();
        List<Map<String, Object>> listaLogSti = new ArrayList<>();
        String trace = Serenity.sessionVariableCalled("TRACE");
        trace = String.format("%s%s%s", "%", trace, "%");
        parametrosQuery.put("TRACE", trace);
        parametrosQuery.put("TIPOMENSAJE", TR);
        String sql = query.getString(key.getQuery());
        listaLogSti = Consulta.ejecutar(sql, parametrosQuery);
        if (listaLogSti.size() == 1) {
            if (listaLogSti.get(0).get("tipomsg").toString().equalsIgnoreCase(TR)) {
                listaLogSti.get(0).remove(TIPO_MENSAJE);
            }
        } else {
            LOGGER.error("No se obtuvo registro TR al ejecutar la consulta");
        }
        return listaLogSti;
    }

}