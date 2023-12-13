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
public class FrmAlquilerHabTest {
    
   
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmAlquilerHab.main(args);
    }

    /**
     * Test of setDatos method, of class FrmAlquilerHab.
     */
   @org.junit.jupiter.api.Test
    public void testSetDatos() {
        System.out.println("setDatos");
        int idInt = 9;
        String fkdnicli = "00112233";
        String numero = "101";
        String tipo = "Individual";
        double precioDouble = 100.0;
        String estado = "Disponible";
        FrmAlquilerHab instance = new FrmAlquilerHab();
        instance.setDatos(idInt, fkdnicli, numero, tipo, precioDouble, estado);
    }
    
}
