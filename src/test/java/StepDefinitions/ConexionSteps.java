package StepDefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pkgNegocio.Conexion;

public class ConexionSteps {

    private Connection con;

    @Given("^se establece la conexión a la base de datos$")
    public void seEstableceLaConexionALaBaseDeDatos() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        assertNotNull(con);
    }

    @When("^se realiza una consulta simple$")
    public void seRealizaUnaConsultaSimple() {
        // Puedes agregar lógica adicional para realizar una consulta simple, si lo deseas
    }

    @Then("^la conexión a la base de datos es exitosa$")
    public void laConexionALaBaseDeDatosEsExitosa() {
        assertNotNull(con);
        try {
            assertTrue(con.isValid(5)); // Verificar que la conexión sigue siendo válida después de 5 segundos de inactividad
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
    }

    private void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}