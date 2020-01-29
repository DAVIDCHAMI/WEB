package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.INVERSIONES;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.ProductoVisibleSaldosPorProducto.el;

public class ConsultaDePagos implements Question<Boolean> {

    public static ConsultaDePagos pagosDisponibles() {
        return new ConsultaDePagos();
    }

    public static boolean primeraRespuestaDel(Actor actor) {
        return el(actor).visualizalProducto(LBL_TARJETAS_CREDITO_PAGOS).conLosNumeros(obtener(TARJETASDECREDITO)).eIdentificaQueSePresenta();
    }

    public static boolean segundaRespuestaDel(Actor actor){
        return el(actor).visualizalProducto(LBL_CREDITOS_PAGOS).conLosNumeros(obtener(CREDITOS)).eIdentificaQueSePresenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return primeraRespuestaDel(actor) && segundaRespuestaDel(actor);
    }
}