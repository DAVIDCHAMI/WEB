package co.com.bancolombia.certificacion.svp.tasks.autenticacion;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunesPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CLAVE;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.USUARIO;

public class AutenticacionSinImagenSinFrase implements Task {

    public static AutenticacionSinImagenSinFrase autenticarseEnLaSVPSinImagen() {
        return instrumented(AutenticacionSinImagenSinFrase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosPrueba.getMap().get(USUARIO).toString()).into(TXT_NOMBRE_USUARIO),
                Click.on(BTN_CONTINUAR));
        if (!LBL_FRASE_SEGURIDAD.resolveFor(actor).isPresent() && !IMG_USUARIO.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                     Enter.theValue(DatosPrueba.getMap().get(CLAVE).toString()).into(TXT_CLAVE),
                    Click.on(BTN_CONTINUAR), unTiempo());
        }
    }
}
