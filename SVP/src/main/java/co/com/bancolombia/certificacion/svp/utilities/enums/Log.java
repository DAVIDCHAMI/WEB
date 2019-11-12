package co.com.bancolombia.certificacion.svp.utilities.enums;

public enum Log {
    /**
     * ****************
     * español
     * ****************
     */
    DOCUMENTO("documento"),
    TIPO_DOCUMENTO("tipoDocumento"),
    CODIGO_TRANSACCION("codigoTransaccion"),
    TRACE("trace"),
    FECHA("fecha"),
    CODIGO_ERROR("codigoError"),
    HORA_TRANSACCION("hora"),
    CANAL("canal"),
    MENSAJE("mensaje"),
    TIPO_CONSULTA("tipoConsulta");

    private String name;

    Log(String ide) {
        this.name = ide;
    }

    public String getName() {
        return name;
    }
}





