/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author zoroONE01
 */
public class fHome extends javax.swing.JFrame {

    /**
     * Creates new form fHome
     */
    boolean select2D = false;
    boolean select2Da = false;
    boolean select3D = false;
    CardLayout c;

    public static boolean left = false;
    public static boolean up = false;
    public static boolean down = false;
    public static boolean right = false;

    public fHome() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        c = (CardLayout) pnMain.getLayout();
        pnMain.add("pn2D", new pn2D());
        pnMain.add("pn2Da", new pn2Da());
        pnMain.add("pn3D", new pn3D());
        c.show(pnMain, "pn2D");
        lb2D.setFont(new Font("Tahoma", Font.BOLD, 22));
        select2D = true;
        UIManager.put("OptionPane.background", Color.WHITE);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("OptionPane.buttonBackground", Color.WHITE);
        UIManager.put("control", Color.WHITE);
        UIManager.put("OptionPane.border", new LineBorder(new Color(214, 224, 250), 1));
        ToolTipManager.sharedInstance().setInitialDelay(600);

        this.setTitle("simpleDRAW");
        ImageIcon img = new ImageIcon("src\\pic\\icons8_crayon_20px.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeader = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb2D = new javax.swing.JLabel();
        lbNhomTacGia = new javax.swing.JLabel();
        lb2Da = new javax.swing.JLabel();
        lb3D = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setText("DRAW");
        lbLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("i");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 10, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("m");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 10, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("p");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 10, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("l");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("s");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("e");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnHeader.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 10, -1));

        lb2D.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb2D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2D.setText("2D");
        lb2D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb2D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb2DMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb2DMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb2DMousePressed(evt);
            }
        });
        pnHeader.add(lb2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 50, 50));

        lbNhomTacGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNhomTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_info_30px.png"))); // NOI18N
        lbNhomTacGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNhomTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbNhomTacGiaMousePressed(evt);
            }
        });
        pnHeader.add(lbNhomTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 30));

        lb2Da.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb2Da.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2Da.setText("2D + Chuyển Động");
        lb2Da.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb2Da.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb2DaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb2DaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb2DaMousePressed(evt);
            }
        });
        pnHeader.add(lb2Da, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 210, 50));

        lb3D.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb3D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3D.setText("3D");
        lb3D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb3D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb3DMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb3DMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb3DMousePressed(evt);
            }
        });
        pnHeader.add(lb3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 50));

        getContentPane().add(pnHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        pnMain.setFocusable(true);
        pnMain.requestFocusInWindow();
        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnMainKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnMainKeyReleased(evt);
            }
        });
        pnMain.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb2DMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DMouseEntered
        lb2D.setFont(new Font("Tahoma", Font.BOLD, 22));

    }//GEN-LAST:event_lb2DMouseEntered

    private void lb2DaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DaMouseExited
        if (select2Da) {
            lb2Da.setFont(new Font("Tahoma", Font.BOLD, 22));
        } else {
            lb2Da.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }

    }//GEN-LAST:event_lb2DaMouseExited

    private void lb3DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3DMouseExited
        if (select3D) {
            lb3D.setFont(new Font("Tahoma", Font.BOLD, 22));
        } else {
            lb3D.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }

    }//GEN-LAST:event_lb3DMouseExited

    private void lb2DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DMouseExited
        if (select2D) {
            lb2D.setFont(new Font("Tahoma", Font.BOLD, 22));
        } else {
            lb2D.setFont(new Font("Tahoma", Font.PLAIN, 18));
        }

    }//GEN-LAST:event_lb2DMouseExited

    private void lb2DaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DaMouseEntered
        lb2Da.setFont(new Font("Tahoma", Font.BOLD, 22));

    }//GEN-LAST:event_lb2DaMouseEntered

    private void lb3DMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3DMouseEntered
        lb3D.setFont(new Font("Tahoma", Font.BOLD, 22));

    }//GEN-LAST:event_lb3DMouseEntered

    private void lb2DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DMousePressed
        select2D = true;
        select2Da = false;
        select3D = false;
        lb2Da.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb3D.setFont(new Font("Tahoma", Font.PLAIN, 18));

        c.show(pnMain, "pn2D");
    }//GEN-LAST:event_lb2DMousePressed

    private void lb2DaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2DaMousePressed
        select2D = false;
        select2Da = true;
        select3D = false;
        lb2D.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb3D.setFont(new Font("Tahoma", Font.PLAIN, 18));

        c.show(pnMain, "pn2Da");
        JOptionPane.showMessageDialog(rootPane, "Nhấn phím play để chạy animation\n\nDùng phím mũi tên để di chuyển");
    }//GEN-LAST:event_lb2DaMousePressed

    private void lb3DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3DMousePressed
        select2D = false;
        select2Da = false;
        select3D = true;
        lb2Da.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb2D.setFont(new Font("Tahoma", Font.PLAIN, 18));

        c.show(pnMain, "pn3D");
    }//GEN-LAST:event_lb3DMousePressed

    private void lbNhomTacGiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNhomTacGiaMousePressed
        String[] info = {"N18DCCN193 - Nguyễn Thanh Tú",
            "N18DCCN190 - Bùi Minh Tơ",
            "N18DCCN202 - Nguyễn Mạnh Tường",
            "N18DCCN214 - Nguyễn Tân Thiên",
            "N18DCCN229 - Lê Đình Triều"};
        JOptionPane.showMessageDialog(this, info, "About Us", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lbNhomTacGiaMousePressed

    private void pnMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnMainKeyReleased

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
        }
    }//GEN-LAST:event_pnMainKeyReleased

    private void pnMainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnMainKeyPressed

        int key = evt.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
        }
    }//GEN-LAST:event_pnMainKeyPressed

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
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initUI();
            }
        });
    }
    
    protected static void initUI() {
        fHome fhome = new fHome();
        fhome.setVisible(true);
        fhome.setResizable(false);
        fhome.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb2D;
    private javax.swing.JLabel lb2Da;
    private javax.swing.JLabel lb3D;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNhomTacGia;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
