package co.com.bancolombia.certificacion.svp.utilities.enums;

public enum ClavesConsultasSql {

    AUTENTICACION_COMFFLGWWW("SQL.COMFFLGWWW.autenticacionLogCanal");

    private String query;

    private ClavesConsultasSql(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

}

