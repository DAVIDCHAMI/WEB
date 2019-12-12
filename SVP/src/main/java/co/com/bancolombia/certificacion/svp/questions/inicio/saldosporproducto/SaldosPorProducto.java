package co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto;

import co.com.bancolombia.certificacion.svp.exceptions.saldos.NoSeVisualizaElProductoException;
import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ProductoVisible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.inicio.InicioPage.LBL_PRODUCTOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;
import static co.com.bancolombia.certificacion.svp.utilities.validaciones.saldosporproducto.ProductoVisible.el;

public class SaldosPorProducto implements Question<Boolean> {

    private final String CUENTAS = "Cuentas";
    private final String TARJETASDECREDITO = "Tarjetas de crédito";
    private final String CREDITOS = "Créditos";
    private final String INVERSIONES = "Inversiones";
    private final String CREDIAGIL = "Crediágil";

    public SaldosPorProducto() {}

    @Override
    public Boolean answeredBy(Actor actor) {

        return el(actor).visualizalProducto(CUENTAS).conLosNumeros(DatosPrueba.getMap().get("cuentas").toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(TARJETASDECREDITO).conLosNumeros(DatosPrueba.getMap().get("tarjetasCredito").toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(CREDITOS).conLosNumeros(DatosPrueba.getMap().get("creditos").toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(INVERSIONES).conLosNumeros(DatosPrueba.getMap().get("inversiones").toString()).eIdentificaQueSePresenta()
                &&el(actor).visualizalProducto(CREDIAGIL).conLosNumeros(DatosPrueba.getMap().get("crediagil").toString()).eIdentificaQueSePresenta()
                ;
    }

    public static SaldosPorProducto visualizaSusSaldos(){return new SaldosPorProducto();}
}
