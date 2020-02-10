package co.com.bancolombia.certificacion.svp.tasks.autenticacion;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.TXT_CLAVE;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.TXT_NOMBRE_USUARIO;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.CLAVE;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Autenticacion implements Task {

    public static Autenticacion autenticarseEnLaSVP() {
        return instrumented(Autenticacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(),
                Enter.theValue(obtener(USUARIO)).into(TXT_NOMBRE_USUARIO),
                Click.on(BTN_CONTINUAR),WaitUntil.the(TXT_CLAVE, isVisible()),
                Esperar.unTiempo(),
                Enter.theValue(obtener(CLAVE)).into(TXT_CLAVE),
                Click.on(BTN_CONTINUAR), unTiempo()
        );
    }
}