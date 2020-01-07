package co.com.bancolombia.certificacion.svp.userinterface.inicio;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class InicioPage {

    public static final Target LBL_PRODUCTOS = Target.the("Productos").locatedBy("//*[contains(text(), '{0}')]");
    public static final Target LBL_PRODUCTOS_OCULTOS = Target.the("Productos ocultos").locatedBy("");

    private InicioPage() {throw new IllegalStateException(UI_CLASS);}
}
