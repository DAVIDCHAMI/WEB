package co.com.bancolombia.certificacion.svp.utilities.validaciones;

import co.com.bancolombia.certificacion.svp.exceptions.saldos.NoSeVisualizaElProductoException;
import co.com.bancolombia.certificacion.svp.exceptions.saldos.SeVisualizaUnaCategoriaSinProductosException;
import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_PRODUCTOS;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_PRODUCTOS_CONSULTA_PAGOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class ProductoVisibleSaldosPorProducto {
    private static Actor actor;
    private static Target producto;
    private static String numerosProductos;
    private static boolean resultado = true;

    public ProductoVisibleSaldosPorProducto(Actor actor) {
        this.actor = actor;
    }

    public static ProductoVisibleSaldosPorProducto el(Actor actor) {
        return new ProductoVisibleSaldosPorProducto(actor);
    }

    public ProductoVisibleSaldosPorProducto visualizalProducto(Target producto) {
        this.producto = producto;
        return this;
    }

    public ProductoVisibleSaldosPorProducto conLosNumeros(String numeroProducto) {
        this.numerosProductos = numeroProducto;
        return this;
    }

    public boolean eIdentificaQueSePresenta() {
        if (numerosProductos != null && !numerosProductos.equals (EMPTY)) {
                if (!TXT_CUENTAS.equals (producto.resolveFor (actor).getText ())) {
                    actor.attemptsTo (Click.on (producto), Esperar.unTiempo ());
                }

                for (String numeroProducto : numerosProductos.replace (" ","").split (COMA)) {
                    if (!LBL_PRODUCTOS.of (numeroProducto).resolveFor (actor).isVisible ()) {
                        resultado = false;
                        throw new NoSeVisualizaElProductoException (numeroProducto);
                    }
                }
        } else {
            if (producto.resolveFor (actor).isVisible ()) {
                resultado = false;
                throw new SeVisualizaUnaCategoriaSinProductosException ();
            }
        }
        return resultado;
    }

    public boolean eIdentificaQueSePresentaPagos() {
        if (numerosProductos != null && !numerosProductos.equals (EMPTY)) {
            if (!TXT_CUENTAS.equals (producto.resolveFor (actor).getText ())) {
                actor.attemptsTo (Click.on (producto), Esperar.unTiempo ());
            }

            for (String numeroProducto : numerosProductos.replace (" ","").split (COMA)) {
                if (!LBL_PRODUCTOS_CONSULTA_PAGOS.of (numeroProducto).resolveFor (actor).isVisible ()) {
                    resultado = false;
                    throw new NoSeVisualizaElProductoException (numeroProducto);
                }
            }
        }
        return resultado;
    }
}