package co.com.bancolombia.certificacion.svp.utilities.validaciones;


import co.com.bancolombia.certificacion.svp.exceptions.detallesproducto.NoExisteEseCampoException;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleCrediAgil.*;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleCreditos.*;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleCuentaAhorroYCorriente.*;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleFondosInversion.*;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleInversiones.*;
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
                throw new NoExisteEseCampoException(campo);
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
                throw new NoExisteEseCampoException(campo);
        }
        return target;
    }

    public static Target camposDetallesFondosInversion(String campo){
        Target target;
        switch (campo){
            case "Tipo de fondo":
                target = LBL_TIPO_FONDO;
                break;
            case "Saldo disponible":
                target = LBL_SALDO_DISPONIBLE_FONDO;
                break;
            case "Saldo total":
                target = LBL_SALDO_TOTAL_FONDO;
                break;
            case "Fecha de vencimiento":
                target = LBL_FECHA_VENCIMIENTO_FONDO;
                break;
            default:
                throw new NoExisteEseCampoException(campo);
        }
        return target;
    }

    public static Target camposDetallesCreditos(String campo){
        Target target;
        switch (campo){
            case "Tipo de credito":
                target = LBL_TIPO_CREDITO;
                break;
            case "Capital vigente":
                target = LBL_CAPITAL_VIGENTE_CREDITO;
                break;
            case "Deuda a la fecha":
                target = LBL_DEUDA_A_LA_FECHA_CREDITO;
                break;
            case "Plan":
                target = LBL_PLAN_CREDITO;
                break;
            case "Tasa de interes efectiva anual":
                target = LBL_TASA_INTERES_EFECTIVA_ANUAL_CREDITO;
                break;
            case "Fecha de vencimiento":
                target = LBL_FECHA_VENCIMIENTO_CREDITO;
                break;
            case "Numero de cuotas":
                target = LBL_NUMERO_CUOTAS_CREDITO;
                break;
            case "Fecha de desembolso":
                target = LBL_FECHA_DESEMBOLSO_CREDITO;
                break;
            case "Valor desembolsado":
                target = LBL_VALOR_DESEMBOLSADO_CREDITO;
                break;
            default:
                throw new NoExisteEseCampoException(campo);
        }
        return target;
    }

    public static Target camposDetallesInversiones(String campo){
        Target target;
        switch (campo){
            case "Tipo de inversion":
                target = LBL_TIPO_INVERSION;
                break;
            case "Fecha de apertura":
                target = LBL_FECHA_APERTURA_INVERSION;
                break;
            case "Capital":
                target = LBL_CAPITAL_INVERSION;
                break;
            case "Plazo en dias":
                target = LBL_PLAZO_EN_DIAS_INVERSION;
                break;
            case "Periodicidad de intereses al dia":
                target = LBL_PERIODICIDAD_DE_INTERESES_EN_DIAS_INVERSION;
                break;
            case "Fecha de vencimiento":
                target = LBL_FECHA_DE_VENCIMIENTO_INVERSION;
                break;
            case "Tasa de interes efectiva anual":
                target = LBL_TASA_DE_INTERES_EFECTIVA_ANUAL_INVERSION;
                break;
            case "Tasa de interes nominal":
                target = LBL_TASA_INTERES_NOMINAL_INVERSION;
                break;
            case "Intereses pagados":
                target = LBL_INTERESES_PAGADOS_INVERSION;
                break;
            case "Intereses del periodo":
                target = LBL_INTERESES_DEL_PERIODO_INVERSION;
                break;
            default:
                throw new NoExisteEseCampoException(campo);
        }
        return target;
    }

    public static Target camposDetallesCrediAgil(String campo){
        Target target;
        switch (campo){
            case "Cupo asignado":
                target = LBL_CUPO_ASIGNADO_CREDIAGIL;
                break;
            case "Cupo utilizado":
                target = LBL_CUPO_UTILIZADO_CREDIAGIL;
                break;
            case "Cupo disponible":
                target = LBL_CUPO_DISPONIBLE_CREDIAGIL;
                break;
            case "Disponible con sobrecupo":
                target = LBL_DISPONIBLE_SOBRECUPO_CREDIAGIL;
                break;
            case "Valor minimo a desembolsar":
                target = LBL_VALOR_MINIMO_DESEMBOLSO_CREDIAGIL;
                break;
            case "Valor maximo a desembolsar":
                target = LBL_VALOR_MAXIMO_DESEMBOLSO_CREDIAGIL;
                break;
            case "Cupo de canje":
                target = LBL_CUPO_CANJE_CREDIAGIL;
                break;
            default:
                throw new NoExisteEseCampoException(campo);
        }
        return target;
    }
}
