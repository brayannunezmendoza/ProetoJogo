/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
//apagar o temporario no fim

/**
 *
 * @author braya
 */
public class Nivel1 {

    JLabel lblFundo1;
    JLabel lblPlataforma1;
    JLabel lblPlataforma2;
    JLabel lblPlataforma3;
    JLabel lblPlataforma4;
    JLabel lblPlataforma5;
    JLabel lblPlataforma6;

    //verificar possivel remoção por inutilidade
    private Rectangle rp1;
    private Rectangle rp2;
    private Rectangle rp3;
    private Rectangle rp4;
    private Rectangle rp5;

    private int h = 30;
    private ArrayList<JLabel> plataformas;
    private ArrayList<Rectangle> limitesPlataformas;

    private int fase = 10;

    public Nivel1(String caminhoFundo) {
        //lista das coordenadas dos label e rectangles
        plataformas = new ArrayList<>();
        limitesPlataformas = new ArrayList<>();
        lblFundo1 = new JLabel(new ImageIcon(getClass().getResource("/res/fundo1.jpeg")));
        lblFundo1.setIcon(new ImageIcon(getClass().getResource(caminhoFundo)));
        lblFundo1.setBounds(0, 0, 1600, 900);
        lblFundo1.setBackground(Color.red);//temmporario
        lblFundo1.setOpaque(true);//temporario
        lblFundo1.setVisible(true);

        ///////////////////////
          lblPlataforma1 = new JLabel();
        lblPlataforma1.setBounds(100, 850, 500, h);
        lblPlataforma1.setBackground(Color.blue);
        lblPlataforma1.setOpaque(true);
        lblPlataforma1.setVisible(true);
        rp1 = new Rectangle(100, 850, 500, h);
        /////////////////////
          lblPlataforma2 = new JLabel();
        lblPlataforma2.setBounds(1000, 680, 500, h);
        lblPlataforma2.setBackground(Color.red);
        lblPlataforma2.setOpaque(true);
        lblPlataforma2.setVisible(true);
        rp2 = new Rectangle(1000, 680, 500, h);
        /////////////
        lblPlataforma3 = new JLabel();
        lblPlataforma3.setBounds(500, 430, 300, h);
        lblPlataforma3.setBackground(Color.BLACK);
        lblPlataforma3.setOpaque(true);
        lblPlataforma3.setVisible(true);
        rp3 = new Rectangle(500, 430, 300, h);
        /////////////
        lblPlataforma4 = new JLabel();
        lblPlataforma4.setBounds(0, 250, 300, h);
        lblPlataforma4.setBackground(Color.cyan);
        lblPlataforma4.setOpaque(true);
        lblPlataforma4.setVisible(true);
        rp4 = new Rectangle(0, 250, 300, h);

        lblPlataforma5 = new JLabel();
        lblPlataforma5.setSize(500, 500);
        lblPlataforma5.setBackground(Color.DARK_GRAY);
        lblPlataforma5.setOpaque(true);
        lblPlataforma5.setVisible(true);
        rp5 = new Rectangle(1100, 150, 500, h);

        plataformas.add(lblPlataforma1);
        plataformas.add(lblPlataforma2);
        plataformas.add(lblPlataforma3);
        plataformas.add(lblPlataforma4);

    }

    public JLabel getNivel1() {
        return lblFundo1;
    }

    /////////////
    public JLabel getLblPlataforma1() {
        return lblPlataforma1;
    }

    public Rectangle getRp1() {
        return rp1;
    }

    public JLabel getLblPlataforma2() {
        return lblPlataforma2;
    }

    public JLabel getLblPlataforma3() {
        return lblPlataforma3;
    }

    public JLabel getLblPlataforma4() {
        return lblPlataforma4;
    }

    public Rectangle getRp2() {
        return rp2;
    }

    public Rectangle getRp3() {
        return rp3;
    }

    public Rectangle getRp4() {
        return rp4;
    }

    public JLabel getLblPlataforma5() {
        return lblPlataforma5;
    }

    public Rectangle getRp5() {
        return rp5;
    }

    public int getFase() {
        return fase;
    }


///////////////
   

}
