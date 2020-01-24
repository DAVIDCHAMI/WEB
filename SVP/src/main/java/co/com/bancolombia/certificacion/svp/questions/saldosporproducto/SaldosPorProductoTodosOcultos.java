package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;

public class SaldosPorProductoTodosOcultos implements Question<Boolean> {

    public static boolean respuestaUnoDel(Actor actor) {
        return (obtener(MENSAJE_RESPUESTA)).equals (LBL_PRODUCTOS_OCULTOS_CUENTAS.resolveFor (actor).getText ())
                && (obtener(MENSAJE_RESPUESTA)).equals (LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO.resolveFor (actor).getText ())
                &&(obtener(MENSAJE_RESPUESTA)).equals (LBL_PRODUCTOS_OCULTOS_INVERSIONES.resolveFor (actor).getText ());
    }

    public static boolean respuestaDosDel(Actor actor){
        return (obtener(MENSAJE_RESPUESTA)).equals (LBL_PRODUCTOS_OCULTOS_CREDITOS.resolveFor (actor).getText ());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo (Click.on (LBL_TARJETAS_CREDITO), Esperar.unTiempo ());
        actor.attemptsTo (Click.on (LBL_CREDITOS), Esperar.unTiempo ());
        actor.attemptsTo (Click.on (LBL_INVERSIONES), Esperar.unTiempo ());
        actor.attemptsTo (Click.on (LBL_CREDIAGIL), Esperar.unTiempo ());
        return respuestaUnoDel (actor) && respuestaDosDel (actor);
    }

    public static SaldosPorProductoTodosOcultos visualizaTodosLosProductosOcultos() {
        return new SaldosPorProductoTodosOcultos ();
    }
}
