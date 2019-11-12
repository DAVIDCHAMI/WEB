package co.com.bancolombia.certificacion.svp.integration.transversal;

import co.com.bancolombia.backend.iseries.transversal.log.trace.BackTrace;
import co.com.bancolombia.backend.modelo.transversal.Transaccion;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import co.com.bancolombia.backend.utilidades.enums.CanalesSistemas;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.EMPTY;

public class Trace {

    private static final Logger LOGGER = LogManager.getLogger(Trace.class.getName());

    private Trace() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static String consultarTrace() throws SQLException {
        BackTrace traceDAO = new BackTrace();
        try {
            Usuario document = new Usuario();
            document.setDocumento(DatosPrueba.getMap().get("numeroDocumento").toString());
            Transaccion transaccion = new Transaccion();
            transaccion.setCodigoTransaccion(DatosPrueba.getMap().get("codigoTransaccion").toString());
            transaccion.setHoraTransaccion(DatosPrueba.getMap().get("horaTransaccion").toString());
            return traceDAO.consultarTrace(document, transaccion, CanalesSistemas.WWW);

        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return EMPTY;
    }
}
