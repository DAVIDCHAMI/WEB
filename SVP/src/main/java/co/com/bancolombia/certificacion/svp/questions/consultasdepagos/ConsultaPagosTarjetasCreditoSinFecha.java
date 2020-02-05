package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_CREDITOS_PAGOS;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_TARJETAS_CREDITO_PAGOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.CREDITOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.TARJETASDECREDITO;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.ProductoVisibleSaldosPorProducto.el;

public class ConsultaPagosTarjetasCreditoSinFecha implements Question<Boolean> {

    public static ConsultaPagosTarjetasCreditoSinFecha pagosDisponiblesSinFecha() {
        return new ConsultaPagosTarjetasCreditoSinFecha();
    }
    public static boolean respuestaConsulta(Actor actor) {
        return el(actor).visualizalProducto(LBL_TARJETAS_CREDITO_PAGOS).conLosNumeros(obtener(TARJETASDECREDITO)).eIdentificaQueSePresentaPagosSinFecha() &&
                el(actor).visualizalProducto(LBL_CREDITOS_PAGOS).conLosNumeros(obtener(CREDITOS)).eIdentificaQueSePresentaPagos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return respuestaConsulta(actor);
    }
}