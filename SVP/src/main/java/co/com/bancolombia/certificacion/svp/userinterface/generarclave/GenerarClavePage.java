package co.com.bancolombia.certificacion.svp.userinterface.generarclave;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class GenerarClavePage {
    public static final Target BTN_ENTIENDO_MODAL = Target.the("Boton modal Entiendo").located(By.xpath("//button[contains(.,'ENTIENDO')]"));
    public static final Target LST_TIPO_DOCUMENTO = Target.the("Select tipo de documento").located(By.xpath("//div[@id='DocumentTypeDropdown']/div/div"));
    public static final Target OPT_TIPO_DOCUMENTO = Target.the("Opciones tipo de documento").locatedBy("");
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Campo Numero de documento").located(By.id("InputDocumentId"));
    public static final Target TXT_CLAVE_USUARIO = Target.the("Campo clave usuario").located(By.id("InputNewPassword"));
    public static final Target TXT_CONFIRMAR_CLAVE_USUARIO = Target.the("Campo Confirmar clave de usuario").located(By.id("InputConfirmNewPassword"));
    public static final Target BTN_GENERAR_CLAVE = Target.the("Boton generar clave").located(By.id("GenerateButton"));
    public static final Target LBL_CONFIRMACION_GENERAR = Target.the("Label Confirmar Generar clave").located(By.id(""));
    public static final Target LBL_FECHA_HORA_GENERAR = Target.the("Label fecha generar clave").located(By.id(""));


    private GenerarClavePage() {
        throw new IllegalStateException(UI_CLASS);
    }
}
