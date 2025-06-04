package niveis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Nivel3 extends JFrame implements KeyListener {

    private JFrame container;
    private ImageIcon img_fundo, img_player, img_nave;
    private JLabel lbl_fundo, lbl_player, lbl_nave,
            lbl_platadorma1, lbl_platadorma2, lbl_platadorma3;
    private int px = 0, py = 700, dpx = 0, dpy = 0;
    private JLabel lbl_obstaculo1, lbl_obstaculo2, lbl_obstaculo3;
    private int velocity;
    private boolean isJumping;
    private int fy = 900;

    public Nivel3() {

        //layouts
        container = new JFrame();
        container.setSize(1600, 900);
        container.setDefaultCloseOperation(EXIT_ON_CLOSE);
        container.setResizable(false);
        container.setLocationRelativeTo(null);
        player();
        osBixin();
        obstaculos();
        plataformas();
        fundo();
        andar();
        new Timer(20, e -> update()).start();
        container.setVisible(true);
    }

    public void fundo() {
        img_fundo = new ImageIcon(getClass().getResource("/IMG/fundo33.png"));
        lbl_fundo = new JLabel();
        lbl_fundo.setIcon(img_fundo);
        lbl_fundo.setBounds(0, 0, 1600, 900);
        lbl_fundo.setVisible(true);
        container.add(lbl_fundo);

    }

    public void player() {
        img_player = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
        lbl_player = new JLabel();
        lbl_player.setIcon(img_player);
        lbl_player.setBounds(px, py, 60, 60);
        lbl_player.setBackground(Color.red);
        lbl_player.setOpaque(true);
        container.add(lbl_player);

    }

    public void plataformas() {
        lbl_platadorma1 = new JLabel();
        lbl_platadorma2 = new JLabel();
        lbl_platadorma3 = new JLabel();

        lbl_platadorma1.setBounds(0, 100, 600, 20);
        lbl_platadorma1.setBackground(Color.BLUE);
        lbl_platadorma1.setOpaque(true);
        lbl_platadorma1.setVisible(true);
        container.add(lbl_platadorma1);

        lbl_platadorma2.setBounds(0, 300, 600, 20);
        lbl_platadorma2.setBackground(Color.BLUE);
        lbl_platadorma2.setOpaque(true);
        lbl_platadorma2.setVisible(true);
        container.add(lbl_platadorma2);

        lbl_platadorma3.setBounds(0, 500, 600, 20);
        lbl_platadorma3.setBackground(Color.BLUE);
        lbl_platadorma3.setOpaque(true);
        lbl_platadorma3.setVisible(true);
        container.add(lbl_platadorma3);

    }

    public void obstaculos() {
        lbl_obstaculo1 = new JLabel();
        lbl_obstaculo2 = new JLabel();
        lbl_obstaculo3 = new JLabel();

        lbl_obstaculo1.setBounds(300, 100, 100, 20);
        lbl_obstaculo1.setBackground(Color.RED);
        lbl_obstaculo1.setOpaque(true);
        lbl_obstaculo1.setVisible(true);
        container.add(lbl_obstaculo1);
        lbl_obstaculo2.setBounds(400, 300, 100, 20);
        lbl_obstaculo2.setBackground(Color.RED);
        lbl_obstaculo2.setOpaque(true);
        lbl_obstaculo2.setVisible(true);
        container.add(lbl_obstaculo2);
        lbl_obstaculo3.setBounds(100, 500, 100, 20);
        lbl_obstaculo3.setBackground(Color.RED);
        lbl_obstaculo3.setOpaque(true);
        lbl_obstaculo3.setVisible(true);
        container.add(lbl_obstaculo3);

    }

    public void andar() {
        container.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    dpx = +5;
                    px += dpx;
                    System.out.println("D");
                    lbl_player.setLocation(px, py);
                } else if (tecla == KeyEvent.VK_A) {
                    dpx = -5;
                    px += dpx;
                    System.out.println("A");
                    lbl_player.setLocation(px, py);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    dpx = 0;

                    lbl_player.setLocation(px, py);
                } else if (tecla == KeyEvent.VK_A) {
                    dpx = 0;

                    lbl_player.setLocation(px, py);
                }
                if (isJumping == false) {

                    if (tecla == KeyEvent.VK_SPACE) {
                        isJumping = true;
                        velocity = 20;

                    }
                }
            }

        }
        );

    }

    public void osBixin() {
        img_nave = new ImageIcon(getClass().getResource("/IMG/nave.png"));
        lbl_nave = new JLabel();
        lbl_nave.setIcon(img_nave);
        lbl_nave.setBounds(1000, 200, 90, 90);
        lbl_nave.setBackground(Color.red);
        lbl_nave.setOpaque(true);
        lbl_nave.setVisible(false);
        container.add(lbl_nave);

    }

    public void movimentacaoBixo() {
    }
    public void mortes() {

    }


    public void ganhou() {
    }

    public void pular() {
        if (isJumping) {
            py -= velocity;
            velocity -= 1;
            px += dpx;
        }
        if (py >= fy) {
            isJumping = false;
            velocity = 0;
        }
    }

    public void update() {
        pular();
        px += dpx;
        lbl_player.setLocation(px, py);
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
