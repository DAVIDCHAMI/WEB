package co.com.bancolombia.certificacion.svp.interactions.comunes;

import co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {
    private Autenticacion autenticacion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(autenticacion));
    }

    public static AbrirNavegador paraSVP() {
        return instrumented(AbrirNavegador.class);
    }
}