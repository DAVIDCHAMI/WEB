package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionConDocumento.autenticarseConDocumentoEnLaSVP;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.userinterface.registrarusuario.RegistrarUsuarioPage.*;
import static co.com.bancolombia.certificacion.svp.userinterface.registrarusuario.RegistrarUsuarioPage.TXT_CREAR_USUARIO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class LlenarFormularioRegistro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(autenticarseConDocumentoEnLaSVP(),
                Enter.theValue(DatosPrueba.getMap().get(USUARIO).toString()).into(TXT_CREAR_USUARIO),
                Enter.theValue(DatosPrueba.getMap().get(CORREO_ELECTRONICO).toString()).into(TXT_CORREO_ELECTRONICO),
                Enter.theValue(DatosPrueba.getMap().get(CELULAR).toString()).into(TXT_CELULAR),
                Click.on(TXT_CREAR_USUARIO),
                Click.on(BTN_CONTINUAR));
    }

    public static LlenarFormularioRegistro llenaFormularioRegistro(){
        return Tasks.instrumented(LlenarFormularioRegistro.class);
    }
}
