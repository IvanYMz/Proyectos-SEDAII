package com.mycompany.hotel;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan_
 */
public class Men_Hotel extends javax.swing.JFrame {

    Clientes_File cf;
    Clientes cl;
    Habitaciones_File h;
    Reservaciones_File r;
    Reservaciones re;
    ArrayList<Habitaciones> LH;

    public Men_Hotel() {
        initComponents();
        cf = new Clientes_File();
        h = new Habitaciones_File();
        r = new Reservaciones_File();
        LH = new ArrayList<>();
        btSaveEdit.setVisible(false);
        ActualizarH();
        ActualizarC();
    }

    private Clientes Search(int i) {
        cf = new Clientes_File();
        cl = new Clientes();
        int search = 0;

        cl.setIDU(i);

        try {
            search = cf.Search_Client(cl.getIDU());
        } catch (IOException ex) {
        }
        if (search == -1) {
            return null;
        }
        try {
            cl = cf.getCl(search);
        } catch (IOException ex) {
        }

        if (cl.getESU().equals("Inactivo")) {
            return null;
        }

        return cl;
    }

    private Reservaciones SearchRe(int i) {
        r = new Reservaciones_File();
        re = new Reservaciones();
        int search = 0;

        re.setIDR(i);

        try {
            search = r.Search_RE(re.getIDR());
        } catch (IOException ex) {
        }
        if (search == -1) {
            return null;
        }
        try {
            re = r.getRE(search);
        } catch (IOException ex) {
        }

        if (re.getER().equals("Cancelada")) {
            return null;
        }

        return re;
    }

    private void ActualizarH() {
        if (comboHa.getItemCount() != 0) {
            comboHa.removeAllItems();
        }
        Habitaciones ha = new Habitaciones();
        try {
            try {
                LH = h.Search();
                for (int i = 0; i < LH.size(); i++) {
                    if (LH.get(i).getEH().equals("Disponible")) {
                        ha.setNH(LH.get(i).getNH());
                        ha.setEH(LH.get(i).getEH());
                        comboHa.addItem(String.valueOf(ha.getNH()));
                    } else {
                        if (comboHa.getItemAt(i) != null) {
                            comboHa.removeItemAt(i);
                        }
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }

    private void ActualizarC() {
        if (comboC.getItemCount() != 0) {
            comboC.removeAllItems();
        }
        cf = new Clientes_File();
        cl = new Clientes();
        int search = 0, c = 0;
        try {
            if (cf.get_ClCount() == 0) {
                return;
            } else {
                c = cf.get_ClCount();
            }
            for (int i = 0; i < c; i++) {
                search = cf.Search_Client(i + 1);
                cl = cf.getCl(search);
                if (cl.getESU().equals("Activo")) {
                    comboC.addItem(String.valueOf(cl.getIDU()));
                } else {
                    if (comboC.getItemAt(i) != null) {
                        comboC.removeItemAt(i);
                    }
                }
            }
        } catch (IOException ex) {
        }
    }

    private void Cliente_Reservación(int id) {
        re = new Reservaciones();
        r = new Reservaciones_File();
        cl = new Clientes();
        cf = new Clientes_File();
        int search = 0, searchC = 0, c = 0;
        try {
            searchC = cf.Search_Client(id);
            cl = cf.getCl(searchC);
            if (r.get_ReCount() == 0) {
                return;
            } else {
                c = r.get_ReCount();
            }
            for (int i = 0; i < c; i++) {
                search = r.Search_RE(i + 1);
                re = r.getRE(search);
                if (cl.getIDU() == id) {
                    r.Delete_RE(i + 1);
                    int ha = re.getIDH();
                    Ed_H(ha, ha, "Disponible");
                }
            }
        } catch (IOException ex) {
        }
    }

    private void Ed_H(int id, int nid, String ne) {
        boolean band = false;
        h = new Habitaciones_File();
        try {
            LH = h.Search();
        } catch (IOException | ClassNotFoundException ex) {}
        for (int i = 0; i < LH.size(); i++) {
            if (LH.get(i).getNH() == id) {
                if(id == nid){
                    LH.get(i).setNH(nid);
                    LH.get(i).setEH(ne);
                    band = true;
                } else {
                    JOptionPane.showMessageDialog(this, "¡Ya hay otra habitación con ese número!");
                    return;
                }
            }
        }
        if (band == true) {
            try {
                h.Add_H(LH);
                ActualizarH();
                txIDH.setText("");
                txNH.setText("");
            } catch (IOException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No se encontró la habitación que se desea editar!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txIDN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txDirección = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txTel = new javax.swing.JTextField();
        btNew = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btSaveEdit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btSaveEditR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txFR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txIR = new javax.swing.JTextField();
        btNewR = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txIDR = new javax.swing.JTextField();
        btSearchR = new javax.swing.JButton();
        btEditR = new javax.swing.JButton();
        btRemoveR = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btSaveR = new javax.swing.JButton();
        txNIDR = new javax.swing.JTextField();
        btCancelR = new javax.swing.JButton();
        txHR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txCR = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        comboC = new javax.swing.JComboBox<>();
        comboHa = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txIDH = new javax.swing.JTextField();
        btSearchH = new javax.swing.JButton();
        btEditH = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txNH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btCancelH = new javax.swing.JButton();
        comboH = new javax.swing.JComboBox<>();
        btSaveH = new javax.swing.JButton();
        btSaveEH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID del cliente: ");

        btSearch.setText("Buscar");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btEdit.setText("Editar");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btRemove.setText("Eliminar");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        jLabel2.setText("ID: ");

        txIDN.setEnabled(false);

        jLabel3.setText("Nombre:");

        txNombre.setEnabled(false);

        jLabel4.setText("Dirección:");

        txDirección.setEnabled(false);

        jLabel5.setText("Correo:");

        txCorreo.setEnabled(false);

        jLabel6.setText("Teléfono:");

        txTel.setEnabled(false);

        btNew.setText("Nuevo");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSave.setText("Guardar");
        btSave.setEnabled(false);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btSaveEdit.setText("Guardar edición");
        btSaveEdit.setEnabled(false);
        btSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRemove)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDirección, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btNew)
                                .addGap(30, 30, 30)))))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSaveEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch)
                    .addComponent(btRemove)
                    .addComponent(btEdit))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txIDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew)
                    .addComponent(btSaveEdit))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jLabel10.setText("ID del cliente:");

        btSaveEditR.setText("Guardar edición");
        btSaveEditR.setEnabled(false);
        btSaveEditR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveEditRActionPerformed(evt);
            }
        });

        jLabel11.setText("ID de la habitación:");

        jLabel12.setText("Fin de la reservación:");

        txFR.setEnabled(false);

        jLabel13.setText("Inicio de la reservación:");

        txIR.setEnabled(false);

        btNewR.setText("Nuevo");
        btNewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewRActionPerformed(evt);
            }
        });

        jLabel14.setText("Reservación:");

        btSearchR.setText("Buscar");
        btSearchR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchRActionPerformed(evt);
            }
        });

        btEditR.setText("Editar");
        btEditR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditRActionPerformed(evt);
            }
        });

        btRemoveR.setText("Eliminar");
        btRemoveR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveRActionPerformed(evt);
            }
        });

        jLabel15.setText("ID de la reservación: ");

        btSaveR.setText("Guardar");
        btSaveR.setEnabled(false);
        btSaveR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveRActionPerformed(evt);
            }
        });

        txNIDR.setEnabled(false);

        btCancelR.setText("Cancelar");
        btCancelR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelRActionPerformed(evt);
            }
        });

        txHR.setEnabled(false);

        jLabel16.setText("Costo:");

        txCR.setEnabled(false);

        jLabel17.setText("Hora de la reservación:");

        comboC.setEnabled(false);
        comboC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCActionPerformed(evt);
            }
        });

        comboHa.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSearchR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoveR))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txNIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboHa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txCR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txIR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txHR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txFR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btNewR)
                                .addGap(159, 159, 159)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btSaveR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btCancelR))
                                    .addComponent(btSaveEditR))))
                        .addGap(218, 218, 218)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txIDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearchR)
                    .addComponent(btRemoveR)
                    .addComponent(btEditR))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txNIDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(txHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaveR)
                    .addComponent(btCancelR))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btSaveEditR))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btNewR)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reservaciones", jPanel2);

        jLabel7.setText("ID/Número:");

        btSearchH.setText("Buscar");
        btSearchH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchHActionPerformed(evt);
            }
        });

        btEditH.setText("Editar");
        btEditH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditHActionPerformed(evt);
            }
        });

        jLabel8.setText("ID/Número de la habitación:");

        jLabel9.setText("Estado de la habitación");

        btCancelH.setText("Cancelar");
        btCancelH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelHActionPerformed(evt);
            }
        });

        comboH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Reservada" }));

        btSaveH.setText("Guardar");
        btSaveH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveHActionPerformed(evt);
            }
        });

        btSaveEH.setText("Guardar edición");
        btSaveEH.setEnabled(false);
        btSaveEH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveEHActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar al archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btSaveH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelH))
                    .addComponent(btSaveEH)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txNH, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(txIDH))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btSearchH)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btEditH))))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearchH)
                    .addComponent(btEditH))
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaveH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSaveEH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Habitaciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        try {
            cf = new Clientes_File();
            txIDN.setText(String.valueOf(cf.get_IdC()));
            txNombre.setEnabled(true);
            txDirección.setEnabled(true);
            txTel.setEnabled(true);
            txCorreo.setEnabled(true);
            btSave.setEnabled(true);
            btCancel.setEnabled(true);
            txID.setEnabled(false);
            btSearch.setEnabled(false);
            btEdit.setEnabled(false);
            btRemove.setEnabled(false);
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_btNewActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if (txIDN.getText().isEmpty() || txNombre.getText().isEmpty()
                || txDirección.getText().isEmpty() || txTel.getText().isEmpty()
                || txCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
            return;
        }
        try {
            cl = new Clientes();
            cl.setIDU(Integer.parseInt(txIDN.getText()));
            cl.setNU(txNombre.getText());
            cl.setDU(txDirección.getText());
            cl.setTU(txTel.getText());
            cl.setEU(txCorreo.getText());
            cl.setESU("Activo");
            if (cf.Add_C(cl)) {
                ActualizarC();
                JOptionPane.showMessageDialog(this, "¡Cliente registrado!");
                txNombre.setEnabled(false);
                txDirección.setEnabled(false);
                txTel.setEnabled(false);
                txCorreo.setEnabled(false);
                btSave.setEnabled(false);
                txIDN.setText("");
                txNombre.setText("");
                txDirección.setText("");
                txTel.setText("");
                txCorreo.setText("");
                txID.setEnabled(true);
                btSearch.setEnabled(true);
                btEdit.setEnabled(true);
                btRemove.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "¡Ocurrió un error, vuelva a intentarlo!");
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if (txID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        cl = new Clientes();

        try {
            if (Search(Integer.parseInt(txID.getText())) == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró el cliente o puede que este se encuentre inactivo!");
                return;
            }
            cl = Search(Integer.parseInt(txID.getText()));
            JOptionPane.showMessageDialog(this, "   - Cliente\nID: " + cl.getIDU() + "\nNombre: " + cl.getNU() + "\nDirección: " + cl.getDU()
                    + "\nTeléfono: " + cl.getTU() + "\nCorreo: " + cl.getEU() + "\nEstado: " + cl.getESU());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if (txID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        try {
            if (Search(Integer.parseInt(txID.getText())) == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró el cliente o puede que este se encuentre inactivo!");
                return;
            }

            cl = new Clientes();
            cl = Search(Integer.parseInt(txID.getText()));
            JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!");
            txIDN.setText(String.valueOf(cl.getIDU()));
            txNombre.setText(cl.getNU());
            txDirección.setText(cl.getDU());
            txTel.setText(cl.getTU());
            txCorreo.setText(cl.getEU());
            txNombre.setEnabled(true);
            txDirección.setEnabled(true);
            txTel.setEnabled(true);
            txCorreo.setEnabled(true);
            btSave.setEnabled(false);
            btSearch.setEnabled(false);
            btEdit.setEnabled(false);
            btRemove.setEnabled(false);
            btNew.setEnabled(false);
            btSaveEdit.setVisible(true);
            btSaveEdit.setEnabled(true);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        if (txID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        cf = new Clientes_File();

        try {
            if (cf.Delete_Client(Integer.parseInt(txID.getText()))) {
                JOptionPane.showMessageDialog(this, "¡Cliente eliminado!");
                Cliente_Reservación(Integer.parseInt(txID.getText()));
                ActualizarC();
                ActualizarH();
                txID.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "¡No se encontró el cliente o puede que este se encuentre inactivo!");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveEditActionPerformed
        if (txIDN.getText().isEmpty() || txNombre.getText().isEmpty()
                || txDirección.getText().isEmpty() || txTel.getText().isEmpty()
                || txCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
            return;
        }

        cl.setIDU(Integer.parseInt(txIDN.getText()));
        cl.setNU(txNombre.getText());
        cl.setDU(txDirección.getText());
        cl.setTU(txTel.getText());
        cl.setEU(txCorreo.getText());
        cl.setESU("Activo");

        try {
            if (cf.Edit_Cl(cl)) {
                ActualizarC();
                JOptionPane.showMessageDialog(this, "¡Cliente editado!");
                txNombre.setEnabled(false);
                txDirección.setEnabled(false);
                txTel.setEnabled(false);
                txCorreo.setEnabled(false);
                btSaveEdit.setVisible(false);
                btNew.setEnabled(true);
                btSearch.setEnabled(true);
                btEdit.setEnabled(true);
                btRemove.setEnabled(true);
                txIDN.setText("");
                txNombre.setText("");
                txDirección.setText("");
                txTel.setText("");
                txCorreo.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "¡Ocurrió un error, vuelva a intentarlo!");
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btSaveEditActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        txID.setText("");
        txIDN.setText("");
        txNombre.setText("");
        txDirección.setText("");
        txTel.setText("");
        txCorreo.setText("");
        txID.setEnabled(true);
        txIDN.setEnabled(false);
        txNombre.setEnabled(false);
        txDirección.setEnabled(false);
        txTel.setEnabled(false);
        txCorreo.setEnabled(false);
        btSave.setEnabled(false);
        btSearch.setEnabled(true);
        btEdit.setEnabled(true);
        btRemove.setEnabled(true);
        btNew.setEnabled(true);
        btSaveEdit.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveEditRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveEditRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSaveEditRActionPerformed

    private void btNewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewRActionPerformed
        if (comboC.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "¡No se encontraron usuarios activos!");
            return;
        }
        if (comboHa.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "¡No hay habitaciones disponibles!");
            return;
        }

        try {
            Reservaciones_File nr = new Reservaciones_File();
            txNIDR.setText(String.valueOf(nr.get_IdR()));
            comboC.setEnabled(true);
            comboHa.setEnabled(true);
            txCR.setEnabled(true);
            txIR.setEnabled(true);
            txHR.setEnabled(true);
            txFR.setEnabled(true);
            txIDR.setEnabled(false);
            btSearchR.setEnabled(false);
            btEditR.setEnabled(false);
            btRemoveR.setEnabled(false);
            btSaveR.setEnabled(true);
            btNew.setEnabled(false);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btNewRActionPerformed

    private void btSearchRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchRActionPerformed
        if (txIDR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        re = new Reservaciones();

        try {
            if (SearchRe(Integer.parseInt(txIDR.getText())) == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró la reservación o puede que esta haya sido cancelada!");
                return;
            }
            re = SearchRe(Integer.parseInt(txIDR.getText()));
            JOptionPane.showMessageDialog(this, "   - Reservación\nID: " + re.getIDR() + "\nID del cliente: " + re.getIDC() + "\nNúmero de habitación: " + re.getIDH()
                    + "\nCosto: " + re.getCR() + "\nInicio de la reservación: " + re.getInR() + "\nHora de la reservación: " + re.getHR()
                    + "\nFin de la reservación: " + re.getFinR());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }

    }//GEN-LAST:event_btSearchRActionPerformed

    private void btEditRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditRActionPerformed
        if (txIDR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        try {
            if (Search(Integer.parseInt(txIDR.getText())) == null) {
                JOptionPane.showMessageDialog(this, "¡No se encontró la reservación!");
                return;
            }

            re = new Reservaciones();
            re = SearchRe(Integer.parseInt(txIDR.getText()));
            JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!");
            txNIDR.setText(String.valueOf(re.getIDR()));
            txCR.setText(String.valueOf(re.getCR()));
            txIR.setText(re.getInR());
            txHR.setText(re.getHR());
            txFR.setText(re.getFinR());
            txCR.setEnabled(true);
            txIR.setEnabled(true);
            txHR.setEnabled(true);
            txFR.setEnabled(true);
            comboC.setEnabled(true);
            comboHa.setEnabled(true);
            btSaveR.setEnabled(false);
            btSearchR.setEnabled(false);
            btEditR.setEnabled(false);
            btRemoveR.setEnabled(false);
            btNewR.setEnabled(false);
            btSaveEditR.setVisible(true);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btEditRActionPerformed

    private void btRemoveRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveRActionPerformed
        if (txIDR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID!");
            return;
        }

        re = new Reservaciones();

        try {
            if (r.Delete_RE(Integer.parseInt(txIDR.getText()))) {
                JOptionPane.showMessageDialog(this, "¡Reservación cancelada!");
                int ha = Integer.parseInt(txIDR.getText());
                Ed_H(ha, ha, "Disponible");
                txIDR.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "¡No se encontró la reservación!");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btRemoveRActionPerformed

    private void btSaveRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveRActionPerformed
        if (txCR.getText().isEmpty() || txIR.getText().isEmpty() || txHR.getText().isEmpty() || txFR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Por favor, ingrese todos los datos!");
            return;
        }

        try {
            re = new Reservaciones();
            re.setIDR(Integer.parseInt(txNIDR.getText()));
            String temp = (String) comboC.getSelectedItem();
            int aux = Integer.parseInt(temp);
            String temp2 = (String) comboHa.getSelectedItem();
            int aux2 = Integer.parseInt(temp2);
            re.setIDC(aux);
            re.setIDH(aux2);
            re.setCR(Integer.parseInt(txCR.getText()));
            re.setInR(txIR.getText());
            re.setHR(txHR.getText());
            re.setFinR(txFR.getText());
            re.setER("Activa");
            if (r.Add_RE(re)) {
                JOptionPane.showMessageDialog(this, "¡Reservación exitosa!");
                int ha = re.getIDH();
                Ed_H(ha, ha, "Reservada");
                txNIDR.setText("");
                txCR.setText("");
                txIR.setText("");
                txHR.setText("");
                txFR.setText("");
                comboC.setEnabled(false);
                comboHa.setEnabled(false);
                txCR.setEnabled(false);
                txIR.setEnabled(false);
                txHR.setEnabled(false);
                txFR.setEnabled(false);
                txIDR.setEnabled(true);
                btSearchR.setEnabled(true);
                btEditR.setEnabled(true);
                btRemoveR.setEnabled(true);
                btSaveR.setEnabled(false);
                btNew.setEnabled(true);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btSaveRActionPerformed

    private void btCancelRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelRActionPerformed
        txNIDR.setText("");
        txCR.setText("");
        txIR.setText("");
        txHR.setText("");
        txFR.setText("");
        txIDR.setText("");
        comboC.setEnabled(false);
        comboHa.setEnabled(false);
        txCR.setEnabled(false);
        txIR.setEnabled(false);
        txHR.setEnabled(false);
        txFR.setEnabled(false);
        txIDR.setEnabled(true);
        btSearchR.setEnabled(true);
        btEditR.setEnabled(true);
        btRemoveR.setEnabled(true);
        btSaveR.setEnabled(false);
        btNew.setEnabled(true);
    }//GEN-LAST:event_btCancelRActionPerformed

    private void btSaveHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveHActionPerformed
        if (txNH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Por favor, ingrese un ID/Número de habitación!");
            return;
        }
        try {
            Habitaciones ha = new Habitaciones();
            ha.setNH(Integer.parseInt(txNH.getText()));
            String aux = (String) comboH.getSelectedItem();
            ha.setEH(aux);
            for (int i = 0; i < LH.size(); i++) {
                if (LH.get(i).getNH() == ha.getNH()) {
                    JOptionPane.showMessageDialog(this, "¡Ya hay una habitación con este número!");
                    return;
                }
            }
            LH.add(ha);
            JOptionPane.showMessageDialog(this, "¡Guardado!");
            txIDH.setText("");
            txNH.setText("");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btSaveHActionPerformed

    private void btSaveEHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveEHActionPerformed
        if (txIDH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID/Número de habitación!");
            return;
        }

        try {
            int id = Integer.parseInt(txIDH.getText());
            int nid = Integer.parseInt(txNH.getText());
            String ne = (String) comboH.getSelectedItem();
            Ed_H(id, nid, ne);
            JOptionPane.showMessageDialog(this, "¡Editado!");
            jButton1.setEnabled(true);
            txIDH.setEnabled(true);
            btSaveEH.setEnabled(false);
            btSearchH.setEnabled(true);
            btSaveH.setEnabled(true);
            btEditH.setEnabled(true);
            txIDH.setText("");
            txNH.setText("");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btSaveEHActionPerformed

    private void btSearchHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchHActionPerformed
        h = new Habitaciones_File();
        Habitaciones ha = new Habitaciones();
        if (txIDH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Primero ingrese un ID/Número de habitación!");
            return;
        }

        try {
            try {
                int id = Integer.parseInt(txIDH.getText());
                boolean band = false;
                LH = h.Search();
                for (int i = 0; i < LH.size(); i++) {
                    if (LH.get(i).getNH() == id) {
                        ha.setNH(LH.get(i).getNH());
                        ha.setEH(LH.get(i).getEH());
                        band = true;
                    }
                }
                if (band == true) {
                    JOptionPane.showMessageDialog(this, "Habitación " + ha.getNH() + ", estado: " + ha.getEH());
                } else {
                    JOptionPane.showMessageDialog(this, "¡La habitación no existe, o se encuentra reservada!");
                }
            } catch (IOException ex) {
            } catch (ClassNotFoundException ex) {
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
        }
    }//GEN-LAST:event_btSearchHActionPerformed

    private void btEditHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditHActionPerformed
        jButton1.setEnabled(false);
        txIDH.setEnabled(false);
        btSaveEH.setEnabled(true);
        btSearchH.setEnabled(false);
        btSaveH.setEnabled(false);
        btEditH.setEnabled(false);
    }//GEN-LAST:event_btEditHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (LH.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Aún no hay registros para cargar!");
            return;
        }
        try {
            h.Add_H(LH);
            ActualizarH();
            JOptionPane.showMessageDialog(this, "¡Guardado en archivo!");
            txIDH.setText("");
            txNH.setText("");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelHActionPerformed
        jButton1.setEnabled(true);
        txIDH.setEnabled(true);
        btSaveEH.setEnabled(false);
        btSearchH.setEnabled(true);
        btSaveH.setEnabled(true);
        btEditH.setEnabled(true);
        txIDH.setText("");
        txNH.setText("");
    }//GEN-LAST:event_btCancelHActionPerformed

    private void comboCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Men_Hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCancelH;
    private javax.swing.JButton btCancelR;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEditH;
    private javax.swing.JButton btEditR;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNewR;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btRemoveR;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSaveEH;
    private javax.swing.JButton btSaveEdit;
    private javax.swing.JButton btSaveEditR;
    private javax.swing.JButton btSaveH;
    private javax.swing.JButton btSaveR;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btSearchH;
    private javax.swing.JButton btSearchR;
    private javax.swing.JComboBox<String> comboC;
    private javax.swing.JComboBox<String> comboH;
    private javax.swing.JComboBox<String> comboHa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txCR;
    private javax.swing.JTextField txCorreo;
    private javax.swing.JTextField txDirección;
    private javax.swing.JTextField txFR;
    private javax.swing.JTextField txHR;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txIDH;
    private javax.swing.JTextField txIDN;
    private javax.swing.JTextField txIDR;
    private javax.swing.JTextField txIR;
    private javax.swing.JTextField txNH;
    private javax.swing.JTextField txNIDR;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txTel;
    // End of variables declaration//GEN-END:variables
}
