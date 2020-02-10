package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleTarjetasCredito {

    public static final Target LBL_DETALLE_TARJETA = Target.the("Label para validar posición sobre el detalle").located(By.id("TitleProductDetail"));
    public static final Target LBL_TIPO_TARJETA = Target.the("Label para validar el tipo de tarjeta").located(By.xpath("//span[contains(@id, 'TypeCardPersonal')]/../div//span[contains(text(), '')]"));
    public static final Target LBL_AVANCE_PESOS = Target.the("Label para validar el cupo disponible para avance en pesos").located(By.xpath("//span[contains(@id, 'AvailableForAdvancesInWeights')]/../div[2]//span[contains (@id,'AvailableAdvances')]"));
    public static final Target LBL_CUPO_DISPONIBLE_PESOS = Target.the("Label para validar el cupo disponible en pesos").located(By.xpath("//span[contains(@id, 'QuotaAvailableInCop')]/../div//span[contains(@id, 'QuotaAvailable')]"));
    public static final Target LBL_DEUDA_FECHA_PESOS = Target.the("Label para validar la deuda a la fecha en pesos").located(By.xpath("//span[contains(@id, 'DebtTodateInCop')]/../div//span[contains(@id, 'DebtToDate')]"));
    public static final Target LBL_DEUDA_FECHA_DOLARES = Target.the("Label para validar la deuda a la fecha en dolares").located(By.xpath("//span[contains(@id, 'DebtToDateInDollars')]/../div//span[contains(@id, 'DebtToDateDollars')]"));
    public static final Target LBL_TRM = Target.the("Label para validar el TRM").located(By.xpath("//span[contains(@id, 'TrmText')]/../div//span[contains(@id, 'TRMValue')]"));
    public static final Target LBL_FECHA_VENCIMIENTO = Target.the("Label para validar la fecha de vencimiento de la E-Card").located(By.xpath("//span[contains(@id, 'LimitDate')]/../div//span[contains(@id, 'TVFCLM4')]"));
    public static final Target LBL_CODIGO_SEGURIDAD = Target.the("Label para validar el codigo de seguridad de la E-Card").located(By.xpath("//span[contains(@id, 'SecurityCode')]/../div[2]//span[contains(@id, 'SecurityCode4')]"));


    private DetalleTarjetasCredito() {throw new IllegalStateException(UI_CLASS);}
}

