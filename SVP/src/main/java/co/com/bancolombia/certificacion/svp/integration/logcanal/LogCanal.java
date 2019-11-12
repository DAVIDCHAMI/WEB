package co.com.bancolombia.certificacion.svp.integration.logcanal;

import co.com.bancolombia.backend.iseries.consultas.Consulta;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.enums.ClavesConsultasSql;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.*;

import static co.com.bancolombia.certificacion.svp.integration.transversal.Trace.consultarTrace;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class LogCanal {
    private static final Logger LOGGER = LogManager.getLogger(LogCanal.class.getName());

    private LogCanal() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static List<Map<String, Object>> consultaLogCanal(ResourceBundle query, ClavesConsultasSql key) {

        Map<String, Object> parametrosQuery = new HashMap<>();
        List<Map<String, Object>> listaLogCanal = new ArrayList<>();
        try {
            DatosPrueba.getMap().put("trace", consultarTrace());
            parametrosQuery.put("TRACE", consultarTrace());
            String sql = query.getString(key.getQuery());
            listaLogCanal = Consulta.ejecutar(sql, parametrosQuery);
            if (listaLogCanal.size() == 2) {
                if (listaLogCanal.get(0).get(TIPO_MENSAJE).toString().equalsIgnoreCase(TRAMAINPUTCODE) && listaLogCanal.get(1).get(TIPO_MENSAJE).toString().equalsIgnoreCase(TRAMAOUTPUTCODE)) {
                    listaLogCanal.get(0).remove(TIPO_MENSAJE);
                    listaLogCanal.get(1).remove(TIPO_MENSAJE);
                }
            } else {
                LOGGER.error("No se obtuvo trama entrada y/o salida al ejecutar la consulta");
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return listaLogCanal;
    }


}
