package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleCreditos {
    public static final Target LBL_DETALLE_CREDITOS = Target.the("Label para validar posición sobre el detalle").located(By.id("TitleDetail"));
    public static final Target LBL_TIPO_CREDITO = Target.the("Label para validar el tipo de credito").located(By.xpath("//span[contains(@id, 'TypeCredit')]/../div//span[contains(text(), '')]"));
    public static final Target LBL_CAPITAL_VIGENTE_CREDITO = Target.the("Label para validar el capital vigente").located(By.xpath("//span[contains(@id, 'AvailableForAdvancesInWeights')]/../div[2]//span[contains(@id, 'CurrentCapitalExpression')]"));
    public static final Target LBL_DEUDA_A_LA_FECHA_CREDITO = Target.the("Label para validar la deuda a la fecha").located(By.xpath("//span[contains(@id, 'DebtDateText')]/../div//span[contains(@id, 'CurrentDebtExpression')]"));
    public static final Target LBL_PLAN_CREDITO = Target.the("Label para validar el plan").located(By.xpath("//span[contains(@id, 'CreditPlanContainer')]/../div//span[contains(@id, 'DebtToDateExpression')]"));
    public static final Target LBL_TASA_INTERES_EFECTIVA_ANUAL_CREDITO = Target.the("Label para validar la tasa de interes efectiva anual").located(By.xpath("//span[contains(@id, 'InterestRate')]/../div//span[contains(@id, 'DebtToDateDollars')]"));
    public static final Target LBL_FECHA_VENCIMIENTO_CREDITO = Target.the("Label para validar la fecha de vencimiento").located(By.xpath("//span[contains(@id, 'DueDateText')]/../div//span[contains(@id, 'TRMValue')]"));
    public static final Target LBL_NUMERO_CUOTAS_CREDITO = Target.the("Label para validar el el número de cuotas").located(By.xpath("//span[contains(@id, 'FeeText')]/../div//span[contains(@id, 'FeeExpression')]"));
    public static final Target LBL_FECHA_DESEMBOLSO_CREDITO = Target.the("Label para validar la fecha de desembolso del credito").located(By.xpath("//span[contains(@id, 'CreditPlanContainer2')]/../div//span[contains(@id, 'DisburseDate')]"));
    public static final Target LBL_VALOR_DESEMBOLSADO_CREDITO = Target.the("Label para validar el valor desembolsado del credito").located(By.xpath("//span[contains(@id, 'InterestRate2')]/../div//span[contains(@id, 'DisbursedValue')]"));

    private DetalleCreditos() {throw new IllegalStateException(UI_CLASS);}
}
