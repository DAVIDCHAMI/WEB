package co.com.bancolombia.certificacion.svp.interactions.autenticacion;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.TECLADO_CLAVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarClave implements Interaction {

    public static Interaction ingresarClave() {
        return instrumented(IngresarClave.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String clave = DatosPrueba.getMap().get("clave").toString();
        for (int i = 0; i < clave.length(); i++) {
            String strXpath = "//div[contains(@id, '" + clave.charAt(i) + "')]";
            TECLADO_CLAVE.resolveFor(actor).findElement(By.xpath(strXpath)).click();
        }
    }
}