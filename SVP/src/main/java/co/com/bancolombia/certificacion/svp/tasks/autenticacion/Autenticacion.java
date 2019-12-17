package co.com.bancolombia.certificacion.svp.tasks.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.interactions.wait.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.*;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Autenticacion implements Task {

    public static Autenticacion autenticarseEnLaSVP() {
        return instrumented(Autenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get(USUARIO).toString()).into(TXT_NOMBRE_USUARIO),
                Click.on(BTN_CONTINUAR), WaitUntil.the(TXT_CLAVE, isVisible()),
                Enter.theValue(DatosPrueba.getMap().get(CLAVE).toString()).into(TXT_CLAVE),
                Click.on(BTN_CONTINUAR)
        );
    }
}