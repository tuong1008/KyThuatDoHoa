/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TrucToaDo;
import Model.TrucToaDo2DAnimation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author zoroONE01
 */
public class pn2Da extends javax.swing.JPanel {

    boolean selectPlay = false;

    public pn2Da() {
        initComponents();
        lbSelected(lbTrucThang);
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

        pnThongTin = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnMain = new Model.TrucToaDo2DAnimation();
        pnFooter = new javax.swing.JPanel();
        lbPlay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        toaDoCurrent = new javax.swing.JLabel();
        pnChucNang = new javax.swing.JPanel();
        lbTrucThang = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnThongTin.setBackground(new java.awt.Color(255, 255, 255));
        pnThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Thông tin chi tiết");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnThongTin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 30));

        add(pnThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -50, 200, 600));

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
        pnMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnMainKeyTyped(evt);
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

        lbPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_play_30px.png"))); // NOI18N
        lbPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbPlayMousePressed(evt);
            }
        });
        pnFooter.add(lbPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_move_30px.png"))); // NOI18N
        jLabel1.setText("Descartes:");
        pnFooter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        toaDoCurrent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toaDoCurrent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toaDoCurrent.setText("Ox : Oy");
        toaDoCurrent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnFooter.add(toaDoCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, 30));

        add(pnFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1000, 50));

        pnChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnChucNang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnChucNang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTrucThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_helicopter_30px_1.png"))); // NOI18N
        lbTrucThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTrucThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbTrucThangMousePressed(evt);
            }
        });
        pnChucNang.add(lbTrucThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        add(pnChucNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 50, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void lbTrucThangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrucThangMousePressed

    }//GEN-LAST:event_lbTrucThangMousePressed

    private void lbPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPlayMousePressed
        if (!selectPlay) {
            lbSelected(lbPlay);
            TrucToaDo2DAnimation.pause = selectPlay;
        } else {
            lbPlay.setBorder(null);
            TrucToaDo2DAnimation.pause = selectPlay;
        }
        selectPlay = !selectPlay;
    }//GEN-LAST:event_lbPlayMousePressed

    private void pnMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseEntered
    }//GEN-LAST:event_pnMainMouseEntered

    private void pnMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseExited
        pnMain.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_pnMainMouseExited

    private void pnMainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnMainKeyTyped

    }//GEN-LAST:event_pnMainKeyTyped

    private void pnMainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMainMouseMoved
        Point point = TrucToaDo.convertDescart(evt.getPoint());
        String xyCurrent = (int) point.getX() + " : " + (int) point.getY();
        toaDoCurrent.setText(xyCurrent);
    }//GEN-LAST:event_pnMainMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lbPlay;
    private javax.swing.JLabel lbTrucThang;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JLabel toaDoCurrent;
    // End of variables declaration//GEN-END:variables
}
