/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import entidades.Player;
import game.MecanicaN1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame {
    private int f;
    private Player player;

    private int nivel = 2;
    private JPanel g1;
    private MecanicaN1 game1;
    private int p;
    private JLabel movPlayer;
    
 
   

    public Janela() {
       
        
       
        if ( nivel == 1) {
            g1 = new MecanicaN1();
            add(g1);
              
        }
        if (nivel == 2) {
        }
        if (nivel == 3) {
        }
        if (nivel == 4) {
        }
        if (nivel == 5) {
        }
        if (nivel == 0) {
        }

        setSize(1600, 920);

        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

      

    }
  
    

}
