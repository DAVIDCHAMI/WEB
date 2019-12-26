package co.com.bancolombia.certificacion.svp.tasks.recordarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.tasks.recordarusuario.LlenarFormularioRecordarUsuario.llenaElFormularioDelRecordarUsuario;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.BTN_OLVIDASTE_TU_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Recordar implements Task {

    public static Performable usuario() {
        return instrumented(Recordar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OLVIDASTE_TU_USUARIO),
                llenaElFormularioDelRecordarUsuario()
        );
    }
}