# Plan de pruebas Screenplay WebUI

Es necesario verificar el funcionamiento del sitio web [http://automationpractice.com/index.php](http://automationpractice.com/index.php)

Se requiere probar los apartados web **Contac us**, **Sign in**, **Create an account**.

# Alcance

Se probaran los apartados

- Contact us
- Sign in
- Create an account

**Fuera del alcance:** otros modulos del aplicativo. Otros escenarios fuera de los especificados en la estrategia de pruebas

# Estrategia de pruebas

Las pruebas se harán automatizadas usando el patron Screenplay con Serenity BDD

Se plantearán 2 escenarios por cada modulo. Se ejecutarán en el siguiente orden:

1. Create an account
2. Sign in
3. Contact us

**Cobertura de pruebas:** se ejecutarán en navegador Google Chrome, usando el SO Windows 10.

**Estrategia de pruebas**: se generaran datos aleatorios para usuarios usando librerias de aleatorizacion de java, asi como JAVA Faker en donde se requiera.

### Escenarios Create an account

```markdown
**Feature:** Registrarse en la plataforma
  **As** cliente del la tienda
  **I want to** registrarme en la plataforma
  **So that** yo pueda comprar en línea  

Scenario: Crear un nuevo usuario con campos obligatorios
	Given que estoy en la pagina de registro de la plataforma
  When diligencie los campos obligatorios con mi informacion personal necesaria
  Then se mostrará un mensaje que confrima mi registro en la plataforma
```

| Email address | [ALEATORIO] |
| --- | --- | --- |
| First Name | Philip |
| Last Name | Sherman |
| Password | 12345 |
| Address | 42 Wallaby Way |
| City | Sidney |
| State | Alabama |
| Zip Code | 2000 |
| Mobile phone | 1234567890 |

```markdown
Scenario: Intentar crear un usuario con un formato de email no valido
	Given que estoy en la pagina de creacion de cuenta
  When ingrese un correo con un formato incorrecto como "p.sherman.pixar.com"
  Then se mostrará un mensaje de advertencia "1. Invalid email address".
```

### Escenarios sign in

```
Feature: Ingresar
  As cliente registrado en la plataforma
  I want to ingresar al aplicativo
  So that yo pueda consultar el estado de mis productos financieros

  Scenario: Ingresar al aplicativo con credenciales validas
		Given que me he registrado en la plataforma
		And estoy en el modulo Sign Un
    When ingrese mis credenciales de login validas     
    Then podre consultar el estado de mis poductos
```

| Email address | [Aleatorio] |
| --- | --- |
| Password | Nemo |

```
 Scenario: Intentar ingresar con un formato de correo no valido
		Given que estoy en el modulo de ingreso
    When ingrese un correo con un formato no valido como "p.sherman.pixar.com"
    Then se mostrara un mensaje de error y no podre ingresar al aplicativo
```

### Escenarios Contact us

```
Feature: Soporte al cliente
  As visitante de la pagina
  I want to realizar una peticion
  So that sea atendida por el area de servicio al cliente

  Scenario: Contactar con servicio al cliente
    Given que estoy en la seccion Contact Us
    When diligencie mi PQRS y la envie     
    Then se confirmara el envio de la misma "Your message has been successfully sent to our team."

  Scenario: Intentar enviar una PQRS sin datos de contacto
    Given que estoy en Contact Us
    When diligencie el correo de contacto pero no suministre un mensaje    
    Then se mostrara el error "The message cannot be blank."
```

| Subject Heading | Customer service |
| --- | --- |
| Email | p.sherman@pixar.com |
| Message | ALL THE ANIMALS HAVE GONE MAD! |

# Otros tipos de pruebas

Se recomienda al equipo realizar las siguientes pruebas:

- Pruebas de Rendimiento
- Pruebas de Seguridad