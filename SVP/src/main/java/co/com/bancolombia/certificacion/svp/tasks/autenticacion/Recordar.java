package co.com.bancolombia.certificacion.svp.tasks.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.RecordarUsuarioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Recordar implements Task {

    public static Performable usuario(){
        return instrumented(Recordar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get("numeroDocumento").toString()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(DatosPrueba.getMap().get("clave").toString()).into(TXT_CLAVE),
                Click.on(BTN_RECORDAR)
        );
    }
}