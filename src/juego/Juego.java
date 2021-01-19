/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author JHPAT
 */
public class Juego {
        
public static void main(String[] args) throws Exception{       
menu x2=new menu();
x2.setVisible(true);
x2.setExtendedState(JFrame.MAXIMIZED_BOTH);
do{
sonido s=new sonido();
cargarmusica();
s.apagar();
}while(1>=0);
    }
 public static void cargarmusica(){
    int a=1; 
    
     try{
        Thread.sleep(180000); 
     }
     catch(InterruptedException e){}        
    
 
}}
