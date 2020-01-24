package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.*;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.ProductoVisibleSaldosPorProducto.el;

public class SaldosPorProductoVisibles implements Question<Boolean> {

    public static boolean primeraRespuestaDel(Actor actor) {
        return el(actor).visualizalProducto(LBL_CUENTAS).conLosNumeros(obtener(CUENTAS)).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(LBL_TARJETAS_CREDITO).conLosNumeros(obtener(TARJETASDECREDITO)).eIdentificaQueSePresenta();
    }

    public static boolean segundaRespuestaDel(Actor actor){
        return el(actor).visualizalProducto(LBL_CREDITOS).conLosNumeros(obtener(CREDITOS)).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(LBL_INVERSIONES).conLosNumeros(obtener(INVERSIONES)).eIdentificaQueSePresenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {return primeraRespuestaDel (actor) && segundaRespuestaDel (actor);}

    public static SaldosPorProductoVisibles visualizaSusSaldos(){return new SaldosPorProductoVisibles();}
}