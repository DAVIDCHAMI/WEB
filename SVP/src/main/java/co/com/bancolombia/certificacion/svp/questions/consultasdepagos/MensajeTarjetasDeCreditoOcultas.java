package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeTarjetasDeCreditoOcultas implements Question<String> {

    public static MensajeTarjetasDeCreditoOcultas mensajeTarjetaCreditoOculto() {
        return new MensajeTarjetasDeCreditoOcultas();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}