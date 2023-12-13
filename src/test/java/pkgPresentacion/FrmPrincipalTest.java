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
public class FrmPrincipalTest {
    
  
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

  
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = {};  // Utiliza un array vacío en lugar de null
        FrmPrincipal.main(args);
        // TODO revisa el código de prueba generado y elimina la llamada predeterminada a fail.
    }

    @org.junit.jupiter.api.Test
    public void testMain2() {
        System.out.println("main");
        String[] args = null;
        FrmLogin.main(args);

    }
    
    
    
}
