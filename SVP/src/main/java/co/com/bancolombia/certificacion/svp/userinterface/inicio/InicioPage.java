package co.com.bancolombia.certificacion.svp.userinterface.inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class InicioPage {
    public static final Target LBL_PRODUCTOS = Target.the("Productos")
            .locatedBy("//*[text()='{0}']");
    public static final Target LBL_CUENTAS = Target.the ("Label Cuentas")
            .located (By.id("AccountsRow"));
    public static final Target LBL_TARJETAS_CREDITO = Target.the ("Label Tarjetas de credito")
            .located (By.id("CreditCardContainer"));
    public static final Target LBL_CREDITOS = Target.the ("Label Creditos")
            .located (By.id ("CreditRow"));
    public static final Target LBL_INVERSIONES = Target.the ("Label Inversiones")
            .located (By.id(""));
    public static final Target LBL_CREDIAGIL = Target.the ("Label Crediagil")
            .located (By.id("CreditAgilRow"));
    public static final Target LBL_PRODUCTOS_OCULTOS_CUENTAS = Target.the("Productos ocultos")
            .locatedBy("//*[@id='AccountsRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO = Target.the("Productos ocultos")
            .locatedBy("//*[@id='CreditCardContainer']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_CREDITOS = Target.the("Productos ocultos")
            .locatedBy("//*[@id='CreditRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_INVERSIONES = Target.the("Productos ocultos")
            .locatedBy("");
    public static final Target LBL_PRODUCTOS_OCULTOS_CREDIAGIL = Target.the("Productos ocultos")
            .locatedBy("//*[@id='CreditAgilRow']//div[@class='text-message no-responsive']");

    private InicioPage() {throw new IllegalStateException(UI_CLASS);}
}