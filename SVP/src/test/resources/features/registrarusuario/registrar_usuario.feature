#language: es

Característica: Registro de usuarios
  Yo como Banco
  Quiero que los clientes se asignen un usuario
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Registro de usuario con usuario y documento iguales
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el quiere registrarsse con usuario y documento igual en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario    | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta                                            |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@1
      |1|Alterno||||989636299|989636299|1234|1234||da@gmail.com|3182314777|hola|Para continuar debes registrarte de nuevo en la aplicación.|

  Esquema del escenario: Registro de usuario con usuario ya existente
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro con usuario que ya existe en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta                                       |
        ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@2
      |2|Alterno||||65698237|OSVPPRU01|1234|1234||da@gmail.com|3182314777|hola|Ingresa otro usuario. El que ingresaste ya está en uso|

  Esquema del escenario: Registro de usuario con usuario ya existente (limite)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro con diferentes usuarios ya existentes
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@3
      |3|Alterno||||65698237|OSVPPRU01|1234|1234||da@gmail.com|3182314777|hola|¡Lo sentimos!|

  Esquema del escenario: Registro de usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el completa el registro en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta   |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@4
      |4|Acierto||||51854814|UserEjec21|1234|1234||da@gmail.com|3182314777|hola|¡Registro exitoso!|