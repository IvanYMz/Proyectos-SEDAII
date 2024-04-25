package com.mycompany.tienda;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Menú_Admin extends javax.swing.JPanel {

    User_File usf;

    public Menú_Admin() {
        initComponents();
        usf = new User_File();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btUsSaveA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txUsIDA = new javax.swing.JTextField();
        txUsLastNameA = new javax.swing.JTextField();
        txUsNameA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txUsTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txUsAddrA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txUserNameA = new javax.swing.JTextField();
        txUserPassA = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txUserConfPassA = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txSearchUsA = new javax.swing.JTextField();
        btSearchUs = new javax.swing.JButton();
        btEditUs = new javax.swing.JButton();
        btDeleteUs = new javax.swing.JButton();
        btSaveEditUs = new javax.swing.JButton();
        btCancelUsA = new javax.swing.JButton();
        btNuevoA = new javax.swing.JButton();
        btRegresarA = new javax.swing.JButton();
        combTypeUsA = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(876, 468));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        btUsSaveA.setText("Guardar");
        btUsSaveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsSaveAActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre (s):");

        jLabel3.setText("Apellidos:");

        txUsIDA.setEditable(false);
        txUsIDA.setDragEnabled(true);
        txUsIDA.setEnabled(false);

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono:");

        jLabel6.setText("Nombre de Usuario:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Confirmar contraseña:");

        jLabel9.setText("Ingrese ID:");

        btSearchUs.setText("Buscar");
        btSearchUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchUsActionPerformed(evt);
            }
        });

        btEditUs.setText("Editar");
        btEditUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditUsActionPerformed(evt);
            }
        });

        btDeleteUs.setText("Eliminar");
        btDeleteUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteUsActionPerformed(evt);
            }
        });

        btSaveEditUs.setText("Guardar Edición");
        btSaveEditUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveEditUsActionPerformed(evt);
            }
        });

        btCancelUsA.setText("Cancelar");
        btCancelUsA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelUsAActionPerformed(evt);
            }
        });

        btNuevoA.setText("Nuevo");
        btNuevoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoAActionPerformed(evt);
            }
        });

        btRegresarA.setText("Regresar");
        btRegresarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarAActionPerformed(evt);
            }
        });

        combTypeUsA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vendedor", "Administrador" }));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ivan_\\OneDrive\\Pictures\\ADMIN.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txUsLastNameA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txSearchUsA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSearchUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDeleteUs))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txUsNameA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txUsTel)
                                .addComponent(txUsAddrA)
                                .addComponent(txUsIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(btUsSaveA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btSaveEditUs)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btCancelUsA))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txUserConfPassA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txUserPassA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txUserNameA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combTypeUsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btRegresarA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txSearchUsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditUs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteUs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearchUs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txUsIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(combTypeUsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txUsNameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txUsLastNameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txUsTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txUsAddrA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txUserNameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txUserPassA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txUserConfPassA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btSaveEditUs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btUsSaveA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCancelUsA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(8, 8, 8)
                .addComponent(btNuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRegresarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btUsSaveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsSaveAActionPerformed
        if(txUserNameA.getText().isEmpty() || txUsNameA.getText().isEmpty() || txUsLastNameA.getText().isEmpty() ||
          txUsTel.getText().isEmpty() || txUsAddrA.getText().isEmpty()  || txUserPassA.toString().isEmpty()){
          JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
          return;
       }
        Usuario us = new Usuario();
        try{
            us.setID(Integer.parseInt(txUsIDA.getText()));
            us.setName(txUsNameA.getText());
            us.setLastName(txUsLastNameA.getText());
            us.setNumber(txUsTel.getText());
            us.setAddres(txUsAddrA.getText());
            us.setUserName(txUserNameA.getText());
            char[] temp = txUserPassA.getPassword();
            String aux2 = String.valueOf(temp);
            us.setPass(aux2);
            String aux = (String) combTypeUsA.getSelectedItem();
            us.setTypeUser(aux);
            us.setStatus("Activo");
        } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");}
        if (Arrays.toString(txUserPassA.getPassword()).equals(Arrays.toString(txUserConfPassA.getPassword()))){
            try {
                usf.Add_C(us);
            } catch (IOException ex) {}
            int t = us.getTam();
            JOptionPane.showMessageDialog(this, "¡Usuario agregado!");
            Menú_Admin usm = new Menú_Admin();
            usm.setSize(1080, 536);
            usm.setLocation(0, 0);
            jPanel1.removeAll();
            jPanel1.add(usm, BorderLayout.CENTER);
            jPanel1.revalidate();
        } else{
            JOptionPane.showMessageDialog(this, "¡Las contraseñas no coinciden!");
        }
    }//GEN-LAST:event_btUsSaveAActionPerformed

    private void btDeleteUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteUsActionPerformed
        try {
            Usuario us = new Usuario();
            try{
                us.setID(Integer.parseInt(txSearchUsA.getText()));
            } catch(NumberFormatException nfe){}
            if (usf.Delete_User(us.getID())){
                JOptionPane.showMessageDialog(this, "¡Usuario Eliminado!");
                Menú_Admin usm = new Menú_Admin();
                usm.setSize(1080, 480);
                usm.setLocation(0, 0);
                jPanel1.removeAll();
                jPanel1.add(usm, BorderLayout.CENTER);
                jPanel1.revalidate();
                txSearchUsA.setText("");
                txUsIDA.setText("");
                txUsNameA.setText("");
                txUsLastNameA.setText("");
                txUsTel.setText("");
                txUsAddrA.setText("");
                txUserNameA.setText("");
                txUserPassA.setText("");
                txUserConfPassA.setText(""); 
            } else{
                JOptionPane.showMessageDialog(this, "¡ESTE USUARIO SE ENCUENTRA INACTIVO!");
                txSearchUsA.setText("");
                return;
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btDeleteUsActionPerformed

    private void btSaveEditUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveEditUsActionPerformed
        if(txUserNameA.getText().isEmpty() || txUsNameA.getText().isEmpty() || txUsLastNameA.getText().isEmpty() ||
          txUsTel.getText().isEmpty() || txUsAddrA.getText().isEmpty()  || txUserPassA.toString().isEmpty()){
          JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");
          return;
       }
        Usuario us = new Usuario();
        us.setID(Integer.parseInt(txUsIDA.getText()));
        us.setName(txUsNameA.getText());
        us.setLastName(txUsLastNameA.getText());
        us.setNumber(txUsTel.getText());
        us.setAddres(txUsAddrA.getText());
        us.setUserName(txUserNameA.getText());
        char[] temp = txUserPassA.getPassword();
        String aux2 = String.valueOf(temp);
        us.setPass(aux2);
        String aux = (String) combTypeUsA.getSelectedItem();
        us.setTypeUser(aux);
        us.setStatus("Activo");
        if (Arrays.toString(txUserPassA.getPassword()).equals(Arrays.toString(txUserConfPassA.getPassword()))){
            try {
                usf.Edit_User(us);
                JOptionPane.showMessageDialog(this, "¡Editado!");
                Menú_Admin usm = new Menú_Admin();
                usm.setSize(1080, 480);
                usm.setLocation(0, 0);
                jPanel1.removeAll();
                jPanel1.add(usm, BorderLayout.CENTER);
                jPanel1.revalidate();
            } catch (IOException ex) {}
        } else{
            JOptionPane.showMessageDialog(this, "¡Las contraseñas no coinciden!");
        }
        txSearchUsA.setText("");
        txUsIDA.setText("");
        txUsNameA.setText("");
        txUsLastNameA.setText("");
        txUsTel.setText("");
        txUsAddrA.setText("");
        txUserNameA.setText("");
        txUserPassA.setText("");
        txUserConfPassA.setText("");
    }//GEN-LAST:event_btSaveEditUsActionPerformed

    private void btCancelUsAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelUsAActionPerformed
        txSearchUsA.setText("");
        txUsIDA.setText("");
        txUsNameA.setText("");
        txUsLastNameA.setText("");
        txUsTel.setText("");
        txUsAddrA.setText("");
        txUserNameA.setText("");
        txUserPassA.setText("");
        txUserConfPassA.setText("");
    }//GEN-LAST:event_btCancelUsAActionPerformed

    private void btEditUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditUsActionPerformed
        try {
            Usuario us = new Usuario();
            try{
                us.setID(Integer.parseInt(txSearchUsA.getText()));
            } catch(NumberFormatException nfe){}
            int s = usf.Search_User(us.getID());
            us = usf.getUs(s);
            if (us.getStatus().equals("Activo")){
                JOptionPane.showMessageDialog(this, "¡Por favor, ingrese los nuevos datos!");
                txUsIDA.setText(txSearchUsA.getText());
                txSearchUsA.setText("");
                txUsNameA.setText("");
                txUsLastNameA.setText("");
                txUsTel.setText("");
                txUsAddrA.setText("");
                txUserNameA.setText("");
                txUserPassA.setText("");
                txUserConfPassA.setText("");
                btUsSaveA.setEnabled(false);
                btNuevoA.setEnabled(false);
                btSearchUs.setEnabled(false);
                btDeleteUs.setEnabled(false);
                btEditUs.setEnabled(false);
            } else{
                JOptionPane.showMessageDialog(this, "¡ESTE USUARIO SE ENCUENTRA INACTIVO!");
                txSearchUsA.setText("");
                return;
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btEditUsActionPerformed

    private void btNuevoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoAActionPerformed
        txSearchUsA.setText("");
        txUsNameA.setText("");
        txUsLastNameA.setText("");
        txUsTel.setText("");
        txUsAddrA.setText("");
        txUserNameA.setText("");
        txUserPassA.setText("");
        txUserConfPassA.setText("");
        btNuevoA.setEnabled(false);
        btSaveEditUs.setEnabled(false);
        btSearchUs.setEnabled(false);
        btEditUs.setEnabled(false);
        btDeleteUs.setEnabled(false);
        try {
            User_File usfa = new User_File();
            txUsIDA.setText(String.valueOf(usfa.get_IdC()));
        } catch (IOException ex) {}
    }//GEN-LAST:event_btNuevoAActionPerformed

    private void btSearchUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchUsActionPerformed
        try {
            Usuario us = new Usuario();
            try{
                us.setID(Integer.parseInt(txSearchUsA.getText()));
            } catch(NumberFormatException nfe){}
            int search = usf.Search_User(us.getID());
            if(search == -1){
                JOptionPane.showMessageDialog(this, "¡No se pudo encontrar el usuario!");
                Menú_Admin usm = new Menú_Admin();
                usm.setSize(1080, 480);
                usm.setLocation(0, 0);
                jPanel1.removeAll();
                jPanel1.add(usm, BorderLayout.CENTER);
                jPanel1.revalidate();
                return;
            } 
            us = usf.getUs(search);
            if(us.getName() == null){
               
            } else if(us.getStatus().equals("Inactivo")){
                JOptionPane.showMessageDialog(this, "¡ESTE USUARIO SE ENCUENTRA INACTIVO!");
                txSearchUsA.setText("");
                return;
            }
            JOptionPane.showMessageDialog(this, ".- Registro\nID: " + us.getID() + "\nNombre: "
                    + us.getName() + "\nApellidos: " + us.getLastName() + "\nTeléfono: "
                    + us.getNumber() + "\nDirección: " + us.getAddres() + "\nUsuario: "
                    + us.getUserName() + "\nContraseña: " + us.getPass() + "\nPerfil: "
                    + us.getTypeUser());
            Menú_Admin usm = new Menú_Admin();
            usm.setSize(1080, 480);
            usm.setLocation(0, 0);
            jPanel1.removeAll();
            jPanel1.add(usm, BorderLayout.CENTER);
            jPanel1.revalidate();
        } catch (IOException ex) {}
    }//GEN-LAST:event_btSearchUsActionPerformed

    private void btRegresarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarAActionPerformed
        Admin adm = new Admin();
        adm.setSize(1080, 480);
        adm.setLocation(0, 0);
        jPanel1.removeAll();
        jPanel1.add(adm, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_btRegresarAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelUsA;
    private javax.swing.JButton btDeleteUs;
    private javax.swing.JButton btEditUs;
    private javax.swing.JButton btNuevoA;
    private javax.swing.JButton btRegresarA;
    private javax.swing.JButton btSaveEditUs;
    private javax.swing.JButton btSearchUs;
    private javax.swing.JButton btUsSaveA;
    private javax.swing.JComboBox<String> combTypeUsA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txSearchUsA;
    private javax.swing.JTextField txUsAddrA;
    private javax.swing.JTextField txUsIDA;
    private javax.swing.JTextField txUsLastNameA;
    private javax.swing.JTextField txUsNameA;
    private javax.swing.JTextField txUsTel;
    private javax.swing.JPasswordField txUserConfPassA;
    private javax.swing.JTextField txUserNameA;
    private javax.swing.JPasswordField txUserPassA;
    // End of variables declaration//GEN-END:variables
}
