package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ProductoVisible.el;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantProductos.PRODUCTO_CUENTAS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantProductos.PRODUCTO_CREDIAGIL;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantProductos.PRODUCTO_CREDITOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantProductos.PRODUCTO_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantProductos.PRODUCTO_TARJETASDECREDITO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CUENTAS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TARJETASDECREDITO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CREDITOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CREDIAGIL;

public class SaldosPorProductoVisibles implements Question<Boolean> {
    private static boolean respuesta;
    @Override
    public Boolean answeredBy(Actor actor) {

        respuesta = el(actor).visualizalProducto(PRODUCTO_CUENTAS).conLosNumeros(DatosPrueba.getMap().get(CUENTAS).toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(PRODUCTO_TARJETASDECREDITO).conLosNumeros(DatosPrueba.getMap().get(TARJETASDECREDITO).toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(PRODUCTO_CREDITOS).conLosNumeros(DatosPrueba.getMap().get(CREDITOS).toString()).eIdentificaQueSePresenta();

        return respuesta &&el(actor).visualizalProducto(PRODUCTO_INVERSIONES).conLosNumeros(DatosPrueba.getMap().get(INVERSIONES).toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(PRODUCTO_CREDIAGIL).conLosNumeros(DatosPrueba.getMap().get(CREDIAGIL).toString()).eIdentificaQueSePresenta();
    }

    public static SaldosPorProductoVisibles visualizaSusSaldos(){return new SaldosPorProductoVisibles();}
}
