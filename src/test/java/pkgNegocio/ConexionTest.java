/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Pedro
 */
public class ConexionTest {
    
    private Conexion conexion;

    @BeforeEach
    public void setUp() {
        conexion = new Conexion();
    }

    @AfterEach
    public void tearDown() {
        try {
            if (conexion.getConnection() != null && !conexion.getConnection().isClosed()) {
                conexion.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    public void testConexionExitosa() {
        Connection con = conexion.getConnection();
        assertNotNull(con);
        try {
            assertFalse(con.isClosed());
        } catch (SQLException e) {
            fail("Error al verificar si la conexión está cerrada: " + e.getMessage());
        }
    }
    
}
