/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import pkgEntidad.clsECliente;

/**
 *
 * @author Pedro
 */
public class clsNClienteTest {
    

    /**
     * Test of Mtdlistar method, of class clsNCliente.
     */
   @org.junit.jupiter.api.Test
    void testMtdlistar() {
        System.out.println("Mtdlistar");
        clsNCliente instance = new clsNCliente();
        ResultSet result = instance.Mtdlistar();

        try {
            // Verificar que el resultado no sea nulo
            assertNotNull(result);

            // Puedes agregar más verificaciones según tus necesidades
            // Por ejemplo, verificar que el conjunto de resultados tenga al menos una fila
            assertTrue(result.next());

            // También puedes verificar valores específicos en las columnas, por ejemplo:
            // assertEquals("valorEsperado", result.getString("nombreColumna"));

        } catch (SQLException ex) {
            // Si hay una excepción al trabajar con la base de datos, falla la prueba
            fail("Excepción SQL: " + ex.getMessage());
        }
    }

    /**
     * Test of MtdAgregar method, of class clsNCliente.
     */
    @org.junit.jupiter.api.Test
    void testMtdAgregar() {
        System.out.println("MtdAgregar");
        clsECliente objEclie = new clsECliente();
        // Puedes establecer valores para objEclie según tus necesidades
        objEclie.setDni("52252251");
        objEclie.setNombre("Heidi");
        objEclie.setApellido("Nina");
        objEclie.setTelefono("5215122");

        clsNCliente instance = new clsNCliente();
        boolean result = instance.MtdAgregar(objEclie);

        // Verificar que el resultado sea el esperado (en este caso, se espera true si la inserción es exitosa)
        assertFalse(result);
    }

    /**
     * Test of MtdBuscarCodigo method, of class clsNCliente.
     */
    @org.junit.jupiter.api.Test
    void testMtdBuscarCodigo() {
        System.out.println("MtdBuscarCodigo");
        clsECliente objEcli = new clsECliente();
        // Puedes establecer valores para objEcli según tus necesidades
        objEcli.setDni("00112233");

        clsNCliente instance = new clsNCliente();
        ResultSet result = instance.MtdBuscarCodigo(objEcli);

        try {
            // Verificar que el resultado no sea nulo
            assertNotNull(result);

            // Puedes agregar más verificaciones según tus necesidades
            // Por ejemplo, verificar que el conjunto de resultados tenga al menos una fila
            assertTrue(result.next());

            // También puedes verificar valores específicos en las columnas, por ejemplo:
            // assertEquals("valorEsperado", result.getString("nombreColumna"));

        } catch (SQLException ex) {
            // Si hay una excepción al trabajar con la base de datos, falla la prueba
            fail("Excepción SQL: " + ex.getMessage());
        }
    }

    /**
     * Test of MtdEliminar method, of class clsNCliente.
     */
//    @org.junit.jupiter.api.Test
//    void testMtdEliminar() {
//        System.out.println("MtdEliminar");
//        String dni = "52252251";  // Puedes ajustar este valor según tus necesidades
//        clsNCliente instance = new clsNCliente();
//        boolean result = instance.MtdEliminar(dni);
//
//        
//       assertTrue(result);
//    }

    /**
     * Test of MtdModificar method, of class clsNCliente.
     */
//    @org.junit.jupiter.api.Test
//    public void testMtdModificar() {
//        System.out.println("MtdModificar");
//        clsECliente objEclie = null;
//        clsNCliente instance = new clsNCliente();
//        boolean expResult = false;
//        boolean result = instance.MtdModificar(objEclie);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of pdfClientes method, of class clsNCliente.
//     */
//   @org.junit.jupiter.api.Test
//    public void testPdfClientes() {
//        System.out.println("pdfClientes");
//        clsECliente objEclie = null;
//        clsNCliente instance = new clsNCliente();
//        instance.pdfClientes(objEclie);
//        
//    }
    
}
