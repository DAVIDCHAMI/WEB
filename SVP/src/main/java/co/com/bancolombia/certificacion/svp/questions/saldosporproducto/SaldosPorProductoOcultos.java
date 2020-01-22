package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ObjetoAInteractuar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TXT_CUENTAS;

public class SaldosPorProductoOcultos implements Question<String> {

    private String producto;

    public SaldosPorProductoOcultos(String producto) {
        this.producto = producto;
    }

    @Override
    public String answeredBy(Actor actor) {
        if (!TXT_CUENTAS.equals (producto)) {
            actor.attemptsTo (Click.on(ObjetoAInteractuar.interactuaConEl(producto)));
        }
        return Text.of (ObjetoAInteractuar.interactuaConElMensajeDeOcultoDel (producto)).viewedBy (actor).asString ();
    }

    public static SaldosPorProductoOcultos visualizaElMensajeDeProductosOcultos(String producto) {
        return new SaldosPorProductoOcultos (producto);
    }
}