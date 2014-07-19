package formas;

public class EjemploJPanelConFondo extends javax.swing.JFrame {

    public EjemploJPanelConFondo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new JPanelConFondo();
        final javax.swing.JButton btFondo1 = new javax.swing.JButton();
        final javax.swing.JButton btFondo2 = new javax.swing.JButton();
        final javax.swing.JButton btSinImagen = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MENU1 = new javax.swing.JMenu();
        SMCORREO = new javax.swing.JMenuItem();
        SMDESTINA = new javax.swing.JMenuItem();
        SMREMITE = new javax.swing.JMenuItem();
        SMDOCUME = new javax.swing.JMenuItem();
        MENU2 = new javax.swing.JMenu();
        SMUSUARIO = new javax.swing.JMenuItem();
        SMEMPRE = new javax.swing.JMenuItem();
        SMGRUPO = new javax.swing.JMenuItem();
        MENU3 = new javax.swing.JMenu();
        SMLISTA = new javax.swing.JMenuItem();
        MENU4 = new javax.swing.JMenu();
        Mentra = new javax.swing.JMenuItem();
        MENU5 = new javax.swing.JMenu();
        SMAYUDA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Probando JPanel con Imagen de Fondo");

        panelFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelFondo.setOpaque(false);

        btFondo1.setText("fondo 1");
        btFondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFondo1ActionPerformed(evt);
            }
        });

        btFondo2.setText("fondo 2");
        btFondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFondo2ActionPerformed(evt);
            }
        });

        btSinImagen.setText("sin fondo");
        btSinImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSinImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFondo1)
                    .addComponent(btFondo2)
                    .addComponent(btSinImagen))
                .addContainerGap())
        );

        MENU1.setText("Archivos");
        MENU1.setFont(new java.awt.Font("Tahoma", 1, 12));

        SMCORREO.setText("Correspondencia");
        SMCORREO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMCORREOActionPerformed(evt);
            }
        });
        MENU1.add(SMCORREO);

        SMDESTINA.setText("Destinatarios");
        SMDESTINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMDESTINAActionPerformed(evt);
            }
        });
        MENU1.add(SMDESTINA);

        SMREMITE.setText("Remitentes");
        SMREMITE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMREMITEActionPerformed(evt);
            }
        });
        MENU1.add(SMREMITE);

        SMDOCUME.setText("Tipo de Documentos");
        SMDOCUME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMDOCUMEActionPerformed(evt);
            }
        });
        MENU1.add(SMDOCUME);

        jMenuBar1.add(MENU1);

        MENU2.setText("Administrador");
        MENU2.setFont(new java.awt.Font("Tahoma", 1, 12));

        SMUSUARIO.setText("Administrador de Usuarios");
        SMUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMUSUARIOActionPerformed(evt);
            }
        });
        MENU2.add(SMUSUARIO);

        SMEMPRE.setText("Resgistro de Empresa");
        SMEMPRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMEMPREActionPerformed(evt);
            }
        });
        MENU2.add(SMEMPRE);

        SMGRUPO.setText("Grupos de Usuarios");
        SMGRUPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMGRUPOActionPerformed(evt);
            }
        });
        MENU2.add(SMGRUPO);

        jMenuBar1.add(MENU2);

        MENU3.setText("Informes");
        MENU3.setFont(new java.awt.Font("Tahoma", 1, 12));

        SMLISTA.setText("Listados");
        SMLISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMLISTAActionPerformed(evt);
            }
        });
        MENU3.add(SMLISTA);

        jMenuBar1.add(MENU3);

        MENU4.setText("Salir");
        MENU4.setFont(new java.awt.Font("Tahoma", 1, 12));

        Mentra.setText("Salida");
        Mentra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MentraActionPerformed(evt);
            }
        });
        MENU4.add(Mentra);

        jMenuBar1.add(MENU4);

        MENU5.setText("Ayuda");
        MENU5.setFont(new java.awt.Font("Tahoma", 1, 12));

        SMAYUDA.setText("Informacion del Autor");
        SMAYUDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMAYUDAActionPerformed(evt);
            }
        });
        MENU5.add(SMAYUDA);

        jMenuBar1.add(MENU5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFondo1ActionPerformed
        ((JPanelConFondo) panelFondo).setImagen("/imagenes/ibraico.png");
    }//GEN-LAST:event_btFondo1ActionPerformed

    private void btFondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFondo2ActionPerformed
        ((JPanelConFondo) panelFondo).setImagen("/imagenes/fondocorreo.jpg");
    }//GEN-LAST:event_btFondo2ActionPerformed

    private void btSinImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinImagenActionPerformed
//        ((JPanelConFondo) panelFondo).setImagen((String) null);
         ((JPanelConFondo) panelFondo).setImagen("/imagenes/fondoimpre.jpg");
    }//GEN-LAST:event_btSinImagenActionPerformed

    private void SMCORREOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMCORREOActionPerformed
//        MCORREPO.setVisible(true);
}//GEN-LAST:event_SMCORREOActionPerformed

    private void SMDESTINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMDESTINAActionPerformed
//        MDESTINA.setVisible(true);
}//GEN-LAST:event_SMDESTINAActionPerformed

    private void SMREMITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMREMITEActionPerformed
//        MREMITE.setVisible(true);
}//GEN-LAST:event_SMREMITEActionPerformed

    private void SMDOCUMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMDOCUMEActionPerformed
//        MDOCUME.setVisible(true);
}//GEN-LAST:event_SMDOCUMEActionPerformed

    private void SMUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMUSUARIOActionPerformed
//        MUSUARIO.setVisible(true);
}//GEN-LAST:event_SMUSUARIOActionPerformed

    private void SMEMPREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMEMPREActionPerformed
//        MEMPRESA.setVisible(true);
}//GEN-LAST:event_SMEMPREActionPerformed

    private void SMGRUPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMGRUPOActionPerformed
//        MGRU.setVisible(true);
}//GEN-LAST:event_SMGRUPOActionPerformed

    private void SMLISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMLISTAActionPerformed
//        MREPO.setVisible(true);
}//GEN-LAST:event_SMLISTAActionPerformed

    private void MentraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MentraActionPerformed
        setVisible(false);
//        MENTRA.setVisible(true);
}//GEN-LAST:event_MentraActionPerformed

    private void SMAYUDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMAYUDAActionPerformed
//        MAYUDA.setVisible(true);
}//GEN-LAST:event_SMAYUDAActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EjemploJPanelConFondo jf = new EjemploJPanelConFondo();
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MENU1;
    private javax.swing.JMenu MENU2;
    private javax.swing.JMenu MENU3;
    private javax.swing.JMenu MENU4;
    private javax.swing.JMenu MENU5;
    private javax.swing.JMenuItem Mentra;
    private javax.swing.JMenuItem SMAYUDA;
    private javax.swing.JMenuItem SMCORREO;
    private javax.swing.JMenuItem SMDESTINA;
    private javax.swing.JMenuItem SMDOCUME;
    private javax.swing.JMenuItem SMEMPRE;
    private javax.swing.JMenuItem SMGRUPO;
    private javax.swing.JMenuItem SMLISTA;
    private javax.swing.JMenuItem SMREMITE;
    private javax.swing.JMenuItem SMUSUARIO;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
