package co.com.bancolombia.certificacion.svp.interactions.segundaclave;

import co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException;
import co.com.bancolombia.certificacion.svp.interactions.espera.Esperar;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException.FALLO_LONGITUD_CLAVE;
import static co.com.bancolombia.certificacion.svp.questions.comunes.VerificacionClave.verificacionLongitudDela;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.TECLADO_CLAVE;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BOTON_ACEPTAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class IngresarSegundaClave implements Interaction {

    private static final int LONGITUD_CLAVE = 4;

    public static Interaction ingresarSegundaClave() {
        return instrumented(IngresarSegundaClave.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.esperar(3000));
        if (TECLADO_CLAVE.resolveFor(actor).withTimeoutOf(20, TimeUnit.SECONDS).isVisible()) {
            String segundaClave = DatosPrueba.getMap().get("segundaClave").toString();
            actor.should(seeThat(verificacionLongitudDela(segundaClave.length()), equalTo(LONGITUD_CLAVE)).orComplainWith(FalloAutenticacionException.class, FALLO_LONGITUD_CLAVE));
            for (int i = 0; i < segundaClave.length(); i++) {
                String strXpath = "//div[contains(@id, '" + segundaClave.charAt(i) + "')]";
                TECLADO_CLAVE.resolveFor(actor).findElement(By.xpath(strXpath)).click();
            }
            actor.attemptsTo(Click.on(BOTON_ACEPTAR));
            actor.attemptsTo(Esperar.esperar(5000));
        }
    }
}
