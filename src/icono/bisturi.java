/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icono;

import gui.PlayGame;
import java.applet.AudioClip;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import menu_juegos.menu_juegos;


/**
 *
 * @author JHPAT
 */
public class bisturi extends javax.swing.JFrame {
  int x,y,c;
private void m(){
    AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource("/juego/v.wav"));
    sonido.play();}
    public void eventoMouse(java.awt.event.MouseEvent evt){
       x=evt.getX();
       y=evt.getY();
    }
    public void puntoMouse(JLabel label){
    Point point=MouseInfo.getPointerInfo().getLocation();
    label.setLocation(point.x-x,point.y-y);
}
    ImageIcon imageIcon=new ImageIcon();
    public bisturi() {
        initComponents();
        this.setLocationRelativeTo(null);
      co1.setVisible(false);
      c1.setVisible(false);    
      p1.setVisible(false);
      h1.setVisible(false);
      r1.setVisible(false);   
      i1.setVisible(false);
      tr1.setVisible(false);    
      pul1.setVisible(false);
      e1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c2 = new javax.swing.JLabel();
        pul1 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        co1 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        tr1 = new javax.swing.JLabel();
        pul2 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        co2 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        tr2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerebro (2).png"))); // NOI18N
        c2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                c2MouseDragged(evt);
            }
        });
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                c2MouseReleased(evt);
            }
        });
        getContentPane().add(c2);
        c2.setBounds(1050, 430, 120, 100);

        pul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pulmon1.png"))); // NOI18N
        getContentPane().add(pul1);
        pul1.setBounds(290, 220, 200, 200);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/higado.png"))); // NOI18N
        getContentPane().add(h1);
        h1.setBounds(270, 380, 160, 120);

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estomago.png"))); // NOI18N
        getContentPane().add(e1);
        e1.setBounds(370, 380, 110, 110);

        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/intestino.png"))); // NOI18N
        getContentPane().add(i1);
        i1.setBounds(290, 490, 200, 200);

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pancreasf.png"))); // NOI18N
        getContentPane().add(p1);
        p1.setBounds(370, 430, 80, 110);

        co1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon_1.png"))); // NOI18N
        getContentPane().add(co1);
        co1.setBounds(370, 260, 80, 100);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerebro (2).png"))); // NOI18N
        getContentPane().add(c1);
        c1.setBounds(330, 30, 120, 100);

        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/riñones1.png"))); // NOI18N
        getContentPane().add(r1);
        r1.setBounds(260, 450, 230, 85);

        tr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traquea.png"))); // NOI18N
        getContentPane().add(tr1);
        tr1.setBounds(340, 130, 120, 200);

        pul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pulmon1.png"))); // NOI18N
        pul2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pul2MouseDragged(evt);
            }
        });
        pul2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pul2MouseReleased(evt);
            }
        });
        getContentPane().add(pul2);
        pul2.setBounds(810, 80, 260, 250);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/higado.png"))); // NOI18N
        h2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                h2MouseDragged(evt);
            }
        });
        h2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                h2MouseReleased(evt);
            }
        });
        getContentPane().add(h2);
        h2.setBounds(820, 310, 160, 120);

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estomago.png"))); // NOI18N
        e2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                e2MouseDragged(evt);
            }
        });
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                e2MouseReleased(evt);
            }
        });
        getContentPane().add(e2);
        e2.setBounds(1190, 370, 120, 110);

        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/intestino.png"))); // NOI18N
        i2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                i2MouseDragged(evt);
            }
        });
        i2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                i2MouseReleased(evt);
            }
        });
        getContentPane().add(i2);
        i2.setBounds(810, 470, 200, 200);

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pancreasf.png"))); // NOI18N
        p2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p2MouseDragged(evt);
            }
        });
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p2MouseReleased(evt);
            }
        });
        getContentPane().add(p2);
        p2.setBounds(1080, 280, 89, 110);

        co2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon_1.png"))); // NOI18N
        co2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                co2MouseDragged(evt);
            }
        });
        co2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                co2MouseReleased(evt);
            }
        });
        getContentPane().add(co2);
        co2.setBounds(1070, 110, 80, 100);

        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/riñones1.png"))); // NOI18N
        r2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                r2MouseDragged(evt);
            }
        });
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                r2MouseReleased(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(1050, 550, 230, 85);

        tr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traquea.png"))); // NOI18N
        tr2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tr2MouseDragged(evt);
            }
        });
        tr2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tr2MouseReleased(evt);
            }
        });
        getContentPane().add(tr2);
        tr2.setBounds(1180, 120, 120, 200);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rinicio10087.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reinicio2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 70, 100, 87);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/organos1.png"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 200, 360, 520);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/torso11.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 800, 1310);

        t.setEditable(false);
        t.setBackground(new java.awt.Color(0, 0, 0));
        t.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t);
        t.setBounds(805, 29, 500, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calavera-Fumando-51802.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1030, 420, 0, 320);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calavera-3d.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(680, 80, 0, 400);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 15, 200, 160);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-6, 0, 1440, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void co2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_co2MouseDragged
    
              this.puntoMouse(co2); 
 
    }//GEN-LAST:event_co2MouseDragged

    private void co2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_co2MouseReleased
                 if((co2.getX()>=328 && co2.getX()<=458)&&(co2.getY()>=244 && co2.getY()<=366)){
    co2.setVisible(false);
     co1.setVisible(true);
     c++;}else{ co2.setLocation(1070,110);}
                 if(c==9){
                     m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_co2MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 c=0;
 t.setText(" ");
        co1.setVisible(false);
      c1.setVisible(false);    
      p1.setVisible(false);
      h1.setVisible(false);
      r1.setVisible(false);   
      i1.setVisible(false);
      tr1.setVisible(false);    
      pul1.setVisible(false);
      e1.setVisible(false);   
co2.setVisible(true);
      c2.setVisible(true);    
      p2.setVisible(true);
      h2.setVisible(true);
      r2.setVisible(true);   
      i2.setVisible(true);
      tr2.setVisible(true);    
      pul2.setVisible(true);
      e2.setVisible(true);
co2.setLocation(1070,110);
      c2.setLocation(1050,430);   
      p2.setLocation(1080,280);
      h2.setLocation(820,310);
      r2.setLocation(1050,550);  
      i2.setLocation(810,470);
      tr2.setLocation(1180,120);    
      pul2.setLocation(810,80);
      e2.setLocation(1190,370);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tr2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr2MouseDragged
   this.puntoMouse(tr2); 
    }//GEN-LAST:event_tr2MouseDragged

    private void tr2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr2MouseReleased
       if((tr2.getX()>=285 && tr2.getX()<=451)&&(tr2.getY()>=100  && tr2.getY()<=332)){
    tr2.setVisible(false);
     tr1.setVisible(true);
     c++;}else{tr2.setLocation(1180,120);} 
       if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_tr2MouseReleased

    private void h2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h2MouseReleased
        if((h2.getX()>=232 && h2.getX()<=436)&&(h2.getY()>=360  && h2.getY()<=491)){
    h2.setVisible(false);
     h1.setVisible(true);
     c++;}else{h2.setLocation(820,310);}  
        if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_h2MouseReleased

    private void h2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h2MouseDragged
         this.puntoMouse(h2); 
    }//GEN-LAST:event_h2MouseDragged

    private void i2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i2MouseReleased
     if((i2.getX()>=234 && i2.getX()<=484)&&(i2.getY()>=511  && i2.getY()<=685)){
    i2.setVisible(false);
     i1.setVisible(true);
     c++;}else{i2.setLocation(810,470);}  
     if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_i2MouseReleased

    private void i2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i2MouseDragged
       this.puntoMouse(i2); 
    }//GEN-LAST:event_i2MouseDragged

    private void e2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseReleased
      if((e2.getX()>=333 && e2.getX()<=469)&&(e2.getY()>=387  && e2.getY()<=505)){
    e2.setVisible(false);
     e1.setVisible(true);
     c++;}else{e2.setLocation(1190,370);} 
      if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_e2MouseReleased

    private void e2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseDragged
        this.puntoMouse(e2);
    }//GEN-LAST:event_e2MouseDragged

    private void p2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseReleased
      if((p2.getX()>=333 && p2.getX()<=469)&&(p2.getY()>=387  && p2.getY()<=505)){
    p2.setVisible(false);
     p1.setVisible(true);
     c++;}else{p2.setLocation(1080,280);} 
      if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_p2MouseReleased

    private void p2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseDragged
         this.puntoMouse(p2);
    }//GEN-LAST:event_p2MouseDragged

    private void c2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseReleased
        if((c2.getX()>=277 && c2.getX()<=452)&&(c2.getY()>=14  && c2.getY()<=130)){
    c2.setVisible(false);
     c1.setVisible(true);
     c++;}else{c2.setLocation(1050,430);  } 
        if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_c2MouseReleased

    private void c2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseDragged
           this.puntoMouse(c2);
    }//GEN-LAST:event_c2MouseDragged

    private void r2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseDragged
     this.puntoMouse(r2);
    }//GEN-LAST:event_r2MouseDragged

    private void r2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseReleased
           if((r2.getX()>=218 && r2.getX()<=502)&&(r2.getY()>=431  && r2.getY()<=535)){
    r2.setVisible(false);
     r1.setVisible(true);
     c++;}else{r2.setLocation(1050,550);} 
           if(c==9){   m();
                     t.setText("¡GAME OVER HAS GANADO!");
                 }
    }//GEN-LAST:event_r2MouseReleased

    private void pul2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pul2MouseReleased
        if((pul2.getX()>=230 && pul2.getX()<=498)&&(pul2.getY()>=191  && pul2.getY()<=425)){
            pul2.setVisible(false);
            pul1.setVisible(true);
            c++;}else{pul2.setLocation(810,80);}
        if(c==9){   m();
            t.setText("¡GAME OVER HAS GANADO!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_pul2MouseReleased

    private void pul2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pul2MouseDragged

        this.puntoMouse(pul2);
    }//GEN-LAST:event_pul2MouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      menu_juegos x1=new menu_juegos();
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
            java.util.logging.Logger.getLogger(bisturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bisturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bisturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bisturi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bisturi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel co1;
    private javax.swing.JLabel co2;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel pul1;
    private javax.swing.JLabel pul2;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JTextField t;
    private javax.swing.JLabel tr1;
    private javax.swing.JLabel tr2;
    // End of variables declaration//GEN-END:variables
}
