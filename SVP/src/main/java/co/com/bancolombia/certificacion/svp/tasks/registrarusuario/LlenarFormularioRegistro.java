package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.registrarusuario.RegistrarUsuario.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.*;

public class LlenarFormularioRegistro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener(USUARIO)).into(TXT_CREAR_USUARIO),
                Enter.theValue(obtener(CORREO_ELECTRONICO)).into(TXT_CORREO_ELECTRONICO),
                Enter.theValue(obtener(CELULAR)).into(TXT_CELULAR),
                Click.on(TXT_CREAR_USUARIO)
        );
    }

    public static LlenarFormularioRegistro llenaFormularioRegistro() {
        return Tasks.instrumented(LlenarFormularioRegistro.class);
    }
}
