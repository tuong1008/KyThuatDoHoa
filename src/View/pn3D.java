/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.HinhCau;
import Model.HinhHop;
import Model.TrucToaDo;
import Model.TrucToaDo3D;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author zoroONE01
 */
public class pn3D extends javax.swing.JPanel {

    /**
     * Creates new form pn3D
     */
    boolean selectHinhHop = false;
    boolean selectHinhCau = false;
    public final String Ve_HinhHop = "hinhHop";
    public final String Ve_HinhCau = "hinhCau";

    public String mode = Ve_HinhHop;

    public pn3D() {
        initComponents();
        lbSelected(lbHinhHop);
        selectHinhHop = true;
    }

    public void lbSelected(JLabel lb) {
        lb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner6 = new javax.swing.JSpinner();
        pnThongTin = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerXo = new javax.swing.JSpinner();
        jSpinnerYo = new javax.swing.JSpinner();
        jSpinnerZo = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerDai = new javax.swing.JSpinner();
        jSpinnerRong = new javax.swing.JSpinner();
        jSpinnerCao = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerBanKinh = new javax.swing.JSpinner();
        pnMain = new Model.TrucToaDo3D();
        pnFooter = new javax.swing.JPanel();
        lbXoa = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        toaDoCurrent = new javax.swing.JLabel();
        pnChucNang = new javax.swing.JPanel();
        lbHinhCau = new javax.swing.JLabel();
        lbHinhHop = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnThongTin.setBackground(new java.awt.Color(255, 255, 255));
        pnThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Thông tin chi tiết");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnThongTin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("x");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 20, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("y");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 20, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("z");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 20, 30));

        jSpinnerXo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerXo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerXo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerXoStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerXo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 30));

        jSpinnerYo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerYo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerYo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerYoStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerYo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 30));

        jSpinnerZo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerZo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerZo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerZoStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerZo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("a");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 20, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("b");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 20, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("h");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 20, 30));

        jSpinnerDai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerDai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerDai.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDaiStateChanged(evt);
            }
        });
        jSpinnerDai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSpinnerDaiMousePressed(evt);
            }
        });
        pnThongTin.add(jSpinnerDai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 30));

        jSpinnerRong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerRong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerRong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerRongStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerRong, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 30));

        jSpinnerCao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerCao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerCao.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCaoStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("√2");
        pnThongTin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 20, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("r");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 20, 30));

        jSpinnerBanKinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSpinnerBanKinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinnerBanKinh.setEnabled(false);
        jSpinnerBanKinh.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerBanKinhStateChanged(evt);
            }
        });
        pnThongTin.add(jSpinnerBanKinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 30));

        add(pnThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 200, 550));

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnMainMouseMoved(evt);
            }
        });
        pnMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnMainMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 750, 500));

        pnFooter.setBackground(new java.awt.Color(255, 255, 255));
        pnFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictrue/icons8_trash_30px.png"))); // NOI18N
        lbXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbXoaMousePressed(evt);
            }
        });
        pnFooter.add(lbXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictrue/icons8_move_30px.png"))); // NOI18N
        jLabel9.setText("Descartes:");
        pnFooter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, -1));

        toaDoCurrent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toaDoCurrent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toaDoCurrent.setText("Ox : Oy");
        toaDoCurrent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnFooter.add(toaDoCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 30));

        add(pnFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1000, 50));

        pnChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnChucNang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnChucNang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHinhCau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictrue/icons8_longitude_30px.png"))); // NOI18N
        lbHinhCau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHinhCau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbHinhCauMousePressed(evt);
            }
        });
        pnChucNang.add(lbHinhCau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbHinhHop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictrue/icons8_sugar_cube_30px.png"))); // NOI18N
        lbHinhHop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHinhHop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbHinhHopMousePressed(evt);
            }
        });
        pnChucNang.add(lbHinhHop, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 14, -1, -1));

        add(pnChucNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void lbHinhHopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHinhHopMousePressed
        selectHinhCau = false;
        lbSelected(lbHinhHop);
        lbHinhCau.setBorder(null);
        mode = Ve_HinhHop;
        jSpinnerDai.setEnabled(true);
        jSpinnerRong.setEnabled(true);
        jSpinnerCao.setEnabled(true);
        jSpinnerBanKinh.setEnabled(false);
        TrucToaDo3D.tempShape = null;
        TrucToaDo3D.shape3D = null;
        repaint();
    }//GEN-LAST:event_lbHinhHopMousePressed

    private void lbHinhCauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHinhCauMousePressed
        selectHinhHop = false;
        lbSelected(lbHinhCau);
        lbHinhHop.setBorder(null);
        jSpinnerDai.setEnabled(false);
        jSpinnerRong.setEnabled(false);
        jSpinnerCao.setEnabled(false);
        jSpinnerBanKinh.setEnabled(true);
        TrucToaDo3D.tempShape = null;
        TrucToaDo3D.shape3D = null;
        repaint();
        mode = Ve_HinhCau;
    }//GEN-LAST:event_lbHinhCauMousePressed

    private void pnMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseEntered
    }//GEN-LAST:event_pnMainMouseEntered

    private void pnMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseExited
        pnMain.setCursor(Cursor.getDefaultCursor());// TODO add your handling code here:
    }//GEN-LAST:event_pnMainMouseExited

    private void lbXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaMousePressed
        if (TrucToaDo3D.shape3D != null) {
            int select = JOptionPane.showConfirmDialog(this, "XÓA", "Xóa Shape?", JOptionPane.YES_NO_OPTION, 0);
            if (select == 0) {
                TrucToaDo3D.tempShape = null;
                TrucToaDo3D.shape3D = null;
                repaint();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
        }
    }//GEN-LAST:event_lbXoaMousePressed

    private void jSpinnerXoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerXoStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerXoStateChanged

    private void jSpinnerDaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerDaiMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jSpinnerDaiMousePressed

    private void jSpinnerDaiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerDaiStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerDaiStateChanged

    private void jSpinnerYoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerYoStateChanged
        // TODO add your handling code here
        if (mode.equals(Ve_HinhHop)) {
            TrucToaDo3D.shape3D = new HinhHop((int) jSpinnerXo.getValue(), (int) jSpinnerYo.getValue(), (int) jSpinnerZo.getValue(), (int) jSpinnerDai.getValue(), (int) jSpinnerRong.getValue(), (int) jSpinnerCao.getValue());
        } else {
            if (mode.equals(Ve_HinhCau)) {
                TrucToaDo3D.shape3D = new HinhCau((int) jSpinnerXo.getValue(), (int) jSpinnerYo.getValue(), (int) jSpinnerZo.getValue(), (int) jSpinnerBanKinh.getValue());
            }
        }
        repaint();
    }//GEN-LAST:event_jSpinnerYoStateChanged

    private void jSpinnerZoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerZoStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerZoStateChanged

    private void jSpinnerRongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerRongStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerRongStateChanged

    private void jSpinnerCaoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCaoStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerCaoStateChanged

    private void jSpinnerBanKinhStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerBanKinhStateChanged
        // TODO add your handling code here:
        jSpinnerYoStateChanged(evt);
    }//GEN-LAST:event_jSpinnerBanKinhStateChanged

    private void pnMainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseMoved
        // TODO add your handling code here:
        Point point = TrucToaDo.convertDescart(evt.getPoint());
        String xyCurrent = (int) point.getX() + " : " + (int) point.getY();
        toaDoCurrent.setText(xyCurrent);
        
    }//GEN-LAST:event_pnMainMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinnerBanKinh;
    private javax.swing.JSpinner jSpinnerCao;
    private javax.swing.JSpinner jSpinnerDai;
    private javax.swing.JSpinner jSpinnerRong;
    private javax.swing.JSpinner jSpinnerXo;
    private javax.swing.JSpinner jSpinnerYo;
    private javax.swing.JSpinner jSpinnerZo;
    private javax.swing.JLabel lbHinhCau;
    private javax.swing.JLabel lbHinhHop;
    private javax.swing.JLabel lbXoa;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JLabel toaDoCurrent;
    // End of variables declaration//GEN-END:variables
}
