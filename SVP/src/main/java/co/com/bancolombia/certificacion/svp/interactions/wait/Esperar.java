package co.com.bancolombia.certificacion.svp.interactions.wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TIEMPO_ESPERA_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(TIEMPO_ESPERA_LOGIN);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Esperar unTiempo(){
        return instrumented(Esperar.class);
    }
}