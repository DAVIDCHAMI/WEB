package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleFondosInversion {
    public static final Target LBL_DETALLE_FONDO = Target.the("Label para validar posición sobre el detalle").located(By.id("TitleProductDetail"));
    public static final Target LBL_TIPO_FONDO = Target.the("Label para validar el tipo de fondo").located(By.xpath("//div[contains(@id,'AccountType')]/span/..//div[2]"));
    public static final Target LBL_SALDO_DISPONIBLE_FONDO = Target.the("Label para validar el saldo disponible del fondo").located(By.xpath("//div[contains(@id,'AvailableBalance')]/span/..//div/span[contains(text(),'')]"));
    public static final Target LBL_SALDO_TOTAL_FONDO = Target.the("Label para validar el saldo total del fondo").located(By.xpath("//div[contains(@id,'TotalBalance')]/span/..//div/span[contains(text(),'')]"));
    public static final Target LBL_FECHA_VENCIMIENTO_FONDO = Target.the("Label para validar la fecha de vencimiento del fondo").located(By.xpath("//div[contains(@id,'TradeAmountChecking')]/span/..//div/span[contains(text(),'')]"));

    private DetalleFondosInversion() {throw new IllegalStateException(UI_CLASS);}
}
