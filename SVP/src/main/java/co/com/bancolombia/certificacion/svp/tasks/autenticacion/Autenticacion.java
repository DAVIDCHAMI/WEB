package co.com.bancolombia.certificacion.svp.tasks.autenticacion;


import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.*;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {

    public static Autenticacion autenticarseEnLaSVP() {
        return instrumented(Autenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get("usuario").toString()).into(TXT_NOMBRE_USUARIO),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(DatosPrueba.getMap().get("clave").toString()).into(TXT_CLAVE),
                Click.on(BTN_CONTINUAR)
        );
    }
}