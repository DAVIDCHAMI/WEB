package co.com.bancolombia.certificacion.svp.questions.cerrarsesion;

import co.com.bancolombia.certificacion.svp.interactions.comunes.CerrarSesionSVP;
import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.CerrarSesionSVP.cerrarSesion;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_MENSAJE_VALIDACION_CIERRE_SESION;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;

public class ValidacionDeCierreDeSesion implements Question<String> {


    public static ValidacionDeCierreDeSesion seCierreLaSesion() {
        return  new ValidacionDeCierreDeSesion();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(cerrarSesion());
        Esperar.unTiempo();
        System.out.print(Text.of(LBL_MENSAJE_VALIDACION_CIERRE_SESION).viewedBy(actor).asString() + "HOLA");
        return Text.of(LBL_MENSAJE_VALIDACION_CIERRE_SESION).viewedBy(actor).asString();
    }
}
