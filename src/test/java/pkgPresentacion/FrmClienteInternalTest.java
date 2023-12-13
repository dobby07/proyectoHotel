/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgPresentacion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class FrmClienteInternalTest {
    
   

    /**
     * Test of main method, of class FrmClienteInternal.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmClienteInternal.main(args);
    }

    /**
     * Test of setDatos method, of class FrmClienteInternal.
     */
    @org.junit.jupiter.api.Test
    public void testSetDatos() {
        System.out.println("setDatos");
        String dni = "00112233";
        String direccion = "Sample Address";
        String telefono = "123-456-789";
        String email = "sample@email.com";
        FrmClienteInternal instance = new FrmClienteInternal();
        instance.setDatos(dni, direccion, telefono, email);
        
    }
    
}
