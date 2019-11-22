package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class Autenticacion extends PageObject {
    public static final Target TEXTO_NOMBRE_USUARIO = Target.the("nombre de usuario").located(id("username"));
    public static final Target TECLADO_CLAVE = Target.the("teclado clave").located(id("_KEYBRD"));
}
