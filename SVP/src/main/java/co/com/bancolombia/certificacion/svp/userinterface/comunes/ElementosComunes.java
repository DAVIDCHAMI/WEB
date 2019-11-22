package co.com.bancolombia.certificacion.svp.userinterface.comunes;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class ElementosComunes {
    public static final Target BOTON_ACEPTAR = Target.the("boton aceptar").located(id("btnGo"));
    public static final Target ETIQUETA_MENSAJE_ERROR = Target.the("mensaje de error").located(id("summary"));

    private ElementosComunes() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }
}
