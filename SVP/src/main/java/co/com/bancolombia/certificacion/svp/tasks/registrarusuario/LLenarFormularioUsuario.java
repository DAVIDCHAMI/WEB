package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionConDocumento.autenticarseConDocumentoEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LlenarFormularioRegistro.llenaFormularioRegistro;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;

public class LLenarFormularioUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                llenaFormularioRegistro(),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static LLenarFormularioUsuario llenaElPrimerFormularioDeRegistro(){
        return Tasks.instrumented(LLenarFormularioUsuario.class);
    }
}
