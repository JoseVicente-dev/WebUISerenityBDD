Feature: Ingresar
  As cliente registrado en la plataforma
  I want to ingresar al aplicativo
  So that yo pueda consultar el estado de mis productos financieros

  Scenario: Ingresar al aplicativo con credenciales validas
    Given que me he registrado en la plataforma
    And estoy en el modulo Sign Un
    When ingrese mis credenciales de login validas
      | Email address | [Aleatorio] |
      | Password      | 12345        |
    Then podre consultar el estado de mis poductos

  Scenario: Intentar ingresar con un formato de correo no valido
    Given que estoy en el modulo de ingreso
    When ingrese un correo con un formato no valido como "p.sherman.pixar.com"
    Then se mostrara un mensaje de error y no podre ingresar al aplicativo