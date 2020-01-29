package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA_2;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class MensajeNoTieneCreditosYTarjetas implements Question<Boolean> {

    public static MensajeNoTieneCreditosYTarjetas mensajeNoTieneTarjetasYCreditos() {
        return new MensajeNoTieneCreditosYTarjetas();
    }

    public static boolean  respuestaUno(Actor actor){
        return (obtener(MENSAJE_RESPUESTA).equals(LBL_NO_PRODUCTO_CREDITO_TARJETA.resolveFor(actor).getText()));
    }

    public static boolean respuestaDos(Actor actor){
        return (obtener(MENSAJE_RESPUESTA_2).equals(LBL_NO_PRODUCTO_CREDITO.resolveFor(actor).getText()));
    }

    @Override
    public Boolean answeredBy(Actor actor) {
     actor.attemptsTo(Click.on(LBL_TARJETAS_CREDITO), Esperar.unTiempo());
     actor.attemptsTo(Click.on(LBL_CREDITOS_PAGOS), Esperar.unTiempo());
   return respuestaUno(actor) && respuestaDos(actor);
    }
}
