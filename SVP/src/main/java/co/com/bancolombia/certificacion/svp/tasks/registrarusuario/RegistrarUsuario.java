package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionConDocumento.autenticarseConDocumentoEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LLenarFormularioUsuario.llenaElPrimerFormularioDeRegistro;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.userinterface.registrarusuario.RegistrarUsuario.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.PALABRA_CLAVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    public static Performable registrarUsuario() {
        return instrumented(RegistrarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                autenticarseConDocumentoEnLaSVP(),
                llenaElPrimerFormularioDeRegistro(),
                Enter.theValue(obtener(PALABRA_CLAVE)).into(TXT_PALABRA_CLAVE),
                Click.on(CHK_TERMINOS_CONDICIONES),
                Click.on(BTN_CONTINUAR));
        actor.attemptsTo(
                Click.on(BTN_REGISTRAR_USUARIO)
        );
    }
}