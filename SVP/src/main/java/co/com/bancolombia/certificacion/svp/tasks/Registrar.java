package co.com.bancolombia.certificacion.svp.tasks;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.userinterface.registro.RegistrarUsuarioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {

    public static Performable usuario(){
        return instrumented(Registrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get("usuario").toString()).into(TXT_CREAR_USUARIO),
                Enter.theValue(DatosPrueba.getMap().get("correoElectronico").toString()).into(TXT_CORREO_ELECTRONICO),
                Enter.theValue(DatosPrueba.getMap().get("celular").toString()).into(TXT_CELULAR),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(DatosPrueba.getMap().get("palabraClave").toString()).into(TXT_PALABRA_CLAVE),
                Click.on(CHK_TERMINOS_CONDICIONES),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_REGISTRAR_USUARIO),
                Click.on(BTN_CONTINUAR)
        );
    }
}
