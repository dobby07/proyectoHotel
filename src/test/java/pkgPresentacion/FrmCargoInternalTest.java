/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgPresentacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class FrmCargoInternalTest {
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class FrmCargoInternal.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCargoInternal.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setDatos method, of class FrmCargoInternal.
     */
    @org.junit.jupiter.api.Test
    public void testSetDatos() {
        System.out.println("setDatos");
        String codigo = "2";
        String nombre = "Visitante";
        FrmCargoInternal instance = new FrmCargoInternal();
        instance.setDatos(codigo, nombre);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
