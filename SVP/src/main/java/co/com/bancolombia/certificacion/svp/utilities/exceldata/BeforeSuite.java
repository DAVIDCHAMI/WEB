/**
 * @since 25/04/2018
 */
package co.com.bancolombia.certificacion.svp.utilities.exceldata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Se crea una anotación personalizada porque necesitamos copiar todos los datos
 * del archivo de Excel al archivo .feature antes de comenzar a ejecutar
 *
 * @author carmarlo
 * @since 25 /04/2018
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeSuite {
}
