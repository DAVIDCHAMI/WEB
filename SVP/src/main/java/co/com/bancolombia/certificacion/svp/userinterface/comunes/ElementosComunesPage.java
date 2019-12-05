package co.com.bancolombia.certificacion.svp.userinterface.comunes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class ElementosComunesPage {
    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar").located(By.id("ContinueButton"));

    private ElementosComunesPage() {
        throw new IllegalStateException(UI_CLASS);
    }
}
