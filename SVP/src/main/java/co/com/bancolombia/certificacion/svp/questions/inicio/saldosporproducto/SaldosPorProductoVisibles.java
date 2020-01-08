package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.*;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ProductoVisible.el;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CUENTAS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TARJETASDECREDITO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CREDITOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.CREDIAGIL;

public class SaldosPorProductoVisibles implements Question<Boolean> {

    public static boolean primeraRespuestaDel(Actor actor) {
        return el(actor).visualizalProducto(LBL_CUENTAS).conLosNumeros(DatosPrueba.getMap().get(CUENTAS).toString()).eIdentificaQueSePresenta()
                &&
                el(actor).visualizalProducto(LBL_TARJETASDECREDITO).conLosNumeros(DatosPrueba.getMap().get(TARJETASDECREDITO).toString()).eIdentificaQueSePresenta();
    }

    public static boolean segundaRespuestaDel(Actor actor){
        return el(actor).visualizalProducto(LBL_CREDITOS).conLosNumeros(DatosPrueba.getMap().get(CREDITOS).toString()).eIdentificaQueSePresenta()&&el(actor).visualizalProducto(LBL_INVERSIONES).conLosNumeros(DatosPrueba.getMap().get(INVERSIONES).toString()).eIdentificaQueSePresenta()
                &&
                el(actor).visualizalProducto(LBL_CREDIAGIL).conLosNumeros(DatosPrueba.getMap().get(CREDIAGIL).toString()).eIdentificaQueSePresenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {return primeraRespuestaDel (actor) && segundaRespuestaDel (actor);}

    public static SaldosPorProductoVisibles visualizaSusSaldos(){return new SaldosPorProductoVisibles();}
}
