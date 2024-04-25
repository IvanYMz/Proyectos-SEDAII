package com.mycompany.tienda;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan_
 */
public class Compras_Admin extends javax.swing.JPanel {
    
    Product_File pr;
    Carrito_File cf;
    PDF pdf;
    private Object data[][] = new Object [50][10];
    private Object datac[][] = new Object [50][10];
    private Object titulos[] = {"ID", "Nombre", "Precio", "Descripción", "Stock", "Foto"};
    private Object tituloscar[] = {"ID", "Nombre", "Precio", "Descripción", "Cantidad", "Foto"};
    int aux = 0;
    JDayChooser jdt = new JDayChooser();
    JMonthChooser mn = new JMonthChooser();
    JYearChooser ye = new JYearChooser();
    String fecha;
    ArrayList<Carrito> lst;
    
     private void TablePro(){
        TablePr.setDefaultRenderer(Object.class, new Img_T());
        jTable1.setDefaultRenderer(Object.class, new Img_T());
    }
    
    public Compras_Admin() {
        initComponents();
        TablePro();
        pr = new Product_File();
        cf = new Carrito_File();
        pdf = new PDF();
        comboP.setEnabled(true);
        String dia = Integer.toString(jdt.getDay());
        String mes = Integer.toString(mn.getMonth() + 1);
        String a = Integer.toString(ye.getYear());
        fecha = dia + " / " + mes + " / " + a;
        jTextField1.setText(fecha);
        TablePr.setEnabled(false);
        jTable1.setEnabled(false);
    }
   
   void Table(){
       Producto npr = new Producto();
       int x = 0;
       for(int i = 0; i <= pr.getN_reg(); i++){
           try {
               npr = pr.getPr(i);
               Icon foto;
               if (comboP.getSelectedItem().equals("Electronica") && npr.getCat().equals("Electronica") && npr.getStatus().equals("Disponible")){
                    ImageIcon imcon = new ImageIcon(npr.getFoto());
                    Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(140, 80, Image.SCALE_DEFAULT)) ;
                    JLabel jLabelF = new JLabel();
                    jLabelF.setIcon(icon);
                    data[x][0] = npr.getID_Pr();
                    data[x][1] = npr.getName_Pr();
                    data[x][2] = npr.getPrice();
                    data[x][3] = npr.getDescr();
                    data[x][4] = npr.getStock();
                    data[x][5] = jLabelF;
                    x++;
               } else if(comboP.getSelectedItem().equals("Ropa") && npr.getCat().equals("Ropa") && npr.getStatus().equals("Disponible")){
                   ImageIcon imcon = new ImageIcon(npr.getFoto());
                   Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(140, 80, Image.SCALE_DEFAULT)) ;
                   JLabel jLabelF = new JLabel();
                   jLabelF.setIcon(icon);
                   data[x][0] = npr.getID_Pr();
                   data[x][1] = npr.getName_Pr();
                   data[x][2] = npr.getPrice();
                   data[x][3] = npr.getDescr();
                   data[x][4] = npr.getStock();
                   data[x][5] = jLabelF;
                   x++;
               } else if(comboP.getSelectedItem().equals("Muebles") && npr.getCat().equals("Muebles") && npr.getStatus().equals("Disponible")){
                   ImageIcon imcon = new ImageIcon(npr.getFoto());
                   Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(140, 80, Image.SCALE_DEFAULT)) ;
                   JLabel jLabelF = new JLabel();
                   jLabelF.setIcon(icon);
                   data[x][0] = npr.getID_Pr();
                   data[x][1] = npr.getName_Pr();
                   data[x][2] = npr.getPrice();
                   data[x][3] = npr.getDescr();
                   data[x][4] = npr.getStock();
                   data[x][5] = jLabelF;
                   x++;
               } else if(comboP.getSelectedItem().equals("Comida") && npr.getCat().equals("Comida") && npr.getStatus().equals("Disponible")){
                   ImageIcon imcon = new ImageIcon(npr.getFoto());
                   Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(140, 80, Image.SCALE_DEFAULT)) ;
                   JLabel jLabelF = new JLabel();
                   jLabelF.setIcon(icon);
                   data[x][0] = npr.getID_Pr();
                   data[x][1] = npr.getName_Pr();
                   data[x][2] = npr.getPrice();
                   data[x][3] = npr.getDescr();
                   data[x][4] = npr.getStock();
                   data[x][5] = jLabelF;
                   x++;
               } else if(comboP.getSelectedItem().equals("Autos") && npr.getCat().equals("Autos") && npr.getStatus().equals("Disponible")){
                   ImageIcon imcon = new ImageIcon(npr.getFoto());
                   Icon icon = new ImageIcon(imcon.getImage().getScaledInstance(140, 80, Image.SCALE_DEFAULT)) ;
                   JLabel jLabelF = new JLabel();
                   jLabelF.setIcon(icon);
                   data[x][0] = npr.getID_Pr();
                   data[x][1] = npr.getName_Pr();
                   data[x][2] = npr.getPrice();
                   data[x][3] = npr.getDescr();
                   data[x][4] = npr.getStock();
                   data[x][5] = jLabelF;
                   x++;
               }
           } catch (IOException ex) {}
       }
       DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        for(int i = 0; i <= pr.getN_reg(); i++){
            modelo.setValueAt(data[i][0], i, 0);
            modelo.setValueAt(data[i][1], i, 1);
            modelo.setValueAt(data[i][2], i, 2);
            modelo.setValueAt(data[i][3], i, 3);
        }
       TablePr.setRowHeight(100);
       TablePr.setModel(modelo);
   }
   
   void TableCar(){
       
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePr = new javax.swing.JTable();
        comboP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jPanelCl.setBackground(new java.awt.Color(0, 204, 255));

        TablePr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Descripción", "Precio", "Stock", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePr);

        comboP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorías", "Electronica", "Ropa", "Muebles", "Autos", "Comida" }));
        comboP.setEnabled(false);
        comboP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPActionPerformed(evt);
            }
        });

        jButton1.setText("Cambiar categoría ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Carrito:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Descripción", "Cantidad", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton3.setText("Comprar carrito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vaciar carrito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanelClLayout = new javax.swing.GroupLayout(jPanelCl);
        jPanelCl.setLayout(jPanelClLayout);
        jPanelClLayout.setHorizontalGroup(
            jPanelClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addGroup(jPanelClLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        jPanelClLayout.setVerticalGroup(
            jPanelClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(comboP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPActionPerformed
        Table();
        comboP.setEnabled(false);
    }//GEN-LAST:event_comboPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.getDataVector().removeAllElements();
        TablePr.setModel(modelo);
        comboP.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablePrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePrMouseClicked
       int select = TablePr.rowAtPoint(evt.getPoint());
       if(TablePr.getValueAt(select, 0) == null){return;}
       Producto pre = new Producto();
       int c = 0;
       int id = (int) TablePr.getValueAt(select, 0);
       jTable1.setRowHeight(100);
       for(int i = 0; i < jTable1.getRowCount(); i++){
            if(TablePr.getValueAt(select, 0) == jTable1.getValueAt(i, 0) && id >= 1){
                c = (int) jTable1.getValueAt(i, 4);
                jTable1.setValueAt(c + 1, i, 4);
                return;
            }
       }
             datac[aux][0] = TablePr.getValueAt(select, 0);
             datac[aux][1] = TablePr.getValueAt(select, 1);
             datac[aux][2] = TablePr.getValueAt(select, 2);
             datac[aux][3] = TablePr.getValueAt(select, 3);
             datac[aux][4] = 1;
             datac[aux][5] = TablePr.getValueAt(select, 5);
             jTable1.setValueAt(datac[aux][0], aux, 0);
             jTable1.setValueAt(datac[aux][1], aux, 1);
             jTable1.setValueAt(datac[aux][2], aux, 2);
             jTable1.setValueAt(datac[aux][3], aux, 3);
             jTable1.setValueAt(datac[aux][4], aux, 4);
             jTable1.setValueAt(datac[aux][5], aux, 5);
             aux++;
    }//GEN-LAST:event_TablePrMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin adm = new Admin();
        adm.setSize(1080, 487);
        adm.setLocation(0, 0);
        jPanelCl.removeAll();
        jPanelCl.add(adm, BorderLayout.CENTER);
        jPanelCl.revalidate();
        jPanelCl.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Producto npr = new Producto();
        Carrito_File cf = new Carrito_File();
        lst = new ArrayList();
        int i = 0;
        //for(int i = 0; i < jTable1.getRowCount(); i++)
            while(jTable1.getValueAt(i, 0) != null){
            //if(jTable1.getValueAt(i, 0) == null){return;}
            try {
                Carrito c = new Carrito();
                Product_File prd = new Product_File();
                prd.Dec_Pr((int) jTable1.getValueAt(i, 0), (int) jTable1.getValueAt(i, 4));
                    int search = pr.Search_Pr((int) jTable1.getValueAt(i, 0));
                    npr = pr.getPr(search);
                    c.setId(cf.get_IdCPr());
                    c.setProducto(npr.getName_Pr());
                    c.setDescripción(npr.getDescr());
                    c.setCosto_u(npr.getPrice());
                    c.setCosto(npr.getPrice() * (int) jTable1.getValueAt(i, 4));
                    c.setCantidad((int) jTable1.getValueAt(i, 4));
                    c.setFecha(jTextField1.getText());
                    c.setVendedor(npr.getVendor());
                    cf.Add_C(c);
                    lst.add(c);
            } catch (IOException ex) {}
                i++;
         }
            
        pdf.G_PDF(this.lst);
        JOptionPane.showMessageDialog(this, "¡Listo!");
        Compras_Admin adm = new Compras_Admin();
        adm.setSize(1080, 487);
        adm.setLocation(0, 0);
        jPanelCl.removeAll();
        jPanelCl.add(adm, BorderLayout.CENTER);
        jPanelCl.revalidate();
        jPanelCl.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Compras_Admin adm = new Compras_Admin();
        adm.setSize(1080, 487);
        adm.setLocation(0, 0);
        jPanelCl.removeAll();
        jPanelCl.add(adm, BorderLayout.CENTER);
        jPanelCl.revalidate();
        jPanelCl.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePr;
    private javax.swing.JComboBox<String> comboP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelCl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
