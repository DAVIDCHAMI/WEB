package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.svp.utilities.validaciones.ObjetoInteractuarSaldosPorProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeCreditosOcultos implements Question<String> {
String producto;

    public MensajeCreditosOcultos(String producto) {
        this.producto = producto;
    }

    public static MensajeCreditosOcultos mensajeCreditosOcultos(String producto) {
        return new MensajeCreditosOcultos(producto);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo (Click.on(ObjetoInteractuarSaldosPorProducto.interactuaConElProductoOcultoPagos(producto)), Esperar.unTiempo ());
        return Text.of (ObjetoInteractuarSaldosPorProducto.interactuaConElMensajeDeOcultoDel (producto)).viewedBy (actor).asString ();

    }
}