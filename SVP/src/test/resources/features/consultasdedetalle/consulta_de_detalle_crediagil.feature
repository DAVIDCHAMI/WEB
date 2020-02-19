#language: es

Característica: SVP consulta de detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en la SVP
  Para consultar el detalle de una cuenta CrediAgil

  Esquema del escenario: Consulta detalle crediagil
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de crediagil
    Entonces el deberia de ver el detalle  de crediagil
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle   |   escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleCrediAgil1@1
      |1|Acierto|||||USUCAYCA01|1234|4321||Crediagil|Crediágil|Cupo asignado,Cupo utilizado,Cupo disponible,Cupo de canje|CrediAgil|
