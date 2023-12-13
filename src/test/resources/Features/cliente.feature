# Author
# Date
# Description

Feature: Gestión de Clientes

  Scenario: Listar clientes
    Given el usuario está en la página de gestión de clientes
    When el usuario lista los clientes
    Then se deberían mostrar todos los clientes

  Scenario: Agregar nuevo cliente
    Given el usuario está en la página de gestión de clientes
    When el usuario agrega un nuevo cliente con DNI "{DNI}", nombre "{Nombre}", apellido "{Apellido}", y teléfono "{Telefono}"
    Then el nuevo cliente debería estar en la lista de clientes

  Scenario: Buscar cliente por DNI
    Given el usuario está en la página de gestión de clientes
    When el usuario busca un cliente por DNI "{DNI}"
    Then debería encontrar el cliente correspondiente

  Scenario: Modificar cliente
    Given el usuario está en la página de gestión de clientes
    When el usuario modifica el cliente con DNI "{DNI}" y actualiza el nombre a "{NuevoNombre}"
    Then el cliente debería reflejar los cambios en la lista de clientes

  Scenario: Eliminar cliente
    Given el usuario está en la página de gestión de clientes
    When el usuario elimina el cliente con DNI "{DNI}"
    Then el cliente debería ser eliminado de la lista de clientes




