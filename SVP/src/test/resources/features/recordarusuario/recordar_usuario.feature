#language: es

Característica: Recordar usuario
  Yo cliente
  Quiero recordar el usuario
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Recordar usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | mensajeRespuesta |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@1
      |1|Acierto||||123456789|prueba|1234|1234||El usuario ha sido enviado al correo electronico|

  Esquema del escenario: Bloqueo por intentos fallidos al recordar usuario
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el bloquea su usuario por maximo de intentos recuperando la clave
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | mensajeRespuesta |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@2
      |2|Alterno||||123456789|prueba|1234|1234||¡Lo Sentimos!|
