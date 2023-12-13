package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import pkgEntidad.clsEUsuarios;
import pkgNegocio.clsNUsuarios;

public class UsuariosSteps {

    private clsEUsuarios user;
    private clsNUsuarios userManager;
    private List<clsEUsuarios> userList;
    private ResultSet queryResult;

    @Given("^there are no registered users$")
    public void thereAreNoRegisteredUsers() {
        userManager = new clsNUsuarios();
    }

    @When("^a user is added with DNI \"([^\"]*)\", clave \"([^\"]*)\", nombre \"([^\"]*)\", apellido \"([^\"]*)\", email \"([^\"]*)\", teléfono \"([^\"]*)\", estado \"([^\"]*)\" and cargo \"([^\"]*)\"$")
    public void addUser(String dni, String clave, String nombre, String apellido, String email, String telefono, String estado, String cargo) {
        user = new clsEUsuarios();
        user.setDni(dni);
        user.setClave(clave);
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setEmail(email);
        user.setTelefono(telefono);
        user.setEstado(estado);
        user.setFk_cargo(cargo);
        // Implementación para agregar el usuario a la lista interna o realizar la acción correspondiente.
    }

    @Then("^the list of users should contain one user$")
    public void listOfUsersContainsOneUser() {
        userList = (List<clsEUsuarios>) userManager.Mtdlistar();
        assertEquals(1, userList.size());
    }

    // Implementa pasos similares para los demás escenarios...

    @When("^the user with DNI \"([^\"]*)\" validates login with clave \"([^\"]*)\"$")
    public void validateLogin(String dni, String clave) {
        user = new clsEUsuarios();
        user.setDni(dni);
        user.setClave(clave);
        userManager.MtdValidarLogin(user);
    }

    @Then("^the login validation should be successful$")
    public void loginValidationShouldBeSuccessful() {
        // Implementa las verificaciones o aserciones necesarias para validar el inicio de sesión.
    }
}

