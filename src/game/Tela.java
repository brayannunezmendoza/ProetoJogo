/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import entidades.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import nivel.Nivel4;
import nivel.Nivel5;
import nivel.Plataformas;

public class Tela extends JFrame {

    private JLabel escolha1;
    private JLabel escolha2;
    private JLabel escolha3;
    private JLabel escolha4;
    private JLabel escolha5;
    private JLabel escolha6;
    private JLabel fundo;
    private int x = 200, y = 300;
    private int h = 200;
    private int w = 400;
    JPanel p4;
    JLabel player;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private int pX = 1, pY = 700;
    private int novoX, novoY;
   /*private JLabel lblP1 = new Plataformas().getLblPlataforma1(),
            lblP2 = new Plataformas().getLblPlataforma2(), lblP3 = new Plataformas().getLblPlataforma3(),
            lblP4 = new Plataformas().getLblPlataforma4(), lblP5 = new Plataformas().getLblPlataforma5(),
            lblP6 = new Plataformas().getLblPlataforma6(), lblP7 = new Plataformas().getLblPlataforma7(),
            lblP8 = new Plataformas().getLblPlataforma8(), lblP9 = new Plataformas().getLblPlataforma9(),
            lblP10 = new Plataformas().getLblPlataforma10();

    int nivel;*/
    Timer time;

    public Tela() {
        setSize(1600, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //player = new Player("/res/boneco.png", x, y);
       // player.setVisible(false);
       /// add(player);

        escolhas();
        click();
        fundo();

        //escolher();   
        setVisible(true);
       // mover();

        time = new Timer(0, e -> tick());
        time.start();
    }

    public void fundo() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundoescolha.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        add(fundo);

    }

    public void escolhas() {
        escolha1 = new JLabel("Nivel 1 Bloquedo");
        escolha2 = new JLabel("Nivel 2 Bloquedo");
        escolha3 = new JLabel("Nivel 3 Bloquedo");
        escolha4 = new JLabel("Nivel 4 Bloquedo");
        escolha5 = new JLabel("Nivel 5 Bloquedo");
        escolha6 = new JLabel("Nivel 6 Bloquedo");

        escolha1.setBackground(Color.BLACK);
        escolha1.setForeground(Color.WHITE);
        escolha1.setFont(new Font("Arial", Font.BOLD, 30));
        escolha1.setHorizontalAlignment(SwingConstants.CENTER);
        escolha1.setBounds(x, y, w, h);
        escolha1.setOpaque(true);
        escolha1.setVisible(true);

        escolha2.setBackground(Color.BLACK);
        escolha2.setForeground(Color.WHITE);
        escolha2.setFont(new Font("Arial", Font.BOLD, 30));
        escolha2.setHorizontalAlignment(SwingConstants.CENTER);
        escolha2.setBounds(x + w + 20, y, w, h);
        escolha2.setOpaque(true);
        escolha2.setVisible(true);

        escolha3.setBackground(Color.black);
        escolha3.setForeground(Color.WHITE);
        escolha3.setFont(new Font("Arial", Font.BOLD, 30));
        escolha3.setHorizontalAlignment(SwingConstants.CENTER);
        escolha3.setBounds(x + (w * 2) + 40, y, w, h);
        escolha3.setOpaque(true);
        escolha3.setVisible(true);

        escolha4.setBackground(Color.blue);
        escolha4.setForeground(Color.WHITE);
        escolha4.setFont(new Font("Arial", Font.BOLD, 30));
        escolha4.setHorizontalAlignment(SwingConstants.CENTER);
        escolha4.setBounds(x, y + h + 50, w, h);
        escolha4.setOpaque(true);
        escolha4.setVisible(true);

        escolha5.setBackground(Color.blue);
        escolha5.setForeground(Color.WHITE);
        escolha5.setFont(new Font("Arial", Font.BOLD, 30));
        escolha5.setHorizontalAlignment(SwingConstants.CENTER);
        escolha5.setBounds(x + w + 20, y + h + 50, w, h);
        escolha5.setOpaque(true);
        escolha5.setVisible(true);

        escolha6.setBackground(Color.blue);
        escolha6.setForeground(Color.WHITE);
        escolha6.setFont(new Font("Arial", Font.BOLD, 30));
        escolha6.setHorizontalAlignment(SwingConstants.CENTER);
        escolha6.setBounds(x + (w * 2) + 40, y + h + 50, w, h);
        escolha6.setOpaque(true);
        escolha6.setVisible(true);

        add(escolha1);
        add(escolha2);
        add(escolha3);
        add(escolha4);
        add(escolha5);
        add(escolha6);

    }

    public void click() {
        escolha1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // System.out.println(a);

            }
        });
        escolha2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            }
        });
        escolha3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
        escolha4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("a");
                //carregarLabels();
                //coordenadas1();
                add(new Nivel4());
               
                
                
                fundo.setVisible(false);
//                player.setVisible(true);
                desabEsco();

            }

           /* private void coordenadas1() {

             lblP1.setLocation(0, 800);
                lblP2.setLocation(700, 700);
                lblP3.setLocation(1300, 600);
                lblP4.setBounds(1550, 400, 40, 200);
                lblP5.setLocation(1000, 500);
                lblP6.setLocation(300, 400);
                lblP7.setLocation(500, 100);
                lblP8.setLocation(0, 250);
                lblP9.setLocation(1300, 100);
                //moeda.setLocation(lblP2.getX() + (lblP2.getWidth() / 2) - 20, lblP2.getY() - 100);
            }*/
        });
        escolha5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
        escolha6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
    }

    public void desabEsco() {
        remove(escolha1);
        remove(escolha2);
        remove(escolha3);
        remove(escolha4);
        remove(escolha5);
        remove(escolha6);

    }

   /* public void carregarLabels() {

        add(lblP1);
        add(lblP2);
        add(lblP3);
        add(lblP4);
        add(lblP5);
        add(lblP6);
        add(lblP7);
        add(lblP8);
        add(lblP9);

    }*/

    public void tick() {
        //mover();
        // colbaixo();
        //pulando();
       // pX += novoX;
       // pY += novoY;
        //player.setLocation(pX, pY);
        // colisao();
        repaint();
        // barreira();

        repaint();
    }

    /*p/ublic void mover() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    novoX = +10;
                }
                if (tecla == KeyEvent.VK_A) {
                    novoX = -10;
                }
                if (tecla == KeyEvent.VK_SPACE && caindo == true) {
                    pulando = true;
                    velocidade = 20;
                    caindo = false;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D) {
                    novoX = +0;
                }
                if (tecla == KeyEvent.VK_A) {
                    novoX = -0;
                }
            }
        });

    }*/

}
