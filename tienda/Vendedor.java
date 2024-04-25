package com.mycompany.tienda;

/**
 *
 * @author ivan_
 */

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Vendedor extends javax.swing.JPanel {
    
    Product_File v_file;
    User_File usf;
    File arch;
    Image img;
    String ruta;
    public Vendedor() {
        initComponents();
        v_file = new Product_File();
        usf = new User_File();
        ruta = " ";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPr = new javax.swing.JPanel();
        txVendor = new javax.swing.JTextField();
        btOutPr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btSavePr = new javax.swing.JButton();
        btEditPr = new javax.swing.JButton();
        btSave_EdPr = new javax.swing.JButton();
        tx_PP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btDeletePr = new javax.swing.JButton();
        txSearchPr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btSearchPr = new javax.swing.JButton();
        txID_V = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txC_P = new javax.swing.JTextField();
        txN_P = new javax.swing.JTextField();
        combTypePr = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btCancelPr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txD_P = new javax.swing.JTextArea();
        btNewPr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jPanelPr.setBackground(new java.awt.Color(0, 204, 255));

        btOutPr.setText("Salir");
        btOutPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutPrActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        btSavePr.setText("Guardar");
        btSavePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSavePrActionPerformed(evt);
            }
        });

        btEditPr.setText("Editar");
        btEditPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditPrActionPerformed(evt);
            }
        });

        btSave_EdPr.setText("Guardar Edición");
        btSave_EdPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSave_EdPrActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingrese ID:");

        btDeletePr.setText("Eliminar");
        btDeletePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletePrActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        btSearchPr.setText("Buscar");
        btSearchPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchPrActionPerformed(evt);
            }
        });

        txID_V.setEnabled(false);

        jLabel2.setText("Producto:");

        combTypePr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronica", "Ropa", "Muebles", "Autos", "Comida" }));

        jLabel5.setText("N° De unidades:");

        jLabel3.setText("Descripción:");

        jLabel8.setText("Usuario:");

        btCancelPr.setText("Cancelar");

        txD_P.setColumns(20);
        txD_P.setRows(5);
        jScrollPane1.setViewportView(txD_P);

        btNewPr.setText("Nuevo");
        btNewPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewPrActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Imágen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrLayout = new javax.swing.GroupLayout(jPanelPr);
        jPanelPr.setLayout(jPanelPrLayout);
        jPanelPrLayout.setHorizontalGroup(
            jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrLayout.createSequentialGroup()
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrLayout.createSequentialGroup()
                                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrLayout.createSequentialGroup()
                                        .addComponent(txVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txN_P, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txID_V, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrLayout.createSequentialGroup()
                                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrLayout.createSequentialGroup()
                                        .addComponent(btSavePr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btNewPr, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btOutPr))
                                    .addComponent(tx_PP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPrLayout.createSequentialGroup()
                                        .addComponent(txC_P, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addGap(46, 46, 46)
                                        .addComponent(btSave_EdPr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCancelPr)))))
                        .addGap(286, 286, 286)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txSearchPr, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearchPr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combTypePr, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrLayout.createSequentialGroup()
                        .addComponent(btEditPr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletePr)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanelPrLayout.setVerticalGroup(
            jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btSearchPr)
                    .addComponent(txSearchPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditPr)
                    .addComponent(btDeletePr))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrLayout.createSequentialGroup()
                        .addComponent(combTypePr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btSavePr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btNewPr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btOutPr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanelPrLayout.createSequentialGroup()
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txID_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txN_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_PP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txC_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSave_EdPr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelPr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btOutPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutPrActionPerformed
        Login adm = new Login();
        adm.setSize(1080, 480);
        adm.setLocation(0, 0);
        jPanelPr.removeAll();
        jPanelPr.add(adm, BorderLayout.CENTER);
        jPanelPr.revalidate();
        jPanelPr.repaint();
    }//GEN-LAST:event_btOutPrActionPerformed

    private void btSavePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSavePrActionPerformed
        if(txVendor.getText().equals("") || txVendor.isEnabled() || txN_P.getText().isEmpty() || txD_P.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "¡Primero asigne un usuario!");
            return;
        }
        try {
            Producto pr = new Producto();
           try{ 
            
            pr.setID_Pr(Integer.parseInt(txID_V.getText()));
            pr.setName_Pr(txN_P.getText());
            String aux = (String) combTypePr.getSelectedItem();
            pr.setCat(aux);
            pr.setDescr(txD_P.getText());
            pr.setPrice(Integer.parseInt(tx_PP.getText()));
            pr.setStock(Integer.parseInt(txC_P.getText()));
            pr.setStatus("Disponible");
            pr.setVendor(txVendor.getText());
            pr.setFoto(ruta);
           } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");return;}
            v_file.Add_Pr(pr);
            JOptionPane.showMessageDialog(this, "¡Producto registrado!");
            Vendedor vn = new Vendedor();
            vn.setSize(1080, 536);
            vn.setLocation(0, 0);
            jPanelPr.removeAll();
            jPanelPr.add(vn, BorderLayout.CENTER);
            jPanelPr.revalidate();
            jPanelPr.repaint();
        } catch (IOException ex) {}

    }//GEN-LAST:event_btSavePrActionPerformed

    private void btEditPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditPrActionPerformed
        try {
            int search;
            try{
            search = v_file.Search_Pr2(Integer.parseInt(txSearchPr.getText()), txVendor.getText());
             } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");return;}
            if(txVendor.getText().equals("")|| txVendor.isEnabled()){
                JOptionPane.showMessageDialog(this, "¡Primero asigne un usuario!");
                return;
            } else if(search == -1){
                JOptionPane.showMessageDialog(this, "¡Oops, ha ocurrido un error!");
                return;   
            }
            JOptionPane.showMessageDialog(this, "¡Ingrese los nuevos datos!");
            txN_P.setText("");
            txD_P.setText("");
            tx_PP.setText("");
            txC_P.setText("");
            txID_V.setText(txSearchPr.getText());
            txSearchPr.setText("");
            btSearchPr.setEnabled(false);
            btSavePr.setEnabled(false);
            btEditPr.setEnabled(false);
            btDeletePr.setEnabled(false);
        } catch (IOException ex) {}
    }//GEN-LAST:event_btEditPrActionPerformed

    private void btSave_EdPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSave_EdPrActionPerformed
        if(txVendor.getText().equals("")|| txVendor.isEnabled() || txN_P.getText().isEmpty() || txD_P.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "¡Primero asigne un usuario!");
            return;
        }
        try {
            Producto pr = new Producto();
            try{
            pr.setID_Pr(Integer.parseInt(txID_V.getText()));
            pr.setName_Pr(txN_P.getText());
            String aux = (String) combTypePr.getSelectedItem();
            pr.setCat(aux);
            pr.setDescr(txD_P.getText());
            pr.setPrice(Integer.parseInt(tx_PP.getText()));
            pr.setStock(Integer.parseInt(txC_P.getText()));
            pr.setStatus("Disponible");
            pr.setVendor(txVendor.getText());
             } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");return;}
            int search = v_file.Search_Pr2(pr.getID_Pr(), pr.getVendor());
            if (v_file.Edit_Pr(pr) && search != -1){
                JOptionPane.showMessageDialog(this, "¡Editado!");
                Vendedor vn = new Vendedor();
                vn.setSize(1080, 536);
                vn.setLocation(0, 0);
                jPanelPr.removeAll();
                jPanelPr.add(vn, BorderLayout.CENTER);
                jPanelPr.revalidate(); 
                jPanelPr.repaint();
            } else{
                JOptionPane.showMessageDialog(this, "¡Oops, ocurrió un error!");
                return;
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btSave_EdPrActionPerformed

    private void btDeletePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletePrActionPerformed
        if(txVendor.getText().equals("")|| txVendor.isEnabled()){
            JOptionPane.showMessageDialog(this, "¡Primero asigne un usuario!");
            return;
        }
        try {
            int search;
            try{
            search = v_file.Search_Pr2(Integer.parseInt(txSearchPr.getText()), txVendor.getText());
             } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");return;}
            if(v_file.Delete_Pr(Integer.parseInt(txSearchPr.getText())) && search != -1){
                JOptionPane.showMessageDialog(this, "¡Producto eliminado!");
                Vendedor vn = new Vendedor();
                vn.setSize(1080, 536);
                vn.setLocation(0, 0);
                jPanelPr.removeAll();
                jPanelPr.add(vn, BorderLayout.CENTER);
                jPanelPr.revalidate();
            } else{
                JOptionPane.showMessageDialog(this, "¡El producto no se encuentra disponible!");
                return;
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_btDeletePrActionPerformed

    private void btSearchPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchPrActionPerformed
        if(txVendor.getText().equals("")|| txVendor.isEnabled()){
            JOptionPane.showMessageDialog(this, "¡Primero asigne un usuario!");
            return;
        }
        try {
            Producto pr = new Producto();
            try{
            pr.setID_Pr(Integer.parseInt(txSearchPr.getText()));
             } catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "¡Asegurese de ingresar los datos correctamente!");return;}
            pr.setVendor(txVendor.getText());
            int search = v_file.Search_Pr2(pr.getID_Pr(), pr.getVendor());
            pr = v_file.getPr(search);
            if(search == -1){
                JOptionPane.showMessageDialog(this, "¡No se pudo encontrar el articulo");
                Vendedor vn = new Vendedor();
                vn.setSize(1080, 536);
                vn.setLocation(0, 0);
                jPanelPr.removeAll();
                jPanelPr.add(vn, BorderLayout.CENTER);
                jPanelPr.revalidate();
                return;
            } else if(pr.getStatus().equals("Agotado(a)")){
                JOptionPane.showMessageDialog(this, "¡ESTE ARTICULO NO SE ENCUENTRA DISPONIBLE!");
                txSearchPr.setText("");
                return;
            }
            JOptionPane.showMessageDialog(this, ".- Producto\n- " + pr.getCat()+ "\nID: " + pr.getID_Pr() + "\nNombre: "
                + pr.getName_Pr() + "\nDescripción: " + pr.getDescr() + "\nPrecio: "
                + pr.getPrice() + "\nCantidad: " + pr.getStock()+ "\nVendedor: "
                + pr.getVendor());
            Vendedor vn = new Vendedor();
            vn.setSize(1080, 536);
            vn.setLocation(0, 0);
            jPanelPr.removeAll();
            jPanelPr.add(vn, BorderLayout.CENTER);
            jPanelPr.revalidate();
        } catch (IOException ex) {}
    }//GEN-LAST:event_btSearchPrActionPerformed

    private void btNewPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewPrActionPerformed
        if(txVendor.getText().equals("") || txVendor.isEnabled()){
            JOptionPane.showMessageDialog(this, "¡Primero asigne su nombre de usuario!");
            return;
        }
        try {
            txID_V.setText(String.valueOf(v_file.get_IdCPr()));            
            btSearchPr.setEnabled(false);
            btSave_EdPr.setEnabled(false);
            btEditPr.setEnabled(false);
            btDeletePr.setEnabled(false);
        } catch (IOException ex) {}

    }//GEN-LAST:event_btNewPrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res;
        Img search = new Img();
        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG", "PNG", "GIF", "jpg", "gif");
        search.jFileChooser1.setFileFilter(formato);
        res = search.jFileChooser1.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == res){
            arch = search.jFileChooser1.getSelectedFile();
            ruta = arch.getAbsolutePath();
            ImageIcon imcon = new ImageIcon(arch.toString());
            Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)) ;
            jLabel1.setIcon(icon);
        } else{
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int search = usf.Search_User2(txVendor.getText());
            
            if(search == -1){
                JOptionPane.showMessageDialog(this, "¡No se encontró el usuario!");
                return;
            }
            Usuario us = new Usuario();
            us = usf.getUs(search);
            if (us.getTypeUser().equals("Vendedor")){
                txVendor.setEnabled(false);
            } 
            else {
                JOptionPane.showMessageDialog(this, "¡Este usuario no es vendedor!");
                return;
            }
        } catch (IOException ex) {}
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelPr;
    private javax.swing.JButton btDeletePr;
    private javax.swing.JButton btEditPr;
    private javax.swing.JButton btNewPr;
    private javax.swing.JButton btOutPr;
    private javax.swing.JButton btSavePr;
    private javax.swing.JButton btSave_EdPr;
    private javax.swing.JButton btSearchPr;
    private javax.swing.JComboBox<String> combTypePr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelPr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txC_P;
    private javax.swing.JTextArea txD_P;
    private javax.swing.JTextField txID_V;
    private javax.swing.JTextField txN_P;
    private javax.swing.JTextField txSearchPr;
    private javax.swing.JTextField txVendor;
    private javax.swing.JTextField tx_PP;
    // End of variables declaration//GEN-END:variables
}
