package co.com.bancolombia.certificacion.svp.utilities.constant;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.CONSTANT_CLASS;

public class ConstantExcelData {
    public static final String ORIENTACION = "orientacion";
    public static final String CODIGO_TRANSACCION = "codigoTransaccion";
    public static final String CODIGO_ERROR = "codigoError";
    public static final String RESULTADO_ESPERADO = "resultadoEsperado";
    public static final String NUMERO_DOCUMENTO = "numeroDocumento";
    public static final String USUARIO = "usuario";
    public static final String CLAVE = "clave";
    public static final String SEGUNDA_CLAVE = "segundaClave";
    public static final String TIPO_DOCUMENTO = "tipoDocumento";
    public static final String CORREO_ELECTRONICO = "correoElectronico";
    public static final String CELULAR = "celular";
    public static final String PALABRA_CLAVE = "palabraClave";
    public static final String MENSAJE_RESPUESTA = "mensajeRespuesta";
    public static final String MENSAJE_RESPUESTA_DOS = "mensajeRespuestaDos";
    public static final String MENSAJE_ESPERADO= "mensajeEsperado";
    public static final String CUENTAS = "cuentas";
    public static final String TARJETASDECREDITO = "tarjetasCredito";
    public static final String CREDITOS = "creditos";
    public static final String INVERSIONES = "inversiones";
    public static final String CREDIAGIL = "crediagil";

    private ConstantExcelData() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
