package co.com.bancolombia.certificacion.svp.userinterface.comunes;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class ElementosComunesPage {
    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar").locatedBy("");

    private ElementosComunesPage() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }
}
