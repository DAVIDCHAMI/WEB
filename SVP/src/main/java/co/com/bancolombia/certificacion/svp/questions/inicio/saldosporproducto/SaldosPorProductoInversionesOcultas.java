package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.LBL_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.LBL_PRODUCTOS_OCULTOS_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ProductoVisible.el;

public class SaldosPorProductoInversionesOcultas implements Question<Boolean> {
    boolean productoOculto;

    @Override
    public Boolean answeredBy(Actor actor) {
        productoOculto = (DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ()).equals(LBL_PRODUCTOS_OCULTOS_INVERSIONES.resolveFor (actor).getText ());

        return el(actor).visualizalProducto(LBL_INVERSIONES).conLosNumeros(DatosPrueba.getMap().get(INVERSIONES).toString()).eIdentificaQueSePresenta()
        && productoOculto;
    }

    public static SaldosPorProductoInversionesOcultas visualizaElProductoVisibleMasMensajeDeOculto(){
        return new SaldosPorProductoInversionesOcultas ();
    }
}
