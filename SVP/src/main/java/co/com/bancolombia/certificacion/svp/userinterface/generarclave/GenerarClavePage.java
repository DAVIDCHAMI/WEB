package co.com.bancolombia.certificacion.svp.userinterface.generarclave;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class GenerarClavePage {
    public static final Target LST_TIPO_DOCUMENTO = Target.the("Select tipo de documento").locatedBy("");
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Campo Numero de documento").locatedBy("");
    public static final Target TXT_CLAVE_USUARIO = Target.the("Campo clave usuario").locatedBy("");
    public static final Target TXT_CONFIRMAR_CLAVE_USUARIO = Target.the("Campo Confirmar clave de usuario").locatedBy("");
    public static final Target BTN_GENERAR_CLAVE = Target.the("Boton generar clave").locatedBy("");
    public static final Target LBL_CONFIRMACION_GENERAR = Target.the("Label Confirmar Generar clave").locatedBy("");
    public static final Target LBL_FECHA_HORA_GENERAR = Target.the("Label fecha generar clave").locatedBy("");

    private GenerarClavePage() {
    throw new IllegalStateException(UI_CLASS);
    }
}
