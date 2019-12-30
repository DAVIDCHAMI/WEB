package co.com.bancolombia.certificacion.svp.tasks.recordarusuario;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.userinterface.recordarusuario.RecordarUsuarioPage.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CLAVE;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.NUMERO_DOCUMENTO;

public class LlenarFormularioRecordarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get(NUMERO_DOCUMENTO).toString()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(DatosPrueba.getMap().get(CLAVE).toString()).into(TXT_CLAVE),
                Click.on(BTN_RECORDAR)
        );
    }

    public static LlenarFormularioRecordarUsuario llenaElFormularioDelRecordarUsuario() {
        return Tasks.instrumented(LlenarFormularioRecordarUsuario.class);
    }
}