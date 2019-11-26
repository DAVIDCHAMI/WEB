package co.com.bancolombia.certificacion.svp.userinterface.registrarusuario;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.UI_CLASS;

public class RegistrarUsuarioPage {
    public static final Target TXT_CREAR_USUARIO = Target.the("Campo crear usuario").locatedBy("");
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("Campo Correo electronico").locatedBy("");
    public static final Target TXT_CELULAR = Target.the("Campo Numero celular").locatedBy("");
    public static final Target BTN_SELECCIONAR_IMAGEN = Target.the("Boton seleccionar imagen").locatedBy("");
    public static final Target IMG_IMAGEN_REGISTRO = Target.the("Imagen de registro").locatedBy("");
    public static final Target TXT_PALABRA_CLAVE = Target.the("Pàlabra clave").locatedBy("");
    public static final Target CHK_TERMINOS_CONDICIONES = Target.the("Check Aceptar terminos condiciones ").locatedBy("");
    public static final Target LBL_VERIFICAR_USUARIO = Target.the("Label Verificar usuario").locatedBy("");
    public static final Target LBL_VERIFICAR_CORREO_ELECTRONICO_REGISTRO_EXITOSO = Target.the("Label verificar correo electronico").locatedBy("");
    public static final Target LBL_VERIFICAR_CELULAR_REGISTRO_EXITOSO = Target.the("Label verificar numero celular").locatedBy("");
    public static final Target BTN_REGISTRAR_USUARIO = Target.the("Boton registrar usuario").locatedBy("");
    public static final Target LBL_REGISTRO_EXITOSO_REGISTRO_EXITOSO = Target.the("Label registro exitoso").locatedBy("");
    public static final Target LBL_COMPROBANTE_REGISTRO_USUARIO = Target.the("Label comprobante registro exitoso").locatedBy("");
    public static final Target LBL_FECHA_HORA_REGISTRO_USUARIO = Target.the("Label fecha y hora registro exitoso").locatedBy("");

    private RegistrarUsuarioPage() {
        throw new IllegalStateException(UI_CLASS);
    }
}
