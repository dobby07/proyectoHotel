/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pkgPresentacion;

/**
 *
 * @author Acer
 */

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import pkgNegocio.RenderTabla;
import pkgEntidad.clsEReservas;
import pkgNegocio.clsNReservas;
import static pkgPresentacion.FrmInternalReservas.fecha1;
import static pkgPresentacion.FrmInternalReservas.fecha2;

public class FrmReservas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmReservasIn
     */
    
     DefaultTableModel model=new DefaultTableModel();
    
    public FrmReservas() {
        initComponents();
         MostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLALISTA = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCodbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        btnListar.setBackground(new java.awt.Color(255, 0, 51));
        btnListar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("RESERVAS");

        TABLALISTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI CLIENTE", "HABITACION ID", "FECHA RESERVA", "ESTADO", "FECHA ENTRADA", "FECHA SALIDA", "PRECIO TOTAL"
            }
        ));
        TABLALISTA.setName(""); // NOI18N
        TABLALISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLALISTAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLALISTA);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Busqueda Codigo:");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 0, 51));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Limpiar");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 255));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(btnNuevo))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnListar)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void inicio(){
//        this.setTitle("Botones en JTable");this.setResizable(false);this.setLocationRelativeTo(null);
//    }
 
     public void Limpiar() {
        txtCodbuscar.setText("");
    }
   
      private void MostrarTabla(){
        ResultSet rs;
        clsNReservas objNres = new clsNReservas();
        DefaultTableModel model = new DefaultTableModel();
        Object[] dato = new Object[9]; // Cambiamos el tipo de dato a Object

        try {
            rs = objNres.Mtdlistar();
            model.setColumnIdentifiers(new Object[] {"ID", "CLIENTE DNI","HABITACION ID","FECHA RESERVA","ESTADO","FECHA ENTRADA","FECHA SALIDA","PRECIO PAGADO","ACTUALIZAR"}); // Agregamos los nombres de columna al modelo
            while (rs.next()) {
                dato[0] = rs.getString("id");
                dato[1] = rs.getString("cliente_dni");
                dato[2] = rs.getString("habitacion_id");
                dato[3] = rs.getString("fechareserva");
                dato[4] = rs.getString("estado");
                dato[5] = rs.getString("fecha_entrada");
                dato[6] = rs.getString("fecha_salida");
                dato[7] = rs.getString("ptotal");
                //dato[8] = new JButton("Actualizar");
                dato[8] = new JButton("Actualizar");// Agregamos el botón en la última posición
                model.addRow(dato);
            }
            this.TABLALISTA.setModel(model);
            this.TABLALISTA.setDefaultRenderer(Object.class, new RenderTabla());
            
            //damos altura y ancho a las columnas
            this.TABLALISTA.setRowHeight(40);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        MostrarTabla();

        //Agrega el ListSelectionListener a la JTable
        TABLALISTA.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificar si la selección aún está cambiando y si hay una fila seleccionada
                if (!e.getValueIsAdjusting() && TABLALISTA.getSelectedRow() != -1) {
                    // Obtener los valores de la fila seleccionada
                    String id = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 0).toString();
                    String cliente_dni = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 1).toString();
                    String habitacion_id = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 2).toString();
                    String fechareserva = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 3).toString();
                    String estado = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 4).toString();
                    String fechaentrada = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 5).toString();
                    String fecha_salida = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 6).toString();
                    String ptotal = TABLALISTA.getValueAt(TABLALISTA.getSelectedRow(), 7).toString();


                    // Asignar los valores a las cajas de texto correspondientes
                    //                    txtCodigo.setText(id);
                    //                    txtDescripcion.setText(nombre);

                }
            }
        });
    }//GEN-LAST:event_btnListarActionPerformed

    private void TABLALISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLALISTAMouseClicked

        int dato = TABLALISTA.getSelectedRow();
        int columna = TABLALISTA.getSelectedColumn();

//                if (columna == 8) { // Verificar si se hizo clic en la columna del botón "Editar"
//                        JButton botonEditar = (JButton) TABLALISTA.getValueAt(dato, columna);
//            
//                        // Acciones a realizar cuando se hace clic en el botón "Editar"
//                        if (botonEditar != null && evt.getClickCount() == 1) {
//                                String id = (String) TABLALISTA.getValueAt(dato, 0);
//                                //int idI = Integer.parseInt(id);
//                                String cliente_dni = (String) TABLALISTA.getValueAt(dato, 1);
//                                String habitacion_id = (String) TABLALISTA.getValueAt(dato, 2);
//                                //int habid = Integer.parseInt(habitacion_id);
//                                String fechareserva = (String) TABLALISTA.getValueAt(dato,3);
//                                String estado = (String) TABLALISTA.getValueAt(dato, 4);
//                                String fecha_entrada = (String) TABLALISTA.getValueAt(dato, 5);
//                                String fecha_salida = (String) TABLALISTA.getValueAt(dato, 6);
//                
//                                FrmInternalReservas formulario = new FrmInternalReservas();
//                                formulario.setDatos(id,cliente_dni,habitacion_id,fechareserva,estado,fecha_entrada,fecha_salida);
//                                formulario.setVisible(true);
//                            }
//                    }
        if(columna == 8){
            // Verificar si se hizo clic en la columna del botón "Eliminar"
            JButton botonEliminar = (JButton) TABLALISTA.getValueAt(dato, columna);

            // Acciones a realizar cuando se hace clic en el botón "Eliminar"
            if (botonEliminar != null && evt.getClickCount() == 1) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de Confirmar la Reserva?", "Confirmar Reserva", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    String id = (String) TABLALISTA.getValueAt(dato, 0);
                    //String id = (String) TABLALISTA.getValueAt(dato, 0);
                    //int id = Integer.parseInt(id);
                    // Lógica para eliminar el registro de la base de datos
                    clsNReservas objNres = new clsNReservas();
                    if (objNres.MtdActualizarEstado(id)) {
                        DefaultTableModel model = (DefaultTableModel) TABLALISTA.getModel();
                        //model.removeRow(dato);
                        JOptionPane.showMessageDialog(null, "Reserva Confirmada Exitosamente");
                        MostrarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al confirmar reserva");
                        System.out.println(id);
                    }
                }
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_TABLALISTAMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        clsEReservas objEre = new clsEReservas();
        clsNReservas objNre = new clsNReservas();

        String codBuscar = txtCodbuscar.getText().trim(); // Obtener el valor de búsqueda y eliminar espacios en blanco

        // Verificar si el campo de búsqueda está vacío
        if (codBuscar.isEmpty()) {
            MostrarTabla(); // Llama a la función MostrarTabla() para listar todos los datos
        } else {
            // Ejecutar la búsqueda según el código ingresado
            objEre.setId(Integer.parseInt(codBuscar));
            ResultSet rsc = objNre.MtdBuscarCodigo(objEre);
            DefaultTableModel model = (DefaultTableModel) TABLALISTA.getModel();
            model.setRowCount(0); // Limpiar el modelo de la tabla

            try {
                if (rsc.next()) {
                    Object[] rowData = new Object[8];
                    rowData[0] = rsc.getString("id");
                    rowData[1] = rsc.getString("cliente_dni");
                    rowData[2] = rsc.getString("habitacion_id");
                    rowData[3] = rsc.getString("fechareserva");
                    rowData[4] = rsc.getString("estado");
                    rowData[5] = rsc.getString("fecha_entrada");
                    rowData[6] = rsc.getString("fecha_salida");
                    rowData[7] = rsc.getString("ptotal");
                    rowData[8] = new JButton("Actualizar");
                    //rowData[8] = new JButton("Eliminar");// Agregamos el botón en la última posición

                    model.addRow(rowData);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados para el código ingresado.");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setVisible(true);
        this.dispose(); // Cierra el formulario actual

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLALISTA;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodbuscar;
    // End of variables declaration//GEN-END:variables
}
