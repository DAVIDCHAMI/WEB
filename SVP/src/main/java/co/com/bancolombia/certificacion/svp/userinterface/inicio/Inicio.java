package co.com.bancolombia.certificacion.svp.userinterface.inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class Inicio {
    public static final Target LBL_PRODUCTOS = Target.the("Productos")
            .locatedBy("//*[text()='{0}']");
    public static final Target LBL_PRODUCTOS_CONSULTA_PAGOS = Target.the("Productos con pagos pendientes")
            .locatedBy("//*[text()='{0}']/../../../../div[3]/div/span/div[text()= 'Pagar']");
    public static final Target LBL_PRODUCTOS_CONSULTA_PAGOS_CREDITOS = Target.the("Productos con pagos pendientes")
            .locatedBy("//*[text()='{0}']/../../../following-sibling::div[2]/div/div[text()= 'Pagar']");
    public static final Target LBL_CUENTAS = Target.the ("Label Cuentas")
            .locatedBy ("//*[@id='AccountsRow']//span[text()='Cuentas']");
    public static final Target LBL_TARJETAS_CREDITO = Target.the ("Label Tarjetas de credito")
            .located (By.id("CreditCardRow"));
    public static final Target LBL_TARJETAS_CREDITO_PAGOS = Target.the ("Label Tarjetas de credito de Consultas de Pagos")
            .locatedBy ("//div[@id='CreditCardPaymentTitle']//span[@id='CreditCardPaymentTitleLabel']");
    public static final Target LBL_CREDITOS = Target.the ("Label Creditos")
            .located (By.id ("CreditRow"));
    public static final Target LBL_CREDITOS_PAGOS = Target.the ("Label Creditos de Consultas de Pagos")
            .locatedBy ("//div[@id='CreditPaymentTitle']//span[@id='CreditPaymentTitleLabel']");
    public static final Target LBL_INVERSIONES = Target.the ("Label Inversiones")
            .located (By.id("InvestmentsRow"));
    public static final Target LBL_CREDIAGIL = Target.the ("Label Crediagil")
            .located (By.id("CreditAgilRow"));
    public static final Target LBL_PRODUCTOS_OCULTOS_CUENTAS = Target.the("Productos ocultos cuentas")
            .locatedBy("//*[@id='AccountsRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO = Target.the("Productos ocultos tarjetas credito")
            .locatedBy("//*[@id='CreditCardRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_CREDITOS = Target.the("Productos ocultos creditos")
            .locatedBy("//*[@id='CreditRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_INVERSIONES = Target.the("Productos ocultos inversion")
            .locatedBy("//*[@id='InvestmentsRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_CREDIAGIL = Target.the("Productos ocultos crediagil")
            .locatedBy("//*[@id='CreditAgilRow']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO_PAGOS = Target.the("Productos ocultos tarjetas credito de Consultas de Pagos")
            .locatedBy("//div[@id='FeedbackCreditCardPayment']//div[@class='text-message no-responsive']");
    public static final Target LBL_PRODUCTOS_OCULTOS_CREDITOS_PAGOS = Target.the("Productos ocultos creditos de Consultas de Pagos")
            .locatedBy("//div[@id='FeedbackCreditPayment']//div[@class='text-message no-responsive']");
    public static final Target LBL_NO_PRODUCTO_CREDITO = Target.the("Credito Mensaje de no cuenta con el producto en Consultas de Pagos")
            .locatedBy("//div[@id='InlineCreditOfferContainer']//span/../../../div[2]/div/button[contains(.,'LO QUIERO')]");
    public static final Target LBL_NO_PRODUCTO_CREDITO_TARJETA= Target.the("Tarjetas de credito Mensaje de no cuenta con el producto en Consultas de Pagos")
            .locatedBy("//div[@id='InlineCreditCardOffer']//span/../../../div[2]/div/button[text()='LA QUIERO']");
    public static final Target LBL_PRODUCTOS_CONSULTA_PAGOS_SIN_FECHA = Target.the("Productos con pagos pendientes")
            .locatedBy("//*[text()='{0}']/../../../following-sibling::div/div/div/div[@class='product-row-three-column-center-content']");
    public static final Target BTN_SI_CERRAR_SESION= Target.the("Boton si de cerrar sesion ")
            .locatedBy("//button[@class='btn btn-primary margin-base']");
    public  static  final Target BTN_CERRAR_SESISO= Target.the("opción cerrar sesion")
            .locatedBy("//div[@class='action-with-icon display-flex center']");
    public  static  final Target LBL_MENSAJE_VALIDACION_CIERRE_SESION= Target.the("Mensaje para validar sesion")
            .locatedBy("//div[@id='ContainerText']//span");
    public  static  final Target BTN_MENU_INICIO= Target.the("Boton menu incio")
            .locatedBy("//div[@class='menu-icon center']");
    public static final Target LBL_LISTA_CUENTAS_DE_USUARIOS= Target.the("contiene la lista de las cuentas que tiene un usuario")
            .locatedBy("(//div[@id='AccountsRow']//div[@role='tabpanel']/div[@id='SavingAccountsListGroup']/div)[1]");
    public static final Target LBL_LISTA_SALDOS_CUENTAS_DE_USUARIOS= Target.the("contiene la lista de saldos de las cuentas que tiene un usuario")
            .locatedBy("(//div[@id='AccountsRow']//div[@role='tabpanel']/div[@id='SavingAccountsListGroup']//following::span[@class='heading6 text-nunito'])[1]");
    public static final Target LBL_LISTA_NUMERO_CUENTAS_DE_USUARIOS= Target.the("contiene la lista de los numeros de cuentas que tiene un usuario")
            .locatedBy("(//div[contains(@id, 'Content')]/div/div/following::div[contains(@id, 'ColumnLeftPlaceholder')]/div/span[contains(text(),'-')])[1]");
    public static final Target LBL_LISTA_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los creditos que tiene un usuario")
            .locatedBy("(//div[@id='CreditRow']//div[@role='tabpanel']/div[@class='list list-group OSFillParent']/div)[1]");
    public static final Target LBL_LISTA_SALDOS_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los saldos de creditos que tiene un usuario")
            .locatedBy("(//div[@id='CreditRow']//div[contains(@id, 'ColumnRightPlaceholder')]/div[2]/span)[1]");
    public static final Target LBL_LISTA_NUMEROS_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los numeros de creditos que tiene un usuario")
            .locatedBy("(//div[@id='CreditRow']//div[contains(@id, 'ColumnLeftPlaceholder')]/div[2]/span)[1]");
    public static final Target LBL_LISTA_SALDOS_DOLAR_TARJETAS_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los saldos en dolar creditos que tiene un usuario")
            .locatedBy("(//div[@id='CreditCardRow']//div[contains(@id, 'ColumnRightPlaceholder')]/div[3]/span)[1]");
    public static final Target LBL_LISTA_SALDOS_PESO_TARJETAS_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los saldos en peso creditos que tiene un usuario")
            .locatedBy("//div[@id='CreditCardRow']//div[contains(@id, 'ColumnRightPlaceholder')]/div[2]/span");
    public static final Target LBL_LISTA_NUMERO_TARJETAS_CREDITOS_DE_USUARIOS= Target.the("contiene la lista de los numeros en dolar creditos que tiene un usuario")
            .locatedBy("(//div[@id='CreditCardRow']//div[contains(@id, 'ColumnLeftPlaceholder')]/div[2]/span)[1]");
    public static final Target LBL_LISTA_SALDOS_INVERSIONES_DE_USUARIOS= Target.the("contiene la lista de los saldos en inversiones que tiene un usuario")
            .locatedBy("(//div[@id='InvestmentsRow']//div[contains(@id, 'ColumnRightPlaceholder')]/span)[1]");
    public static final Target LBL_LISTA_NUMERO_INVERSIONES_DE_USUARIOS= Target.the("contiene la lista de los numeros en inversiones que tiene un usuario")
            .locatedBy("(//div[@id='InvestmentsRow']//div[contains(@id, 'ColumnLeftPlaceholder')]/div[2]/span)[1]");

    private Inicio() {throw new IllegalStateException(UI_CLASS);}
}