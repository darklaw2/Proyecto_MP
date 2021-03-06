/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import javax.swing.JOptionPane;

/**
 *
 * @author Calix
 */
public class LOCAL_REGISTRO extends javax.swing.JFrame {

    /**
     * Creates new form Local
     */
    public LOCAL_REGISTRO() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        lblId.setText(Funciones.extraerIdMaxLocal());
        Funciones.setListarLocal("");
    }
    
    private void clean(){
        txtNombre.setText("");
        txtDireccion.setText("");
        txtRTN.setText("");
        txtTelefono.setText("");
        txtTelefono2.setText("");
        txtNombre.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLocal = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorarr = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtRTN = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtTelefono2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO LOCAL");

        jLabel2.setText("Id");

        lblId.setText("1");

        jLabel4.setText("Nombre");

        jLabel5.setText("RTN");

        jLabel6.setText("Telefono1");

        jLabel7.setText("Telefono2");

        jLabel8.setText("Direccion");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "RTN", "Telefono", "Telefono2", "Direccion"
            }
        ));
        jScrollPane2.setViewportView(tblLocal);

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorarr.setText("BORRAR");
        btnBorarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorarrActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            txtRTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        try {
            txtTelefono2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButton1))
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnActualizar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefono)
                                .addGap(157, 157, 157)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(btnBorarr, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRTN, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorarr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Sentencias s = new Sentencias();
        s.setNombre_L(this.txtNombre.getText());
        s.setDireccion_L(this.txtDireccion.getText());
        s.setRTN_L(this.txtRTN.getText());
        s.setTelefono_L(this.txtTelefono.getText());
        s.setTelefono2_L(this.txtTelefono2.getText());
        
        
        if (Funciones.isRegisterLocal(s)) {
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO", "FUNCIONO", WIDTH);
            clean();
           Funciones.setListarLocal("");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion", "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tblLocal.getSelectedRow();
        
        txtNombre.setText(tblLocal.getValueAt(fila, 1).toString());
        txtRTN.setText(tblLocal.getValueAt(fila, 2).toString());
        txtTelefono.setText(tblLocal.getValueAt(fila, 3).toString());
        txtTelefono2.setText(tblLocal.getValueAt(fila, 4).toString());
        lblId.setText(tblLocal.getValueAt(fila, 0).toString());
        txtDireccion.setText(tblLocal.getValueAt(fila, 5).toString());
        setVisible(true);
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Sentencias s = new Sentencias();
        
        s.setNombre_L(this.txtNombre.getText());
        s.setRTN_L(this.txtRTN.getText());
        s.setTelefono_L(this.txtTelefono.getText());
        s.setTelefono2_L(this.txtTelefono2.getText());
        s.setDireccion_L(this.txtDireccion.getText());
        s.setId_L(Integer.parseInt(this.lblId.getText()));
        
        if (Funciones.isUpdateLocal(s)) {
            JOptionPane.showMessageDialog(null, "Cambio se realizo correctamente");
            Funciones.setListarLocal("");
            clean();
            
        } else {
            JOptionPane.showMessageDialog(null, "No se puedo realizar la accion");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorarrActionPerformed
        // TODO add your handling code here:
        int fila = tblLocal.getSelectedRow();
        Sentencias s = new Sentencias();
       s.setId_L(Integer.parseInt(tblLocal.getValueAt(fila, 0).toString()));
           int f = JOptionPane.showConfirmDialog(null, "Desea borrar este registro?", "Borrar", WIDTH);
           
            if (f==JOptionPane.YES_NO_OPTION) {
                
                if (Funciones.isDeleteLocal(s)) {
                    JOptionPane.showMessageDialog(null, "Se borro el usuario bro");
                    Funciones.setListarLocal("");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo borrar el campo");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado exitoso");
            }
            
            
            
//        } else {
//            JOptionPane.showMessageDialog(null, "No se pudo borrar el campo");
//        }
        
    }//GEN-LAST:event_btnBorarrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clean();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOCAL_REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOCAL_REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOCAL_REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOCAL_REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOCAL_REGISTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorarr;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId;
    public static javax.swing.JTable tblLocal;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtRTN;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JFormattedTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
