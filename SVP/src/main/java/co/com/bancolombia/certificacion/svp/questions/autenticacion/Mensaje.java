package co.com.bancolombia.certificacion.svp.questions.autenticacion;
import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion.LBL_CLAVE_INVALIDA;

public class Mensaje implements Question<String> {

    public static Mensaje mensajeClaveInvalida(){
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        Esperar.unTiempo();
        return Text.of(LBL_CLAVE_INVALIDA).viewedBy(actor).asString();
    }
}