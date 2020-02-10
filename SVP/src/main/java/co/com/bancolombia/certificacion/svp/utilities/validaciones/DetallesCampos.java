package co.com.bancolombia.certificacion.svp.utilities.validaciones;


import co.com.bancolombia.certificacion.svp.exceptions.detallesproducto.NoExisteEseCampoException;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleCuentaAhorroYCorriente.*;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleTarjetasCredito.*;

public class DetallesCampos {

    private DetallesCampos() {    }

    public static Target camposDetallesCuentas(String campo){
        Target target;

        switch (campo){
            case "Tipo de cuenta":
                target = LBL_TIPO_CUENTA;
                break;
            case "Saldo disponible":
                target = LBL_SALDO_DISPONIBLE;
                break;
            case "Saldo total":
                target = LBL_SALDO_TOTAL;
                break;
            case "Saldo en canje":
                target = LBL_SALDO_EN_CANJE;
                break;
            case "Dias de sobregiro":
                target = LBL_DIAS_SOBREGIRO;
                break;
            default:
                throw new NoExisteEseCampoException();
        }
        return target;
    }

    public static Target camposDetallesTarjetasCredito(String campo){
        Target target;
        switch (campo){
            case "Tipo de tarjeta":
                target = LBL_TIPO_TARJETA;
                break;
            case "Disponible para avances en pesos":
                target = LBL_AVANCE_PESOS;
                break;
            case "Cupo disponible en pesos":
                target = LBL_CUPO_DISPONIBLE_PESOS;
                break;
            case "Deuda a la fecha en pesos":
                target = LBL_DEUDA_FECHA_PESOS;
                break;
            case "Deuda a la fecha en dolares":
                target = LBL_DEUDA_FECHA_DOLARES;
                break;
            case "TRM":
                target = LBL_TRM;
                break;
            case "Fecha de vencimiento":
                target = LBL_FECHA_VENCIMIENTO;
                break;
            case "Codigo de seguridad":
                target = LBL_CODIGO_SEGURIDAD;
                break;
            default:
                throw new NoExisteEseCampoException();
        }
        return target;
    }
}
