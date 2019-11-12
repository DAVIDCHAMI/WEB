package co.com.bancolombia.certificacion.svp.interactions.autenticacion;

import co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.bancolombia.certificacion.svp.exceptions.autenticacion.FalloAutenticacionException.FALLO_LONGITUD_CLAVE;
import static co.com.bancolombia.certificacion.svp.questions.comunes.VerificacionClave.verificacionLongitudDela;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.TECLADO_CLAVE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class IngresarClave implements Interaction {

    private static final int LONGITUD_CLAVE = 4;

    public static Interaction ingresarClave() {
        return instrumented(IngresarClave.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String clave = DatosPrueba.getMap().get("clave").toString();
        actor.should(seeThat(verificacionLongitudDela(clave.length()), equalTo(LONGITUD_CLAVE)).orComplainWith(FalloAutenticacionException.class, FALLO_LONGITUD_CLAVE));
        for (int i = 0; i < clave.length(); i++) {
            String strXpath = "//div[contains(@id, '" + clave.charAt(i) + "')]";
            TECLADO_CLAVE.resolveFor(actor).findElement(By.xpath(strXpath)).click();

        }
    }
}
