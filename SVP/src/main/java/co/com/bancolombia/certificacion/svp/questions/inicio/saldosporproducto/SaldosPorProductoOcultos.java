package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.MSJ_PRODUCTOS_OCULTOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.MENSAJE_RESPUESTA;

public class SaldosPorProductoOcultos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MSJ_PRODUCTOS_OCULTOS.of(DatosPrueba.getMap().get(MENSAJE_RESPUESTA).toString()).resolveFor(actor).isVisible();
    }

    public static SaldosPorProductoOcultos visualizaElMensajeDeProductosOcultos(){
        return new SaldosPorProductoOcultos();
    }
}
