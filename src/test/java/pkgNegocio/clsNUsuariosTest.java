/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import pkgEntidad.clsEUsuarios;

/**
 *
 * @author Pedro
 */
public class clsNUsuariosTest {
    
    clsNUsuarios objNUsuarios;

    @BeforeEach
    void setUp() {
        objNUsuarios = new clsNUsuarios();
    }

    @org.junit.jupiter.api.Test
    void testListarUsuarios() {
        // Act
        ResultSet result = objNUsuarios.Mtdlistar();

        // Assert
        assertNotNull(result);
        // Add more assertions based on your expected results
    }

    

    @org.junit.jupiter.api.Test
    void testEliminarUsuario() {
        // Arrange
        String dniToDelete = "12345678A"; // Assuming this DNI exists in your database

        // Act
        boolean result = objNUsuarios.MtdEliminar(dniToDelete);

        // Assert
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testBuscarCodigoUsuario() {
        // Arrange
        clsEUsuarios objEUsuarios = new clsEUsuarios();
        objEUsuarios.setDni("12345678A"); // Assuming this DNI exists in your database

        // Act
        ResultSet result = objNUsuarios.MtdBuscarCodigo(objEUsuarios);

        // Assert
        assertNotNull(result);
        // Add more assertions based on your expected results
    }


}
