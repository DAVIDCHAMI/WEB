package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SaldosPorProductoOcultos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        //mensaje
        return null;
    }

    public static SaldosPorProductoOcultos visualizaElMensajeDeProductosOcultos(){
        return new SaldosPorProductoOcultos();
    }
}
