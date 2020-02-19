#language: es

Característica: SVP consulta de detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en la SVP
  Para consultar el detalle de un fondo de inversion

  Esquema del escenario: Consulta detalle de fondos de inversion con fecha de vencimiento
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle del fondo de inversion
    Entonces el deberia de ver el detalle  de fondos de inversion
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                     |   escenario       |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleFondosInversion@1
      |1|Acierto|||||FIDURENTA2|1234|4321||Inversiones|7001000083018|Tipo de fondo,Saldo disponible,Saldo total,Fecha de vencimiento|Con fecha de vencimiento|

  Esquema del escenario: Consulta detalle de fondos de inversion sin fecha de vencimiento
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle del fondo de inversion
    Entonces el deberia de ver el detalle  de fondos de inversion
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                     |   escenario       |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleFondosInversion@2
      |2|Acierto|||||FIDUQA04|1234|4321||Inversiones|0461000001260|Tipo de fondo,Saldo disponible,Saldo total|Sin fecha de vencimiento|
