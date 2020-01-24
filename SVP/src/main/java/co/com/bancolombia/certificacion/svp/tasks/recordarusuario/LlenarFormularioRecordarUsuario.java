package co.com.bancolombia.certificacion.svp.tasks.recordarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.recordarusuario.RecordarUsuario.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.CLAVE;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.NUMERO_DOCUMENTO;

public class LlenarFormularioRecordarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener(NUMERO_DOCUMENTO)).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(obtener(CLAVE)).into(TXT_CLAVE),
                Click.on(BTN_RECORDAR)
        );
    }

    public static LlenarFormularioRecordarUsuario llenaElFormularioDelRecordarUsuario() {
        return Tasks.instrumented(LlenarFormularioRecordarUsuario.class);
    }
}