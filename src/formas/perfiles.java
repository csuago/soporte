/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class perfiles extends javax.swing.JFrame {

    /**
     * Creates new form perfiles
     */
    public static java.sql.Statement sql;
    ResultSet rs = null;
    String newPerfilSelect;
    String oldPerfilSelect;

    public perfiles() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            cargar_perfiles();
            cbperfil.setSelectedIndex(0);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void cargar_perfiles() throws SQLException {
        boolean aflag = false;
        flag = true;
        String name = null;
        cbperfil.removeAllItems();
        limpiar_check();
        rs = MiConexionBD.getSql2().executeQuery("SELECT name FROM perfil ORDER BY id_perfil ASC");
        while (rs.next()) {
            if (aflag == false) {
                name = rs.getString("name");
            }
            cbperfil.addItem(rs.getString("name"));
            aflag = true;
        }
        cargar_check(name);
        flag = false;
    }

    public static enum PERFIL {

        SOPORTE(1),
        SERVICIO(2),
        EQUIPO(4),
        USER(8),
        PERFIL(16),
        REPORTE(32);
        public int value;

        private PERFIL(int value) {
            this.value = value;
        }
    }

    public void cargar_check(String name) throws SQLException {
        if (name == null) {
            return;
        }
        rs = MiConexionBD.getSql().executeQuery("SELECT permission FROM perfil WHERE name = '" + name + "'");
        if (rs.next()) {
            int value = rs.getInt("permission");
            limpiar_check();
            if ((value & PERFIL.SOPORTE.value) > 0) {
                chsoporte.setSelected(true);
            }
            if ((value & PERFIL.SERVICIO.value) > 0) {
                chservicio.setSelected(true);
            }
            if ((value & PERFIL.EQUIPO.value) > 0) {
                chequipos.setSelected(true);
            }
            if ((value & PERFIL.USER.value) > 0) {
                chuser.setSelected(true);
            }
            if ((value & PERFIL.PERFIL.value) > 0) {
                chperfil.setSelected(true);
            }
            if ((value & PERFIL.REPORTE.value) > 0) {
                chreporte.setSelected(true);
            }
        }
    }

    public int suma_permission() {
        int suma = 0;
        if (chsoporte.isSelected()) {
            suma += PERFIL.SOPORTE.value;
        }
        if (chservicio.isSelected()) {
            suma += PERFIL.SERVICIO.value;
        }
        if (chequipos.isSelected()) {
            suma += PERFIL.EQUIPO.value;
        }
        if (chuser.isSelected()) {
            suma += PERFIL.USER.value;
        }
        if (chperfil.isSelected()) {
            suma += PERFIL.PERFIL.value;
        }
        if (chreporte.isSelected()) {
            suma += PERFIL.REPORTE.value;
        }
        return suma;
    }

    public void limpiar_check() {
        chequipos.setSelected(false);
        chperfil.setSelected(false);
        chreporte.setSelected(false);
        chservicio.setSelected(false);
        chsoporte.setSelected(false);
        chuser.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbperfil = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        chsoporte = new javax.swing.JCheckBox();
        chservicio = new javax.swing.JCheckBox();
        chequipos = new javax.swing.JCheckBox();
        chuser = new javax.swing.JCheckBox();
        chperfil = new javax.swing.JCheckBox();
        chreporte = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfiles");
        setResizable(false);

        cbperfil.setEditable(true);
        cbperfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbperfilItemStateChanged(evt);
            }
        });
        cbperfil.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cbperfilVetoableChange(evt);
            }
        });

        jLabel1.setText("Perfil:");

        chsoporte.setText("Registro de soporte");

        chservicio.setText("Área de servicio");

        chequipos.setText("Registros de equipos");

        chuser.setText("Administrador de usuarios");

        chperfil.setText("Perfiles");

        chreporte.setText("Reportes");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chequipos)
                            .addComponent(chsoporte)
                            .addComponent(chservicio)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chperfil)
                            .addComponent(chreporte)
                            .addComponent(chuser)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chsoporte)
                    .addComponent(chuser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chservicio)
                    .addComponent(chperfil))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chequipos)
                    .addComponent(chreporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean flag = false;
    private void cbperfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbperfilItemStateChanged
        try {
            if (!flag) {
                if (newPerfilSelect == null || newPerfilSelect.isEmpty()) {
                    newPerfilSelect = cbperfil.getSelectedItem().toString();
                    if (cbperfil.getItemCount() > 0) {
                        //cargar_check(cbperfil.getSelectedItem().toString());
                    }
                //cargar_perfiles();

                } else {
                    if (cbperfil.getItemCount() > 0) {
                        if (!newPerfilSelect.equals(cbperfil.getSelectedItem().toString())) {
                            newPerfilSelect = cbperfil.getSelectedItem().toString();
                            cargar_check(cbperfil.getSelectedItem().toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*if(flag == true){
         try {
         System.out.println("count: "+cbperfil.getItemCount());
         if(cbperfil.getItemCount() != 0){
         cargar_check(cbperfil.getSelectedItem().toString());
         }
         } catch (SQLException ex) {
         ex.printStackTrace();
         }
         }
         flag = true;*/
    }//GEN-LAST:event_cbperfilItemStateChanged


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = cbperfil.getSelectedItem().toString();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NOMBRE DE PERFIL VACIO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                rs = sql.executeQuery("SELECT name FROM perfil WHERE name = '" + cbperfil.getSelectedItem().toString() + "'");
                if (rs.next()) {
                    boolean state = sql.execute("UPDATE perfil SET permission = " + suma_permission() + " WHERE name = '" + name + "'");
                    System.out.println("update " + state);
                    if (!state) {
                        JOptionPane.showMessageDialog(this, "PERFIL " + name + " ACTUALIZADO CON EXITO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
                        cargar_perfiles();
                    }
                } else {
                    boolean state = sql.execute("INSERT INTO perfil(name, permission) VALUES ('" + name + "','" + suma_permission() + "')");
                    if (!state) {
                        JOptionPane.showMessageDialog(this, "PERFIL " + name + " CREADO CON EXITO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
                        cargar_perfiles();
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = cbperfil.getSelectedItem().toString();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NOMBRE DE PERFIL VACIO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                int opc = JOptionPane.showConfirmDialog(this, "¿DESEA ELIMINAR EL PERFIL" + name + "?", "A T E N C I O N", JOptionPane.ERROR_MESSAGE);
                if (opc == 0) {
                    sql.execute("DELETE FROM perfil WHERE name = '" + name + "'");
                    cargar_perfiles();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbperfilVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cbperfilVetoableChange
        System.out.println("evt = ");
    }//GEN-LAST:event_cbperfilVetoableChange

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
            java.util.logging.Logger.getLogger(perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbperfil;
    private javax.swing.JCheckBox chequipos;
    private javax.swing.JCheckBox chperfil;
    private javax.swing.JCheckBox chreporte;
    private javax.swing.JCheckBox chservicio;
    private javax.swing.JCheckBox chsoporte;
    private javax.swing.JCheckBox chuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
