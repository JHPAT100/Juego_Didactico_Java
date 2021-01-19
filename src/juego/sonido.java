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
public class sonido {
    AudioClip Player;

public sonido(){
Player=java.applet.Applet.newAudioClip(getClass().getResource("/juego/mario3_MP3_128K_.wav"));
Player.play();
}
public void apagar(){
    Player.stop();
}
}