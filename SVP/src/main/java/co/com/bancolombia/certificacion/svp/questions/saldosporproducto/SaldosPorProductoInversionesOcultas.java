package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_PRODUCTOS_OCULTOS_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.ProductoVisibleSaldosPorProducto.el;

public class SaldosPorProductoInversionesOcultas implements Question<Boolean> {
    boolean productoVisibles;

    @Override
    public Boolean answeredBy(Actor actor) {
        productoVisibles = el(actor).visualizalProducto(LBL_INVERSIONES)
                .conLosNumeros(obtener(INVERSIONES))
                .eIdentificaQueSePresenta();

        return productoVisibles && (obtener(MENSAJE_RESPUESTA)).equals(LBL_PRODUCTOS_OCULTOS_INVERSIONES.resolveFor(actor).getText());
    }

    public static SaldosPorProductoInversionesOcultas visualizaElProductoVisibleMasMensajeDeOculto() {
        return new SaldosPorProductoInversionesOcultas();
    }
}