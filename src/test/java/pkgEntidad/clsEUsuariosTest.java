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
public class clsEUsuariosTest {
    
    @org.junit.jupiter.api.Test
    public void testGetDni() {
        clsEUsuarios usuario = new clsEUsuarios("123456789", "clave123", "Nombre", "Apellido", "email@example.com", "123456789", "Activo", 1);
        assertEquals("123456789", usuario.getDni());
    }

    @org.junit.jupiter.api.Test
    public void testSetDni() {
        clsEUsuarios usuario = new clsEUsuarios();
        usuario.setDni("987654321");
        assertEquals("987654321", usuario.getDni());
    }

    @org.junit.jupiter.api.Test
    public void testGetClave() {
        clsEUsuarios usuario = new clsEUsuarios("123456789", "clave123", "Nombre", "Apellido", "email@example.com", "123456789", "Activo", 1);
        assertEquals("clave123", usuario.getClave());
    }

    @org.junit.jupiter.api.Test
    public void testSetClave() {
        clsEUsuarios usuario = new clsEUsuarios();
        usuario.setClave("nuevaClave");
        assertEquals("nuevaClave", usuario.getClave());
    }

    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        clsEUsuarios usuario = new clsEUsuarios("123456789", "clave123", "Nombre", "Apellido", "email@example.com", "123456789", "Activo", 1);
        assertEquals("Nombre", usuario.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void testSetNombre() {
        clsEUsuarios usuario = new clsEUsuarios();
        usuario.setNombre("NuevoNombre");
        assertEquals("NuevoNombre", usuario.getNombre());
    }

    // Agrega más pruebas según tus necesidades

    @org.junit.jupiter.api.Test
    public void testGetFk_cargo() {
        clsEUsuarios usuario = new clsEUsuarios("123456789", "clave123", "Nombre", "Apellido", "email@example.com", "123456789", "Activo", 1);
        assertEquals(1, usuario.getFk_cargo());
    }

    @org.junit.jupiter.api.Test
    public void testSetFk_cargo() {
        clsEUsuarios usuario = new clsEUsuarios();
        usuario.setFk_cargo(2);
        assertEquals(2, usuario.getFk_cargo());
    }

    @org.junit.jupiter.api.Test
    public void testSetFk_cargoString() {
        clsEUsuarios usuario = new clsEUsuarios();
        assertThrows(UnsupportedOperationException.class, () -> usuario.setFk_cargo("CargoString"));
    }
    
}
