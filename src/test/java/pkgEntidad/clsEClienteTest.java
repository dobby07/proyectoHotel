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
public class clsEClienteTest {
    
     @org.junit.jupiter.api.Test
    public void testGetDni() {
        clsECliente cliente = new clsECliente("123456789", "Nombre", "Apellido", "123456789");
        assertEquals("123456789", cliente.getDni());
    }

    @org.junit.jupiter.api.Test
    public void testSetDni() {
        clsECliente cliente = new clsECliente();
        cliente.setDni("987654321");
        assertEquals("987654321", cliente.getDni());
    }

    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        clsECliente cliente = new clsECliente("123456789", "Nombre", "Apellido", "123456789");
        assertEquals("Nombre", cliente.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void testSetNombre() {
        clsECliente cliente = new clsECliente();
        cliente.setNombre("NuevoNombre");
        assertEquals("NuevoNombre", cliente.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void testGetApellido() {
        clsECliente cliente = new clsECliente("123456789", "Nombre", "Apellido", "123456789");
        assertEquals("Apellido", cliente.getApellido());
    }

    @org.junit.jupiter.api.Test
    public void testSetApellido() {
        clsECliente cliente = new clsECliente();
        cliente.setApellido("NuevoApellido");
        assertEquals("NuevoApellido", cliente.getApellido());
    }

    @org.junit.jupiter.api.Test
    public void testGetTelefono() {
        clsECliente cliente = new clsECliente("123456789", "Nombre", "Apellido", "123456789");
        assertEquals("123456789", cliente.getTelefono());
    }

    @org.junit.jupiter.api.Test
    public void testSetTelefono() {
        clsECliente cliente = new clsECliente();
        cliente.setTelefono("987654321");
        assertEquals("987654321", cliente.getTelefono());
    }

    @org.junit.jupiter.api.Test
    public void testGetNh() {
        clsECliente cliente = new clsECliente();
        assertEquals(0, clsECliente.getNh());
    }

    @org.junit.jupiter.api.Test
    public void testSetNh() {
        clsECliente cliente = new clsECliente();
        cliente.setNh(1);
        assertEquals(1, clsECliente.getNh());
    }
    
}
