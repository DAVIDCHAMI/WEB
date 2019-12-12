#language: es

Característica: Registro de usuarios
  Yo como Banco
  Quiero que los clientes se asignen un usuario
  Para ingresar a la Sucursal Virtual Personas

  Esquema del escenario: Registro de usuario exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el completa el registro en SVP
    Entonces el deberia de ver el mensaje de
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | correoElectronico | celular    | palabraClave | mensajeRespuesta   |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@1
      |1|Acierto||||25130103|OSVPPRU22|1234|1234||da@gmail.com|3182314777|hola|¡Registro exitoso!|

  Esquema del escenario: Registro de usuario fallido
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro incompleto en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | correoElectronico | celular | palabraClave | mensajeRespuesta               |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@2
      |2|Alterno||||||||||||Registro de usuario incorrecto|

  Esquema del escenario: Registro de usuario con usuario y documento iguales
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro con usuario y documento igual en SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | correoElectronico | celular | palabraClave | mensajeRespuesta                                 |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@3
      |3|Alterno||||||||||||informativo para realizar el registro nuevamente|

  Esquema del escenario: Registro de usuario con usuario ya existente
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro con usuario que ya existe en la SVP
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | correoElectronico | celular | palabraClave | mensajeRespuesta                                       |
        ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@4
      |4|Alterno||||||||||||Ingresa otro usuario. El que ingresaste ya esta en uso|

  Esquema del escenario: Registro de usuario con usuario ya existente (limite)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | correoElectronico   | celular   | palabraClave   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <correoElectronico> | <celular> | <palabraClave> | <mensajeRespuesta> |
    Cuando el realiza un registro con diferentes usuarios ya existentes
    Entonces el deberia de ver el mensaje de respuesta
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | correoElectronico | celular | palabraClave | mensajeRespuesta |
       ##@externaldata@./src/test/resources/datadriven/registrarusuario/registrar_usuario.xlsx@Datos@5
      |5|Alterno||||||||||||¡Lo Sentimos!|
