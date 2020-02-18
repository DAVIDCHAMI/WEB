package co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class DetalleCrediAgil {
    public static final Target LBL_DETALLE_CREDIAGIL = Target.the("Label para validar la posición sobre el detalle").located(By.id(""));
    public static final Target LBL_CUPO_ASIGNADO_CREDIAGIL = Target.the("Label para validar el cupo asignado").located(By.xpath(""));
    public static final Target LBL_CUPO_UTILIZADO_CREDIAGIL = Target.the("Label para validar el cupo utilizado").located(By.xpath(""));
    public static final Target LBL_CUPO_DISPONIBLE_CREDIAGIL = Target.the("Label para validar el cupo disponible").located(By.xpath(""));
    public static final Target LBL_DISPONIBLE_SOBRECUPO_CREDIAGIL = Target.the("Label para validar el disponible con sobrecupo").located(By.xpath(""));
    public static final Target LBL_VALOR_MINIMO_DESEMBOLSO_CREDIAGIL = Target.the("Label para validar el valor mínimo a desembolsar").located(By.xpath(""));
    public static final Target LBL_VALOR_MAXIMO_DESEMBOLSO_CREDIAGIL = Target.the("Label para validar el valor maximo a desembolsar").located(By.xpath(""));
    public static final Target LBL_CUPO_CANJE_CREDIAGIL =Target.the("Label para validar el cupo de canje").located(By.xpath(""));

    private DetalleCrediAgil() {throw new IllegalStateException(UI_CLASS);}
}
