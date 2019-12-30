package co.com.bancolombia.certificacion.svp.tasks.generarclave;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LNK_GENERAR_CLAVE;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.TXT_NOMBRE_USUARIO;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.userinterface.generarclave.GenerarClavePage.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Generar implements Task {

    public static Performable clave() {
        return instrumented(Generar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get(USUARIO).toString()).into(TXT_NOMBRE_USUARIO),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(LNK_GENERAR_CLAVE, isClickable())
        );
        actor.attemptsTo(
                Click.on(LNK_GENERAR_CLAVE)
        );
        actor.attemptsTo(
                Check.whether(BTN_ENTIENDO_MODAL.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_ENTIENDO_MODAL)
                ),
                Click.on(LST_TIPO_DOCUMENTO),
                Click.on(OPT_TIPO_DOCUMENTO.of(DatosPrueba.getMap().get(TIPO_DOCUMENTO).toString())),
                Enter.theValue(DatosPrueba.getMap().get(NUMERO_DOCUMENTO).toString()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(DatosPrueba.getMap().get(CLAVE).toString()).into(TXT_CLAVE_USUARIO),
                Enter.theValue(DatosPrueba.getMap().get(CLAVE).toString()).into(TXT_CONFIRMAR_CLAVE_USUARIO),
                Click.on(BTN_GENERAR_CLAVE)
        );
    }
}