package co.com.bancolombia.certificacion.svp.questions.consultasdetalle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.CAMPOS_DETALLE;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.DetallesCampos.camposDetallesCreditos;

public class CaracteristicasDeCuentasCreditos implements Question<Boolean> {
    private boolean resultado = true;

    @Override
    public Boolean answeredBy(Actor actor) {
        for (String campo : obtener(CAMPOS_DETALLE).split(",")){
            resultado = resultado && camposDetallesCreditos(campo).resolveFor(actor).isVisible();
        }
        return resultado;
    }

    public static CaracteristicasDeCuentasCreditos lasCaracteristicasDeLosCreditos() {
        return new CaracteristicasDeCuentasCreditos();
    }
}