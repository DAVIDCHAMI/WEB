package co.com.bancolombia.certificacion.svp.tasks.comunes;

import co.com.bancolombia.backend.iseries.transversal.log.canal.BackLogCanal;
import co.com.bancolombia.certificacion.svp.utilities.properties.GeneralProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class PropiedadesEntorno implements Task {

    private static final Logger LOGGER = LogManager.getLogger(BackLogCanal.class.getName());

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            GeneralProperties.loadProperties();
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
