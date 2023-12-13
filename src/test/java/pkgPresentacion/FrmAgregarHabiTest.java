/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkgPresentacion;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Pedro
 */
public class FrmAgregarHabiTest {
    
    @org.junit.jupiter.api.Test
    public void testAgregarHabitacion() {
        FrmAgregarHabi frmAgregarHabi = new FrmAgregarHabi();

        int usuid = 1;
        String fkdnicli = "12345678";
        String numero = "101";
        String tipo = "Individual";
        double precioDouble = 50.0;
        String estado = "Disponible";
        String rutaImagen = "/ruta/imagen.jpg";

//        // Establecer los datos en la instancia de FrmAgregarHabi
//        frmAgregarHabi.setUsuid(usuid);
//        frmAgregarHabi.setTxtdnicli(fkdnicli);
//        frmAgregarHabi.setTxtnrohab(numero);
//        frmAgregarHabi.setCmbtipohab(tipo);
//        frmAgregarHabi.setTxtprecio(precioDouble);
//        frmAgregarHabi.setTxtruta(rutaImagen);
//
//        // Llamar al método para agregar la habitación
//        frmAgregarHabi.btnguardarActionPerformed(null);
//
//        // Verificar que los valores se hayan establecido correctamente
//        assertEquals(usuid, FrmAgregarHabi.usuid);
//        assertEquals(fkdnicli, frmAgregarHabi.getTxtdnicli());
//        assertEquals(numero, frmAgregarHabi.getTxtnrohab());
//        assertEquals(tipo, frmAgregarHabi.getCmbtipohab());
//        assertEquals(precioDouble, frmAgregarHabi.getTxtprecio(), 0.001);
//        assertEquals(estado, frmAgregarHabi.getEstado());
//        assertEquals(rutaImagen, frmAgregarHabi.getTxtruta());
    }

}
