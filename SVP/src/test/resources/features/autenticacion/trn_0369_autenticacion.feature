#language: es
@E2E_SVP

Característica: SVP autenticacion
  Yo, como usuario de Bancolombia, quiero iniciar sesion en el SVP y autenticarse con un usuario y contraseña

  @TestCase1
  Esquema del escenario: TRN0369 Inicio de sesion exitoso en el sitio SVP
    Dado que Yo cargo los datos de la transaccion
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> |
    Cuando intento autenticarme utilizando mis credenciales
      | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Entonces verifico el resultado de la autenticacion para inicio de session exitoso

    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/autenticacion/trn_0369_autenticacion.xlsx@Datos
      | 1      | Acierto     | 0369              | 000         | Inicio2           | 1373022         | usua22rio | 1234  | 2443         | 1             |
