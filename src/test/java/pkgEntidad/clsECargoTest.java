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
public class clsECargoTest {
    
    @org.junit.jupiter.api.Test
    public void testGetId() {
        clsECargo cargo = new clsECargo(1, "NombreCargo");
        assertEquals(1, cargo.getId());
    }

    @org.junit.jupiter.api.Test
    public void testSetId() {
        clsECargo cargo = new clsECargo();
        cargo.setId(2);
        assertEquals(2, cargo.getId());
    }

    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        clsECargo cargo = new clsECargo(1, "NombreCargo");
        assertEquals("NombreCargo", cargo.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void testSetNombre() {
        clsECargo cargo = new clsECargo();
        cargo.setNombre("NuevoNombreCargo");
        assertEquals("NuevoNombreCargo", cargo.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void testSetIdString() {
        clsECargo cargo = new clsECargo();
        assertThrows(UnsupportedOperationException.class, () -> cargo.setId("codigo_del_cargo_a_buscar"));
    }
}

    

