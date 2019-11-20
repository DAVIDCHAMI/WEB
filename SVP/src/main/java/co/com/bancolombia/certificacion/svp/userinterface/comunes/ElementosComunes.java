package co.com.bancolombia.certificacion.svp.userinterface.comunes;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class ElementosComunes {
    public static final Target BOTON_ACEPTAR = Target.the("boton aceptar").located(id("btnGo"));
    public static final Target ETIQUETA_MENSAJE_EXITOSO = Target.the(("successful mesage")).located(id("messageConfirmation"));
    public static final Target ETIQUETA_MENSAJE_ERROR = Target.the("mensaje de error").located(id("summary"));
    public static final Target GIF_CARGANDO_BANCOLOMBIA = Target.the("gif cargando").located(id("loading-indicator-undefined"));
    public static final Target FRAME_PRINCIPAL = Target.the("frame principal").located(id("ifrm"));
    public static final Target MENU_OPCION_INICIO = Target.the("opcion menu inicio").located(id("home"));
    public static final Target MENU_PRINCIPAL = Target.the("menu principal").locatedBy("//li[starts-with(@class, 'firt_level_menu')]/child::a[contains(text(),'{0}')]");
    public static final Target SUB_MENU = Target.the("submenu").locatedBy("//li[starts-with(@class, 'second_level_menu_item')]/child::a[@id = '{0}']");
    public static final Target CLAVE_DINAMICA = Target.the("clave dinamica").located(id("passwordS1"));
    public static final Target BOTON_SIGUIENTE_PAGINA= Target.the("Página siguiente").located(By.xpath("//span[@class='glyphicon icon-paginador-siguiente icon_PagText']"));

    private ElementosComunes() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }
}
