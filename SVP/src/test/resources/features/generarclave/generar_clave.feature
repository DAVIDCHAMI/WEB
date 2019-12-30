#language: es

Característica: Generar clave en SVP
  Yo como cliente de Bancolombia
  Quiero generar la clave
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Generar clave en SVP exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp
    Entonces el deberia de ver el mensaje ¡Clave pendiente de activacion!
    Y el mensaje de confirmacion con fecha de la transaccion
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@1
      |1|Acierto||||25130110|USUCDTC1|4321|1234|Cédula de ciudadanía| Debes activar la clave en la Sucursal Física. Si eres colombiano en el exterior comunícate con la Sucursal Telefónica.|
