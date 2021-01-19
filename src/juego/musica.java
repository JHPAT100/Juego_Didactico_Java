/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.applet.AudioClip;

/**
 *
 * @author JHPAT
 */
public class musica {
    private int a;
    private AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource("/juego/mario3_MP3_128K_.wav"));;
    
    public musica(){
  
    }

       public void s(){
         sonido.stop();
   sonido.play();   
       }
  
}
