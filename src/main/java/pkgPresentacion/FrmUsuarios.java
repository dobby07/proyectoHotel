/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pkgPresentacion;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import pkgNegocio.RenderTabla;
import pkgEntidad.clsEUsuarios;
import pkgNegocio.clsNUsuarios;

/**
 *
 * @author Acer
 */
public class FrmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmUsuariosIn
     */
    DefaultTableModel model = new DefaultTableModel();
    public FrmUsuarios() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtCodbuscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        rbtnActivo = new javax.swing.JRadioButton();
        rbtnInactivo = new javax.swing.JRadioButton();
        txtAgregar = new javax.swing.JButton();
        txtListar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtclave1 = new javax.swing.JTextField();

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("FORMULARIO USUARIOS");

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tbusuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbusuarios);

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCodbuscar.setBackground(new java.awt.Color(255, 204, 204));
        txtCodbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodbuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Busqueda Dni:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Dni");

        txtdni.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        txtnombre.setBackground(new java.awt.Color(255, 204, 204));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Apellido");

        txtapellido.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email");

        txtemail.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Clave");

        txtclave.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Cargo");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cliente" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Estado");

        rbtnActivo.setText("Activo");

        rbtnInactivo.setText("Inactivo");

        txtAgregar.setBackground(new java.awt.Color(255, 153, 0));
        txtAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAgregar.setText("Agregar");
        txtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarActionPerformed(evt);
            }
        });

        txtListar.setBackground(new java.awt.Color(255, 153, 0));
        txtListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtListar.setText("Listar");
        txtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Telefono");

        txtclave1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtclave1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rbtnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtListar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtclave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtListar)
                            .addComponent(txtAgregar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnInactivo)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar() {
        txtdni.setText("");
        txtnombre.setText("");
        txtemail.setText("");
        txtapellido.setText("");
        txtclave.setText("");
        rbtnActivo.setSelected(false);
        rbtnInactivo.setSelected(false); 
    }
    private void MostrarTabla(){
        ResultSet rs;
        clsNUsuarios objNcar = new clsNUsuarios();
        DefaultTableModel model = new DefaultTableModel();
        Object[] dato = new Object[9]; // Cambiamos el tipo de dato a Object

        try {
            rs = objNcar.Mtdlistar();
            model.setColumnIdentifiers(new Object[] {"Dni", "Clave", "Nombre", "Apellido", "Email", "Telefono", "Estado","Cargo", "Editar"}); // Agregamos los nombres de columna al modelo
            while (rs.next()) {
                dato[0] = rs.getString("dni");
                dato[1] = rs.getString("clave");
                dato[2] = rs.getString("nombre");
                dato[3] = rs.getString("apellido");
                dato[4] = rs.getString("email");
                dato[5] = rs.getString("telefono");
                dato[6] = rs.getString("estado");
                dato[7] = rs.getString("fk_cargo");
                dato[8] = new JButton("Editar");
                //dato[9] = new JButton("Eliminar");// Agregamos el botón en la última posición
                model.addRow(dato);
            }
            this.tbusuarios.setModel(model);
            this.tbusuarios.setDefaultRenderer(Object.class, new RenderTabla());
            
            //damos altura y ancho a las columnas
            this.tbusuarios.setRowHeight(40);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setVisible(true);
        this.dispose(); // Cierra el formulario actual

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tbusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuariosMouseClicked

        int fila = tbusuarios.getSelectedRow();
        int columna = tbusuarios.getSelectedColumn();

        if (columna == 8) { // Verificar si se hizo clic en la columna del botón "Editar"
            JButton botonEditar = (JButton) tbusuarios.getValueAt(fila, columna);

            // Acciones a realizar cuando se hace clic en el botón "Editar"
            if (botonEditar != null && evt.getClickCount() == 1) {
                String dni = (String) tbusuarios.getValueAt(fila, 0);
                String clave = (String) tbusuarios.getValueAt(fila, 1);
                String nombre = (String) tbusuarios.getValueAt(fila, 2);
                String apellido = (String) tbusuarios.getValueAt(fila, 3);
                String email = (String) tbusuarios.getValueAt(fila, 4);
                String telefono = (String) tbusuarios.getValueAt(fila, 5);
                String estado = (String) tbusuarios.getValueAt(fila, 6);
                String cargo = (String) tbusuarios.getValueAt(fila, 7);
                FrmUsuariosInternal formulario = new FrmUsuariosInternal();
                formulario.SetDatos(dni, clave, nombre, apellido, email,telefono);
                formulario.setVisible(true);
            }
        }
//        else if(columna == 9){
//            // Verificar si se hizo clic en la columna del botón "Eliminar"
//            JButton botonEliminar = (JButton) tbusuarios.getValueAt(fila, columna);
//
//            // Acciones a realizar cuando se hace clic en el botón "Eliminar"
//            if (botonEliminar != null && evt.getClickCount() == 1) {
//                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
//                if (confirmacion == JOptionPane.YES_OPTION) {
//                    String dni = (String) tbusuarios.getValueAt(fila, 0);
//
//                    // Lógica para eliminar el registro de la base de datos
//                    clsNUsuarios objNemp = new clsNUsuarios();
//                    if (objNemp.MtdEliminar(dni)) {
//                        DefaultTableModel model = (DefaultTableModel) tbusuarios.getModel();
//                        model.removeRow(fila);
//                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_tbusuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        clsEUsuarios objEe = new clsEUsuarios();
        clsNUsuarios objNe = new clsNUsuarios();

        String codBuscar = txtCodbuscar.getText().trim(); // Obtener el valor de búsqueda y eliminar espacios en blanco

        // Verificar si el campo de búsqueda está vacío
        if (codBuscar.isEmpty()) {
            MostrarTabla(); // Llama a la función MostrarTabla() para listar todos los datos
        } else {
            // Ejecutar la búsqueda según el código ingresado
            objEe.setDni(codBuscar);
            ResultSet rsc = objNe.MtdBuscarCodigo(objEe);
            DefaultTableModel model = (DefaultTableModel) tbusuarios.getModel();
            model.setRowCount(0); // Limpiar el modelo de la tabla

            try {
                if (rsc.next()) {
                    Object[] rowData = new Object[9];
                    rowData[0] = rsc.getString("Dni");
                    rowData[1] = rsc.getString("Clave");
                    rowData[2] = rsc.getString("Nombre");
                    rowData[3] = rsc.getString("Apellido");
                    rowData[4] = rsc.getString("Email");
                    rowData[5] = rsc.getString("Telefono");
                    rowData[6] = rsc.getString("Estado");
                    rowData[7] = rsc.getString("Cargo");
                    rowData[8] = new JButton("Editar");
                    //rowData[9] = new JButton("Eliminar");

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

    private void txtCodbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodbuscarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your hanling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarActionPerformed
        clsEUsuarios objEusu=new clsEUsuarios();
        clsNUsuarios objNusu=new clsNUsuarios();
        objEusu.setDni(txtdni.getText());

        buttonGroup1.add(rbtnActivo);
        buttonGroup1.add(rbtnInactivo);

        objEusu.setNombre(txtnombre.getText());
        objEusu.setEmail(txtemail.getText());
        objEusu.setApellido(txtapellido.getText());
        objEusu.setClave(txtclave.getText());
        if (rbtnActivo.isSelected()) {
            objEusu.setEstado("A");
        } else if (rbtnInactivo.isSelected()) {
            objEusu.setEstado("I");
        }
        //String fk_cargoS = cmbCargo.getSelectedItem().toString();
        //int fk_cargo = Integer.parseInt(fk_cargoS);
        //objEusu.setFk_cargo(fk_cargo);
        if (cmbCargo.getSelectedItem().equals("Admin")) {
            objEusu.setFk_cargo(1);
        } else if (cmbCargo.getSelectedItem().equals("Cliente")) {
            objEusu.setFk_cargo(2);
        }
        //objEusu.setFk_cargo(cmbCargo.getSelectedItem().toString());
        if(objNusu.MtdAgregar(objEusu)){
            JOptionPane.showMessageDialog(null,"Datos Guardados");
            MostrarTabla();
            Limpiar();
        }
        else{
            JOptionPane.showMessageDialog(null,"Datos Erroneos");
        }
    }//GEN-LAST:event_txtAgregarActionPerformed

    private void txtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListarActionPerformed

        MostrarTabla(); // Llama a la función MostrarTabla()

        // Agrega el ListSelectionListener a la JTable
        tbusuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificar si la selección aún está cambiando y si hay una fila seleccionada
                if (!e.getValueIsAdjusting() && tbusuarios.getSelectedRow() != -1) {
                    // Obtener los valores de la fila seleccionada
                    String dni = tbusuarios.getValueAt(tbusuarios.getSelectedRow(), 0).toString();
                    String direccion = tbusuarios.getValueAt(tbusuarios.getSelectedRow(), 1).toString();
                    String telefono = tbusuarios.getValueAt(tbusuarios.getSelectedRow(), 2).toString();
                    String email = tbusuarios.getValueAt(tbusuarios.getSelectedRow(), 3).toString();
                    String clave = tbusuarios.getValueAt(tbusuarios.getSelectedRow(), 4).toString();

                    // Asignar los valores a las cajas de texto correspondientes
                    txtdni.setText(dni);
                    txtnombre.setText(direccion);
                    txtemail.setText(telefono);
                    txtapellido.setText(email);
                    txtclave.setText(clave);

                }
            }
        });
        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_txtListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnActivo;
    private javax.swing.JRadioButton rbtnInactivo;
    private javax.swing.JTable tbusuarios;
    private javax.swing.JButton txtAgregar;
    private javax.swing.JTextField txtCodbuscar;
    private javax.swing.JButton txtListar;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtclave1;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
