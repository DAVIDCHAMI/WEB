#language: es

Característica: SVP cerrar sesion
  Yo como usuario de Bancolombia
  Quiero Cerrar la sesión del cliente
  Para Evitar fraudes en la aplicacion

  Esquema del escenario: Inicio de sesion exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | mensajeRespuesta   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <mensajeRespuesta> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el cierra la sesion en la SVP
    Entonces el deberia ver la pantalla de inicio de sesion.
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | mensajeRespuesta | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/cerrarsesion/cerrarsesion.xlsx@Datos@1
      |1|Acierto|||Si aún no has creado el usuario, ingresa el número del documento de identidad.||pruebaavance01|1234|||