/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_juegos;

import gui.PlayGame;
import icono.operando;
import javax.swing.JFrame;
import juego.m_juegos;
import puzzle.puzzle;

/**
 *
 * @author JHPAT
 */
public class menu_juegos extends javax.swing.JFrame {

    /**
     * Creates new form menu_juegos
     */
    public menu_juegos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rompe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bis.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bisturir_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 480, 200, 230);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/memo.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerebro (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1210, 460, 150, 160);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 30, 180, 140);

        rompe.setBackground(new java.awt.Color(255, 255, 255));
        rompe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rompe12_1.png"))); // NOI18N
        rompe.setBorder(null);
        rompe.setBorderPainted(false);
        rompe.setContentAreaFilled(false);
        rompe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rompe.setFocusable(false);
        rompe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rompe12345_1.png"))); // NOI18N
        rompe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rompeActionPerformed(evt);
            }
        });
        getContentPane().add(rompe);
        rompe.setBounds(1210, 20, 110, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xdcor11.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -70, 1380, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rompeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rompeActionPerformed
     puzzle x1=new puzzle();
   x1.setVisible(true);
  x1.setExtendedState(JFrame.MAXIMIZED_BOTH);  
dispose();
    }//GEN-LAST:event_rompeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        m_juegos x1=new m_juegos();
        x1.setVisible(true);
        x1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        PlayGame x1=new PlayGame();
        x1.setVisible(true);
        x1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       operando x1=new operando();
   x1.setVisible(true);
  x1.setExtendedState(JFrame.MAXIMIZED_BOTH);  
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_juegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rompe;
    // End of variables declaration//GEN-END:variables
}