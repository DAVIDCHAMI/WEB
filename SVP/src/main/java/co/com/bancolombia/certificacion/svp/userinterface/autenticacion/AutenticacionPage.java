package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AutenticacionPage extends PageObject {
    public static final Target TXT_NOMBRE_USUARIO = Target.the("Campo Nombre de usuario").located(By.id("UsernameInput"));
    public static final Target LNK_OLVIDASTE_CONTRASENA = Target.the("Link olvido contraseña").locatedBy("//span[@class='padding-base']");
    public static final Target LNK_PROBLEMAS_CONEXION = Target.the("Link problemas conexion").located(By.id("b3-Input_Input1"));
    public static final Target TXT_CLAVE = Target.the("Campo clave de usuario").locatedBy("//input[@id='b3-Input_Input1']");
    public static final Target LNK_GENERAR_CLAVE = Target.the("Link generar clave").locatedBy("");
    public static final Target IMG_USUARIO=Target.the("Imagen de seguridad del usuario").located(By.id("UserImage"));
    public static final Target TEXT_FRASE_SEGURIDAD=Target.the("Frase de seguridad del usuario").located(By.id("Phrase2"));
    public static final Target TEXT_NOMBRE_USUARIO=Target.the("Nombre de usuario").locatedBy("");
    public static final Target MSG_USUARIO_REGISTRADO=Target.the("mensage que indica que el usuario ya se encuentra registrado").locatedBy("//div[@id='b7-MessageContent']");
    public static final Target MSG_CLAVE_INVALIDA=Target.the("Mensaje de clave invalida").locatedBy("//div[@id='b7-MessageContent']");
    public static final Target MSG_CLAVE_BLOQUEADA=Target.the("Mensaje de clave bloqueada").locatedBy("//div[@id='b7-MessageContent']");
}


