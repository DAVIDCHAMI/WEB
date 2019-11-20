package co.com.bancolombia.certificacion.svp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.interactions.espera.Esperar.esperar;

public class Frame implements Interaction {
    private Target frame;

    public Frame(Target frame) {
        this.frame = frame;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(esperar(7000));
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(frame.resolveFor(actor));
    }
}
