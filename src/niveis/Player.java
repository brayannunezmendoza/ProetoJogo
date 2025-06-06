/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niveis;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author 12525153326
 */
public class Player {
     ImageIcon img_player;
    JLabel lbl_boneco;
    int px = 500, py = 500;
    int dpx = 10, dpy = -10;
    boolean isJumping= false;
     int velocity;

    public void Player() {
        img_player = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
        lbl_boneco = new JLabel(img_player);
        lbl_boneco.setBounds(px, py, 60, 60);
        lbl_boneco.setBackground(Color.white);
        lbl_boneco.setOpaque(true);
        lbl_boneco.setVisible(true);

    }

   
            
            public void keyPressed(KeyEvent e) {

                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    dpx = +5;
                    px += dpx;
                    System.out.println("D");
                    lbl_boneco.setLocation(px, py);
                } else if (tecla == KeyEvent.VK_A) {
                    dpx = -5;
                    px += dpx;
                    System.out.println("A");
                    lbl_boneco.setLocation(px, py);
                }

            }

            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    dpx = 0;

                    lbl_boneco.setLocation(px, py);
                } else if (tecla == KeyEvent.VK_A) {
                    dpx = 0;

                    lbl_boneco.setLocation(px, py);
                }
                if (isJumping == false) {

                    if (tecla == KeyEvent.VK_SPACE) {
                        isJumping = true;
                         velocity = 20;

                    }
                }
            }

        }
      
    

