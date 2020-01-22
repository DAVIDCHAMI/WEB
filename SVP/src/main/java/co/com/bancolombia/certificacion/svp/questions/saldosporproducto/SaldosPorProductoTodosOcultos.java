package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.MENSAJE_RESPUESTA;

public class SaldosPorProductoTodosOcultos implements Question<Boolean> {

    public static boolean respuestaUnoDel(Actor actor) {
        return (DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ()).equals (LBL_PRODUCTOS_OCULTOS_CUENTAS.resolveFor (actor).getText ())
                && (DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ()).equals (LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO.resolveFor (actor).getText ())
                &&(DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ()).equals (LBL_PRODUCTOS_OCULTOS_INVERSIONES.resolveFor (actor).getText ());
    }

    public static boolean respuestaDosDel(Actor actor){
        return (DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ()).equals (LBL_PRODUCTOS_OCULTOS_CREDITOS.resolveFor (actor).getText ());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return respuestaUnoDel (actor) && respuestaDosDel (actor);
    }

    public static SaldosPorProductoTodosOcultos visualizaTodosLosProductosOcultos() {
        return new SaldosPorProductoTodosOcultos ();
    }
}
