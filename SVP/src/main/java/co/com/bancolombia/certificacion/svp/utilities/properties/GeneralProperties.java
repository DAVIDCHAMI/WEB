package co.com.bancolombia.certificacion.svp.utilities.properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class GeneralProperties {
    private static Properties prop = null;

    private GeneralProperties() {
        throw new IllegalStateException();
    }

    public static String getDriverAS() throws IOException {
        loadProperties();
        return prop.getProperty("DriverAS");
    }

    public static String getConectorAS() throws IOException {
        loadProperties();
        return prop.getProperty("ConectorAS");
    }

    public static String getServidorAS() throws IOException {
        loadProperties();
        return prop.getProperty("ServidorAS");

    }

    public static String getUsuarioAS() throws IOException {
        loadProperties();
        return prop.getProperty("UsuarioAS");

    }

    public static String getClaveAS() throws IOException {
        loadProperties();
        return prop.getProperty("ClaveAS");

    }

    public static String getUrlFront() throws IOException {
        loadProperties();
        return prop.getProperty("UrlFront");
    }

    public static String getCodigoCanal() throws IOException {
        loadProperties();
        return prop.getProperty("CodigoCanal");

    }

    public static String getCodigoSistema() throws IOException {
        loadProperties();
        return prop.getProperty("CodigoSistema");
    }

    public static String getRutaEvidencia() throws IOException {
        loadProperties();
        return prop.getProperty("RutaEvidencia");
    }

    public static String getUrlFrontAPP() throws IOException {
        loadProperties();
        return prop.getProperty("UrlFrontAPP");
    }

    public static String getUrlAtajos() throws IOException {
        loadProperties();
        return prop.getProperty("UrlAtajos");
    }

    public static void loadProperties() throws IOException {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();
            prop.load(new FileReader(strFilePath + "/SVP.properties"));
        }
    }
}
