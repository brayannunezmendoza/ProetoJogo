/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niveis;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author 12525153326
 */
public class Nivel4 {
    
    JFrame container;
    ImageIcon img_fundo, img_player;
    JLabel lbl_fundo;
    JLabel lbl_plataforma1, lbl_plataforma2, lbl_plataforma3;
    int px = 300, py = 300;

    public Nivel4() {
        container = new JFrame();
        Player p = new Player();
        p.Player();
        p.Player();
        
        container.add(p.lbl_boneco);

        plataformas();
        container.setSize(1600, 900);
        container.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Fundo();
        container.setVisible(true);

    }

    public void Fundo() {
        //boneco();
        lbl_fundo = new JLabel();
        img_fundo = new ImageIcon(getClass().getResource("/IMG/fundo4.png"));
        lbl_fundo.setIcon(img_fundo);
        lbl_fundo.setBounds(0, 0, 1600, 900);
        lbl_fundo.setVisible(true);
        container.add(lbl_fundo);
    }

    public void plataformas() {
        lbl_plataforma1 = new JLabel();
        lbl_plataforma2 = new JLabel();
        lbl_plataforma3 = new JLabel();

        lbl_plataforma1.setBounds(0, 300, 1000, 20);
        lbl_plataforma1.setBackground(Color.red);
        lbl_plataforma1.setOpaque(true);
        lbl_plataforma1.setVisible(true);
        container.add(lbl_plataforma1);
        lbl_plataforma2.setBounds(0, 600, 1000, 20);
        lbl_plataforma2.setBackground(Color.red);
        lbl_plataforma2.setOpaque(true);
        lbl_plataforma2.setVisible(true);
        container.add(lbl_plataforma2);
        lbl_plataforma3.setBounds(0, 900, 1000, 20);
        lbl_plataforma3.setBackground(Color.red);
        lbl_plataforma3.setOpaque(true);
        lbl_plataforma3.setVisible(true);
        container.add(lbl_plataforma3);
        //colissao
        //
        //

    }

   /* public void boneco() {
        img_player = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
        lbl_boneco = new JLabel(img_player);
        lbl_boneco.setBounds(px, py, 60, 60);
        lbl_boneco.setBackground(Color.white);
        lbl_boneco.setOpaque(true);
        lbl_boneco.setVisible(true);

        container.add(lbl_boneco);

    }*/
}
