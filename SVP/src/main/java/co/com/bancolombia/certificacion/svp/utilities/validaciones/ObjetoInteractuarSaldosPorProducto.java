package co.com.bancolombia.certificacion.svp.utilities.validaciones;

import co.com.bancolombia.certificacion.svp.exceptions.comunes.ProductoNoManejadoPorElBancoException;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.*;

public class ObjetoInteractuarSaldosPorProducto {

    private ObjetoInteractuarSaldosPorProducto() {    }

    public static Target interactuaConEl(String producto){
        Target target;
        switch(producto) {
            case "Cuentas":
                target = LBL_CUENTAS;
                break;
            case "Tarjetas de credito":
                target = LBL_TARJETAS_CREDITO;
                break;
            case "Crediagil":
                target = LBL_CREDIAGIL;
                break;
            case "Creditos":
                target = LBL_CREDITOS;
                break;
            case "Inversiones":
                target =LBL_INVERSIONES;
                break;
            case "Credito":
                target = LBL_CREDITOS_PAGOS;
                break;
            case "Tarjetas de creditos":
                target = LBL_TARJETAS_CREDITO_PAGOS;
                break;
            default:
                throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }

    public static Target interactuaConElMensajeDeOcultoDel(String producto){
        Target target;
        switch(producto) {
            case "Cuentas":
                target = LBL_PRODUCTOS_OCULTOS_CUENTAS;
                break;
            case "Tarjetas de credito":
                target = LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO;
                break;
            case "Crediagil":
                target =  LBL_PRODUCTOS_OCULTOS_CREDIAGIL;
                break;
            case "Creditos":
                target =  LBL_PRODUCTOS_OCULTOS_CREDITOS;
                break;
            case "Inversiones":
                target = LBL_PRODUCTOS_OCULTOS_INVERSIONES;
                break;
            case "Tarjetas de credito ocultos":
                target = LBL_PRODUCTOS_OCULTOS_TARJETAS_CREDITO_PAGOS;
                break;
            case "Credito oculto":
                target = LBL_PRODUCTOS_OCULTOS_CREDITOS_PAGOS;
                break;
            default:
                throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }

    public static Target interactuaConElMensajeDeNoTieneElProducto(String producto){
        Target target;
        switch (producto){
            case "Tarjetas de creditos":
                target = LBL_NO_PRODUCTO_CREDITO_TARJETA;
                break;

            case "Credito":
                target = LBL_NO_PRODUCTO_CREDITO;
                break;
            default:
                throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }

    public static Target interactuaConElProductoOcultoPagos(String producto) {
        Target target;
             switch(producto) {
                case "Credito oculto":
                    target = LBL_CREDITOS_PAGOS;
                    break;
                case "Tarjetas de credito ocultos":
                   target = LBL_TARJETAS_CREDITO_PAGOS;
                   break;
            default:
                     throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }
}