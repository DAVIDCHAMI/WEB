package co.com.bancolombia.certificacion.svp.questions.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UsuarioRegistrar implements Question<Boolean> {

    public static UsuarioRegistrar estaEnUso() {
        return new UsuarioRegistrar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
