#language: es

Característica: Recordar usuario
  Yo cliente
  Quiero recordar el usuario
  Para ingresar a la Sucursal Virtual Personas


  Esquema del escenario: Recordar usuario - clave invalida
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento | mensajeRespuesta                               |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@1
      |1|Alterno||||25130237|USUCTDC2|4321|1234||Usuario o clave inválida. Inténtalo nuevamente|

  Esquema del escenario: Recordar usuario - clave bloqueada
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de clave bloqueada
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | mensajeRespuesta                               |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@5
      |5|Alterno||||102030401|a|4321|1234||La clave que usas en el cajero está bloqueada.|


  Esquema del escenario: Recordar usuario - usuario invalido
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento | mensajeRespuesta                               |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@2
      |2|Alterno||||1152207037|USUCTDC3|1234|1234||Usuario o clave inválida. Inténtalo nuevamente|

  Esquema del escenario: Recordar usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el recuerda su usuario en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento | mensajeRespuesta                                  |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@3
      |3|Acierto||||25130233|USUCTDC3|1234|1234||El usuario ha sido enviado al correo electrónico.|

    @Manual:Passed
  Esquema del escenario: Bloqueo por intentos fallidos al recordar usuario
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeRespuesta> |
    Cuando el bloquea su usuario por maximo de intentos recuperando la clave
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario    | clave | segundaClave | tipoDocumento | mensajeRespuesta |
       ##@externaldata@./src/test/resources/datadriven/recordarusuario/recordar_usuario.xlsx@Datos@4
      |4|Alterno||||51854814|userejec21|4321|1234||¡Lo sentimos!|