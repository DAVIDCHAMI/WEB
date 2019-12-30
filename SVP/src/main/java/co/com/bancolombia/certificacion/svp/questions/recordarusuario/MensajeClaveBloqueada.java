package co.com.bancolombia.certificacion.svp.questions.recordarusuario;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.recordarusuario.RecordarUsuarioPage.LBL_CONFIRMACION_RECORDAR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.MENSAJE_RESPUESTA;

public class MensajeClaveBloqueada implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION_RECORDAR.of(DatosPrueba.getMap().get(MENSAJE_RESPUESTA).toString()).resolveFor(actor).isVisible();
    }

    public static MensajeClaveBloqueada visualizaElMensajeDeClaveBloqueada(){return new MensajeClaveBloqueada ();}
}