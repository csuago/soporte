/*
 * Usuario.java
 *
 * Created on 1 de agosto de 2008, 07:14 AM
 */
package formas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Ibrahin Araujo
 */
public class ausuario extends javax.swing.JFrame {

    public static Connection conn1;
    public static java.sql.Statement sql;
    private ResultSet rs;
    private String vcodusr, vdenusr, vencripta, vcodprg, vcodmod, vcodpad;
    static proceso PROCE;
    private String vopi, vopm, vope, vcod_prg3;
    private int opcion;
    public static int swe = 0;
    List<Integer> lst;

    public ausuario() {
        try {
            initComponents();
            lst = new ArrayList<Integer>();
            setIconImage(new ImageIcon("./imagenes/ibraico.png").getImage());
            setLocationRelativeTo(null);
            limpiar_usuario();
            tabla_usuario();
            cargar_perfil();
            PROCE = new proceso();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //formulario_dispo();
    }

    void cargar_perfil() throws SQLException {
        cbperfil.removeAllItems();
        rs = MiConexionBD.getSql().executeQuery("SELECT id_perfil as id, name FROM perfil ORDER BY id_perfil ASC");
        while (rs.next()) {
            cbperfil.addItem(rs.getString("name"));
            lst.add(rs.getInt("id"));
        }
    }

    // LIMPIAR_USUARIO
    private void limpiar_usuario() {
        txtcodusr.setText("");
        txtpswusr.setText("");
        txtconfirmar.setText("");
        txtdenusr.setText("");
        txttelef.setText("");
        txttelef1.setText("");
        txtdirec.setText("");
        txtcedula.setText("");
        txtedousu.setSelectedItem("");
        cbperfil.setSelectedItem("");
        opcion = 0;
        aviso.setText("");
    }

   // LIMPIAR_VARIABLE TABLA FORMULARIO USUARIO
   /*public void limpiar_Variables(){
     DefaultTableModel tr = (DefaultTableModel)TABLA_F_USUARIO.getModel();
     tr.setRowCount(0);
     }*/
    // LIMPIA LA TABLA DEL USUARIO ACTIVO
    public void limpiar_Usuario_Activo() {
        DefaultTableModel tr = (DefaultTableModel) TABLA_USUARIO.getModel();
        tr.setRowCount(0);
    }

    // METODO EDITAR_USUARIO
    public void EDITAR_USUARIO() {
        try {
            rs = sql.executeQuery("select * from admg02 where cod_usr = '" + vcodusr + "'");
            if (rs.next()) {
                txtcodusr.setText(rs.getString("cod_usr"));
                txtpswusr.setText(PROCE.DESENCRIPTAR(rs.getString("psw_usr")));
                txtconfirmar.setText(PROCE.DESENCRIPTAR(rs.getString("psw_usr")));
                txtdenusr.setText(rs.getString("den_usr"));
                txttelef.setText(rs.getString("telef_area"));
                txttelef1.setText(rs.getString("telef"));
                txtdirec.setText(rs.getString("direc"));
                txtcedula.setText(rs.getString("cedula"));
                txtedousu.setSelectedItem(rs.getString("edo_usu"));
                cbperfil.setSelectedIndex(findPer(rs.getInt("id_perfil")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int findPer(int value) {
        for (int i = 0; i < lst.size(); i++) {
            if (value == lst.get(i)) {
                return i;
            }
        }
        return 0;
    }

    // CARGAR TABLA DE USUARIO ACTIVO
    private void tabla_usuario() {
        DefaultTableModel tr = (DefaultTableModel) TABLA_USUARIO.getModel();
        try {
            rs = sql.executeQuery("select * from admg02");
            while (rs.next()) {
                vcodusr = rs.getString("cod_usr");
                vdenusr = rs.getString("den_usr");
                tr.addRow(new Object[]{vcodusr, vdenusr});
                TABLA_USUARIO.setModel(tr);
                TableColumn column = null;
                for (int i = 0; i <= 1; i++) {
                    column = TABLA_USUARIO.getColumnModel().getColumn(i);
                    if (i == 1) {
                        column.setPreferredWidth(300);
                    } else {
                        column.setPreferredWidth(70);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

  //CARGAR TABLA DE FORMULARIOS DEL USUARIO
  /*private void formulario_usuario() {
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
     }*/
    //CARGAR TABLA DE FORMULARIOS DISPONIBLES
    private void formulario_dispo() {
        //DefaultTableModel tr = (DefaultTableModel)TABLA_F_DISPO.getModel();
        try {
            rs = sql.executeQuery("select * from insl04 where edo_reg='A' order by nom_prg");
            while (rs.next()) {
                String vcod_prg = rs.getString("cod_prg");
                String vnom_prg = rs.getString("nom_prg");
                //tr.addRow(new Object[]{vcod_prg, vnom_prg, });
            }
        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        txtcodusr = new javax.swing.JTextField();
        txtcedula = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        aviso = new javax.swing.JTextField();
        txttelef1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbperfil = new javax.swing.JComboBox();
        PActivo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TABLA_USUARIO = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btonincluir = new javax.swing.JButton();
        btoneliminar = new javax.swing.JButton();
        btonmodificar = new javax.swing.JButton();
        btoncancelar = new javax.swing.JButton();
        btonaceptar = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        PDatos.add(jPanel2);
        jPanel2.setBounds(0, 0, 520, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario");
        PDatos.add(jLabel2);
        jLabel2.setBounds(66, 54, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre Completo");
        PDatos.add(jLabel4);
        jLabel4.setBounds(14, 78, 110, 15);

        txtdenusr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(txtdenusr);
        txtdenusr.setBounds(130, 74, 200, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password");
        PDatos.add(jLabel3);
        jLabel3.setBounds(60, 103, 65, 15);

        txtpswusr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(txtpswusr);
        txtpswusr.setBounds(130, 98, 140, 20);

        txtconfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(txtconfirmar);
        txtconfirmar.setBounds(130, 124, 140, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Confirmar");
        PDatos.add(jLabel5);
        jLabel5.setBounds(60, 126, 65, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono");
        PDatos.add(jLabel6);
        jLabel6.setBounds(64, 150, 60, 15);

        txttelef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txttelef.setName(""); // NOI18N
        txttelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefKeyTyped(evt);
            }
        });
        PDatos.add(txttelef);
        txttelef.setBounds(130, 150, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cedula");
        PDatos.add(jLabel7);
        jLabel7.setBounds(280, 50, 45, 15);

        txtdirec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane5.setViewportView(txtdirec);

        PDatos.add(jScrollPane5);
        jScrollPane5.setBounds(130, 176, 320, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Edo.Usuario");
        PDatos.add(jLabel16);
        jLabel16.setBounds(50, 242, 76, 20);

        txtedousu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtedousu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B", "A" }));
        txtedousu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(txtedousu);
        txtedousu.setBounds(130, 242, 44, 20);

        txtcodusr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(txtcodusr);
        txtcodusr.setBounds(130, 50, 140, 20);

        txtcedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        PDatos.add(txtcedula);
        txtcedula.setBounds(330, 50, 80, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Dirección");
        PDatos.add(jLabel15);
        jLabel15.setBounds(60, 180, 65, 15);

        aviso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        aviso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aviso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PDatos.add(aviso);
        aviso.setBounds(350, 270, 100, 20);

        txttelef1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txttelef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelef1ActionPerformed(evt);
            }
        });
        txttelef1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelef1KeyTyped(evt);
            }
        });
        PDatos.add(txttelef1);
        txttelef1.setBounds(180, 150, 140, 20);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel9.setText("Perfil");
        PDatos.add(jLabel9);
        jLabel9.setBounds(77, 275, 46, 16);

        PDatos.add(cbperfil);
        cbperfil.setBounds(130, 270, 150, 28);

        PActivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PActivo.setLayout(null);

        TABLA_USUARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
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
        if (TABLA_USUARIO.getColumnModel().getColumnCount() > 0) {
            TABLA_USUARIO.getColumnModel().getColumn(0).setPreferredWidth(20);
            TABLA_USUARIO.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        PActivo.add(jScrollPane6);
        jScrollPane6.setBounds(10, 50, 490, 200);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Usuarios Activos");
        PActivo.add(jLabel8);
        jLabel8.setBounds(270, 10, 148, 17);

        btonincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/incluir.png"))); // NOI18N
        btonincluir.setToolTipText("Ingreso de Nuevo Usuario ");
        btonincluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonincluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btonincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonincluirActionPerformed(evt);
            }
        });
        PActivo.add(btonincluir);
        btonincluir.setBounds(10, 0, 50, 45);

        btoneliminar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btoneliminar.setForeground(new java.awt.Color(0, 0, 102));
        btoneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        btoneliminar.setToolTipText("Eliminacion de Registro deUsuario");
        btoneliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btonmodificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btonmodificar.setForeground(new java.awt.Color(0, 0, 102));
        btonmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btonmodificar.setToolTipText("Actualizar Registro de Usuario");
        btonmodificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonmodificar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonmodificarActionPerformed(evt);
            }
        });
        PActivo.add(btonmodificar);
        btonmodificar.setBounds(110, 0, 50, 45);

        btoncancelar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btoncancelar.setForeground(new java.awt.Color(0, 51, 102));
        btoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btoncancelar.setToolTipText("Cancelar el Registro");
        btoncancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btoncancelar.setPreferredSize(new java.awt.Dimension(83, 23));
        btoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoncancelarActionPerformed(evt);
            }
        });
        PActivo.add(btoncancelar);
        btoncancelar.setBounds(160, 0, 50, 45);

        btonaceptar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btonaceptar.setForeground(new java.awt.Color(0, 0, 102));
        btonaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        btonaceptar.setToolTipText("Aceptar el Registro");
        btonaceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(PActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(PDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TABLA_USUARIOMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_USUARIOMouseReleased
        int fila = TABLA_USUARIO.getSelectedRow();
        vcodusr = TABLA_USUARIO.getValueAt(fila, 0).toString();
        EDITAR_USUARIO();
        //limpiar_Variables();
        //formulario_usuario();
}//GEN-LAST:event_TABLA_USUARIOMouseReleased

    private void TABLA_USUARIOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLA_USUARIOKeyReleased
        int fila = TABLA_USUARIO.getSelectedRow();
        vcodusr = TABLA_USUARIO.getValueAt(fila, 0).toString();
        EDITAR_USUARIO();
        //limpiar_Variables();
        //formulario_usuario();
}//GEN-LAST:event_TABLA_USUARIOKeyReleased

    /*public void insert(){
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
     }*/
    private void btonincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonincluirActionPerformed

        /*UserQuery uq = new UserQuery();
         if(uq.existRIF(txtcedula.getText()) == true){
         JOptionPane.showMessageDialog(this,"EL NÚMERO DE CEDULA YA EXISTE","A T E N C I O N",JOptionPane.INFORMATION_MESSAGE );
         }*/
        if (existRIF(txtcedula.getText()) == true) {
            JOptionPane.showMessageDialog(this, "EL NÚMERO DE CEDULA YA EXISTE", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtcodusr.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El campo USUARIO O PASSWORD esta en blanco", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = 1;
            aviso.setText("INCLUIR");
            btonaceptar.setEnabled(true);
        }
}//GEN-LAST:event_btonincluirActionPerformed

    private void btoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoneliminarActionPerformed
        if (txtcodusr.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "SELECCIONE UN REGISTRO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = 3;
            aviso.setText("ELIMINACION");
        }
}//GEN-LAST:event_btoneliminarActionPerformed

    private void btonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonmodificarActionPerformed
        if (txtcodusr.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "SELECCIONE UN REGISTRO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = 2;
            aviso.setText("ACTUALIZAR");
        }
}//GEN-LAST:event_btonmodificarActionPerformed

    private void btoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoncancelarActionPerformed
        limpiar_usuario();
}//GEN-LAST:event_btoncancelarActionPerformed

    public boolean existRIF(String cedula) {
        try {
            rs = sql.executeQuery("SELECT cedula FROM admg02 WHERE cedula = '" + txtcedula.getText() + "' LIMIT 1");
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @SuppressWarnings("static-access")
    private void btonaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonaceptarActionPerformed

        if (opcion == 0) {
            JOptionPane.showMessageDialog(this, "ELIGE UN OPCIÓN", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtcedula.getText().isEmpty() && opcion != 3) {
            JOptionPane.showMessageDialog(this, "INSERTA UN NÚMERO DE CEDULA", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtdenusr.getText().isEmpty() && opcion != 3) {
            JOptionPane.showMessageDialog(this, "ESCRIBE UN NOMBRE", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (existRIF(txtcedula.getText()) == true && opcion == 1) {
            JOptionPane.showMessageDialog(this, "EL NÚMERO DE CEDULA YA EXISTE", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (!txtpswusr.getText().equals(txtconfirmar.getText()) && opcion != 3) {
            JOptionPane.showMessageDialog(this, "LAS CONTRASEÑAS NO COINCIDEN", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else if (txttelef.getText().isEmpty() && opcion != 3 || txttelef1.getText().isEmpty() && opcion != 3) {
            JOptionPane.showMessageDialog(this, "ESCRIBE UN NÚMERO DE TELEFONO", "A T E N C I O N", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (opcion == 1) {
                int a = JOptionPane.showConfirmDialog(this, "¿DESEA AGREGAR AL USUARIO?"
                        + "", "POR FAVOR VERIFIQUE...", JOptionPane.ERROR_MESSAGE);

                if (a == 0) {
                    try {
                        String vedoreg = "A";
                        String vplataforma = "JAVA";
                        vcodusr = txtcodusr.getText().toUpperCase().trim();
                        vdenusr = txtdenusr.getText().toUpperCase().trim();
                        String atelef = txttelef.getText();
                        String vtelef = txttelef1.getText();
                        String vcedula = txtcedula.getText();
                        String vdirec = txtdirec.getText().toUpperCase().trim();
                        String vedousu = (String) txtedousu.getSelectedItem();
                        vencripta = PROCE.ENCRIPTAR(txtpswusr.getText());

                        sql.executeUpdate("insert into admg02 (edo_reg, plataforma, cod_usr, den_usr, psw_usr, telef_area, telef, direc, edo_usu, cedula, id_perfil) "
                                + "values('" + vedoreg + "','" + vplataforma + "','" + vcodusr + "','" + vdenusr + "','" + vencripta + "','" + atelef + "','" + vtelef + "','" + vdirec + "','" + vedousu + "','" + vcedula + "'," + lst.get(cbperfil.getSelectedIndex()) + ")");
                    } catch (SQLException ex) {
                        Logger.getLogger(ausuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            if (opcion == 2) {
                int a = JOptionPane.showConfirmDialog(this, "¿REALMENTE DESEA MODIFICAR EL REGISTRO?"
                        + "", "POR FAVOR VERIFIQUE...", JOptionPane.ERROR_MESSAGE);
                if (a == 0) {
                    vencripta = PROCE.ENCRIPTAR(txtpswusr.getText());
                }
                {
                    try {

                        sql.executeUpdate("update admg02 "
                                + " set cod_usr = '" + txtcodusr.getText().toUpperCase().trim() + "'"
                                + ",psw_usr     = '" + vencripta + "'"
                                + ",den_usr     = '" + txtdenusr.getText().toUpperCase().trim() + "'"
                                + ",edo_usu     = '" + (String) txtedousu.getSelectedItem() + "'"
                                + ",telef_area  = '" + txttelef.getText() + "'"
                                + ",telef       = '" + txttelef1.getText() + "'"
                                + ",cedula      = '" + txtcedula.getText() + "'"
                                + ",direc       = '" + txtdirec.getText().toUpperCase().trim() + "'"
                                + ",id_perfil   = '" + lst.get(cbperfil.getSelectedIndex()) + "'"
                                + "where cod_usr = '" + vcodusr + "' and edo_reg='A' ");

                        JOptionPane.showMessageDialog(this, "REGISTRO ACTUALIZADO", "PROCESO CONCLUIDO EXITOSAMENTE", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "REGISTRO NO ACTUALIZADO\nRevise que el nombre y la cedula no sean repetidos", "ERROR POR FAVOR VERIFIQUE Y VUELVA A INTENTARLO", JOptionPane.ERROR_MESSAGE);
                    }
                }
                //limpiar_Variables();
                limpiar_usuario();
            }
            if (opcion == 3) {
                JOptionPane.showMessageDialog(this, "NO HAY ELIMINACION DE REGISTRO...", "BLOQUE EL USUARIO EDO. USUARIO", JOptionPane.ERROR_MESSAGE);
            }

            //limpiar_Variables();
            limpiar_usuario();
            limpiar_Usuario_Activo();
            tabla_usuario();
        }
}//GEN-LAST:event_btonaceptarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (swe != 0) {
            swe = 0;
        }
    }//GEN-LAST:event_formWindowActivated

private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed

    // TODO add your handling code here:
}//GEN-LAST:event_txtcedulaActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char key = evt.getKeyChar();
        if (key >= '0' && key <= '9' || key == 8) {
            if (txtcedula.getText().length() > 8) {
                evt.consume();
            }
            if (key != 8 && txtcedula.getText().length() == 0) {
                txtcedula.setText("v");
            }
            if (key == 8 && txtcedula.getText().length() == 1) {
                txtcedula.setText(null);
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txttelef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelef1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelef1ActionPerformed

    private void txttelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefKeyTyped
        char key = evt.getKeyChar();
        if (key >= '0' && key <= '9' || key == 8) {
            if (txttelef.getText().length() > 2) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefKeyTyped

    private void txttelef1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelef1KeyTyped
        char key = evt.getKeyChar();
        if (key >= '0' && key <= '9' || key == 8) {
            if (txttelef1.getText().length() > 6) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txttelef1KeyTyped

    // METODO EDITAR_ATRIBUTOS
    /*private void EDITAR_ATRIBUTOS() {
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
     {e.printStackTrace();}
     }*/
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
    private javax.swing.JPanel PActivo;
    private javax.swing.JPanel PDatos;
    private javax.swing.JTable TABLA_USUARIO;
    private javax.swing.JTextField aviso;
    private javax.swing.JButton btonaceptar;
    private javax.swing.JButton btoncancelar;
    private javax.swing.JButton btoneliminar;
    private javax.swing.JButton btonincluir;
    private javax.swing.JButton btonmodificar;
    private javax.swing.JComboBox cbperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JFormattedTextField txtcedula;
    private javax.swing.JTextField txtcodusr;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JTextField txtdenusr;
    private javax.swing.JEditorPane txtdirec;
    private javax.swing.JComboBox txtedousu;
    private javax.swing.JPasswordField txtpswusr;
    private javax.swing.JTextField txttelef;
    private javax.swing.JTextField txttelef1;
    // End of variables declaration//GEN-END:variables

}
