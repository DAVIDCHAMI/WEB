package co.com.bancolombia.certificacion.svp.questions.autenticacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.interactions.wait.Esperar.unTiempo;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.AutenticacionPage.LBL_CLAVE_INVALIDA;


public class Mensaje implements Question<String> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        unTiempo();
        return Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString();
    }
}