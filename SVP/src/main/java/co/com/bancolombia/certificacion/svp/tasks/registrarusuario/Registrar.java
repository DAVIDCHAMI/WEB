package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LlenarFormularioRegistro.llenaFormularioRegistro;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.userinterface.registrarusuario.RegistrarUsuarioPage.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {

    public static Performable usuario(){
        return instrumented(Registrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(llenaFormularioRegistro(),
                Enter.theValue(DatosPrueba.getMap().get(PALABRA_CLAVE).toString()).into(TXT_PALABRA_CLAVE),
                Click.on(CHK_TERMINOS_CONDICIONES),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_REGISTRAR_USUARIO),
                Click.on(BTN_CONTINUAR)
        );
    }
}