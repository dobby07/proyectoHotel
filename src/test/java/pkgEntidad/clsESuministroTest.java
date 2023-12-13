/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgEntidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author Pedro
 */
public class clsESuministroTest {
    
    /**
     * Test of getId method, of class clsESuministro.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        clsESuministro suministro = new clsESuministro(1, "NombreSuministro");
        assertEquals(1, suministro.getId());
    }
    
    @org.junit.jupiter.api.Test
    public void testSetId() {
        clsESuministro suministro = new clsESuministro(1, "NombreSuministro");
        suministro.setId(1);
        assertEquals(1, suministro.getId());
    }
    
    
    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        clsESuministro suministro = new clsESuministro(1, "NombreSuministro");
        assertEquals("NombreSuministro", suministro.getNombre());
    }
    
    @org.junit.jupiter.api.Test
public void testSetNombre() {
    clsESuministro suministro = new clsESuministro(1, "NombreSuministro");
    suministro.setNombre("NuevoNombreSuministro");
    assertEquals("NuevoNombreSuministro", suministro.getNombre());
}

    
    
}
