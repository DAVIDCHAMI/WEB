package co.com.bancolombia.certificacion.svp.questions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionClave implements Question<Integer> {
    private Integer clave;

    public VerificacionClave(Integer clave) {
        this.clave = clave;
    }

    public static VerificacionClave verificacionLongitudDela(Integer clave) {
        return new VerificacionClave(clave);
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return clave;
    }
}
