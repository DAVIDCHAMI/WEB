package co.com.bancolombia.certificacion.svp.tasks.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.GenerarClavePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Generar implements Task {

    public static Performable clave(){
        return instrumented(Generar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(DatosPrueba.getMap().get("tipoDocumento").toString()).from(LST_TIPO_DOCUMENTO),
                Enter.theValue(DatosPrueba.getMap().get("numeroDocumento").toString()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(DatosPrueba.getMap().get("clave").toString()).into(TXT_CLAVE_USUARIO),
                Enter.theValue(DatosPrueba.getMap().get("clave").toString()).into(TXT_CONFIRMAR_CLAVE_USUARIO),
                Click.on(BTN_GENERAR_CLAVE)
        );
    }
}
