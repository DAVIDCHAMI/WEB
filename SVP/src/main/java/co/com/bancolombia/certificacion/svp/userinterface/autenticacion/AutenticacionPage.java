package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutenticacionPage extends PageObject {
    public static final Target TXT_NOMBRE_USUARIO = Target.the("Campo Nombre de usuario").located(By.id("UsernameInput"));
    public static final Target LNK_OLVIDASTE_CONTRASENA = Target.the("Link olvido contraseña").locatedBy("//span[@class='padding-base']");
    public static final Target LNK_PROBLEMAS_CONEXION = Target.the("Link problemas conexion").located(By.id("b3-Input_Input1"));
    public static final Target TXT_CLAVE = Target.the("Campo clave de usuario").located(By.id("b3-Input_TextVar"));
    public static final Target LNK_GENERAR_CLAVE = Target.the("Link generar clave").locatedBy("//span[@id='GeneratePassLabel']/..");
    public static final Target IMG_USUARIO=Target.the("Imagen de seguridad del usuario").located(By.id("UserImage"));
    public static final Target LBL_FRASE_SEGURIDAD=Target.the("Frase de seguridad del usuario").located(By.id("Phrase2"));
    public static final Target LBL_LOGIN_USUARIO=Target.the("Nombre de usuario").locatedBy("//div[@id='b1-Title']/span[contains(text(),'Hola')]");
    public static final Target LBL_CLAVE_INVALIDA=Target.the("Mensaje de clave invalida").located(By.id("b7-MessageContent"));
    public static final Target LBL_CLAVE_BLOQUEADA=Target.the("Mensaje de clave bloqueada").located(By.id("b7-ErrorDescription"));
    public static final Target BTN_OLVIDASTE_TU_USUARIO = Target.the("Boton Recordar").locatedBy("//a[@id='ForgetLink']/span");
}