package co.com.bancolombia.certificacion.svp.tasks.recordarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.tasks.recordarusuario.LlenarFormularioRecordarUsuario.llenaElFormularioDelRecordarUsuario;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.BTN_OLVIDASTE_TU_USUARIO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.INTENTOS_RECORDAR_USUARIO;

public class BloquearPorMaximoDeIntentos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_OLVIDASTE_TU_USUARIO));
        for (int i = 0; i < INTENTOS_RECORDAR_USUARIO; i++) {
            actor.attemptsTo(llenaElFormularioDelRecordarUsuario());
        }

    }

    public static BloquearPorMaximoDeIntentos bloqueaLaContrasenaPorMaximoDeIntentos(){
        return Tasks.instrumented (BloquearPorMaximoDeIntentos.class);
    }
}
