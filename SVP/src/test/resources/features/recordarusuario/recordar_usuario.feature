#language: es

Característica: Recordar usuario
  Yo cliente
  Quiero recordar el usuario
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Recordar usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de confirmacion El usuario ha sido enviado al correo electronico
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@1
      |1|Acierto|||||||||

  Esquema del escenario: Bloqueo por intentos fallidos al recordar usuario
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el bloquea su usuario por maximo de intentos recuperando la clave
    Entonces el deberia de ver el mensaje ¡Lo Sentimos! en SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@2
      |2|Alterno|||||||||
