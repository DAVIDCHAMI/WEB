package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.svp.utilities.validaciones.ObjetoInteractuarSaldosPorProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeConsultaDePagosDeCreditos implements Question<String> {
    private String producto;

    public MensajeConsultaDePagosDeCreditos(String producto) {
        this.producto = producto;
    }

    public static MensajeConsultaDePagosDeCreditos mensajeUstedNoTienePagosDeCreditos(String producto) {
        return new MensajeConsultaDePagosDeCreditos(producto);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo (Click.on(ObjetoInteractuarSaldosPorProducto.interactuaConEl(producto)), Esperar.unTiempo ());
        return Text.of (ObjetoInteractuarSaldosPorProducto.interactuaConElMnesajeDeNoTieneElProducto (producto)).viewedBy (actor).asString ();

    }
}