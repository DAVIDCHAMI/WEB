package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleCuentaAhorroYCorriente {

    public static final Target LBL_DETALLE_PRODUCTO = Target.the("Label para validar posición sobre el detalle").located(By.id("TitleProductDetail"));
    public static final Target LBL_TIPO_CUENTA = Target.the("Label para validar el tipo de cuenta").located(By.xpath("//div[contains(@id, 'AccountType')]/.//span[contains(text(), '')]/../div//span[contains(text(), '')]"));
    public static final Target LBL_SALDO_DISPONIBLE = Target.the("Label para validar el saldo disponible").located(By.xpath("//div[contains(@id, 'AvailableBalance')]//span[contains(text(), '')]/../div//span[contains(text(), '')]"));
    public static final Target LBL_SALDO_TOTAL = Target.the("Label para validar el saldo total").located(By.xpath("//div[contains(@id, 'TotalBalance')]//span[contains(text(), '')]/../div[2]//span[contains(text(), '')]"));
    public static final Target LBL_SALDO_EN_CANJE = Target.the("Label para validar el saldo en canje").located(By.xpath("//div[contains(@id, 'TradeAmountChecking') or contains(@id, 'TradeAmountSavings')]//span[contains(text(), '')]/../div[2]//span[contains(text(), '')]"));
    public static final Target LBL_DIAS_SOBREGIRO = Target.the("Label para validar los días de sobregiro").located(By.xpath("//div[contains(@id, 'OverdraftDays')]/div[2]//span[contains(text(),'')]"));

    private DetalleCuentaAhorroYCorriente() {throw new IllegalStateException(UI_CLASS);}
}
