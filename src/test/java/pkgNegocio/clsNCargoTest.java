/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import pkgEntidad.clsECargo;

/**
 *
 * @author Pedro
 */
public class clsNCargoTest {
    
    clsNCargo objNCargo;

    @BeforeEach
    void setUp() {
        objNCargo = new clsNCargo();
    }

   @org.junit.jupiter.api.Test
    void testListarCargos() {
        // Act
        ResultSet result = objNCargo.Mtdlistar();

        // Assert
        assertNotNull(result);
        // Add more assertions based on your expected results
    }

    @org.junit.jupiter.api.Test
    void testBuscarCodigoCargo() {
        // Arrange
        clsECargo objECargo = new clsECargo();
        objECargo.setId(1); // Assuming this ID exists in your database

        // Act
        var result = objNCargo.MtdBuscarCodigo(objECargo);

        // Assert
        assertNotNull(result);
        // Add more assertions based on your expected results
    }

   @org.junit.jupiter.api.Test
    void testAgregarCargo() {
        // Arrange
        clsECargo objECargo = new clsECargo();
        objECargo.setId(5); // Assuming this ID doesn't exist in your database
        objECargo.setNombre("TestCargo");

        // Act
        boolean result = objNCargo.MtdAgregar(objECargo);

        // Assert
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testEliminarCargo() {
        // Arrange
        String idToDelete = "5"; // Assuming this ID exists in your database

        // Act
        boolean result = objNCargo.MtdEliminar(idToDelete);

        // Assert
        assertTrue(result);
    }

   @org.junit.jupiter.api.Test
    void testModificarCargo() {
        // Arrange
        clsECargo objECargo = new clsECargo();
        objECargo.setId(1); // Assuming this ID exists in your database
        objECargo.setNombre("ModifiedCargo");

        // Act
        boolean result = objNCargo.MtdModificar(objECargo);

        // Assert
        assertTrue(result);
    }
}
