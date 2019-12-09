package co.com.bancolombia.certificacion.svp.utilities.constant;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.CONSTANT_CLASS;

public class ConstantManager {
    public static final String ACIERTO = "ACIERTO";
    public static final String EXITOSO = "EXITOSO";
    public static final String ALTERNO = "ALTERNO";
    public static final String FORMATO_HORA_HHMMSS = "HHmmss";
    public static final String FORMATO_FECHA_YYYYMMDD = "yyyyMMdd";
    public static final String EMPTY = "";
    public static final String REMOVE_MIDDLE_SCRIPT = "-";
    public static final String MM_DD_YYYY = "MM/dd/yyyy";
    public static final String REPORTS_SERENITY = "reportSerenity";
    public static final String TRAMAINPUTCODE = "0220";
    public static final String TRAMAOUTPUTCODE = "0230";
    public static final String TRAMA_INPUT = "TRAMA INPUT";
    public static final String TRAMA_OUTPUT = "TRAMA OUTPUT";
    public static final String TIPO_MENSAJE = "tipomsg";
    public static final String TRAMA_TR = "TRAMA TR";
    public static final String TRAMA_TS = "TRAMA TS";
    public static final String TR = "TR";
    public static final String TS = "TS";
    public static final String SN = "SN";
    public static final String RC = "RC";
    public static final String CODIGO_TRANSACCION_AUTENTICACION = "0369";
    public static final String ORIENTACION="orientacion";
    public static final String CODIGO_TRANSACCION="codigoTransaccion";
    public static final String CODIGO_ERROR="codigoError";
    public static final String RESULTADO_ESPERADO="resultadoEsperado";
    public static final String NUMERO_DOCUMENTO="numeroDocumento";
    public static final String USUARIO="usuario";
    public static final String CLAVE="clave";
    public static final String SEGUNDA_CLAVE="segundaClave";
    public static final String TIPO_DOCUMENTO="tipoDocumento";
    public static final String CORREO_ELECTRONICO = "correoElectronico";
    public static final String CELULAR = "celular";
    public static final String PALABRA_CLAVE = "palabraClave";

    private ConstantManager() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}