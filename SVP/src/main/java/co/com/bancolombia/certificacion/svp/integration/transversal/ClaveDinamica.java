package co.com.bancolombia.certificacion.svp.integration.transversal;

import co.com.bancolombia.backend.iseries.personas.clavedinamica.BackClaveDinamica;
import co.com.bancolombia.backend.modelo.transversal.Transaccion;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import co.com.bancolombia.backend.utilidades.enums.CanalesSistemas;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class ClaveDinamica {

    private static final Logger LOGGER = LogManager.getLogger(ClaveDinamica.class.getName());

    private ClaveDinamica() {
        throw new IllegalStateException(ConstantTypeClass.INTEGRATION_CLASS);
    }

    public static String consultarClaveDinamica() {
        String claveDinamica = "";
        Usuario usuario = new Usuario();
        Transaccion transaccion = new Transaccion();
        usuario.setDocumento(DatosPrueba.getMap().get("numeroDocumento").toString());
        transaccion.setHoraTransaccion(DatosPrueba.getMap().get("horaTransaccion").toString());
        BackClaveDinamica backClaveDinamica = new BackClaveDinamica();
        try {
            claveDinamica = backClaveDinamica.consultarClaveDinamica(usuario, transaccion, CanalesSistemas.BLP);

        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return claveDinamica;
    }
}
