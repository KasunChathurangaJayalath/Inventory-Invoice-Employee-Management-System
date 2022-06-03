/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.management.srb.inventory;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Avishka
 */
public class Invenmain extends javax.swing.JFrame {
        int mouseX;
    int mouseY;
     JpanelLoader jpload = new JpanelLoader();

    /**
     * Creates new form Invenmain
     */
    public Invenmain() {
        initComponents();
          showDate();
       showTime();    
       
       onClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        
       dashboad dash = new dashboad();
        jpload.jPanelLoader(CenterPanel, dash);     
    }
     void showDate() {
       Date d = new Date();
       SimpleDateFormat s;
       s = new SimpleDateFormat("yyyy-MM-dd");
       lblDate.setText(s.format(d));
      
       
   }
       void showTime() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("H:mm:ss");
            lblTime.setText(s.format(d));
          
         }).start();
            
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPanel = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        lblminimize = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CenterPanel.setBackground(new java.awt.Color(180, 170, 255));

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 820, 700));

        headerpanel.setBackground(new java.awt.Color(255, 255, 255));
        headerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/minimize.png"))); // NOI18N
        lblminimize.setPreferredSize(new java.awt.Dimension(25, 25));
        lblminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizeMouseClicked(evt);
            }
        });
        headerpanel.add(lblminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/cancel1.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date");
        lblDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        headerpanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 150, 28));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time");
        lblTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        headerpanel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 150, 28));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/sr boa food Main form design 2 header 1024 768.png"))); // NOI18N
        headerpanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 70));

        getContentPane().add(headerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 820, 70));

        sidePanel.setBackground(new java.awt.Color(0, 0, 104));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/SR test.png"))); // NOI18N
        sidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 170));

        btn1.setBackground(new java.awt.Color(0, 0, 51));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/laptop-2562.png"))); // NOI18N
        btn1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 190, 50));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dashboard");
        btn1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 190, 20));

        sidePanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 80));

        btn2.setBackground(new java.awt.Color(0, 0, 51));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/product.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        btn2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Product");
        btn2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 190, 20));

        sidePanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 80));

        btn3.setBackground(new java.awt.Color(0, 0, 51));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setPreferredSize(new java.awt.Dimension(190, 80));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/categogy.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });
        btn3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 190, 55));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Category");
        btn3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 190, 20));

        sidePanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 190, 80));

        btn4.setBackground(new java.awt.Color(0, 0, 51));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/snowflakes_type.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        btn4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 190, 60));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Product Type");
        btn4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 20));

        sidePanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 190, 85));

        btn6.setBackground(new java.awt.Color(0, 0, 51));
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Main Menu");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout btn6Layout = new javax.swing.GroupLayout(btn6);
        btn6.setLayout(btn6Layout);
        btn6Layout.setHorizontalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        btn6Layout.setVerticalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addGroup(btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn6Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 190, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/management/srb/icons/sr boa food Main form design side panel1024 768.png"))); // NOI18N
        sidePanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 210, 768));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 770));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        setSize(new java.awt.Dimension(1030, 770));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void onClick(JPanel panel){
        panel.setBackground(new Color(0,153,204));
    }
    private void onLeaveClick(JPanel panel){
        panel.setBackground(new Color(0,0,51));
    }
    
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        onClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        
       dashboad dash = new dashboad();
        jpload.jPanelLoader(CenterPanel, dash);                      

    }//GEN-LAST:event_btn1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         onClick(btn2);
        onLeaveClick(btn1);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
       
       
        
        product pro = new product();
        jpload.jPanelLoader(CenterPanel, pro);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        onClick(btn2);
        onLeaveClick(btn1);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
       
        
        product pro = new product();
        jpload.jPanelLoader(CenterPanel, pro);
    }//GEN-LAST:event_btn2MouseClicked

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
       
    }//GEN-LAST:event_jLabel8KeyPressed

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        onClick(btn3);
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn4);
       
        
        category ca = new category();
        jpload.jPanelLoader(CenterPanel, ca);
    }//GEN-LAST:event_btn3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       onClick(btn4);
        onLeaveClick(btn1);
        onLeaveClick(btn3);
        onLeaveClick(btn2);
      
        
        
        producttype prot = new producttype();
        jpload.jPanelLoader(CenterPanel, prot);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
       onClick(btn4);
        onLeaveClick(btn1);
        onLeaveClick(btn3);
        onLeaveClick(btn2);
          
       
        
        
        
        producttype prot = new producttype();
        jpload.jPanelLoader(CenterPanel, prot);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
 this.dispose();
    }//GEN-LAST:event_btn6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
          onClick(btn3);
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn4);
       
        
        category ca = new category();
        jpload.jPanelLoader(CenterPanel, ca);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lblminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Invenmain.ICONIFIED);
    }//GEN-LAST:event_lblminimizeMouseClicked

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - mouseX, Y - mouseY);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_dragMousePressed

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
            java.util.logging.Logger.getLogger(Invenmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invenmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invenmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invenmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invenmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn6;
    private javax.swing.JLabel drag;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblminimize;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}