package co.com.bancolombia.certificacion.svp.integration.logcanal.autenticacion;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.integration.logcanal.LogCanal.consultaLogCanal;
import static co.com.bancolombia.certificacion.svp.utilities.enums.ClavesConsultasSql.AUTENTICACION_COMFFLGWWW;
import static co.com.bancolombia.certificacion.svp.utilities.managers.QueryManager.QUERY_ISERIES_AUTENTICAION;

public class LogCanalAutenticacion {

    private LogCanalAutenticacion() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static List<Map<String, Object>> consultaAutenticacionLogCanal() {
        return consultaLogCanal(QUERY_ISERIES_AUTENTICAION, AUTENTICACION_COMFFLGWWW);
    }

}