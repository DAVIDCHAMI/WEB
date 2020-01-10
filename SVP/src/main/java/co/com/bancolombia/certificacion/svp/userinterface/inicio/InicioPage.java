package co.com.bancolombia.certificacion.svp.userinterface.inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class InicioPage {
    public static final Target LBL_PRODUCTOS = Target.the("Productos")
            .locatedBy("//*[contains(text(), '{0}')]");
    public static final Target LBL_PRODUCTOS_OCULTOS = Target.the("Productos ocultos")
            .locatedBy("");
    public static final Target LBL_CUENTAS = Target.the ("Label Cuentas")
            .located (By.id(""));
    public static final Target LBL_TARJETASDECREDITO = Target.the ("Label Tarjetas de credito")
            .locatedBy ("");
    public static final Target LBL_CREDITOS = Target.the ("Label Creditos")
            .located (By.id ("b18-label"));
    public static final Target LBL_INVERSIONES = Target.the ("Label Inversiones")
            .locatedBy ("");
    public static final Target LBL_CREDIAGIL = Target.the ("Label Crediagil")
            .locatedBy ("");

    private InicioPage() {throw new IllegalStateException(UI_CLASS);}
}