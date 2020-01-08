package co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto;

import co.com.bancolombia.certificacion.svp.exceptions.saldos.NoSeVisualizaElProductoException;
import co.com.bancolombia.certificacion.svp.exceptions.saldos.SeVisualizaUnaCategoriaSinProductosException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.LBL_PRODUCTOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class ProductoVisible {

    private static Actor actor;
    private static Target producto;
    private static String numerosProductos;
    private static boolean resultado = true;

    public ProductoVisible(Actor actor) {
        this.actor = actor;
    }


    public static ProductoVisible el(Actor actor) {
        return new ProductoVisible (actor);
    }

    public ProductoVisible visualizalProducto(Target producto) {
        this.producto = producto;
        return this;
    }

    public ProductoVisible conLosNumeros(String numeroProducto) {
        this.numerosProductos = numeroProducto;
        return this;
    }

    public boolean eIdentificaQueSePresenta() {
        if (numerosProductos != null && !numerosProductos.equals (EMPTY)) {
            if (!TXT_CUENTAS.equals (producto.resolveFor(actor).getText())) {
                actor.attemptsTo (Click.on (producto));
            }
            for (String numeroProducto : numerosProductos.split (COMA)) {
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
}
