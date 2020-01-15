package co.com.bancolombia.certificacion.svp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.LBL_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cargar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        while(LBL_CARGANDO.resolveFor(actor).isVisible()){}
    }

    public static Performable transaccion(){
        return instrumented(Cargar.class);
    }
}