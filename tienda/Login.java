package com.mycompany.tienda;

/**
 *
 * @author ivan_
 */

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JPanel {

    User_File usf;
    String us_A;
    
    public Login() {
        initComponents();
        usf = new User_File();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txPass = new javax.swing.JPasswordField();
        btIniciarS = new javax.swing.JButton();
        txUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btReg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("----  o  ----");

        txPass.setBackground(new java.awt.Color(0, 204, 255));
        txPass.setBorder(null);

        btIniciarS.setText("Iniciar sesión");
        btIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarSActionPerformed(evt);
            }
        });

        txUsuario.setBackground(new java.awt.Color(0, 204, 255));
        txUsuario.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña:");

        btReg.setText("Registrarse");
        btReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ivan_\\Downloads\\Login.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btIniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btReg)
                                    .addGap(57, 57, 57)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(74, 74, 74)))
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btIniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btReg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarSActionPerformed
        try {
            Usuario us = new Usuario();
            us.setUserName(txUsuario.getText());
            char[] temp = txPass.getPassword();
            String aux =  String.valueOf(temp);
            us.setPass(aux);
            int search = usf.Search_Conf(us.getUserName(), aux);
            if (search == -1){
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
                    Login adm = new Login();
                    adm.setSize(1080, 536);
                    adm.setLocation(0, 0);
                    jPanel1.removeAll();
                    jPanel1.add(adm, BorderLayout.CENTER);
                    jPanel1.revalidate();
                    jPanel1.repaint();
            } else {
                us = usf.getUs(search);
                if(us.getStatus().equals("Inactivo")){
                    JOptionPane.showMessageDialog(this, "¡ESTE USUARIO SE ENCUENTRA INACTIVO!");
                    txUsuario.setText("");
                    txPass.setText("");
                    return;
                }
                if (us.getUserName().equals(txUsuario.getText()) && us.getPass().equals(aux)){
                    JOptionPane.showMessageDialog(this, "Sesión iniciada");
                    User_File usf3 = new User_File();
                    us = usf3.Type_User(us);
                    if(us.getTypeUser().equals("Administrador")){
                         Admin adm = new Admin();
                         adm.setSize(1080, 536);
                         adm.setLocation(0, 0);
                         jPanel1.removeAll();
                         jPanel1.add(adm, BorderLayout.CENTER);
                         jPanel1.revalidate();
                         jPanel1.repaint();
                    } else if(us.getTypeUser().equals("Vendedor")){
                        Vendedor vn = new Vendedor();
                        vn.setSize(1080, 536);
                        vn.setLocation(0, 0);
                        jPanel1.removeAll();
                        jPanel1.add(vn, BorderLayout.CENTER);
                        jPanel1.revalidate();
                        jPanel1.repaint();
                    } else if(us.getTypeUser().equals("Cliente")){
                        Cliente vn = new Cliente();
                        vn.setSize(1080, 536);
                        vn.setLocation(0, 0);
                        jPanel1.removeAll();
                        jPanel1.add(vn, BorderLayout.CENTER);
                        jPanel1.revalidate();
                        jPanel1.repaint();
                    }
                }
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btIniciarSActionPerformed

    private void btRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegActionPerformed
        try {
            if (usf.get_IdC() == 1){
                JOptionPane.showMessageDialog(this, "¡Primero agrega un administrador, por favor!");
                Menú_Admin mn = new Menú_Admin();
                mn.setSize(1080, 536);
                mn.setLocation(0, 0);
                jPanel1.removeAll();
                jPanel1.add(mn, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            } else{
                Menú_User us = new Menú_User();
                us.setSize(1080, 536);
                us.setLocation(0, 0);
                jPanel1.removeAll();
                jPanel1.add(us, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciarS;
    private javax.swing.JButton btReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txPass;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
