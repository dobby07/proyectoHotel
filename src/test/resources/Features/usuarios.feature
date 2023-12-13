# Author
# Date
# Description

Feature: Funcionalidad para probar la gestión de usuarios

  Scenario: Agregar un nuevo usuario
    Given no hay usuarios registrados
    When se agrega un usuario con DNI "12345678", clave "password123", nombre "John", apellido "Doe", email "john.doe@example.com", teléfono "123456789", estado "Activo" y cargo "1"
    Then la lista de usuarios debe contener un usuario
    And el usuario debe tener los detalles correctos

  Scenario: Modificar un usuario existente
    Given hay un usuario con DNI "87654321", clave "oldpassword", nombre "Jane", apellido "Doe", email "jane.doe@example.com", teléfono "987654321", estado "Activo" y cargo "2"
    When se modifica el usuario con DNI "87654321" con nuevos detalles
    Then el usuario debe tener los detalles modificados

  Scenario: Eliminar un usuario existente
    Given hay un usuario con DNI "55555555", clave "deletepassword", nombre "Alice", apellido "Smith", email "alice.smith@example.com", teléfono "555555555", estado "Activo" y cargo "3"
    When se elimina el usuario con DNI "55555555"
    Then la lista de usuarios no debe contener al usuario eliminado

  Scenario: Validar inicio de sesión del usuario
    Given hay un usuario con DNI "99999999", clave "loginpassword", nombre "Bob", apellido "Johnson", email "bob.johnson@example.com", teléfono "999999999", estado "Activo" y cargo "1"
    When el usuario con DNI "99999999" valida el inicio de sesión con clave "loginpassword"
    Then la validación del inicio de sesión debe ser exitosa



