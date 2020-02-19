package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleCrediAgil {
    public static final Target LBL_DETALLE_CREDIAGIL = Target.the("Label para validar la posición sobre el detalle").located(By.id("TitleProductDetail"));
    public static final Target LBL_CUPO_ASIGNADO_CREDIAGIL = Target.the("Label para validar el cupo asignado").located(By.xpath("//div[contains(@id, 'AccountType')]/span[contains(text(),'')]/..//div/span[contains(text(),'')]"));
    public static final Target LBL_CUPO_UTILIZADO_CREDIAGIL = Target.the("Label para validar el cupo utilizado").located(By.xpath("//div[contains(@id, 'TotalBalance')]/span[contains(text(),'')]/..//div/span[contains(text(),'')]"));
    public static final Target LBL_CUPO_DISPONIBLE_CREDIAGIL = Target.the("Label para validar el cupo disponible").located(By.xpath("//div[contains(@id, 'AvailableBalance')]/span[contains(text(),'')]/..//div/span[contains(text(),'')]"));
    public static final Target LBL_CUPO_CANJE_CREDIAGIL =Target.the("Label para validar el cupo de canje").located(By.xpath("//div[contains(@id, 'OverdraftDays5')]/span[contains(text(),'')]/..//div/span[contains(text(),'')]"));
    public static final Target OPC_CREDIAGIL =Target.the("Label para validar el cupo de canje").located(By.xpath("//div[@id='ContainerLinkCrediagil']"));

    private DetalleCrediAgil() {throw new IllegalStateException(UI_CLASS);}
}
