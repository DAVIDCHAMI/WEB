#language: es

Característica: SVP consulta detalles
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en la SVP
  Para consultar el detalle de una tarjeta de credito

  Esquema del escenario: Consulta detalle tarjeta de credito Amex.
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito
    Entonces el deberia de ver el detalle de la tarjeta de credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle   |escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleTarjetasCredito@1
      |1|Acierto|||||USUCTDC3|1234|1234||Tarjetas de credito|****7036|Tipo de tarjeta,Disponible para avances en pesos,Cupo disponible en pesos,Deuda a la fecha en pesos,Deuda a la fecha en dolares,TRM|Visualizar campos Amex|

  Esquema del escenario: Consulta detalle tarjeta de credito Master.
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito
    Entonces el deberia de ver el detalle de la tarjeta de credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle                                                                                    |escenario              |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleTarjetasCredito@2
      |2|Acierto|||||USUCTDC3|1234|1234||Tarjetas de credito|****8091|Tipo de tarjeta,Disponible para avances en pesos,Cupo disponible en pesos,Deuda a la fecha en pesos,Deuda a la fecha en dolares,TRM|Visualizar campos Master|

  Esquema del escenario: Consulta detalle tarjeta de credito Visa.
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito
    Entonces el deberia de ver el detalle de la tarjeta de credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle  |escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleTarjetasCredito@3
      |3|Acierto|||||USUCTDC3|1234|1234||Tarjetas de credito|****0374|Tipo de tarjeta,Disponible para avances en pesos,Cupo disponible en pesos,Deuda a la fecha en pesos,TRM|Visualizar campos Visa|

  Esquema del escenario: Consulta detalle tarjetas de credito E-card
    Dado que Andres carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | producto   | numeroProducto   | camposDetalle   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <producto> | <numeroProducto> | <camposDetalle> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito
    Entonces el deberia de ver el detalle de la tarjeta de credito
    Ejemplos:
      | idCaso    | orientacion   | codigoTransaccion  | codigoError  | resultadoEsperado     | numeroDocumento   | usuario      | clave   | segundaClave  | tipoDocumento   | producto   | numeroProducto    | camposDetalle  |escenario  |
       ##@externaldata@.\src\test\resources\datadriven\consultasdedetalle\consulta_de_detalles.xlsx@DetalleTarjetasCredito@4
      |4|Acierto|||||PRUEBAECARD02|1234|1234||Tarjetas de credito|****7371|Tipo de tarjeta,Disponible para avances en pesos,Cupo disponible en pesos,Deuda a la fecha en pesos,Deuda a la fecha en dolares,TRM,Fecha de vencimiento,Codigo de seguridad|Visualizar campos Ecard Master|