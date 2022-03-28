Feature: Registrarse en la plataforma
  As cliente del la tienda
  I want to registrarme en la plataforma
  So that yo pueda comprar en línea

  Scenario: Crear un nuevo usuario con campos obligatorios
    Given que estoy en la pagina de registro de la plataforma
    When diligencie los campos obligatorios con mi informacion personal necesaria
      | FirstName   | Philip         |
      | LastName    | Sherman        |
      | Password     | 12345          |
      | Address      | 42 Wallaby Way |
      | City         | Sidney         |
      | State        | Alabama        |
      | ZipCode     | 20000           |
      | MobilePhone | 1234567890     |
    Then se mostrara un mensaje que confrima mi registro en la plataforma

  Scenario: Intentar crear un usuario con un formato de email no valido
    Given que estoy en la pagina de creacion de cuenta
    When ingrese un correo con un formato incorrecto como "p.sherman.pixar.com"
    Then se mostrar un mensaje de advertencia "Invalid email address".
