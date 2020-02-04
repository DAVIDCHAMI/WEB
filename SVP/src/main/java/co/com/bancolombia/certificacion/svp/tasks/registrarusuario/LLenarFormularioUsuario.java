package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LlenarFormularioRegistro.llenaFormularioRegistro;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BTN_CONTINUAR;

public class LLenarFormularioUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(),
                llenaFormularioRegistro(),
                Esperar.unTiempo(),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static LLenarFormularioUsuario llenaElPrimerFormularioDeRegistro() {
        return Tasks.instrumented(LLenarFormularioUsuario.class);
    }
}