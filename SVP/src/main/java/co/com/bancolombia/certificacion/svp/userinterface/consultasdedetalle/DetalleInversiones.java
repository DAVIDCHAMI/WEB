package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleInversiones {
    public static final Target LBL_DETALLE_INVERSION = Target.the("Label para validar posición sobre el detalle").located(By.id("TitleProductDetail"));
    public static final Target LBL_TIPO_INVERSION = Target.the("Label para validar el tipo de inversion").located(By.xpath("//div[contains(@id, 'InvestmentType')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_FECHA_APERTURA_INVERSION = Target.the("Label para validar la fecha de apertura").located(By.xpath("//div[contains(@id, 'OpenningDate')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_CAPITAL_INVERSION = Target.the("Label para validar el capital").located(By.xpath("//div[contains(@id, 'AvailableBalance')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_PLAZO_EN_DIAS_INVERSION = Target.the("Label para validar el plazo en días").located(By.xpath("//div[contains(@id, 'TermInDays')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_PERIODICIDAD_DE_INTERESES_EN_DIAS_INVERSION = Target.the("Label para validar la periodicidad de intereses al dia").located(By.xpath("//div[contains(@id, 'PeriodicityInDays')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_FECHA_DE_VENCIMIENTO_INVERSION = Target.the("Label para validar fecha de vencimiento").located(By.xpath("//div[contains(@id, 'DuteDate')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_TASA_DE_INTERES_EFECTIVA_ANUAL_INVERSION = Target.the("Label para validar tasa de interés efectiva anual").located(By.xpath("//div[contains(@id, 'YearInterest')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_TASA_INTERES_NOMINAL_INVERSION = Target.the("Label para validar la tasa de interés nominal").located(By.xpath("//div[contains(@id, 'NominalInterest')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_INTERESES_PAGADOS_INVERSION = Target.the("Label para validar los intereses pagados").located(By.xpath("//div[contains(@id, 'PayedInterest')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));
    public static final Target LBL_INTERESES_DEL_PERIODO_INVERSION = Target.the("Label para validar intereses del periodo").located(By.xpath("//div[contains(@id, 'OverdraftDays5')]/span[contains(text(),'')]/../div/span[contains(text(), '')]"));

    private DetalleInversiones() {throw new IllegalStateException(UI_CLASS);}
}
