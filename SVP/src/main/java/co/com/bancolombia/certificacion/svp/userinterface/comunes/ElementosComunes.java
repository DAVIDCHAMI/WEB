package co.com.bancolombia.certificacion.svp.userinterface.comunes;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class ElementosComunes {
    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar").locatedBy("//span[text()='CONTINUAR']");
    public static final Target TXT_MENSAJE_RESPUESTA = Target.the("Mensaje de respuesta").locatedBy("//*[text()='{0}']");
    public static final Target LBL_CARGANDO = Target.the("Mensaje Cargando transaccion").locatedBy("//span[contains(.,'Cargando...')]");

    private ElementosComunes() {
        throw new IllegalStateException(UI_CLASS);
    }
}