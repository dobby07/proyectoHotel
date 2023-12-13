/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import pkgEntidad.clsEHabitaciones;

/**
 *
 * @author Pedro
 */
public class clsNHabitacionesTest {
    
    clsNHabitaciones objNHabitaciones;
    
    @BeforeEach
    void setUp() {
        objNHabitaciones = new clsNHabitaciones();
    }
    
@org.junit.jupiter.api.Test
public void testMtdestadohabitaciones() {
    // Arrange
    System.out.println("Mtdestadohabitaciones");

    // Act
    clsNHabitaciones instance = new clsNHabitaciones();
    ResultSet result = instance.Mtdestadohabitaciones();

    // Assert
    assertNotNull(result);
    // Agrega aserciones adicionales según la lógica de tu programa
}

    /**
     * Test of MtdModificar method, of class clsNHabitaciones.
     */
    @org.junit.jupiter.api.Test
    public void testMtdModificar() {
        // Arrange
        clsEHabitaciones objEHab = new clsEHabitaciones();
        objEHab.setId(1); // Assuming this ID exists in your database
        objEHab.setFkdnicli("87654321");
        objEHab.setEstado("Ocupada");

        // Act
        boolean result = objNHabitaciones.MtdModificar(objEHab);

        // Assert
        assertTrue(result);
   
    }

    /**
     * Test of MtdAgregarHabitacion method, of class clsNHabitaciones.
     */
@org.junit.jupiter.api.Test
public void testMtdAgregarHabitacion() {
    // Arrange
    System.out.println("MtdAgregarHabitacion");
    clsEHabitaciones objEhab = new clsEHabitaciones();
    // Configura el objeto objEhab según sea necesario para tu prueba

    // Act
    clsNHabitaciones instance = new clsNHabitaciones();
    boolean result = instance.MtdAgregarHabitacion(objEhab);

    // Assert
    assertFalse(result);
    // Agrega aserciones adicionales según la lógica de tu programa
}

    /**
     * Test of MtdListar method, of class clsNHabitaciones.
     */
     @org.junit.jupiter.api.Test
    public void testMtdListar() {
        // Arrange
        // Assuming you have some data in your database

        // Act
        ArrayList<clsEHabitaciones> habitacionesList = clsNHabitaciones.MtdListar();

        // Assert
        assertNotNull(habitacionesList);
        assertFalse(habitacionesList.isEmpty());
    
    }

    /**
     * Test of MtdBuscarCodigo method, of class clsNHabitaciones.
     */
     @org.junit.jupiter.api.Test
    public void testMtdBuscarCodigo() {
        // Arrange
    System.out.println("MtdBuscarCodigo");
    clsEHabitaciones objEhab = new clsEHabitaciones();
    // Configura el objeto objEhab según sea necesario para tu prueba

    // Act
    clsNHabitaciones instance = new clsNHabitaciones();
    ResultSet result = instance.MtdBuscarCodigo(objEhab);

    // Assert
    assertNotNull(result);
    // Agrega aserciones adicionales según la lógica de tu programa
        
    }
    
}
