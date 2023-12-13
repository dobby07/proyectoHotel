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
import pkgEntidad.clsEReservas;

/**
 *
 * @author Pedro
 */
public class clsNReservasTest {
    
    clsNReservas objNReservas;
   
    @BeforeEach
    void setUp() {
        objNReservas = new clsNReservas();
    }
    
    @org.junit.jupiter.api.Test
    public void testMtdListarReserva() {
        // Act
        clsNReservas objNReservas = new clsNReservas();  // Asegúrate de crear una instancia válida del objeto
        ResultSet result = objNReservas.Mtdlistar();

        // Assert
        assertNotNull(result);
        // Agrega más aserciones basadas en tus resultados esperados
    }

    /**
     * Test of Mtdlistar method, of class clsNReservas.
     */
  

    /**
     * Test of MtdEliminar method, of class clsNReservas.
     */
    @org.junit.jupiter.api.Test
    void testEliminarReserva() {
        // Arrange
        clsNReservas objNReservas = new clsNReservas();  // Asegúrate de crear una instancia válida del objeto
        String idToDelete = "1"; // Assuming this ID exists in your database

        // Act
        boolean result = objNReservas.MtdEliminar(idToDelete);

        // Assert
        assertTrue(result);
    }

    /**
     * Test of MtdActualizarEstado method, of class clsNReservas.
     */
    @org.junit.jupiter.api.Test
   void testActualizarEstadoReserva() {
    // Arrange
    clsNReservas objNReservas = new clsNReservas();  // Asegúrate de crear una instancia válida del objeto
    String idToUpdate = "1"; // Assuming this ID exists in your database

    // Act
    boolean result = objNReservas.MtdActualizarEstado(idToUpdate);

    // Assert
    assertTrue(result);
}

    /**
     * Test of MtdAgregar method, of class clsNReservas.
     */
//   @org.junit.jupiter.api.Test
//    public void testMtdAgregar() {
//        // Crear una instancia de la clase que contiene el método a probar
//        clsNReservas objNReservas = new clsNReservas();
//
//        // Crear un objeto de prueba para la reserva
//        clsEReservas objEres = new clsEReservas();
//        objEres.setId(1);  // Establecer valores adecuados para tu prueba
//        objEres.setCliente_dni("12345678");
//        objEres.setHabitacion_id(152);
//        objEres.setFechareserva("2023-01-01");
//        objEres.setEstado("Reservado");
//        objEres.setFecha_entrada("2023-01-10");
//        objEres.setFecha_salida("2023-01-15");
//        // Establecer otros valores necesarios para tu prueba
//
//        // Llamar al método que quieres probar
//        boolean resultado = objNReservas.MtdAgregar(objEres);
//
//        // Verificar si el resultado es el esperado
//        assertTrue(resultado);
//
//        // Opcional: Realizar más aserciones para verificar el estado después de la inserción
//        // Por ejemplo, puedes consultar la base de datos para asegurarte de que se haya insertado correctamente.
//    }

    /**
     * Test of MtdBuscarCodigo method, of class clsNReservas.
     */
    @org.junit.jupiter.api.Test
    void testBuscarCodigoReserva() {
        // Arrange
        clsNReservas objNReservas = new clsNReservas();  // Asegúrate de crear una instancia válida del objeto
        clsEReservas objEReservas = new clsEReservas();
        objEReservas.setId(1); // Assuming this ID exists in your database

        // Act
        ResultSet result = objNReservas.MtdBuscarCodigo(objEReservas);

        // Assert
        assertNotNull(result);
        // Agrega más aserciones basadas en tus resultados esperados
    }

    /**
     * Test of MtdModificar method, of class clsNReservas.
     */
//   @org.junit.jupiter.api.Test
//public void testMtdModificar() {
//    // Arrange
//    clsNReservas objNReservas = new clsNReservas();  // Asegúrate de crear una instancia válida del objeto
//    clsEReservas objEReservas = new clsEReservas();
//    objEReservas.setId(1); // Assuming this ID exists in your database
//
//    // Act
//    boolean result = objNReservas.MtdModificar(objEReservas);
//
//    // Assert
//    assertTrue(result);
//    // Agrega más aserciones basadas en tus resultados esperados
//}
}
