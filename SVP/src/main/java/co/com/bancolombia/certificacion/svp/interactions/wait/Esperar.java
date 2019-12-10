package co.com.bancolombia.certificacion.svp.interactions.wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {
    private int time;

    public Esperar(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(unTiempo(time));
    }

    public static Esperar unTiempo(int time){
        return instrumented(Esperar.class,time);
    }
}