package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pkgEntidad.clsECargo;
import pkgNegocio.Conexion;
import pkgNegocio.clsNCargo;

public class CargoSteps {

    private Connection con;
    private clsNCargo cargoHandler;
    private clsECargo cargo;

    @Given("el usuario está en la página de administración de cargos")
    public void user_is_on_cargo_admin_page() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        cargoHandler = new clsNCargo();
    }

    @When("el usuario lista los cargos")
    public void user_lists_cargos() {
        cargoHandler.Mtdlistar();
    }

    @Then("se deberían mostrar todos los cargos")
    public void cargos_should_be_displayed() {
        // Aquí puedes agregar aserciones para verificar que se muestran los cargos correctamente.
        // Por ejemplo, podrías obtener el ResultSet y verificar que contiene los datos esperados.
    }

    @When("el usuario busca un cargo por código")
    public void user_searches_cargo_by_code() {
        cargo = new clsECargo();
        // Configura el objeto cargo con el código que estás buscando.
        cargo.setId(1);
        cargoHandler.MtdBuscarCodigo(cargo);
    }

    @Then("debería encontrar el cargo correspondiente")
    public void cargo_should_be_found() {
        // Aquí puedes agregar aserciones para verificar que el cargo fue encontrado correctamente.
        // Por ejemplo, puedes verificar que el ResultSet contiene el cargo esperado.
    }

    @When("el usuario agrega un nuevo cargo")
    public void user_adds_new_cargo() {
        cargo = new clsECargo();
        // Configura el objeto cargo con los datos del nuevo cargo.
        cargo.setId(3);
        cargo.setNombre("nombre_del_nuevo_cargo");
        cargoHandler.MtdAgregar(cargo);
    }

    @Then("el nuevo cargo debería estar en la lista de cargos")
    public void new_cargo_should_be_in_cargo_list() {
        // Aquí puedes agregar aserciones para verificar que el nuevo cargo está en la lista.
        // Por ejemplo, puedes listar los cargos nuevamente y verificar que contiene el nuevo cargo.
    }

    @When("el usuario elimina un cargo")
    public void user_deletes_cargo() {
        // Configura el objeto cargo con el código del cargo que deseas eliminar.
        String codigoCargoAEliminar = "5";
        cargoHandler.MtdEliminar(codigoCargoAEliminar);
    }

    @Then("el cargo debería ser eliminado de la lista de cargos")
    public void cargo_should_be_deleted_from_cargo_list() {
        // Aquí puedes agregar aserciones para verificar que el cargo fue eliminado correctamente.
        // Por ejemplo, puedes listar los cargos nuevamente y verificar que no contiene el cargo eliminado.
    }

    @When("el usuario modifica un cargo")
    public void user_modifies_cargo() {
        cargo = new clsECargo();
        // Configura el objeto cargo con el código del cargo que deseas modificar y los nuevos datos.
        cargo.setId(2);
        cargo.setNombre("Visitante");
        cargoHandler.MtdModificar(cargo);
    }

    @Then("el cargo debería reflejar los cambios en la lista de cargos")
    public void cargo_should_reflect_changes_in_cargo_list() {
        // Aquí puedes agregar aserciones para verificar que el cargo fue modificado correctamente.
        // Por ejemplo, puedes listar los cargos nuevamente y verificar que contiene el cargo modificado con los nuevos datos.
    }
}
