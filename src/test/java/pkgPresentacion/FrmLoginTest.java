/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgPresentacion;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkgEntidad.clsEUsuarios;
import pkgNegocio.clsNUsuarios;

/**
 *
 * @author Pedro
 */
public class FrmLoginTest {
    
   
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
       String[] args = null;
        FrmLogin.main(args);
        
    }
    
   @org.junit.jupiter.api.Test
    public void testMtdValidarLogin_CredencialesCorrectas_DeberiaDevolverTrue() {
        clsNUsuarios objNusu = new clsNUsuarios();
        clsEUsuarios objEusu = new clsEUsuarios();
        objEusu.setDni("11223344");
        objEusu.setClave("123456");

        assertTrue(objNusu.MtdValidarLogin(objEusu));
    }

    @org.junit.jupiter.api.Test
    public void testMtdValidarLogin_CredencialesIncorrectas_DeberiaDevolverFalse() {
        clsNUsuarios objNusu = new clsNUsuarios();
        clsEUsuarios objEusu = new clsEUsuarios();
        objEusu.setDni("11223344");
        objEusu.setClave("123");

        assertFalse(objNusu.MtdValidarLogin(objEusu));
    }
    
}
