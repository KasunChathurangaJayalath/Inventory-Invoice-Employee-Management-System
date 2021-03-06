/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.management.srb.invoice1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Avishka
 */
public class Product_price extends javax.swing.JPanel{

    /**
     * Creates new form Product_price
     */
    public Product_price() {
        initComponents();
        dbconnect();
        Showtable();
    }
java.sql.Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null; 
        
         public void dbconnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sr_bio_foods","root","");  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
         
           public void Showtable() {
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery("select * from product_price");
            pricetable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }
      
       public void deletedata(){
         try {
            
            
           pst = con.prepareStatement("delete from product_price where productID = ?");
           pst.setString(1,txtProid.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"DELETE SUCCESSFULLY");
               txtProid.setText("");
               txtproduct.setText("");
               txtbuyingpric.setText("");
               txtsellprice.setText("");
           
        
        } catch (SQLException ex) {
            Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pricetable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtproduct = new javax.swing.JTextField();
        txtbuyingpric = new javax.swing.JTextField();
        txtsellprice = new javax.swing.JTextField();
        txtProid = new javax.swing.JTextField();

        setBackground(new java.awt.Color(200, 210, 255));
        setPreferredSize(new java.awt.Dimension(820, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header_panel.setBackground(new java.awt.Color(0, 0, 104));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product buying and selling Prices :");

        javax.swing.GroupLayout Header_panelLayout = new javax.swing.GroupLayout(Header_panel);
        Header_panel.setLayout(Header_panelLayout);
        Header_panelLayout.setHorizontalGroup(
            Header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Header_panelLayout.setVerticalGroup(
            Header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(Header_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 882, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product buying and selling Prices :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 470, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        pricetable.setBackground(new java.awt.Color(122, 204, 255));
        pricetable.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 204)));
        pricetable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pricetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Buying Price", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pricetable.setSelectionForeground(new java.awt.Color(102, 40, 204));
        pricetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pricetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pricetable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 610, 244));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 640, 180, 36));

        updatebutton.setBackground(new java.awt.Color(0, 153, 204));
        updatebutton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 180, -1));

        deletebutton.setBackground(new java.awt.Color(255, 0, 51));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 180, 36));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Product ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 182, 102, 27));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Product :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 27));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Buying Price :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Selling Price :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        txtproduct.setEditable(false);
        txtproduct.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtproduct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(51, 51, 51)));
        add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 168, 29));

        txtbuyingpric.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtbuyingpric.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(51, 51, 51)));
        add(txtbuyingpric, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 154, 29));

        txtsellprice.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtsellprice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(51, 51, 51)));
        add(txtsellprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 154, 29));

        txtProid.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtProid.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(51, 51, 51)));
        txtProid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProidKeyPressed(evt);
            }
        });
        add(txtProid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 227, 154, 29));
    }// </editor-fold>//GEN-END:initComponents

    private void pricetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pricetableMouseClicked
        DefaultTableModel model = (DefaultTableModel) pricetable.getModel();
        int Myindex = pricetable.getSelectedRow();
        txtProid.setText(model.getValueAt(Myindex, 0).toString());
        txtproduct.setText(model.getValueAt(Myindex, 1).toString());
        txtbuyingpric.setText(model.getValueAt(Myindex, 2).toString());
        txtsellprice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_pricetableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtProid.getText().isEmpty()){
            txtProid.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtproduct.getText().isEmpty()){
            txtproduct.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtbuyingpric.getText().isEmpty()){
            txtbuyingpric.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtsellprice.getText().isEmpty()){
            txtsellprice.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }

        else{
            try {
                String sql = "insert into product_price "
                + "(productID,product,buyingprice,sellprice)"
                + "values (?,?,?,?)";

                pst = con.prepareStatement(sql);
                pst.setString(1,txtProid.getText().toUpperCase());

                pst.setString(2,txtproduct.getText());
                double buprice = Double.parseDouble(txtbuyingpric.getText().toString().trim());
                pst.setDouble(3,buprice);
                double sellprice = Double.parseDouble(txtsellprice.getText().toString().trim());
                pst.setDouble(4,sellprice);
                pst.executeUpdate();
                Showtable();
                txtProid.setText("");
                txtproduct.setText("");
                txtbuyingpric.setText("");
                txtsellprice.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        if (txtProid.getText().isEmpty()){
            txtProid.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtproduct.getText().isEmpty()){
            txtproduct.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtbuyingpric.getText().isEmpty()){
            txtbuyingpric.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(txtsellprice.getText().isEmpty()){
            txtsellprice.setBackground(new Color(255,0,51));
            JOptionPane.showMessageDialog(this,"Missing Information");
        }

        else{
            try {
                String UpdateQuery = "Update product_price set "
                + " product='" + txtproduct.getText()+"'"
                + ", buyingprice='" + Double.valueOf(txtbuyingpric.getText())+"'"
                + ", sellprice='" + Double.valueOf(txtsellprice.getText())+"'"
                + " where productID='" + txtProid.getText()+"'";
                Statement st = con.createStatement();
                st.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Price Updated Successfully.");
                Showtable();
                this.txtProid.setText("");
                this.txtproduct.setText("");
                this.txtbuyingpric.setText("");
                this.txtsellprice.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        deletedata();
        Showtable();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void txtProidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProidKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String proid = txtProid.getText().toUpperCase();
            try {

                pst = con.prepareStatement("select * from product where productID = ?");
                pst.setString(1, proid);
                rs = pst.executeQuery();
                if (rs.next() == false)
                {
                    JOptionPane.showMessageDialog(this,"Product details not avalible");
                }
                else
                {
                    String product =rs.getString("productName");
                    txtproduct.setText(product.trim());
                }

            } catch (SQLException ex) {
                Logger.getLogger(Product_price.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtProidKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header_panel;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pricetable;
    private javax.swing.JTextField txtProid;
    private javax.swing.JTextField txtbuyingpric;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtsellprice;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
