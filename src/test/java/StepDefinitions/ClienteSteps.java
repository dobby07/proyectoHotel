package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pkgEntidad.clsECliente;
import pkgNegocio.clsNCliente;

public class ClienteSteps {

    private clsNCliente clienteHandler;
    private clsECliente cliente;

    @Given("el usuario está en la página de gestión de clientes")
    public void user_is_on_client_management_page() {
        clienteHandler = new clsNCliente();
    }

    @When("el usuario lista los clientes")
    public void user_lists_clients() {
        clienteHandler.Mtdlistar();
    }

    @Then("se deberían mostrar todos los clientes")
    public void clients_should_be_displayed() {
        // Aquí puedes agregar aserciones para verificar que se muestran los clientes correctamente.
        // Por ejemplo, podrías obtener el ResultSet y verificar que contiene los datos esperados.
    }

    @When("el usuario agrega un nuevo cliente con DNI {string}, nombre {string}, apellido {string}, y teléfono {string}")
    public void user_adds_new_client(String dni, String nombre, String apellido, String telefono) {
        cliente = new clsECliente();
        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        clienteHandler.MtdAgregar(cliente);
    }

    @Then("el nuevo cliente debería estar en la lista de clientes")
    public void new_client_should_be_in_client_list() {
        // Aquí puedes agregar aserciones para verificar que el nuevo cliente está en la lista.
        // Por ejemplo, puedes listar los clientes nuevamente y verificar que contiene el nuevo cliente.
    }

    @When("el usuario busca un cliente por DNI {string}")
    public void user_searches_client_by_dni(String dni) {
        cliente = new clsECliente();
        cliente.setDni(dni);
        clienteHandler.MtdBuscarCodigo(cliente);
    }

    @Then("debería encontrar el cliente correspondiente")
    public void client_should_be_found() {
        // Aquí puedes agregar aserciones para verificar que el cliente fue encontrado correctamente.
        // Por ejemplo, puedes verificar que el ResultSet contiene el cliente esperado.
    }

    @When("el usuario modifica el cliente con DNI {string} y actualiza el nombre a {string}")
    public void user_modifies_client(String dni, String nuevoNombre) {
        cliente = new clsECliente();
        cliente.setDni(dni);
        cliente.setNombre(nuevoNombre);
        clienteHandler.MtdModificar(cliente);
    }

    @Then("el cliente debería reflejar los cambios en la lista de clientes")
    public void client_should_reflect_changes_in_client_list() {
        // Aquí puedes agregar aserciones para verificar que el cliente fue modificado correctamente.
        // Por ejemplo, puedes listar los clientes nuevamente y verificar que contiene el cliente modificado con los nuevos datos.
    }

    @When("el usuario elimina el cliente con DNI {string}")
    public void user_deletes_client(String dni) {
        clienteHandler.MtdEliminar(dni);
    }

    @Then("el cliente debería ser eliminado de la lista de clientes")
    public void client_should_be_deleted_from_client_list() {
        // Aquí puedes agregar aserciones para verificar que el cliente fue eliminado correctamente.
        // Por ejemplo, puedes listar los clientes nuevamente y verificar que no contiene el cliente eliminado.
    }
}
