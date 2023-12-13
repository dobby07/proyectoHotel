/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgNegocio;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author Pedro
 */
public class RenderTablaTest {
    

    @org.junit.jupiter.api.Test
     public void testGetTableCellRendererComponent() {
        RenderTabla render = new RenderTabla();

        // Crear un JButton simulado
        JButton botonSimulado = new JButton("MiBoton");

        // Llamar al método getTableCellRendererComponent
        Component componente = render.getTableCellRendererComponent(new JTable(), botonSimulado, false, false, 0, 0);

        // Verificar que el componente devuelto sea el mismo JButton que se pasó como valor
        assertSame(botonSimulado, componente);

        // También podrías verificar otros aspectos del componente según tus necesidades
        // Por ejemplo, si es JButton o no, y más...

        // Aquí tienes un ejemplo adicional de cómo podrías verificar si es un JButton:
        assertTrue(componente instanceof JButton);
    }
    
}
