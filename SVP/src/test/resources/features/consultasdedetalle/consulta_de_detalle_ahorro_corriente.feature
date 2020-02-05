#language: es

Característica: SVP consultas de detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en la SVP
  Para consultar el detalle de las cuentas ahorro y corriente

  Esquema del escenario: Consulta detalle cuenta de ahorro
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la cuenta de ahorro
    Entonces el deberia de ver el detalle de la cuenta de ahorro
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                     |   escenario       |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleCuentasAhorro@1
      |1|Acierto|||||PRUEBAICDSC2|1234|1234||Cuentas|406-777090-17|Tipo de cuenta,Saldo total,Saldo disponible,Saldo en canje|Visualizar campos|

  Esquema del escenario: Consulta detalle cuenta corriente
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la cuenta corriente
    Entonces el deberia de ver el detalle de la cuenta corriente
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                     |   escenario       |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleCuentasCorriente@1
      |1|Acierto|||||PRUEBAICDSC2 |1234|1234||Cuentas|406-177090-03|Tipo de cuenta,Saldo disponible,Saldo total,Saldo en canje,Dias de sobregiro |Visualizar campos|
