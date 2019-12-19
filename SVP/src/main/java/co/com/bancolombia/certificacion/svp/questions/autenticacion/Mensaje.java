package co.com.bancolombia.certificacion.svp.questions.autenticacion;

import co.com.bancolombia.certificacion.svp.interactions.wait.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.interactions.wait.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;


public class Mensaje implements Question<String> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        //return DatosPrueba.getMap().get(ORIENTACION).toString().equalsIgnoreCase(ALTERNO)? Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString():DatosPrueba.getMap().get(ORIENTACION).toString();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString();
    }
}