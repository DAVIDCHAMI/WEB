package co.com.bancolombia.certificacion.svp.questions.saldosporproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.ProductoVisibleSaldosPorProducto.respuesta;

public class SaldosPorProductoValidarPorProducto implements Question <Boolean> {
    String producto;

    public SaldosPorProductoValidarPorProducto(String producto) {
        this.producto = producto;
    }

    public static SaldosPorProductoValidarPorProducto visualizaSusSaldosPorProducto(String producto) {
        return new SaldosPorProductoValidarPorProducto(producto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       return respuesta(actor, producto);
    }
}