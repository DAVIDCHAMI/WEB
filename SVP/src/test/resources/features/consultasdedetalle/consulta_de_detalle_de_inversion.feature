#language: es

Característica: SVP consulta de detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para consultar el detalle de una inversion virtual

  Esquema del escenario: Consulta detalle de inversiones virtuales
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle inversiones virtuales
    Entonces el deberia de ver el detalle  de inversiones virtuales
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                     |   escenario       |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleInversiones@1
      |1|Acierto|||||USUA13RIO|1234|4321||Inversiones|27600103026|Tipo de inversion,Fecha de apertura,Capital,Plazo en dias,Periodicidad de intereses al dia,Fecha de vencimiento,Tasa de interes efectiva anual,Tasa de interes nominal,Intereses pagados,Intereses del periodo|Inversion Virtual|
