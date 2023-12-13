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
public class clsEReservasTest {
    
    @org.junit.jupiter.api.Test
    public void testGetId() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals(1, reserva.getId());
    }

   @org.junit.jupiter.api.Test
    public void testSetId() {
        clsEReservas reserva = new clsEReservas();
        reserva.setId(2);
        assertEquals(2, reserva.getId());
    }

    @org.junit.jupiter.api.Test
    public void testGetCliente_dni() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals("123456789", reserva.getCliente_dni());
    }

    @org.junit.jupiter.api.Test
    public void testSetCliente_dni() {
        clsEReservas reserva = new clsEReservas();
        reserva.setCliente_dni("987654321");
        assertEquals("987654321", reserva.getCliente_dni());
    }

   @org.junit.jupiter.api.Test
    public void testGetHabitacion_id() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals(101, reserva.getHabitacion_id());
    }

    @org.junit.jupiter.api.Test
    public void testSetHabitacion_id() {
        clsEReservas reserva = new clsEReservas();
        reserva.setHabitacion_id(102);
        assertEquals(102, reserva.getHabitacion_id());
    }
    
    @org.junit.jupiter.api.Test
    public void testGetFechareserva() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals("2023-12-01", reserva.getFechareserva());
    }

    @org.junit.jupiter.api.Test
    public void testSetFechareserva() {
        clsEReservas reserva = new clsEReservas();
        reserva.setFechareserva("2023-12-02");
        assertEquals("2023-12-02", reserva.getFechareserva());
    }
    
    @org.junit.jupiter.api.Test
    public void testGetEstado() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals("Activa", reserva.getEstado());
    }

    @org.junit.jupiter.api.Test
    public void testSetEstado() {
        clsEReservas reserva = new clsEReservas();
        reserva.setEstado("Activa");
        assertEquals("Activa", reserva.getEstado());
    }
    
    @org.junit.jupiter.api.Test
    public void testGetFecha_entrada() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals("2023-12-10", reserva.getFecha_entrada());
    }

    @org.junit.jupiter.api.Test
    public void testSetFecha_entrada() {
        clsEReservas reserva = new clsEReservas();
        reserva.setFecha_entrada("2023-12-11");
        assertEquals("2023-12-11", reserva.getFecha_entrada());
    }
    
    @org.junit.jupiter.api.Test
    public void testGetFecha_salida() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals("2023-12-15", reserva.getFecha_salida());
    }

    @org.junit.jupiter.api.Test
    public void testSetFecha_salida() {
        clsEReservas reserva = new clsEReservas();
        reserva.setFecha_salida("2023-12-16");
        assertEquals("2023-12-16", reserva.getFecha_salida());
    }

    // Agrega más pruebas según tus necesidades

    @org.junit.jupiter.api.Test
    public void testGetPtotal() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals(500, reserva.getPtotal());
    }

    @org.junit.jupiter.api.Test
    public void testSetPtotal() {
        clsEReservas reserva = new clsEReservas(1, "123456789", 101, "2023-12-01", "Activa", "2023-12-10", "2023-12-15", 500);
        assertEquals(500, reserva.getPtotal());
    }

    
}
