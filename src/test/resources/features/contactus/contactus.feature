Feature: Soporte al cliente
  As visitante de la pagina
  I want to realizar una peticion
  So that sea atendida por el area de servicio al cliente

  Scenario: Contactar con servicio al cliente
    Given que estoy en la seccion Contact Us
    When diligencie mi PQRS y la envie
      | SubjectHeading | Webmaster               |
      | Email           | p.sherman@pixar.com            |
      | Message         | ALL THE ANIMALS HAVE GONE MAD! |
    Then se confirmara el envio de la misma "Your message has been successfully sent to our team."

  Scenario: Intentar enviar una PQRS sin datos de contacto
    Given que estoy en Contact Us
    When diligencie el correo de contacto pero no suministre un mensaje
      | SubjectHeading | Customer service               |
      | Email           | p.sherman@pixar.com            |
      | Message         |   |
    Then se mostrara el error "The message cannot be blank."