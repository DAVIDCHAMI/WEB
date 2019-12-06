package co.com.bancolombia.certificacion.svp.interactions.wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.TXT_CLAVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitInteraction implements Interaction {

    private int time;

    public WaitInteraction(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(wait(time));
    }

    public static WaitInteraction wait(int time){
        return instrumented(WaitInteraction.class,time);
    }
}