package co.com.bancolombia.certificacion.svp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TIEMPO_ESPERA_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {

    private static final Logger LOGGER = LogManager.getLogger(Esperar.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(TIEMPO_ESPERA_LOGIN);
        } catch (InterruptedException e) {
            LOGGER.info("No se realizo la espera definida");
            Thread.currentThread().interrupt();
        }
    }

    public static Esperar unTiempo(){
        return instrumented(Esperar.class);
    }
}