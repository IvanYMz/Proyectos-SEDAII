
// Morales Zepeda Ivan Yutlanih
// Zaragoza Jimenez Moisés de Jesús 

package MP;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {

    Usuario us;
    Cliente cl;
    Vehículo ve;
    Reparación re;
    Pieza pz;
    Login_File log;
    User_File file_us;
    Client_File file_cl;
    Vehicle_File file_ve;
    Repairs_File file_re;
    Piece_File file_pi;
    ArrayList<Usuario> List;
    ArrayList<Cliente> ListC;
    ArrayList<Vehículo> ListV;
    ArrayList<Pieza> ListP;

    public Menu() {
        initComponents();
        MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel3), false);
        MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel4), false);
        MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel5), false);
        MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel6), false);
        file_us = new User_File();
        file_cl = new Client_File();
        file_ve = new Vehicle_File();
        file_re = new Repairs_File();
        file_pi = new Piece_File();
        log = new Login_File();
        List = new ArrayList<>();
        List = file_cl.getUsuarios();
        for (Usuario x : List) {
            JComboClient.addItem(x.getName() + ", " + x.getSecName());
        }
        ListC = new ArrayList<>();
        ListC = file_ve.getCliente();
        for (Cliente x : ListC){
            jComboV.addItem(x.getName() + ", " + x.getSecName());
        }
        ListV = new ArrayList<>();
        ListV = file_re.getVehicle();
        for (Vehículo x : ListV){
            jComboR_V.addItem(String.valueOf(x.getID()));
        }
        ListP = new ArrayList<>();
        ListP = file_re.getPiece();
        for (Pieza x : ListP){
            jComboR_P.addItem(String.valueOf(x.getID()));
        }
        jPanel1.setBackground(Color.pink);
        jPanel2.setBackground(Color.pink);
        jPanel3.setBackground(Color.pink);
        jPanel4.setBackground(Color.pink);
        jPanel5.setBackground(Color.pink);
        jPanel6.setBackground(Color.pink);
        jPanel7.setBackground(Color.pink);
        jPanel8.setBackground(Color.pink);
        jPanel9.setBackground(Color.pink);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboR_V1 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        txtValR1 = new javax.swing.JTextField();
        tbtSearchR1 = new javax.swing.JButton();
        tbtEdit_R1 = new javax.swing.JButton();
        tbtDelete_R1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtID_R1 = new javax.swing.JTextField();
        M2 = new javax.swing.JLabel();
        txtFalla1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtDateIn_R1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtEstR1 = new javax.swing.JTextField();
        tbtSave_R1 = new javax.swing.JButton();
        tbtNew_R1 = new javax.swing.JButton();
        tbtCancel_Client3 = new javax.swing.JButton();
        tbtSaveEdit_Client3 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtDateOut_R1 = new javax.swing.JTextField();
        jComboR_P1 = new javax.swing.JComboBox<>();
        txtID_RV1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtcant_piezas1 = new javax.swing.JTextField();
        txtID_P1 = new javax.swing.JTextField();
        MenPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tbtLog = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbtBuscar = new javax.swing.JButton();
        txtValID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSecName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddr = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNewUser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JTextField();
        tbtNew = new javax.swing.JButton();
        tbtSave = new javax.swing.JButton();
        tbtCancel = new javax.swing.JButton();
        tbtRemove = new javax.swing.JButton();
        tbtEdit = new javax.swing.JButton();
        tbtSaveEd = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSearch_Client = new javax.swing.JTextField();
        tbtSearchClient = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        JComboClient = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtID_Client = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtName_Client = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSecName_Client = new javax.swing.JTextField();
        tbtNew_Client = new javax.swing.JButton();
        tbtEdit_Client = new javax.swing.JButton();
        tbtSaveEdit_Client = new javax.swing.JButton();
        tbtSave_Client = new javax.swing.JButton();
        tbtCancel_Client = new javax.swing.JButton();
        tbtDelete_Client = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtSit_Client = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboV = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtValV = new javax.swing.JTextField();
        tbtSearchV = new javax.swing.JButton();
        tbtEdit_V = new javax.swing.JButton();
        tbtDelete_V = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtID_V = new javax.swing.JTextField();
        M = new javax.swing.JLabel();
        txtMatr = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMarcaV = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtEstV = new javax.swing.JTextField();
        tbtSave_V = new javax.swing.JButton();
        tbtNew_V = new javax.swing.JButton();
        tbtCancel_Client1 = new javax.swing.JButton();
        tbtSaveEdit_Client1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboR_V = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtValR = new javax.swing.JTextField();
        tbtSearchR = new javax.swing.JButton();
        tbtEdit_R = new javax.swing.JButton();
        tbtDelete_R = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtID_R = new javax.swing.JTextField();
        M1 = new javax.swing.JLabel();
        txtFalla = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtDateOut_R = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtEstR = new javax.swing.JTextField();
        tbtSave_R = new javax.swing.JButton();
        tbtNew_R = new javax.swing.JButton();
        tbtCancel_Client2 = new javax.swing.JButton();
        tbtSaveEdit_R = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtDateIn_R = new javax.swing.JTextField();
        jComboR_P = new javax.swing.JComboBox<>();
        txtID_RV = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtID_P = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txtSearch_Pieza = new javax.swing.JTextField();
        tbtSearch_P = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txtID_Pieza = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        tbtNew_P = new javax.swing.JButton();
        tbtEdit_P = new javax.swing.JButton();
        tbtSaveEdit_P = new javax.swing.JButton();
        tbtSave_P = new javax.swing.JButton();
        tbtCancel_P = new javax.swing.JButton();
        tbtDelete_Client1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescrip = new javax.swing.JTextArea();
        txtStock = new javax.swing.JTextField();

        jLabel36.setText("Vehículo:");

        jLabel37.setText("Ingrese ID:");

        tbtSearchR1.setText("Buscar");
        tbtSearchR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSearchR1ActionPerformed(evt);
            }
        });

        tbtEdit_R1.setText("Editar");
        tbtEdit_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEdit_R1ActionPerformed(evt);
            }
        });

        tbtDelete_R1.setText("Eliminar");
        tbtDelete_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtDelete_R1ActionPerformed(evt);
            }
        });

        jLabel38.setText("ID de reparación:");

        txtID_R1.setEnabled(false);

        M2.setText("Falla del vehículo:");

        jLabel39.setText("ID de vehículo:");

        jLabel40.setText("Fecha de entrada:");

        jLabel41.setText("Estado");

        txtEstR1.setEditable(false);
        txtEstR1.setEnabled(false);

        tbtSave_R1.setText("Guardar");
        tbtSave_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSave_R1ActionPerformed(evt);
            }
        });

        tbtNew_R1.setText("Nuevo");
        tbtNew_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNew_R1ActionPerformed(evt);
            }
        });

        tbtCancel_Client3.setText("Cancelar");
        tbtCancel_Client3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancel_Client3ActionPerformed(evt);
            }
        });

        tbtSaveEdit_Client3.setText("Salvar Edición");
        tbtSaveEdit_Client3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdit_Client3ActionPerformed(evt);
            }
        });

        jLabel42.setText("Pieza:");

        jLabel43.setText("Fecha de salida:");

        txtID_RV1.setEnabled(false);

        jLabel44.setText("ID de pieza:");

        jLabel45.setText("Cantidad de piezas:");

        txtID_P1.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(tbtSave_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtCancel_Client3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtSaveEdit_Client3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel38)
                                    .addComponent(M2)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel43))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboR_V1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtFalla1)
                                            .addComponent(txtID_R1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtID_RV1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(jLabel42)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboR_P1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(134, 134, 134))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel45)
                                                    .addComponent(jLabel44)
                                                    .addComponent(jLabel41))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEstR1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                    .addComponent(txtcant_piezas1)
                                                    .addComponent(txtID_P1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDateOut_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDateIn_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(111, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(tbtNew_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(399, 399, 399))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)))
                        .addComponent(txtValR1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbtSearchR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtEdit_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtDelete_R1)
                .addGap(12, 12, 12))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtValR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSearchR1)
                    .addComponent(tbtEdit_R1)
                    .addComponent(tbtDelete_R1))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboR_V1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboR_P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtID_R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtID_P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M2)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFalla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)
                        .addComponent(txtcant_piezas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(txtID_RV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEstR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateOut_R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtDateIn_R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSaveEdit_Client3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtCancel_Client3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtSave_R1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(tbtNew_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("       Usuario:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        tbtLog.setText("Ingresar");
        tbtLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtLogActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tbtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(404, 404, 404))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );

        MenPane.addTab("Login", jPanel1);

        jLabel3.setText("Ingrese ID:");

        tbtBuscar.setText("Buscar");
        tbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        txtID.setEnabled(false);

        jLabel5.setText("Nombre(s):");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Perfil:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Mecánico" }));

        jLabel8.setText("Teléfono:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Nombre de Usuario:");

        jLabel11.setText("Contraseña:");

        tbtNew.setText("Nuevo");
        tbtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNewActionPerformed(evt);
            }
        });

        tbtSave.setText("Guardar");
        tbtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveActionPerformed(evt);
            }
        });

        tbtCancel.setText("Cancelar");
        tbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancelActionPerformed(evt);
            }
        });

        tbtRemove.setText("Remover");
        tbtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtRemoveActionPerformed(evt);
            }
        });

        tbtEdit.setText("Editar");
        tbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEditActionPerformed(evt);
            }
        });

        tbtSaveEd.setText("Salvar Edición");
        tbtSaveEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado");

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(tbtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbtSaveEd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSecName)
                                    .addComponent(txtAddr)
                                    .addComponent(txtNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel12))))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID)
                        .addComponent(txtTel)
                        .addComponent(txtNewUser)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tbtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSaveEd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtValID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        MenPane.addTab("Usuarios", jPanel2);

        jLabel13.setText("Ingrese ID:");

        tbtSearchClient.setText("Buscar");
        tbtSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSearchClientActionPerformed(evt);
            }
        });

        jLabel14.setText("Usuario:");

        jLabel15.setText("ID:");

        txtID_Client.setEnabled(false);

        jLabel16.setText("Nombre(s):");

        jLabel17.setText("Apellidos:");

        tbtNew_Client.setText("Nuevo");
        tbtNew_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNew_ClientActionPerformed(evt);
            }
        });

        tbtEdit_Client.setText("Editar");
        tbtEdit_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEdit_ClientActionPerformed(evt);
            }
        });

        tbtSaveEdit_Client.setText("Salvar Edición");
        tbtSaveEdit_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdit_ClientActionPerformed(evt);
            }
        });

        tbtSave_Client.setText("Guardar");
        tbtSave_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSave_ClientActionPerformed(evt);
            }
        });

        tbtCancel_Client.setText("Cancelar");
        tbtCancel_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancel_ClientActionPerformed(evt);
            }
        });

        tbtDelete_Client.setText("Eliminar");
        tbtDelete_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtDelete_ClientActionPerformed(evt);
            }
        });

        jLabel18.setText("Estado");

        txtSit_Client.setEditable(false);
        txtSit_Client.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbtNew_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 239, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtID_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSearch_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtSearchClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtEdit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtDelete_Client))
                            .addComponent(txtSit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboClient, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSecName_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tbtSave_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtCancel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(310, 310, 310))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tbtSaveEdit_Client)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSearch_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSearchClient)
                    .addComponent(tbtEdit_Client)
                    .addComponent(tbtDelete_Client))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(JComboClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel18)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtID_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSecName_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtSave_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtCancel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSaveEdit_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(tbtNew_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        MenPane.addTab("Clientes", jPanel3);

        jLabel19.setText("Cliente:");

        jComboV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboVActionPerformed(evt);
            }
        });

        jLabel20.setText("Ingrese ID:");

        tbtSearchV.setText("Buscar");
        tbtSearchV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSearchVActionPerformed(evt);
            }
        });

        tbtEdit_V.setText("Editar");
        tbtEdit_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEdit_VActionPerformed(evt);
            }
        });

        tbtDelete_V.setText("Eliminar");
        tbtDelete_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtDelete_VActionPerformed(evt);
            }
        });

        jLabel21.setText("ID:");

        txtID_V.setEnabled(false);

        M.setText("Matrícula:");

        jLabel22.setText("Marca:");

        jLabel23.setText("Modelo:");

        jLabel24.setText("Fecha");

        jLabel25.setText("Estado");

        txtEstV.setEditable(false);
        txtEstV.setEnabled(false);

        tbtSave_V.setText("Guardar");
        tbtSave_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSave_VActionPerformed(evt);
            }
        });

        tbtNew_V.setText("Nuevo");
        tbtNew_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNew_VActionPerformed(evt);
            }
        });

        tbtCancel_Client1.setText("Cancelar");
        tbtCancel_Client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancel_Client1ActionPerformed(evt);
            }
        });

        tbtSaveEdit_Client1.setText("Salvar Edición");
        tbtSaveEdit_Client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdit_Client1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModel)
                                    .addComponent(tbtSave_V, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtCancel_Client1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtSaveEdit_Client1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19)
                                    .addComponent(M)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMarcaV, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMatr, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID_V, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEstV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel25)
                                                .addGap(36, 36, 36))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jComboV, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(127, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(tbtNew_V, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(399, 399, 399))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)))
                        .addComponent(txtValV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbtSearchV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtEdit_V, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtDelete_V)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtValV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSearchV)
                    .addComponent(tbtEdit_V)
                    .addComponent(tbtDelete_V))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jComboV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtID_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M)
                            .addComponent(txtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtMarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSave_V, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(tbtCancel_Client1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtSaveEdit_Client1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(tbtNew_V, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        MenPane.addTab("Vehículos", jPanel4);

        jLabel26.setText("Vehículo:");

        jLabel27.setText("Ingrese ID:");

        tbtSearchR.setText("Buscar");
        tbtSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSearchRActionPerformed(evt);
            }
        });

        tbtEdit_R.setText("Editar");
        tbtEdit_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEdit_RActionPerformed(evt);
            }
        });

        tbtDelete_R.setText("Eliminar");
        tbtDelete_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtDelete_RActionPerformed(evt);
            }
        });

        jLabel28.setText("ID de reparación:");

        txtID_R.setEnabled(false);

        M1.setText("Falla del vehículo:");

        jLabel29.setText("ID de vehículo:");

        jLabel31.setText("Fecha de entrada:");

        jLabel32.setText("Estado");

        txtEstR.setEditable(false);
        txtEstR.setEnabled(false);

        tbtSave_R.setText("Guardar");
        tbtSave_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSave_RActionPerformed(evt);
            }
        });

        tbtNew_R.setText("Nuevo");
        tbtNew_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNew_RActionPerformed(evt);
            }
        });

        tbtCancel_Client2.setText("Cancelar");
        tbtCancel_Client2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancel_Client2ActionPerformed(evt);
            }
        });

        tbtSaveEdit_R.setText("Salvar Edición");
        tbtSaveEdit_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdit_RActionPerformed(evt);
            }
        });

        jLabel33.setText("Pieza:");

        jLabel34.setText("Fecha de salida:");

        txtID_RV.setEnabled(false);

        jLabel30.setText("ID de pieza:");

        txtID_P.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(tbtSave_R, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtCancel_Client2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtSaveEdit_R, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28)
                                    .addComponent(M1)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDateIn_R, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDateOut_R, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboR_V, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtFalla)
                                            .addComponent(txtID_R, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtID_RV, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboR_P, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(174, 174, 174))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel30)
                                                    .addComponent(jLabel32))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEstR, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                    .addComponent(txtID_P, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(111, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(tbtNew_R, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(399, 399, 399))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)))
                        .addComponent(txtValR, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbtSearchR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtEdit_R, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtDelete_R)
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtValR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSearchR)
                    .addComponent(tbtEdit_R)
                    .addComponent(tbtDelete_R))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jComboR_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboR_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtID_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txtID_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M1)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtID_RV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateIn_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtDateOut_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSaveEdit_R, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtCancel_Client2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtSave_R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tbtNew_R, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MenPane.addTab("Reparaciones", jPanel5);

        jLabel46.setText("Ingrese ID:");

        tbtSearch_P.setText("Buscar");
        tbtSearch_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSearch_PActionPerformed(evt);
            }
        });

        jLabel48.setText("ID de pieza:");

        txtID_Pieza.setEnabled(false);
        txtID_Pieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_PiezaActionPerformed(evt);
            }
        });

        jLabel49.setText("Descripción de la pieza:");

        jLabel50.setText("En stock:");

        tbtNew_P.setText("Nuevo");
        tbtNew_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtNew_PActionPerformed(evt);
            }
        });

        tbtEdit_P.setText("Editar");
        tbtEdit_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEdit_PActionPerformed(evt);
            }
        });

        tbtSaveEdit_P.setText("Salvar Edición");
        tbtSaveEdit_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSaveEdit_PActionPerformed(evt);
            }
        });

        tbtSave_P.setText("Guardar");
        tbtSave_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSave_PActionPerformed(evt);
            }
        });

        tbtCancel_P.setText("Cancelar");
        tbtCancel_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtCancel_PActionPerformed(evt);
            }
        });

        tbtDelete_Client1.setText("Eliminar");
        tbtDelete_Client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtDelete_Client1ActionPerformed(evt);
            }
        });

        txaDescrip.setColumns(20);
        txaDescrip.setRows(5);
        jScrollPane1.setViewportView(txaDescrip);

        txtStock.setEnabled(false);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbtNew_P, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch_Pieza, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbtSearch_P)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbtEdit_P, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbtDelete_Client1)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tbtSave_P, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtCancel_P, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tbtSaveEdit_P))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID_Pieza, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 312, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtSearch_Pieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSearch_P)
                    .addComponent(tbtEdit_P)
                    .addComponent(tbtDelete_Client1))
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtID_Pieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(74, 74, 74)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtSave_P, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtCancel_P, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtSaveEdit_P, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbtNew_P, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MenPane.addTab("Piezas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void tbtLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtLogActionPerformed
        try {
            String aux = txtUser.getText();
            char[] temp = txtPass.getPassword();
            String aux2 = String.valueOf(temp);
            if (log.Autenticar(aux, aux2)) {
                int ProfType = log.Profile(aux, aux2);
                if (ProfType == 1) {
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel2), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel3), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel4), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel5), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel6), true);
                    tbtBuscar.setEnabled(true);
                    tbtSave.setEnabled(true);
                    tbtCancel.setEnabled(true);
                    tbtNew.setEnabled(true);
                    tbtEdit.setEnabled(true);
                    tbtRemove.setEnabled(true);
                    txtValID.setEnabled(true);
                    txtName.setEnabled(true);
                    txtSecName.setEnabled(true);
                    txtTel.setEnabled(true);
                    txtNewUser.setEnabled(true);
                    txtAddr.setEnabled(true);
                    txtNewPass.setEnabled(true);
                    tbtSaveEd.setEnabled(true);
                    jComboBox2.setEnabled(true);
                } else if (ProfType == 2) {
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel2), false);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel3), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel4), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel5), true);
                    MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel6), true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Usuario no válido!");
            }
        } catch (FileNotFoundException ex) {
        }
    }//GEN-LAST:event_tbtLogActionPerformed

    private void tbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtBuscarActionPerformed
        try {
            us = new Usuario();
            us.setId(Integer.parseInt(txtValID.getText()));
            us = file_us.Search_User(us);
            txtID.setText(String.valueOf(us.getId()));
            txtName.setText(String.valueOf(us.getName()));
            txtSecName.setText(String.valueOf(us.getSecName()));
            txtTel.setText(String.valueOf(us.getPhone()));
            txtNewUser.setText(String.valueOf(us.getUsername()));
            txtAddr.setText(String.valueOf(us.getAddress()));
            txtNewPass.setText(String.valueOf(us.getPassword()));
            jTextField1.setText(String.valueOf(us.getEstado()));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_tbtBuscarActionPerformed

    private void tbtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNewActionPerformed
        try {
            txtID.setText(String.valueOf(file_us.getUser_Id()));
            txtName.setText("");
            txtSecName.setText("");
            txtTel.setText("");
            txtNewUser.setText("");
            txtNewPass.setText("");
            txtAddr.setText("");
            jTextField1.setText("");
        } catch (FileNotFoundException ex) {
        }
    }//GEN-LAST:event_tbtNewActionPerformed

    private void tbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEditActionPerformed
        txtName.setText("");
        txtSecName.setText("");
        txtTel.setText("");
        txtNewUser.setText("");
        txtNewPass.setText("");
        txtAddr.setText("");
        jTextField1.setText("");
        JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!\n¡Y seleccione: Salvar edición!");
    }//GEN-LAST:event_tbtEditActionPerformed

    private void tbtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveActionPerformed
        try {
            us = new Usuario();
            us.setId(Integer.parseInt(txtID.getText()));
            us.setName(txtName.getText());
            us.setSecName(txtSecName.getText());
            us.setPhone(txtTel.getText());
            us.setAddress(txtAddr.getText());
            us.setUsername(txtNewUser.getText());
            us.setPassword(txtNewPass.getText());
            String aux = (String) jComboBox2.getSelectedItem();
            us.setPerfil(aux);
            us.setEstado("Activo");
            file_us.Save_User(us);
            MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel1), true);
            txtUser.setEnabled(true);
            txtPass.setEnabled(true);
            tbtLog.setEnabled(true);
            jButton2.setEnabled(true);
            JOptionPane.showMessageDialog(this, "¡Guardado!");
            
            if (us.getId() == 1) {
                tbtBuscar.setEnabled(false);
                tbtSave.setEnabled(false);
                tbtCancel.setEnabled(false);
                tbtNew.setEnabled(false);
                tbtEdit.setEnabled(false);
                tbtRemove.setEnabled(false);
                txtValID.setEnabled(false);
                txtName.setEnabled(false);
                txtSecName.setEnabled(false);
                txtTel.setEnabled(false);
                txtNewUser.setEnabled(false);
                txtAddr.setEnabled(false);
                txtNewPass.setEnabled(false);
                tbtSaveEd.setEnabled(false);
                jComboBox2.setEnabled(false);
                MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel2), false);
                MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel3), false);
                MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel4), false);
                MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel5), false);
                MenPane.setEnabledAt(MenPane.indexOfComponent(jPanel6), false);
                txtID.setText("");
                txtName.setText("");
                txtSecName.setText("");
                txtTel.setText("");
                txtNewUser.setText("");
                txtNewPass.setText("");
                txtAddr.setText("");
                jTextField1.setText("");
                JOptionPane.showMessageDialog(this, "¡Inicie sesión para continuar!");
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_tbtSaveActionPerformed

    private void tbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtRemoveActionPerformed
        us = new Usuario();
        us.setId(Integer.parseInt(txtValID.getText()));
        us.setName(txtName.getText());
        us.setSecName(txtSecName.getText());
        us.setPhone(txtTel.getText());
        us.setAddress(txtAddr.getText());
        us.setUsername(txtNewUser.getText());
        us.setPassword(txtNewPass.getText());
        us.setEstado("Activo");
        String aux = (String) jComboBox2.getSelectedItem();
        us.setPerfil(aux);
        file_us.Eliminar(us.getId());
        txtID.setText("");
        txtName.setText("");
        txtSecName.setText("");
        txtTel.setText("");
        txtNewUser.setText("");
        txtNewPass.setText("");
        txtAddr.setText("");
        jTextField1.setText("");
        JOptionPane.showMessageDialog(this, "¡Regoistro ahora inactivo!");
    }//GEN-LAST:event_tbtRemoveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancelActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtSecName.setText("");
        txtTel.setText("");
        txtNewUser.setText("");
        txtAddr.setText("");
        txtNewPass.setText("");
    }//GEN-LAST:event_tbtCancelActionPerformed

    private void tbtSaveEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdActionPerformed
        us = new Usuario();
        us.setId(Integer.parseInt(txtValID.getText()));
        us.setName(txtName.getText());
        us.setSecName(txtSecName.getText());
        us.setPhone(txtTel.getText());
        us.setAddress(txtAddr.getText());
        us.setUsername(txtNewUser.getText());
        us.setPassword(txtNewPass.getText());
        us.setEstado("Activo");
        String aux = (String) jComboBox2.getSelectedItem();
        us.setPerfil(aux);
        file_us.Modificar(us.getId(), us.getName(), us.getSecName(), us.getAddress(), us.getPhone(), us.getUsername(), us.getPassword(), us.getPerfil(), us.getEstado());
        JOptionPane.showMessageDialog(this, "¡Regoistro editado!");
    }//GEN-LAST:event_tbtSaveEdActionPerformed

    private void tbtNew_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNew_ClientActionPerformed
        try {
            txtID_Client.setText(String.valueOf(file_cl.get_IdC()));
            txtName_Client.setText("");
            txtSecName_Client.setText("");
            txtSit_Client.setText("");
        } catch (FileNotFoundException ex) {
        }
    }//GEN-LAST:event_tbtNew_ClientActionPerformed

    private void tbtEdit_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEdit_ClientActionPerformed
        txtID_Client.setText("");
        txtName_Client.setText("");
        txtSecName_Client.setText("");
        txtSit_Client.setText("");
        txtNewPass.setText("");
        txtSit_Client.setText("");
        JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!\n¡Y seleccione: Salvar edición!");
    }//GEN-LAST:event_tbtEdit_ClientActionPerformed

    private void tbtSaveEdit_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdit_ClientActionPerformed
        
        cl = new Cliente();
        cl.setId(Integer.parseInt(txtSearch_Client.getText()));
        cl.setName(txtName_Client.getText());
        cl.setSecName(txtSecName_Client.getText());
        cl.setEstado("Activo");
        String aux = (String) JComboClient.getSelectedItem();
        cl.setUsuario_R(aux);
        file_cl.Modificar_Cl(cl.getId(), cl.getName(), cl.getSecName(), cl.getEstado(), cl.getUsuario_R());
        JOptionPane.showMessageDialog(this, "¡Regoistro editado!");
    }//GEN-LAST:event_tbtSaveEdit_ClientActionPerformed

    private void tbtSave_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSave_ClientActionPerformed
        try {
            cl = new Cliente();
            cl.setId(Integer.parseInt(txtID_Client.getText()));
            cl.setName(txtName_Client.getText());
            cl.setSecName(txtSecName_Client.getText());
            cl.setEstado("Activo");
            String aux = (String) JComboClient.getSelectedItem();
            cl.setUsuario_R(aux);
            file_cl.Save_Client(cl);
            JOptionPane.showMessageDialog(this, "¡Guardado!");
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSave_ClientActionPerformed

    private void tbtCancel_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancel_ClientActionPerformed
        txtID_Client.setText("");
        txtName_Client.setText("");
        txtSecName_Client.setText("");
        txtSit_Client.setText("");
    }//GEN-LAST:event_tbtCancel_ClientActionPerformed

    private void tbtDelete_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtDelete_ClientActionPerformed
        cl = new Cliente();
        cl.setId(Integer.parseInt(txtSearch_Client.getText()));
        cl.setName(txtName_Client.getText());
        cl.setSecName(txtSecName_Client.getText());
        cl.setEstado("Activo");
        String aux = (String) JComboClient.getSelectedItem();
        cl.setUsuario_R(aux);
        file_cl.Eliminar_Cl(cl.getId());
        txtID_Client.setText("");
        txtName_Client.setText("");
        txtSecName_Client.setText("");
        txtSit_Client.setText("");
        txtNewPass.setText("");
        txtSit_Client.setText("");
        JOptionPane.showMessageDialog(this, "¡Regoistro ahora inactivo!");
    }//GEN-LAST:event_tbtDelete_ClientActionPerformed

    private void tbtSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSearchClientActionPerformed
        try {
            cl = new Cliente();
            cl.setId(Integer.parseInt(txtSearch_Client.getText()));
            cl = file_cl.Search_Cl(cl);
            txtID_Client.setText(String.valueOf(cl.getId()));
            txtName_Client.setText(String.valueOf(cl.getName()));
            txtSecName_Client.setText(String.valueOf(cl.getSecName()));
            txtSit_Client.setText(String.valueOf(cl.getEstado()));
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSearchClientActionPerformed

    private void tbtSearchVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSearchVActionPerformed
        try {
            ve = new Vehículo();
            ve.setID(Integer.parseInt(txtValV.getText()));
            ve = file_ve.Search_V(ve);
            txtID_V.setText(String.valueOf(ve.getID()));
            txtMatr.setText(ve.getMatrícula());
            txtMarcaV.setText(ve.getMarca());
            txtModel.setText(ve.getModelo());
            txtEstV.setText(ve.getEstado());
            txtDate.setText(ve.getFecha());
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSearchVActionPerformed

    private void tbtEdit_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEdit_VActionPerformed
            txtID_V.setText(" ");
            txtMatr.setText(" ");
            txtMatr.setText(" ");
            txtMarcaV.setText(" ");
            txtModel.setText(" ");
            txtEstV.setText(" ");
            txtDate.setText(" ");
            JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!\n¡Y seleccione: Salvar edición!");
    }//GEN-LAST:event_tbtEdit_VActionPerformed

    private void tbtDelete_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtDelete_VActionPerformed
        ve = new Vehículo();
        ve.setID(Integer.parseInt(txtValV.getText()));
        String aux = (String) jComboV.getSelectedItem();
        ve.setCliente(aux);
        ve.setMatrícula(txtMatr.getText());
        ve.setMarca(txtMarcaV.getText());
        ve.setModelo(txtModel.getText());
        ve.setEstado("Activo");
        ve.setFecha(txtDate.getText());
        file_ve.Delete_V(ve.getID());
        txtID_V.setText(" ");
        txtMatr.setText(" ");
        txtMatr.setText(" ");
        txtMarcaV.setText(" ");
        txtModel.setText(" ");
        txtEstV.setText(" ");
        txtDate.setText(" ");
        JOptionPane.showMessageDialog(this, "¡Regoistro ahora inactivo!");
    }//GEN-LAST:event_tbtDelete_VActionPerformed

    private void tbtNew_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNew_VActionPerformed
        try {
            txtID_V.setText(String.valueOf(file_ve.get_IdV()));
            txtMatr.setText("");
            txtMarcaV.setText("");
            txtModel.setText("");
            txtEstV.setText("");
            txtDate.setText("");
        } catch (FileNotFoundException ex) {}
    }//GEN-LAST:event_tbtNew_VActionPerformed

    private void tbtSave_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSave_VActionPerformed
        try {
            ve = new Vehículo();
            ve.setID(Integer.parseInt(txtID_V.getText()));
            ve.setMatrícula(txtMatr.getText());
            ve.setMarca(txtMatr.getText());
            ve.setMarca(txtMarcaV.getText());
            ve.setModelo(txtModel.getText());
            ve.setEstado("Activo");
            String aux = (String) jComboV.getSelectedItem();
            ve.setCliente(aux);
            ve.setFecha(txtDate.getText());
            file_ve.Save_Vehilce(ve);
            JOptionPane.showMessageDialog(this, "¡Guardado!");
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSave_VActionPerformed

    private void tbtCancel_Client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancel_Client1ActionPerformed
            txtID_V.setText(" ");
            txtMatr.setText(" ");
            txtMarcaV.setText(" ");
            txtModel.setText(" ");
            txtEstV.setText(" ");
            txtDate.setText(" ");
    }//GEN-LAST:event_tbtCancel_Client1ActionPerformed

    private void tbtSaveEdit_Client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdit_Client1ActionPerformed
        ve = new Vehículo();
        ve.setID(Integer.parseInt(txtValV.getText()));
        String aux = (String) jComboV.getSelectedItem();
        ve.setCliente(aux);
        ve.setMatrícula(txtMatr.getText());
        ve.setMarca(txtMarcaV.getText());
        ve.setModelo(txtModel.getText());
        ve.setEstado("Activo");
        ve.setFecha(txtDate.getText());
        file_ve.Modificar_V(ve.getID(), ve.getCliente(), ve.getMatrícula(), ve.getMarca(), ve.getModelo(), ve.getEstado(), ve.getFecha());
        JOptionPane.showMessageDialog(this, "¡Regoistro editado!");
    }//GEN-LAST:event_tbtSaveEdit_Client1ActionPerformed

    private void tbtSearchR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSearchR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtSearchR1ActionPerformed

    private void tbtEdit_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEdit_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtEdit_R1ActionPerformed

    private void tbtDelete_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtDelete_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtDelete_R1ActionPerformed

    private void tbtSave_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSave_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtSave_R1ActionPerformed

    private void tbtNew_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNew_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtNew_R1ActionPerformed

    private void tbtCancel_Client3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancel_Client3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtCancel_Client3ActionPerformed

    private void tbtSaveEdit_Client3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdit_Client3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtSaveEdit_Client3ActionPerformed

    private void tbtSearch_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSearch_PActionPerformed
        try {
            pz = new Pieza();
            pz.setID(Integer.parseInt(txtSearch_Pieza.getText()));
            pz = file_pi.Search_Piece(pz);
            txtID_Pieza.setText(String.valueOf(pz.getID()));
            txtSearch_Pieza.setText("");
            txtStock.setText(String.valueOf(pz.getStock()));
            txaDescrip.setText(pz.getDescr());
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSearch_PActionPerformed

    private void tbtNew_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNew_PActionPerformed
        try {
            txtID_Pieza.setText(String.valueOf(file_pi.getPiece_Id()));
            txtSearch_Pieza.setText("");
            txtStock.setText("");
            txtStock.setEnabled(true);
            txaDescrip.setText("");
        } catch (FileNotFoundException ex) {}
    }//GEN-LAST:event_tbtNew_PActionPerformed

    private void tbtEdit_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEdit_PActionPerformed
        txtID_Pieza.setText("");
        txtStock.setText("");
        txaDescrip.setText("");
        txtStock.setEnabled(true);
        JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!\n¡Y seleccione: Salvar edición!");
    }//GEN-LAST:event_tbtEdit_PActionPerformed

    private void tbtSaveEdit_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdit_PActionPerformed
        pz = new Pieza();
        pz.setID(Integer.parseInt(txtSearch_Pieza.getText()));
        pz.setStock(Integer.parseInt(txtStock.getText()));
        pz.setDescr(txaDescrip.getText());
        file_pi.Modificar(pz.getID(), pz.getStock(), pz.getDescr());
        txtStock.setEnabled(false);
        txtID_Pieza.setText("");
        txtSearch_Pieza.setText("");
        txtStock.setText("");
        txaDescrip.setText("");
        JOptionPane.showMessageDialog(this, "¡Regoistro editado!");
    }//GEN-LAST:event_tbtSaveEdit_PActionPerformed

    private void tbtSave_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSave_PActionPerformed
        try {
            pz = new Pieza();
            pz.setID(Integer.parseInt(txtID_Pieza.getText()));
            pz.setStock(Integer.parseInt(txtStock.getText()));
            pz.setDescr(txaDescrip.getText());
            file_pi.Save_Piece(pz);
            txtStock.setEnabled(false);
            txtID_Pieza.setText("");
            txtSearch_Pieza.setText("");
            txtStock.setText("");
            txaDescrip.setText("");
            JOptionPane.showMessageDialog(this, "¡Guardado!");
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSave_PActionPerformed

    private void tbtCancel_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancel_PActionPerformed
            txtID_Pieza.setText("");
            txtSearch_Pieza.setText("");
            txtStock.setText("");
            txaDescrip.setText("");
    }//GEN-LAST:event_tbtCancel_PActionPerformed

    private void tbtDelete_Client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtDelete_Client1ActionPerformed
        pz = new Pieza();
        pz.setID(Integer.parseInt(txtSearch_Pieza.getText()));
        file_pi.Eliminar(pz.getID());
        txtStock.setEnabled(false);
        txtID_Pieza.setText("");
        txtSearch_Pieza.setText("");
        txtStock.setText("");
        txaDescrip.setText("");
        JOptionPane.showMessageDialog(this, "¡Regoistro ahora vacío en stock!");
    }//GEN-LAST:event_tbtDelete_Client1ActionPerformed

    private void txtID_PiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_PiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_PiezaActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void tbtSaveEdit_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSaveEdit_RActionPerformed
        re = new Reparación();
        re.setID_R(Integer.parseInt(txtValR.getText()));
        re.setFalla(txtFalla.getText());
        String aux = (String) jComboR_V.getSelectedItem();
        re.setIDV_R(Integer.parseInt(aux));
        re.setDate_In(txtDateIn_R.getText());
        re.setDate_Out(txtDateOut_R.getText());
        String aux1 = (String) jComboR_P.getSelectedItem();
        re.setIDP_R(Integer.parseInt(aux1));
        re.setEstado("Activo");
        file_re.Modificar_R(re.getID_R(), re.getIDV_R(), re.getIDP_R(), re.getDate_In(), re.getDate_Out(), re.getFalla(), re.getEstado());
        file_pi.Descontar(Integer.parseInt(aux1));
        JOptionPane.showMessageDialog(this, "¡Regoistro editado!");
    }//GEN-LAST:event_tbtSaveEdit_RActionPerformed

    private void tbtCancel_Client2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtCancel_Client2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtCancel_Client2ActionPerformed

    private void tbtNew_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtNew_RActionPerformed
        try {
            txtID_R.setText(String.valueOf(file_re.get_IdR()));
            txtFalla.setText("");
            txtID_RV.setText("");
            txtDateIn_R.setText("");
            txtDateOut_R.setText("");
            txtID_P.setText("");
            txtEstR.setText("");
        } catch (FileNotFoundException ex) {}
    }//GEN-LAST:event_tbtNew_RActionPerformed

    private void tbtSave_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSave_RActionPerformed
         try {
            re = new Reparación();
            re.setID_R(Integer.parseInt(txtID_R.getText()));
            re.setFalla(txtFalla.getText());
            String aux = (String) jComboR_V.getSelectedItem();
            re.setIDV_R(Integer.parseInt(aux));
            re.setDate_In(txtDateIn_R.getText());
            re.setDate_Out(txtDateOut_R.getText());
            String aux1 = (String) jComboR_P.getSelectedItem();
            re.setIDP_R(Integer.parseInt(aux1));
            re.setEstado("Activo");
            file_re.Save_Rep(re);
            file_pi.Descontar(Integer.parseInt(aux1));
            JOptionPane.showMessageDialog(this, "¡Guardado!");
            txtID_R.setText("");
            txtFalla.setText("");
            txtID_RV.setText("");
            txtDateIn_R.setText("");
            txtDateOut_R.setText("");
            txtID_P.setText("");
            txtEstR.setText("");
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSave_RActionPerformed

    private void tbtDelete_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtDelete_RActionPerformed
        re = new Reparación();
        re.setID_R(Integer.parseInt(txtID_R.getText()));
        file_re.Eliminar_R(re.getID_R());
        txtFalla.setText("");
        txtID_RV.setText("");
        txtDateIn_R.setText("");
        txtDateOut_R.setText("");
        txtID_P.setText("");
        txtEstR.setText("");
        JOptionPane.showMessageDialog(this, "¡Regoistro ahora inactivo!");
    }//GEN-LAST:event_tbtDelete_RActionPerformed

    private void tbtEdit_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEdit_RActionPerformed
            txtID_R.setText("");
            txtFalla.setText("");
            txtID_RV.setText("");
            txtDateIn_R.setText("");
            txtDateOut_R.setText("");
            txtID_P.setText("");
            txtEstR.setText("");
            JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!\n¡Y seleccione: Salvar edición!");
    }//GEN-LAST:event_tbtEdit_RActionPerformed

    private void tbtSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSearchRActionPerformed
        try {
            re = new Reparación();
            re.setID_R(Integer.parseInt(txtValR.getText()));
            re = file_re.Search_R(re);
            txtID_R.setText(String.valueOf(re.getID_R()));
            txtFalla.setText(re.getFalla());
            txtID_RV.setText(String.valueOf(re.getIDV_R()));
            txtDateIn_R.setText(re.getDate_In());
            txtDateOut_R.setText(re.getDate_Out());
            txtID_P.setText(String.valueOf(re.getIDP_R()));
            txtEstR.setText(re.getEstado());
        } catch (IOException ex) {}
    }//GEN-LAST:event_tbtSearchRActionPerformed

    private void jComboVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboClient;
    private javax.swing.JLabel M;
    private javax.swing.JLabel M1;
    private javax.swing.JLabel M2;
    private javax.swing.JTabbedPane MenPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboR_P;
    private javax.swing.JComboBox<String> jComboR_P1;
    private javax.swing.JComboBox<String> jComboR_V;
    private javax.swing.JComboBox<String> jComboR_V1;
    private javax.swing.JComboBox<String> jComboV;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tbtBuscar;
    private javax.swing.JButton tbtCancel;
    private javax.swing.JButton tbtCancel_Client;
    private javax.swing.JButton tbtCancel_Client1;
    private javax.swing.JButton tbtCancel_Client2;
    private javax.swing.JButton tbtCancel_Client3;
    private javax.swing.JButton tbtCancel_P;
    private javax.swing.JButton tbtDelete_Client;
    private javax.swing.JButton tbtDelete_Client1;
    private javax.swing.JButton tbtDelete_R;
    private javax.swing.JButton tbtDelete_R1;
    private javax.swing.JButton tbtDelete_V;
    private javax.swing.JButton tbtEdit;
    private javax.swing.JButton tbtEdit_Client;
    private javax.swing.JButton tbtEdit_P;
    private javax.swing.JButton tbtEdit_R;
    private javax.swing.JButton tbtEdit_R1;
    private javax.swing.JButton tbtEdit_V;
    private javax.swing.JButton tbtLog;
    private javax.swing.JButton tbtNew;
    private javax.swing.JButton tbtNew_Client;
    private javax.swing.JButton tbtNew_P;
    private javax.swing.JButton tbtNew_R;
    private javax.swing.JButton tbtNew_R1;
    private javax.swing.JButton tbtNew_V;
    private javax.swing.JButton tbtRemove;
    private javax.swing.JButton tbtSave;
    private javax.swing.JButton tbtSaveEd;
    private javax.swing.JButton tbtSaveEdit_Client;
    private javax.swing.JButton tbtSaveEdit_Client1;
    private javax.swing.JButton tbtSaveEdit_Client3;
    private javax.swing.JButton tbtSaveEdit_P;
    private javax.swing.JButton tbtSaveEdit_R;
    private javax.swing.JButton tbtSave_Client;
    private javax.swing.JButton tbtSave_P;
    private javax.swing.JButton tbtSave_R;
    private javax.swing.JButton tbtSave_R1;
    private javax.swing.JButton tbtSave_V;
    private javax.swing.JButton tbtSearchClient;
    private javax.swing.JButton tbtSearchR;
    private javax.swing.JButton tbtSearchR1;
    private javax.swing.JButton tbtSearchV;
    private javax.swing.JButton tbtSearch_P;
    private javax.swing.JTextArea txaDescrip;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDateIn_R;
    private javax.swing.JTextField txtDateIn_R1;
    private javax.swing.JTextField txtDateOut_R;
    private javax.swing.JTextField txtDateOut_R1;
    private javax.swing.JTextField txtEstR;
    private javax.swing.JTextField txtEstR1;
    private javax.swing.JTextField txtEstV;
    private javax.swing.JTextField txtFalla;
    private javax.swing.JTextField txtFalla1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID_Client;
    private javax.swing.JTextField txtID_P;
    private javax.swing.JTextField txtID_P1;
    private javax.swing.JTextField txtID_Pieza;
    private javax.swing.JTextField txtID_R;
    private javax.swing.JTextField txtID_R1;
    private javax.swing.JTextField txtID_RV;
    private javax.swing.JTextField txtID_RV1;
    private javax.swing.JTextField txtID_V;
    private javax.swing.JTextField txtMarcaV;
    private javax.swing.JTextField txtMatr;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName_Client;
    private javax.swing.JTextField txtNewPass;
    private javax.swing.JTextField txtNewUser;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSearch_Client;
    private javax.swing.JTextField txtSearch_Pieza;
    private javax.swing.JTextField txtSecName;
    private javax.swing.JTextField txtSecName_Client;
    private javax.swing.JTextField txtSit_Client;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtValID;
    private javax.swing.JTextField txtValR;
    private javax.swing.JTextField txtValR1;
    private javax.swing.JTextField txtValV;
    private javax.swing.JTextField txtcant_piezas1;
    // End of variables declaration//GEN-END:variables
}
