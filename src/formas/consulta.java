/*
 * consulta.java
 *
 * Created on 15 de agosto de 2008, 17:00
 */

package formas;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
 
/**
 *
 * @author  Ibrahin Araujo
 */
public class consulta extends javax.swing.JFrame {
    
    private MiConexionBD cone;
    private java.sql.Statement stmt;
    static  proceso  PROCE = new proceso();
    static  fsoporte  MCORREPO  = new fsoporte();
    static  consulta BCON   = new consulta();
    public  static String Cgrupo = "44";
    private String vtexto;
 

    /** Creates new form consulta */
    public consulta() {
    
        try{              
             cone = cone.getInstance();
             //cone.init();
             Connection conn =cone.getMiConexion();
             stmt=conn.createStatement();             
          }
        
        catch(Exception e)
          {
          }
            initComponents();
            setIconImage (new ImageIcon("./imagenes/ibraico.png").getImage());
            setLocationRelativeTo(null);
            Ctexto.setText("");
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Btonsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ctexto = new javax.swing.JTextArea();
        btonselecion = new javax.swing.JButton();
        Rfecha = new javax.swing.JButton();
        Rdesrem = new javax.swing.JButton();
        Rnrooficio = new javax.swing.JButton();
        Rcodigo = new javax.swing.JButton();
        Btonrem = new javax.swing.JButton();
        Btondes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Busqueda de Correspondencia");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panel1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setText("Consulta:");
        panel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 22);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Recibido", "Descripcion", "Codigo", "Oficio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setFillsViewportHeight(true);
        tabla.setFocusTraversalPolicyProvider(true);
        tabla.setRowHeight(27);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaMouseReleased(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(10);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(10);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(10);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 600, 230);

        Btonsalir.setFont(new java.awt.Font("Tahoma", 1, 12));
        Btonsalir.setText("Salir");
        Btonsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonsalirActionPerformed(evt);
            }
        });
        panel1.add(Btonsalir);
        Btonsalir.setBounds(520, 365, 90, 25);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.setAutoscrolls(true);

        Ctexto.setColumns(20);
        Ctexto.setFont(new java.awt.Font("Tahoma", 0, 12));
        Ctexto.setLineWrap(true);
        Ctexto.setRows(5);
        Ctexto.setWrapStyleWord(true);
        Ctexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CtextoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Ctexto);

        panel1.add(jScrollPane2);
        jScrollPane2.setBounds(100, 10, 510, 60);

        btonselecion.setFont(new java.awt.Font("Tahoma", 1, 12));
        btonselecion.setText("Seleccionar");
        btonselecion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonselecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonselecionActionPerformed(evt);
            }
        });
        panel1.add(btonselecion);
        btonselecion.setBounds(520, 330, 90, 25);

        Rfecha.setFont(new java.awt.Font("Tahoma", 1, 12));
        Rfecha.setText("Fecha Recibida");
        Rfecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfechaActionPerformed(evt);
            }
        });
        panel1.add(Rfecha);
        Rfecha.setBounds(10, 365, 150, 25);

        Rdesrem.setFont(new java.awt.Font("Tahoma", 1, 12));
        Rdesrem.setText("Descripcion Remitente");
        Rdesrem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rdesrem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rdesrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdesremActionPerformed(evt);
            }
        });
        panel1.add(Rdesrem);
        Rdesrem.setBounds(10, 330, 150, 25);

        Rnrooficio.setFont(new java.awt.Font("Tahoma", 1, 12));
        Rnrooficio.setText("Nro. de Oficio");
        Rnrooficio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rnrooficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RnrooficioActionPerformed(evt);
            }
        });
        panel1.add(Rnrooficio);
        Rnrooficio.setBounds(166, 330, 150, 25);

        Rcodigo.setFont(new java.awt.Font("Tahoma", 1, 12));
        Rcodigo.setText("Codigo");
        Rcodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RcodigoActionPerformed(evt);
            }
        });
        panel1.add(Rcodigo);
        Rcodigo.setBounds(166, 365, 150, 25);

        Btonrem.setFont(new java.awt.Font("Tahoma", 1, 12));
        Btonrem.setText("Remitente");
        Btonrem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btonrem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btonrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonremActionPerformed(evt);
            }
        });
        panel1.add(Btonrem);
        Btonrem.setBounds(320, 330, 90, 25);

        Btondes.setFont(new java.awt.Font("Tahoma", 1, 12));
        Btondes.setText("Destinatario");
        Btondes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btondes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btondes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtondesActionPerformed(evt);
            }
        });
        panel1.add(Btondes);
        Btondes.setBounds(320, 365, 90, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")
    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
       int fila=tabla.getSelectedRow();
       String desrem=tabla.getValueAt(fila,2).toString();
       Ctexto.setText(desrem);
    }//GEN-LAST:event_tablaMouseReleased

    @SuppressWarnings("static-access")
    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
       int fila=tabla.getSelectedRow();
       String desrem=tabla.getValueAt(fila,2).toString();
       Ctexto.setText(desrem);     
    }//GEN-LAST:event_tablaKeyReleased

    @SuppressWarnings("static-access")
    private void BtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonsalirActionPerformed
       Ctexto.setText("");
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();
       tr.setRowCount(0);
       setVisible(false);
    }//GEN-LAST:event_BtonsalirActionPerformed

    private void CtextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CtextoMousePressed
       Ctexto.setText("");
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();
       tr.setRowCount(0);
    }//GEN-LAST:event_CtextoMousePressed

    @SuppressWarnings("static-access")
    private void btonselecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonselecionActionPerformed
       int fila=tabla.getSelectedRow();
//       MCORREPO.Nregistro =  tabla.getValueAt(fila,0).toString();
//       MCORREPO.swe = 1;
       Ctexto.setText("");
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();
       tr.setRowCount(0);
       setVisible(false);
    }//GEN-LAST:event_btonselecionActionPerformed
    //Busqueda popr Fecha Recibida
    private void RfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfechaActionPerformed
            vtexto  =  Ctexto.getText();

            DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

             try
                {             
               Statement s = cone.getMiConexion().createStatement();
               String consul="select * from correpo where edo_reg = 'A' and  grupo = '"+Cgrupo+"' and fecha_rec like '%"+vtexto+"%'";
               ResultSet rs = s.executeQuery(consul);

                while (rs.next())
                    {
                      String var1 = rs.getString("id");
                      String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
                      String var3 = rs.getString("des_rem");
                      String var4 = rs.getString("codigo");
                      String var5 = rs.getString("nro_oficio");
                      tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
                      tabla.setModel(tr);
                      TableColumn column = null;
                      for (int i = 0; i < 3; i++) {
                          column = tabla.getColumnModel().getColumn(i);
                          if (i == 0) {column.setPreferredWidth(0);}
                          if (i == 1) {column.setPreferredWidth(15);}
                          if (i == 2) {column.setPreferredWidth(250);}
                          if (i == 3) {column.setPreferredWidth(10);}
                          if (i == 4) {column.setPreferredWidth(10);}
                      }
                }
             }

                catch (Exception e)
                {
                }
    }//GEN-LAST:event_RfechaActionPerformed
   // Busque por ddescripcion del Documento
    private void RdesremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdesremActionPerformed
       vtexto  =  Ctexto.getText();
    
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

       try
         {          
           Statement s = cone.getMiConexion().createStatement();
           String consul="select * from correpo where edo_reg = 'A' and grupo = '"+Cgrupo+"' and des_rem like '%"+vtexto+"%'";
           ResultSet rs = s.executeQuery(consul);
           
           while (rs.next())
           {
             String var1 = rs.getString("id");
             String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
             String var3 = rs.getString("des_rem");
             String var4 = rs.getString("codigo");
             String var5 = rs.getString("nro_oficio");
             tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
             tabla.setModel(tr);
             TableColumn column = null;
             for (int i = 0; i < 3; i++) {
                  column = tabla.getColumnModel().getColumn(i);
                  if (i == 0) {column.setPreferredWidth(0);}
                  if (i == 1) {column.setPreferredWidth(15);}
                  if (i == 2) {column.setPreferredWidth(250);}
                  if (i == 3) {column.setPreferredWidth(10);}
                  if (i == 4) {column.setPreferredWidth(10);}
             }            
           }          
         }

          catch (Exception e)
          {
          }

    }//GEN-LAST:event_RdesremActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Ctexto.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void RnrooficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnrooficioActionPerformed
      vtexto  =  Ctexto.getText();
    
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

       try
         {
           Statement s = cone.getMiConexion().createStatement();
           String consul="select * from correpo where edo_reg = 'A' and grupo = '"+Cgrupo+"' and nro_oficio like '%"+vtexto+"%'";
           ResultSet rs = s.executeQuery(consul);                    

           if(rs.next())
           {
             String var1 = rs.getString("id");
             String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
             String var3 = rs.getString("des_rem");
             String var4 = rs.getString("codigo");
             String var5 = rs.getString("nro_oficio");
             tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
             tabla.setModel(tr);
             TableColumn column = null;
             for (int i = 0; i < 3; i++) {
                  column = tabla.getColumnModel().getColumn(i);
                  if (i == 0) {column.setPreferredWidth(0);}
                  if (i == 1) {column.setPreferredWidth(15);}
                  if (i == 2) {column.setPreferredWidth(250);}
                  if (i == 3) {column.setPreferredWidth(10);}
                  if (i == 4) {column.setPreferredWidth(10);}
             }
           }
           else {
               JOptionPane.showMessageDialog(this,"REGISTRO NO ENCONTRADO ","VUELVA A INTENTARLO",JOptionPane.INFORMATION_MESSAGE);
               Ctexto.setText("");         

           }
       } catch (Exception e) {
       }
    }//GEN-LAST:event_RnrooficioActionPerformed

    private void RcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RcodigoActionPerformed
       vtexto  =  Ctexto.getText();
     
       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

       try
         {         
           Statement s = cone.getMiConexion().createStatement();
           String consul="select * from correpo where edo_reg = 'A' and grupo = '"+Cgrupo+"' and codigo like '%"+vtexto+"%'";
           ResultSet rs = s.executeQuery(consul);

           while (rs.next())
           {

             String var1 = rs.getString("id");
             String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
             String var3 = rs.getString("des_rem");
             String var4 = rs.getString("codigo");
             String var5 = rs.getString("nro_oficio");
             tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
             tabla.setModel(tr);
             TableColumn column = null;
             for (int i = 0; i < 3; i++) {
                  column = tabla.getColumnModel().getColumn(i);
                  if (i == 0) {column.setPreferredWidth(0);}
                  if (i == 1) {column.setPreferredWidth(15);}
                  if (i == 2) {column.setPreferredWidth(250);}
                  if (i == 3) {column.setPreferredWidth(10);}
                  if (i == 4) {column.setPreferredWidth(10);}
             }
           }
         }
          catch (Exception e)
          {
          }
    }//GEN-LAST:event_RcodigoActionPerformed

    private void BtonremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonremActionPerformed
        vtexto  =  Ctexto.getText();

       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

       try
         {
           Statement s = cone.getMiConexion().createStatement();
           String consul="select * from correpo where edo_reg = 'A' and grupo = '"+Cgrupo+"' and cod_rem like '%"+vtexto+"%'";
           ResultSet rs = s.executeQuery(consul);

           while (rs.next())
           {

             String var1 = rs.getString("id");
             String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
             String var3 = rs.getString("des_rem");
             String var4 = rs.getString("codigo");
             String var5 = rs.getString("nro_oficio");
             tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
             tabla.setModel(tr);
             TableColumn column = null;
             for (int i = 0; i < 3; i++) {
                  column = tabla.getColumnModel().getColumn(i);
                  if (i == 0) {column.setPreferredWidth(0);}
                  if (i == 1) {column.setPreferredWidth(15);}
                  if (i == 2) {column.setPreferredWidth(250);}
                  if (i == 3) {column.setPreferredWidth(10);}
                  if (i == 4) {column.setPreferredWidth(10);}
             }
           }
         }
          catch (Exception e)
          {
          }
    }//GEN-LAST:event_BtonremActionPerformed

    private void BtondesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtondesActionPerformed
         vtexto  =  Ctexto.getText();

       DefaultTableModel tr = (DefaultTableModel)tabla.getModel();

       try
         {
           Statement s = cone.getMiConexion().createStatement();
           String consul="select * from correpo where edo_reg = 'A' and grupo = '"+Cgrupo+"' and cod_des like '%"+vtexto+"%'";
           ResultSet rs = s.executeQuery(consul);

           while (rs.next())
           {

             String var1 = rs.getString("id");
             String var2 =  (PROCE.verfecha(rs.getString("fecha_rec")));
             String var3 = rs.getString("des_rem");
             String var4 = rs.getString("codigo");
             String var5 = rs.getString("nro_oficio");
             tr.addRow(new Object[]{var1, var2, var3, var4, var5,});
             tabla.setModel(tr);
             TableColumn column = null;
             for (int i = 0; i < 3; i++) {
                  column = tabla.getColumnModel().getColumn(i);
                  if (i == 0) {column.setPreferredWidth(0);}
                  if (i == 1) {column.setPreferredWidth(15);}
                  if (i == 2) {column.setPreferredWidth(250);}
                  if (i == 3) {column.setPreferredWidth(10);}
                  if (i == 4) {column.setPreferredWidth(10);}
             }
           }
         }
          catch (Exception e)
          {
          }
    }//GEN-LAST:event_BtondesActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                consulta frame = new consulta();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
   
   public String cs(String a)
   {
       return "'"+a+"'";
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btondes;
    private javax.swing.JButton Btonrem;
    private javax.swing.JButton Btonsalir;
    private javax.swing.JTextArea Ctexto;
    private javax.swing.JButton Rcodigo;
    private javax.swing.JButton Rdesrem;
    private javax.swing.JButton Rfecha;
    private javax.swing.JButton Rnrooficio;
    private javax.swing.JButton btonselecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    
}
