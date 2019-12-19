#language: es

Característica: Registro de usuarios
  Yo como Banco
  Quiero que los clientes se asignen un usuario
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Registro de usuario con usuario y documento iguales
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   | intentos   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> | <intentos> |
    Cuando el realiza un registro con usuario y documento igual en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario    | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta                                            | intentos |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@1
      |1|Alterno||||1245123881|1245123881|1234|1234||da@gmail.com|3182314777|hola|Para continuar debes registrarte de nuevo en la aplicación.|1|

  Esquema del escenario: Registro de usuario con usuario ya existente
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   | intentos   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> | <intentos> |
    Cuando el realiza un registro con usuario que ya existe en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta                                       | intentos |
        ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@2
      |2|Alterno||||1245123881|OSVPPRU01|1234|1234||da@gmail.com|3182314777|hola|Ingresa otro usuario. El que ingresaste ya está en uso|1|


  Esquema del escenario: Registro de usuario con usuario ya existente (limite)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   | intentos   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> | <intentos> |
    Cuando el realiza un registro con diferentes usuarios ya existentes
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta | intentos |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@3
      |3|Alterno||||1245123881|OSVPPRU01|1234|1234||da@gmail.com|3182314777|hola|¡Lo Sentimos!|5|

  Esquema del escenario: Registro de usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   | intentos   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> | <intentos> |
    Cuando el completa el registro en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta   | intentos |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@4
      |4|Acierto||||1245123881|OSVPPRU99|1234|1234||da@gmail.com|3182314777|hola|¡Registro exitoso!|1|
