package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;


@NamedUrls(
        {
                @NamedUrl(name = "open.QA", url = "https://{1}")
        }
)
public class Autenticacion extends PageObject {

    public static final Target TEXTO_NOMBRE_USUARIO = Target.the("nombre de usuario").located(By.id("username"));
    public static final Target TECLADO_CLAVE = Target.the("teclado clave").located(By.id("_KEYBRD"));

}
