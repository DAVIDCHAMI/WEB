#language: es

Característica: Generar clave en SVP
  Yo como cliente de Bancolombia
  Quiero generar la clave
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Generar clave en SVP exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el genera la clave para svp
    Entonces el deberia de ver el mensaje de confirmacion ¡Clave pendiente de activacion! y fecha de la transaccion
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@1
      |1|Acierto|||||||||
