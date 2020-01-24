package co.com.bancolombia.certificacion.svp.questions.recordarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.recordarusuario.RecordarUsuario.LBL_CONFIRMACION_RECORDAR;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;

public class MensajeClaveBloqueada implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION_RECORDAR.of(obtener(MENSAJE_RESPUESTA)).resolveFor(actor).isVisible();
    }

    public static MensajeClaveBloqueada visualizaElMensajeDeClaveBloqueada(){return new MensajeClaveBloqueada ();}
}