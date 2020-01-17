package co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto;

import co.com.bancolombia.certificacion.svp.exceptions.comunes.ProductoNoManejadoPorElBancoException;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.*;

public class ObjetoAInteractuar {

    public static Target interactuaConEl(String producto){
        Target target = null;
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
            default:
                throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }

    public static Target interactuaConElMensajeDeOcultoDel(String producto){
        Target target = null;
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
            default:
                throw new ProductoNoManejadoPorElBancoException (producto);
        }
        return target;
    }
}
