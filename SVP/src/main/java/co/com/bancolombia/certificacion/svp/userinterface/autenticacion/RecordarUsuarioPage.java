package co.com.bancolombia.certificacion.svp.userinterface.autenticacion;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class RecordarUsuarioPage {
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Campo numero de documento").locatedBy("");
    public static final Target TXT_CLAVE = Target.the("Campo clave de usuario").locatedBy("");
    public static final Target BTN_RECORDAR = Target.the("Boton Recordar").locatedBy("");
    public static final Target LBL_CONFIRMACION_RECORDAR = Target.the("Label Confirmar recordar usuario").locatedBy("");
    public static final Target LBL_COMPROBANTE_RECORDAR = Target.the("Label Numero de comprobante recordar usuario").locatedBy("");
    public static final Target LBL_FECHA_HORA_RECORDAR = Target.the("Label fecha recordar usuario").locatedBy("");

    private RecordarUsuarioPage() {
        throw new IllegalStateException(UI_CLASS);
    }
}
