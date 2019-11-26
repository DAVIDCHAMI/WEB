#language: es

Característica: SVP autenticacion
  Yo, como usuario de Bancolombia, quiero iniciar sesion en el SVP y autenticarse con un usuario y contraseña

  Esquema del escenario: TRN0369 Inicio de sesion exitoso en SVP Uno
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion
    #Entonces el deberia de ver el resultado de la autenticacion es exitoso
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/autenticacion/trn_0369_autenticacion.xlsx@Datos@1

  Esquema del escenario: TRN0369 Inicio de sesion exitoso en SVP Dos
    Dado que Juan carga los datos de la transaccion
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> |
    Cuando el intenta autenticarse utilizando sus credenciales
      | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    #Entonces el deberia de ver el resultado de la autenticacion es exitoso
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/autenticacion/trn_0369_autenticacion.xlsx@Datos@1