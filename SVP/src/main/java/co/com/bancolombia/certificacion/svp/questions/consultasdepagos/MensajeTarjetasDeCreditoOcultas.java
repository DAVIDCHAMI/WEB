package co.com.bancolombia.certificacion.svp.questions.consultasdepagos;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.svp.utilities.validaciones.ObjetoInteractuarSaldosPorProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.TXT_CUENTAS;

public class MensajeTarjetasDeCreditoOcultas implements Question<String> {
    String producto;

    public MensajeTarjetasDeCreditoOcultas(String producto) {
        this.producto = producto;
    }

    public static MensajeTarjetasDeCreditoOcultas mensajeTarjetaCreditoOculto(String producto) {
        return new MensajeTarjetasDeCreditoOcultas(producto);
    }

    @Override
    public String answeredBy(Actor actor) {
            actor.attemptsTo (Click.on(ObjetoInteractuarSaldosPorProducto.interactuaConElProductoOcultoPagos(producto)), Esperar.unTiempo ());
        return Text.of (ObjetoInteractuarSaldosPorProducto.interactuaConElMensajeDeOcultoDel (producto)).viewedBy (actor).asString ();
    }

}