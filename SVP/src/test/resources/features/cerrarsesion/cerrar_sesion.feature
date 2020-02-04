#language: es

Característica: SVP cerrar sesion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para realizar cierre de sesion en la SVP

  Esquema del escenario: Inicio de sesion exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | mensajeRespuesta   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <mensajeRespuesta> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia ver la sesion cerrada.
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | mensajeRespuesta | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/cerrarsesion/cerrarsesion.xlsx@Datos@1
      |1|Acierto|||Si aún no has creado el usuario, ingresa el número del documento de identidad.||pruebaavance01|1234|||