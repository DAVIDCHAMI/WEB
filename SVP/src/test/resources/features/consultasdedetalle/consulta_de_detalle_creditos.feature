#language: es

Característica: SVP consulta de detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en la SVP
  Para consultar el detalle de un credito de consumo

  Esquema del escenario: Consulta detalle de credito hipotecario
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle del credito
    Entonces el deberia de ver el detalle del credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle   |   escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleCreditos1@1
      |1|Acierto|||||CHIPOTE95|1234|4321||Creditos|10001263181|Tipo de credito,Capital vigente,Deuda a la fecha,Plan,Tasa de interes efectiva anual,Fecha de vencimiento,Numero de cuotas|Credito hipotecario|

  Esquema del escenario: Consulta detalle credito de comsumo
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle del credito
    Entonces el deberia de ver el detalle del credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle   |   escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleCreditos1@2
      |2|Acierto|||||CHIPOTE95|1234|4321||Creditos|29281026324|Tipo de credito,Capital vigente,Deuda a la fecha,Fecha de desembolso,Valor desembolsado, |Credito de consumo|
