package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class MensajeTodosLosProductosOcultos implements Question<Boolean> {

    public static MensajeTodosLosProductosOcultos mensajeTodosLosProductosOcultos() {
        return  new MensajeTodosLosProductosOcultos();
    }

public static  boolean primeraRespuesta(Actor actor){
        return (obtener(MENSAJE_RESPUESTA).equals(LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO_PAGOS.resolveFor(actor).getText()));
}

public  static  boolean segundaRespuesta(Actor actor){
        return (obtener(MENSAJE_RESPUESTA).equals(LBL_PRODUCTOS_OCULTOS_CREDITOS_PAGOS.resolveFor(actor).getText()));
}

    @Override
    public Boolean answeredBy(Actor actor) {
      actor.attemptsTo(Click.on(LBL_TARJETAS_CREDITO_PAGOS), Esperar.unTiempo());
      actor.attemptsTo(Click.on(LBL_CREDITOS_PAGOS),Esperar.unTiempo());
        return primeraRespuesta(actor) & segundaRespuesta(actor);
    }
}