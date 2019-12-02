package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class AutenticacionPage extends PageObject {
    public static final Target TXT_NOMBRE_USUARIO = Target.the("Campo Nombre de usuario").locatedBy("");
    public static final Target LNK_OLVIDASTE_CONTRASENA = Target.the("Link olvido contraseña").locatedBy("");
    public static final Target LNK_PROBLEMAS_CONEXION = Target.the("Link problemas conexion").locatedBy("");
    public static final Target TXT_CLAVE = Target.the("Campo clave de usuario").locatedBy("");
    public static final Target LNK_GENERAR_CLAVE = Target.the("Link generar clave").locatedBy("");
}
