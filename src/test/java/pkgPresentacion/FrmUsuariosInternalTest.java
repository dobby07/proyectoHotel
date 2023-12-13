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
public class FrmUsuariosInternalTest {
    
   

    /**
     * Test of main method, of class FrmUsuariosInternal.
     */
   @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmUsuariosInternal.main(args);
    }

    /**
     * Test of SetDatos method, of class FrmUsuariosInternal.
     */
   @org.junit.jupiter.api.Test
    public void testSetDatos() {
        System.out.println("SetDatos");
        String dni = "12345678";
        String clave = "123426";
        String nombre = "OOscar";
        String apellido = "Cervantes";
        String email = "mcervantes@gmail.com";
        String telefono = "999225888";
        FrmUsuariosInternal instance = new FrmUsuariosInternal();
        instance.SetDatos(dni, clave, nombre, apellido, email, telefono);
    }
    
}
