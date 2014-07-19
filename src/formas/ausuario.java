/*
 * Usuario.java
 *
 * Created on 1 de agosto de 2008, 07:14 AM
 */

package formas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author  Ibrahin Araujo
 */
public class ausuario extends javax.swing.JFrame {
   
    public static Connection conn1;
    public static java.sql.Statement sql;
    private ResultSet rs; 
    private String vcodusr,vdenusr,vencripta,vcodprg,vcodmod,vcodpad;
    static  proceso  PROCE  = new proceso();
    private String vopi,vopm,vope,vcod_prg3;
    private int opcion;
    public  static int swe = 0;   
         
    public ausuario() {
      
            initComponents();
            setIconImage (new ImageIcon("./imagenes/ibraico.png").getImage());
            setLocationRelativeTo(null);
            limpiar_usuario();
            tabla_usuario();
            formulario_dispo();          
    }

 
   // LIMPIAR_USUARIO
   private void limpiar_usuario(){
            txtcodusr   .setText("");
            txtpswusr   .setText("");
            txtconfirmar.setText("");
            txtdenusr   .setText("");
            txttelef    .setText("");
            txtdirec    .setText("");
            txtcedula   .setText("");
            txtedousu   .setSelectedItem("");
            txtclausr   .setSelectedItem("");           
            opcion=0;
            aviso.setText("");
   }

   // LIMPIAR_VARIABLE TABLA FORMULARIO USUARIO
   public void limpiar_Variables(){
            DefaultTableModel tr = (DefaultTableModel)TABLA_F_USUARIO.getModel();
            tr.setRowCount(0);
   }

   // LIMPIA LA TABLA DEL USUARIO ACTIVO
   public void limpiar_Usuario_Activo(){
                    DefaultTableModel tr = (DefaultTableModel)TABLA_USUARIO.getModel();
                    tr.setRowCount(0);
   }
   

   // METODO EDITAR_USUARIO
   public void EDITAR_USUARIO(){
       try
       {         
           rs = sql.executeQuery("select * from admg02 where cod_usr = '"+vcodusr+"'");
           if(rs.next())
           {                   
              txtcodusr     .setText(rs.getString("cod_usr"));
              txtpswusr     .setText(PROCE.DESENCRIPTAR(rs.getString("psw_usr")));
              txtconfirmar  .setText(PROCE.DESENCRIPTAR(rs.getString("psw_usr")));
              txtdenusr     .setText(rs.getString("den_usr"));
              txttelef      .setText(rs.getString("telef"));
              txtdirec      .setText(rs.getString("direc"));
              txtcedula     .setText(rs.getString("cedula"));
              txtedousu     .setSelectedItem(rs.getString("edo_usu"));
              txtclausr     .setSelectedItem(rs.getString("cla_usr"));               
          }
       }catch(Exception e) {}       
   }

   // CARGAR TABLA DE USUARIO ACTIVO
   private void tabla_usuario()  {
        DefaultTableModel tr = (DefaultTableModel)TABLA_USUARIO.getModel();
        try
                {
                rs = sql.executeQuery ("select * from admg02");
                while (rs.next())
                    {
                      vcodusr  = rs.getString("cod_usr");
                      vdenusr  = rs.getString("den_usr");
                      tr.addRow(new Object[]{vcodusr, vdenusr});
                      TABLA_USUARIO.setModel(tr);
                      TableColumn column = null;
                      for (int i = 0; i <= 1; i++)
                      {
                        column = TABLA_USUARIO.getColumnModel().getColumn(i);
                        if (i == 1) {column.setPreferredWidth(300);
                        } else {column.setPreferredWidth(70);}
                      }
                     }
                 }
                catch (Exception e)
                {
                }
  }

  //CARGAR TABLA DE FORMULARIOS DEL USUARIO
  private void formulario_usuario() {
    DefaultTableModel tr = (DefaultTableModel)TABLA_F_USUARIO.getModel();

    try
       {
        rs = sql.executeQuery("select * from admg03 where cod_usr = '"+vcodusr+"' and edo_reg= 'A'  ");
        while (rs.next()) {
               vcodusr  = rs.getString("cod_usr");
               vcodprg  = rs.getString("cod_prg"); 
               tr.addRow(new Object[]{vcodusr, vcodprg});
               TABLA_F_USUARIO.setModel(tr);
               TableColumn column = null;
               for (int i = 0; i < 2; i++) {
                    column = TABLA_F_USUARIO.getColumnModel().getColumn(i);
                    if (i == 0) {column.setPreferredWidth(20);}
                    if (i == 1) {column.setPreferredWidth(200);}                       
               }
        }
       }
         catch (Exception e)
         {
         }
  }
  
  //CARGAR TABLA DE FORMULARIOS DISPONIBLES
  private void formulario_dispo() {
    DefaultTableModel tr = (DefaultTableModel)TABLA_F_DISPO.getModel();
    try
       {
        rs = sql.executeQuery ("select * from insl04 where edo_reg='A' order by nom_prg");
        while (rs.next()) {
               String vcod_prg  = rs.getString("cod_prg");
               String vnom_prg  = rs.getString("nom_prg");
               tr.addRow(new Object[]{vcod_prg, vnom_prg, });
        } 
       }
        catch (Exception e)
        {}

  }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        PDatos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdenusr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpswusr = new javax.swing.JPasswordField();
        txtconfirmar = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttelef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtdirec = new javax.swing.JEditorPane();
        jLabel16 = new javax.swing.JLabel();
        txtedousu = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtclausr = new javax.swing.JComboBox();
        txtcodusr = new javax.swing.JTextField();
        txtcedula = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        aviso = new javax.swing.JTextField();
        PActivo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TABLA_USUARIO = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btonincluir = new javax.swing.JButton();
        btoneliminar = new javax.swing.JButton();
        btonmodificar = new javax.swing.JButton();
        btoncancelar = new javax.swing.JButton();
        btonaceptar = new javax.swing.JButton();
        btonsalir = new javax.swing.JButton();
        PDispo = new javax.swing.JPanel();
        I_FORMULARIO = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TABLA_F_DISPO = new javax.swing.JTable();
        PUsuario = new javax.swing.JPanel();
        txtopi = new javax.swing.JComboBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        TABLA_F_USUARIO = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtopm = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtope = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox();
        txtpri = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Boton_Actualizar_Formulario = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrador de Usuario");
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PDatos.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        PDatos.add(jPanel2);
        jPanel2.setBounds(0, 0, 490, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario");
        PDatos.add(jLabel2);
        jLabel2.setBounds(76, 54, 50, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre Completo");
        PDatos.add(jLabel4);
        jLabel4.setBounds(12, 78, 112, 15);

        txtdenusr.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtdenusr);
        txtdenusr.setBounds(130, 74, 200, 18);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password");
        PDatos.add(jLabel3);
        jLabel3.setBounds(60, 103, 65, 15);

        txtpswusr.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtpswusr);
        txtpswusr.setBounds(130, 98, 140, 18);

        txtconfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtconfirmar);
        txtconfirmar.setBounds(130, 124, 140, 18);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Confirmar");
        PDatos.add(jLabel5);
        jLabel5.setBounds(60, 126, 65, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono");
        PDatos.add(jLabel6);
        jLabel6.setBounds(64, 150, 60, 15);

        txttelef.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        txttelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefActionPerformed(evt);
            }
        });
        PDatos.add(txttelef);
        txttelef.setBounds(130, 150, 140, 18);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cedula");
        PDatos.add(jLabel7);
        jLabel7.setBounds(280, 50, 45, 15);

        txtdirec.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        jScrollPane5.setViewportView(txtdirec);

        PDatos.add(jScrollPane5);
        jScrollPane5.setBounds(130, 176, 320, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setText("Edo.Usuario");
        PDatos.add(jLabel16);
        jLabel16.setBounds(50, 242, 76, 20);

        txtedousu.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtedousu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B", "A" }));
        txtedousu.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtedousu);
        txtedousu.setBounds(130, 242, 44, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel17.setText("Usuario");
        PDatos.add(jLabel17);
        jLabel17.setBounds(210, 242, 50, 20);

        txtclausr.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtclausr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UM", "SU" }));
        txtclausr.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtclausr);
        txtclausr.setBounds(260, 242, 50, 20);

        txtcodusr.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(txtcodusr);
        txtcodusr.setBounds(130, 50, 140, 18);

        txtcedula.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        PDatos.add(txtcedula);
        txtcedula.setBounds(330, 50, 70, 18);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Dirección");
        PDatos.add(jLabel15);
        jLabel15.setBounds(60, 180, 65, 15);

        aviso.setFont(new java.awt.Font("Arial", 1, 12));
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        aviso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aviso.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PDatos.add(aviso);
        aviso.setBounds(330, 240, 100, 20);

        PActivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PActivo.setLayout(null);

        TABLA_USUARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DENOMINACION DEL USUARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_USUARIO.setToolTipText("Usuarios Activos en el Sistema");
        TABLA_USUARIO.getTableHeader().setReorderingAllowed(false);
        TABLA_USUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TABLA_USUARIOMouseReleased(evt);
            }
        });
        TABLA_USUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABLA_USUARIOKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(TABLA_USUARIO);
        TABLA_USUARIO.getColumnModel().getColumn(0).setPreferredWidth(20);
        TABLA_USUARIO.getColumnModel().getColumn(1).setPreferredWidth(200);

        PActivo.add(jScrollPane6);
        jScrollPane6.setBounds(10, 50, 430, 200);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Usuarios Activos");
        PActivo.add(jLabel8);
        jLabel8.setBounds(300, 10, 148, 17);

        btonincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/incluir.png"))); // NOI18N
        btonincluir.setToolTipText("Ingreso de Nuevo Usuario ");
        btonincluir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btonincluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btonincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonincluirActionPerformed(evt);
            }
        });
        PActivo.add(btonincluir);
        btonincluir.setBounds(10, 0, 50, 45);

        btoneliminar.setFont(new java.awt.Font("Arial", 1, 11));
        btoneliminar.setForeground(new java.awt.Color(0, 0, 102));
        btoneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        btoneliminar.setToolTipText("Eliminacion de Registro deUsuario");
        btoneliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btoneliminar.setMaximumSize(new java.awt.Dimension(87, 23));
        btoneliminar.setMinimumSize(new java.awt.Dimension(87, 23));
        btoneliminar.setPreferredSize(new java.awt.Dimension(87, 23));
        btoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoneliminarActionPerformed(evt);
            }
        });
        PActivo.add(btoneliminar);
        btoneliminar.setBounds(60, 0, 50, 45);

        btonmodificar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btonmodificar.setForeground(new java.awt.Color(0, 0, 102));
        btonmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btonmodificar.setToolTipText("Actualizar Registro de Usuario");
        btonmodificar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btonmodificar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonmodificarActionPerformed(evt);
            }
        });
        PActivo.add(btonmodificar);
        btonmodificar.setBounds(110, 0, 50, 45);

        btoncancelar.setFont(new java.awt.Font("Arial", 1, 11));
        btoncancelar.setForeground(new java.awt.Color(0, 51, 102));
        btoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btoncancelar.setToolTipText("Cancelar el Registro");
        btoncancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btoncancelar.setPreferredSize(new java.awt.Dimension(83, 23));
        btoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoncancelarActionPerformed(evt);
            }
        });
        PActivo.add(btoncancelar);
        btoncancelar.setBounds(160, 0, 50, 45);

        btonaceptar.setFont(new java.awt.Font("Arial", 1, 11));
        btonaceptar.setForeground(new java.awt.Color(0, 0, 102));
        btonaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        btonaceptar.setToolTipText("Aceptar el Registro");
        btonaceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btonaceptar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btonaceptar.setMaximumSize(new java.awt.Dimension(87, 23));
        btonaceptar.setMinimumSize(new java.awt.Dimension(87, 23));
        btonaceptar.setPreferredSize(new java.awt.Dimension(87, 23));
        btonaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonaceptarActionPerformed(evt);
            }
        });
        PActivo.add(btonaceptar);
        btonaceptar.setBounds(210, 0, 50, 45);

        btonsalir.setFont(new java.awt.Font("Arial", 1, 11));
        btonsalir.setForeground(new java.awt.Color(0, 0, 102));
        btonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btonsalir.setToolTipText("Salida de Administracion de Usuario");
        btonsalir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btonsalir.setPreferredSize(new java.awt.Dimension(83, 23));
        btonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonsalirActionPerformed(evt);
            }
        });
        PActivo.add(btonsalir);
        btonsalir.setBounds(260, 0, 50, 45);

        PDispo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PDispo.setLayout(null);

        I_FORMULARIO.setFont(new java.awt.Font("Tahoma", 1, 12));
        I_FORMULARIO.setText("Agregar Formulario");
        I_FORMULARIO.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        I_FORMULARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_FORMULARIOActionPerformed(evt);
            }
        });
        PDispo.add(I_FORMULARIO);
        I_FORMULARIO.setBounds(150, 240, 170, 25);

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Formularios Disponibles");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PDispo.add(jPanel8);
        jPanel8.setBounds(0, 0, 470, 40);

        TABLA_F_DISPO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DENOMINACION", "IND_RAP", "OPC1", "OPC2", "OPC3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_F_DISPO.setSurrendersFocusOnKeystroke(true);
        TABLA_F_DISPO.getTableHeader().setReorderingAllowed(false);
        TABLA_F_DISPO.setVerifyInputWhenFocusTarget(false);
        TABLA_F_DISPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TABLA_F_DISPOMouseReleased(evt);
            }
        });
        TABLA_F_DISPO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABLA_F_DISPOKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(TABLA_F_DISPO);
        TABLA_F_DISPO.getColumnModel().getColumn(0).setMinWidth(80);
        TABLA_F_DISPO.getColumnModel().getColumn(0).setPreferredWidth(80);
        TABLA_F_DISPO.getColumnModel().getColumn(0).setMaxWidth(80);
        TABLA_F_DISPO.getColumnModel().getColumn(1).setPreferredWidth(200);
        TABLA_F_DISPO.getColumnModel().getColumn(2).setMinWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(2).setPreferredWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(2).setMaxWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(3).setMinWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(3).setPreferredWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(3).setMaxWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(4).setMinWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(4).setPreferredWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(4).setMaxWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(5).setMinWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(5).setPreferredWidth(0);
        TABLA_F_DISPO.getColumnModel().getColumn(5).setMaxWidth(0);

        PDispo.add(jScrollPane7);
        jScrollPane7.setBounds(10, 50, 450, 180);

        PUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PUsuario.setLayout(null);

        txtopi.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtopi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txtopi.setToolTipText("Marque 1 para Activar,0 para Desactivar");
        txtopi.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PUsuario.add(txtopi);
        txtopi.setBounds(50, 240, 40, 23);

        TABLA_F_USUARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "DENOMINACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_F_USUARIO.getTableHeader().setReorderingAllowed(false);
        TABLA_F_USUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TABLA_F_USUARIOMouseReleased(evt);
            }
        });
        TABLA_F_USUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABLA_F_USUARIOKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(TABLA_F_USUARIO);
        TABLA_F_USUARIO.getColumnModel().getColumn(0).setMinWidth(80);
        TABLA_F_USUARIO.getColumnModel().getColumn(0).setPreferredWidth(80);
        TABLA_F_USUARIO.getColumnModel().getColumn(0).setMaxWidth(80);

        PUsuario.add(jScrollPane8);
        jScrollPane8.setBounds(10, 50, 450, 180);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel11.setText("Incluir:");
        PUsuario.add(jLabel11);
        jLabel11.setBounds(10, 242, 40, 15);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel12.setText("Modificar:");
        PUsuario.add(jLabel12);
        jLabel12.setBounds(90, 242, 58, 15);

        txtopm.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtopm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txtopm.setToolTipText("Marque 1 para Activar,0 para Desactivar");
        txtopm.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PUsuario.add(txtopm);
        txtopm.setBounds(150, 240, 40, 23);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel13.setText("Eliminar:");
        PUsuario.add(jLabel13);
        jLabel13.setBounds(190, 242, 50, 15);

        txtope.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtope.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txtope.setToolTipText("Marque 1 para Activar,0 para Desactivar");
        txtope.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PUsuario.add(txtope);
        txtope.setBounds(244, 242, 40, 23);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel14.setText("Activar:");
        PUsuario.add(jLabel14);
        jLabel14.setBounds(376, 242, 44, 15);

        txtstatus.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "T" }));
        txtstatus.setToolTipText("Marque T para Activar,F para Desactivar");
        txtstatus.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PUsuario.add(txtstatus);
        txtstatus.setBounds(424, 240, 40, 22);

        txtpri.setFont(new java.awt.Font("Arial", 1, 12));
        txtpri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txtpri.setToolTipText("Marque 1 para Activar,0 para Desactivar");
        txtpri.setBorder(javax.swing.BorderFactory.createBevelBorder(1));
        PUsuario.add(txtpri);
        txtpri.setBounds(330, 240, 40, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setText("Print");
        PUsuario.add(jLabel18);
        jLabel18.setBounds(290, 242, 30, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Formularios del Usuario");
        PUsuario.add(jLabel10);
        jLabel10.setBounds(290, 20, 161, 17);

        Boton_Actualizar_Formulario.setFont(new java.awt.Font("Tahoma", 1, 12));
        Boton_Actualizar_Formulario.setText("Atributos Formulario");
        Boton_Actualizar_Formulario.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        Boton_Actualizar_Formulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Actualizar_FormularioActionPerformed(evt);
            }
        });
        PUsuario.add(Boton_Actualizar_Formulario);
        Boton_Actualizar_Formulario.setBounds(100, 10, 180, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(PDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(PUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABLA_USUARIOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_USUARIOMouseReleased
        int fila=TABLA_USUARIO.getSelectedRow();
        vcodusr=TABLA_USUARIO.getValueAt(fila,0).toString();
        EDITAR_USUARIO();
        limpiar_Variables();
        formulario_usuario();
}//GEN-LAST:event_TABLA_USUARIOMouseReleased

    private void TABLA_USUARIOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLA_USUARIOKeyReleased
        int fila=TABLA_USUARIO.getSelectedRow();
        vcodusr=TABLA_USUARIO.getValueAt(fila,0).toString();
        EDITAR_USUARIO();
        limpiar_Variables();
        formulario_usuario();
}//GEN-LAST:event_TABLA_USUARIOKeyReleased

    private void TABLA_F_DISPOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_F_DISPOMouseReleased
        int fila=TABLA_F_DISPO.getSelectedRow();
        String vcod_prg=TABLA_F_DISPO.getValueAt(fila,0).toString();
    }//GEN-LAST:event_TABLA_F_DISPOMouseReleased

    private void TABLA_F_DISPOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLA_F_DISPOKeyReleased
        int fila=TABLA_F_DISPO.getSelectedRow();
        String vcod_prg=TABLA_F_DISPO.getValueAt(fila,0).toString();
    }//GEN-LAST:event_TABLA_F_DISPOKeyReleased

    private void I_FORMULARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_FORMULARIOActionPerformed
       DefaultTableModel tr = (DefaultTableModel)TABLA_F_USUARIO.getModel();
        try
          {
            rs = sql.executeQuery("select * from insl04 where edo_reg= 'A' order by nom_prg ");
            while (rs.next()) {
                   vcodusr  = txtcodusr.getText().toUpperCase().trim();
                   vcodprg  = rs.getString("cod_prg");                    
                   tr.addRow(new Object[]{vcodusr, vcodprg});
                   TABLA_F_USUARIO.setModel(tr);
                   TableColumn column = null;
                   for (int i = 0; i < 2; i++) {
                        column = TABLA_F_USUARIO.getColumnModel().getColumn(i);
                        if (i == 0) {column.setPreferredWidth(20);}
                        if (i == 1) {column.setPreferredWidth(200);}                       
                   }
            }
            
         }
         
          catch (Exception e)
         {}
         insert();
}//GEN-LAST:event_I_FORMULARIOActionPerformed

    public void insert(){
     String vedoreg = "A";     
     String vindrap = "F";   
     String vplataforma = "JAVA";
     DefaultTableModel tr = (DefaultTableModel)TABLA_F_USUARIO.getModel();
     int nFilas = tr.getRowCount();
     for(int r = 0; r <= (nFilas - 1); r ++){
       String sentenciaSQL = "INSERT INTO admg03 (edo_reg, ind_rap,plataforma,cod_usr, cod_prg)"+
              " VALUES ('"+vedoreg+"',"                     
                     + "'"+vindrap+"',"
                     + "'"+vplataforma+"',"
                     + "'"+tr.getValueAt(r, 0).toString()+"',"                    
                     + "'"+tr.getValueAt(r, 1).toString()+"')";           
        try {
            sql.executeUpdate(sentenciaSQL);

        } catch (SQLException e) {}
    }
}
    private void TABLA_F_USUARIOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_F_USUARIOMouseReleased
        int fila=TABLA_F_USUARIO.getSelectedRow();
        vcod_prg3=TABLA_F_USUARIO.getValueAt(fila,1).toString().trim();
        EDITAR_ATRIBUTOS();
}//GEN-LAST:event_TABLA_F_USUARIOMouseReleased

    private void TABLA_F_USUARIOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLA_F_USUARIOKeyReleased
        int fila=TABLA_F_USUARIO.getSelectedRow();
        vcod_prg3=TABLA_F_USUARIO.getValueAt(fila,1).toString().trim();
        EDITAR_ATRIBUTOS();
}//GEN-LAST:event_TABLA_F_USUARIOKeyReleased

    private void Boton_Actualizar_FormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Actualizar_FormularioActionPerformed
       int a=JOptionPane.showConfirmDialog(this,"REALMENTE DESEA MODIFICAR LOS ATRIBUTOS DEL FORMULARIO?" +
                "","POR FAVOR VERIFIQUE...",JOptionPane.ERROR_MESSAGE);

        if(a==0) {
            try {
                 sql.executeUpdate("update admg03 " +
                                   " set ind_rap = '"+(String) txtstatus.getSelectedItem()+"'"+
                                   ",opi        = '"+(String) txtopi.getSelectedItem()+"'"+
                                   ",opm        = '"+(String) txtopm.getSelectedItem()+"'"+
                                   ",ope        = '"+(String) txtope.getSelectedItem()+"'"+
//                                   ",oprin      = '"+(String) txtpri.getSelectedItem()+"'"+
                                "where cod_usr   = '"+txtcodusr.getText()+"' and cod_prg ='"+vcod_prg3+"' ");
                 
                  JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO...","PROCESO CONCLUIDO EXITOSAMENTE",JOptionPane.INFORMATION_MESSAGE);

                limpiar_Variables();
                formulario_usuario();
            } catch(Exception e) {
           }
        }
}//GEN-LAST:event_Boton_Actualizar_FormularioActionPerformed

    private void btonincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonincluirActionPerformed
        if  (txtcodusr.getText().compareTo("") == 0 )
            {JOptionPane.showMessageDialog(this,"El campo USUARIO O PASSWORD esta en blanco","A T E N C I O N",JOptionPane.INFORMATION_MESSAGE );}
          else {
            opcion = 1;
            aviso.setText("INCLUIR");
            btonaceptar.setEnabled(true);  }
}//GEN-LAST:event_btonincluirActionPerformed

    private void btoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoneliminarActionPerformed
       if  (txtcodusr.getText().compareTo("") ==0 )
            {JOptionPane.showMessageDialog(this,"SELECCIONE UN REGISTRO","A T E N C I O N",JOptionPane.INFORMATION_MESSAGE );}
          else {
            opcion= 3;
            aviso.setText("ELIMINACION");}
}//GEN-LAST:event_btoneliminarActionPerformed

    private void btonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonmodificarActionPerformed
       if  (txtcodusr.getText().compareTo("") ==0 )
            {JOptionPane.showMessageDialog(this,"SELECCIONE UN REGISTRO","A T E N C I O N",JOptionPane.INFORMATION_MESSAGE );}
          else {
            opcion= 2;
            aviso.setText("ACTUALIZAR");}
}//GEN-LAST:event_btonmodificarActionPerformed

    private void btoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoncancelarActionPerformed
        limpiar_usuario();
}//GEN-LAST:event_btoncancelarActionPerformed

    private void existecedula() {
        
    }
            
    
    
    @SuppressWarnings("static-access")
    private void btonaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonaceptarActionPerformed
    
      
     if(opcion == 1 ) {
        int a=JOptionPane.showConfirmDialog(this,"¿DESEA AGREGAR AL USUARIO?" +
                "","POR FAVOR VERIFIQUE...",JOptionPane.ERROR_MESSAGE);
        
        if(a==0)
          {
                try {
                    String vedoreg = "A";    
                    String vplataforma = "JAVA";
                    vcodusr = txtcodusr.getText().toUpperCase().trim();
                    vdenusr = txtdenusr.getText().toUpperCase().trim();
                    String vtelef  = txttelef.getText();
                    String vcedula = txtcedula.getText();
                    String vdirec  = txtdirec.getText().toUpperCase().trim();
                    String vedousu = (String) txtedousu.getSelectedItem(); 
                    String vclausr = (String) txtclausr.getSelectedItem(); 
                    vencripta = PROCE.ENCRIPTAR(txtpswusr.getText());
                 
                     sql.executeUpdate("insert into admg02 (edo_reg,plataforma,cod_usr,den_usr,psw_usr,telef,direc,cla_usr,edo_usu,cedula) "+
                               "values('"+vedoreg+"','"+vplataforma+"','"+vcodusr+"','"+vdenusr+"','"+vencripta+"','"+vtelef+"','"+vdirec+"','"+vclausr+"','"+vedousu+"','"+vcedula+"')");
                } catch (SQLException ex) {
                    Logger.getLogger(ausuario.class.getName()).log(Level.SEVERE, null, ex);
                }
          }

     }
     
      if(opcion == 2 ) {
         int a=JOptionPane.showConfirmDialog(this,"¿REALMENTE DESEA MODIFICAR EL REGISTRO?" +
                "","POR FAVOR VERIFIQUE...",JOptionPane.ERROR_MESSAGE);
         if(a==0)
            vencripta = PROCE.ENCRIPTAR(txtpswusr.getText());
           {
         try
        {

         sql.executeUpdate("update admg02 " +
                           " set cod_usr = '"+txtcodusr.getText().toUpperCase().trim()+"'"+
                           ",psw_usr     = '"+vencripta+"'"+
                           ",den_usr     = '"+txtdenusr.getText().toUpperCase().trim()+"'"+
                           ",edo_usu     = '"+(String) txtedousu.getSelectedItem()+"'"+
                           ",cla_usr     = '"+(String) txtclausr.getSelectedItem()+"'"+
                           ",telef       = '"+txttelef.getText()+"'"+
                           ",cedula       = '"+txtcedula.getText()+"'"+
                           ",direc       = '"+txtdirec.getText().toUpperCase().trim()+"'"+
                           "where cod_usr = '"+vcodusr+"' and edo_reg='A' ");
            
         JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO...","PROCESO CONCLUIDO EXITOSAMENTE",JOptionPane.INFORMATION_MESSAGE);
        }
       catch(Exception e)
          {JOptionPane.showMessageDialog(this,"REGISTRO NO ACTUALIZADO...","ERROR POR FAVOR VERIFIQUE Y VUELVA A INTENTARLO",JOptionPane.ERROR_MESSAGE);
        }
           }
            limpiar_Variables();
            limpiar_usuario();
      }
       if(opcion == 3 ) {
           JOptionPane.showMessageDialog(this,"NO HAY ELIMINACION DE REGISTRO...","BLOQUE EL USUARIO EDO. USUARIO",JOptionPane.ERROR_MESSAGE);
       }

         limpiar_Variables();
         limpiar_usuario();
         limpiar_Usuario_Activo();
         tabla_usuario();
}//GEN-LAST:event_btonaceptarActionPerformed

    private void btonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonsalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btonsalirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if ( swe != 0){          
             swe = 0;}
    }//GEN-LAST:event_formWindowActivated

private void txttelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txttelefActionPerformed

private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed

    // TODO add your handling code here:
}//GEN-LAST:event_txtcedulaActionPerformed
    
         
    // METODO EDITAR_ATRIBUTOS
    private void EDITAR_ATRIBUTOS() {
       try
       {
           rs = sql.executeQuery ("select * from admg03 where cod_prg = '"+vcod_prg3+"' and cod_usr = '"+vcodusr+"'");
           while(rs.next())
           {       
             txtstatus  .setSelectedItem(rs.getString("ind_rap"));
             txtopi     .setSelectedItem(rs.getString("opi"));
             txtopm     .setSelectedItem(rs.getString("opm"));
             txtope     .setSelectedItem(rs.getString("ope"));
             txtpri     .setSelectedItem(rs.getString("oprin"));
          }       
       }catch(Exception e)
        {}
    }

  
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
           public void run() {                   
              JFrame usuario = new ausuario();
              usuario.setLocationRelativeTo(null);
              usuario.setVisible(true);
           }
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Actualizar_Formulario;
    private javax.swing.JButton I_FORMULARIO;
    private javax.swing.JPanel PActivo;
    private javax.swing.JPanel PDatos;
    private javax.swing.JPanel PDispo;
    private javax.swing.JPanel PUsuario;
    private javax.swing.JTable TABLA_F_DISPO;
    private javax.swing.JTable TABLA_F_USUARIO;
    private javax.swing.JTable TABLA_USUARIO;
    private javax.swing.JTextField aviso;
    private javax.swing.JButton btonaceptar;
    private javax.swing.JButton btoncancelar;
    private javax.swing.JButton btoneliminar;
    private javax.swing.JButton btonincluir;
    private javax.swing.JButton btonmodificar;
    private javax.swing.JButton btonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JFormattedTextField txtcedula;
    private javax.swing.JComboBox txtclausr;
    private javax.swing.JTextField txtcodusr;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JTextField txtdenusr;
    private javax.swing.JEditorPane txtdirec;
    private javax.swing.JComboBox txtedousu;
    private javax.swing.JComboBox txtope;
    private javax.swing.JComboBox txtopi;
    private javax.swing.JComboBox txtopm;
    private javax.swing.JComboBox txtpri;
    private javax.swing.JPasswordField txtpswusr;
    private javax.swing.JComboBox txtstatus;
    private javax.swing.JTextField txttelef;
    // End of variables declaration//GEN-END:variables

     
}
