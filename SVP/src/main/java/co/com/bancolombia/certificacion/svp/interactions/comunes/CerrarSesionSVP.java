package co.com.bancolombia.certificacion.svp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CerrarSesionSVP implements Interaction {

    public static CerrarSesionSVP cerrarSesion() {
        return instrumented(CerrarSesionSVP.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_MENU_INICIO),
              Click.on(BTN_CERRAR_SESISO),
                Click.on(BTN_SI_CERRAR_SESION)
                );
    }
}