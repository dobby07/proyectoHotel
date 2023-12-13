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
public class clsEHabitacionesTest {
    
    @org.junit.jupiter.api.Test
    public void testGetId() {
        clsEHabitaciones habitacion = new clsEHabitaciones(1, "123456789", "101", "Individual", 100.0, "Disponible", null);
        assertEquals(1, habitacion.getId());
    }

    @org.junit.jupiter.api.Test
    public void testSetId() {
        clsEHabitaciones habitacion = new clsEHabitaciones();
        habitacion.setId(2);
        assertEquals(2, habitacion.getId());
    }

   @org.junit.jupiter.api.Test
    public void testGetFkdnicli() {
        clsEHabitaciones habitacion = new clsEHabitaciones(1, "123456789", "101", "Individual", 100.0, "Disponible", null);
        assertEquals("123456789", habitacion.getFkdnicli());
    }

    @org.junit.jupiter.api.Test
    public void testSetFkdnicli() {
        clsEHabitaciones habitacion = new clsEHabitaciones();
        habitacion.setFkdnicli("987654321");
        assertEquals("987654321", habitacion.getFkdnicli());
    }

    @org.junit.jupiter.api.Test
    public void testGetNumero() {
        clsEHabitaciones habitacion = new clsEHabitaciones(1, "123456789", "101", "Individual", 100.0, "Disponible", null);
        assertEquals("101", habitacion.getNumero());
    }

    @org.junit.jupiter.api.Test
    public void testSetNumero() {
        clsEHabitaciones habitacion = new clsEHabitaciones();
        habitacion.setNumero("102");
        assertEquals("102", habitacion.getNumero());
    }

    // Agrega más pruebas según tus necesidades

    @org.junit.jupiter.api.Test
    public void testGetFoto() {
        byte[] foto = new byte[]{1, 2, 3};
        clsEHabitaciones habitacion = new clsEHabitaciones(1, "123456789", "101", "Individual", 100.0, "Disponible", foto);
        assertArrayEquals(foto, habitacion.getFoto());
    }

    @org.junit.jupiter.api.Test
    public void testSetFoto() {
        byte[] foto = new byte[]{4, 5, 6};
        clsEHabitaciones habitacion = new clsEHabitaciones();
        habitacion.setFoto(foto);
        assertArrayEquals(foto, habitacion.getFoto());
    }
    
}
