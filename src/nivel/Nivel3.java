/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivel;

import entidades.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author braya
 */
public class Nivel3 extends JFrame {

    int tem = 3;
    private JLabel fundo;
    private Timer time;
    private JFrame nivel4;
    private Player player;
    private JLabel lblP1 = new Plataformas().getLblPlataforma1(), lblP2 = new Plataformas().getLblPlataforma2(),
            lblP3 = new Plataformas().getLblPlataforma3(), lblP4 = new Plataformas().getLblPlataforma4(), lblP5 = new Plataformas().getLblPlataforma5(),
            lblP6 = new Plataformas().getLblPlataforma6(), lblP7 = new Plataformas().getLblPlataforma7(), lblP8 = new Plataformas().getLblPlataforma8(),
            lblP9 = new Plataformas().getLblPlataforma9(), lblP10 = new Plataformas().getLblPlataforma10();
    private int pX = 100, pY = 100;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private int novoX, novoY;
    private JLabel placar;
    private int mortes;

    public Nivel3() {
        placar = new JLabel("Mortes: " + mortes);
        placar.setBounds(1400, 0, 200, 100);
        placar.setForeground(Color.white);
        placar.setFont(new Font("Arial", Font.BOLD, 35));
        placar.setVisible(true);
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundo3.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);

        nivel4 = new JFrame("nivel4");
        player = new Player("/res/boneco.png", pX, pY);
        player.setBackground(Color.red);
        nivel4.add(player);
        carregarLabels();

        nivel4.add(fundo);
        nivel4.setBackground(Color.BLACK);
        nivel4.setSize(1600, 900);
        nivel4.setLayout(null);
        nivel4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nivel4.setVisible(true);
        time = new Timer(20, e -> atualização());
        time.start();
    }

    public void carregarLabels() {
        nivel4.add(placar);
        nivel4.add(lblP1);
        nivel4.add(lblP2);
        nivel4.add(lblP3);
        nivel4.add(lblP4);
        nivel4.add(lblP5);
        nivel4.add(lblP6);
        nivel4.add(lblP7);
        nivel4.add(lblP8);
        nivel4.add(lblP9);
        nivel4.add(lblP10);
        lblP1.setBounds(0, 250, 1400, 40);     //platafroma de cima
        lblP1.setBackground(Color.blue);
        lblP2.setBounds(300, 600, 1300, 40);    //platafroma de cima
        lblP3.setBounds(0, 800, 1600, 40);    //platafroma de cima
        lblP3.setBackground(Color.BLUE);
        lblP4.setBounds(1550, 400, 40, 200);    //armadilha de lado
        lblP5.setLocation(1000, 450);   //miniplataforma
        lblP6.setLocation(300, 400);     //miniplataforma2
        lblP7.setBounds(600, 550, 50, 50);    //bixo
        lblP8.setBounds(1200, 550, 50, 50); //bixo
        lblP9.setBounds(1550, 750, 50, 50);   //chegar
        lblP9.setBackground(Color.green);
        lblP10.setBackground(Color.red);    //armadilha

    }

    public void moveBixin() {

        if (lblP8.getX()>=1500) {
            tem = -3;

        }if(lblP7.getX()<=300){tem=3;}
        lblP7.setLocation(lblP7.getX() + tem, 550);
        lblP8.setLocation(lblP8.getX() + tem, 550);

    }

    private void atualização() {
        System.out.println(tem);
        mover();
        colbaixo();
        pulando();
        pX += novoX;
        pY += novoY;
        player.setLocation(pX, pY);
        colisao();
        moveBixin();
        barreira();
        repaint();
    }

    public void pontoSpanw() {
        pY = 100;
        pX = 100;
        player.setLocation(pX, pY);
        mortes += 1;
        placar.setText("Mortes: " + mortes);

    }

    private void barreira() {
        if (player.getY() >= 900) {
            velocidade = 0;
            pontoSpanw();
        }
        if (player.getX() >= 1540 || player.getX() <= 10) {
            novoX = 0;
        }
    }

    public void mover() {
        nivel4.addKeyListener(new KeyAdapter() {
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

    }

    public void pulando() {
        if (pulando == true) {
            pY -= velocidade;
            velocidade -= 1;
        }
        if (pY >= fy) {
            velocidade = 0;
        }

    }

    public void novaPos() {
        velocidade = 0;
        pulando = false;
        caindo = true;
    }

    public void colbaixo() {
        if (player.getBounds().intersects(lblP1.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(lblP2.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(lblP3.getBounds())) {
            velocidade = -10;
        }

        if (player.getBounds().intersects(lblP5.getBounds())) {
            velocidade = -5;
        }
        if (player.getBounds().intersects(lblP6.getBounds())) {
            velocidade = -10;
        }

        if (player.getBounds().intersects(lblP10.getBounds())) {
            velocidade = -10;
        }
    }

    public void colisao() {
        if (player.getBounds().intersects(lblP1.getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= lblP1.getY() + 20) {
                player.setLocation(player.getX(), lblP1.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(lblP2.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP2.getY() + 20) {
                player.setLocation(player.getX(), lblP2.getY() - player.getHeight());
                novaPos();

            }
        }

        if (player.getBounds().intersects(lblP3.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP3.getY() + 20) {
                player.setLocation(player.getX(), lblP3.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(lblP4.getBounds())) {
            pontoSpanw();
        }
        if (player.getBounds().intersects(lblP5.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP5.getY() + 20) {
                player.setLocation(player.getX(), lblP5.getY() - player.getHeight());
                novaPos();
            } else {
            }
        }
        if (player.getBounds().intersects(lblP6.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP6.getY() + 20) {
                player.setLocation(player.getX(), lblP6.getY() - player.getHeight());
                novaPos();
            } else {
            }
        }
        if (player.getBounds().intersects(lblP7.getBounds())) {
            pontoSpanw();

        }
        if (player.getBounds().intersects(lblP8.getBounds())) {
            pontoSpanw();
        }
        if (player.getBounds().intersects(lblP9.getBounds())) {

            JOptionPane.showMessageDialog(null, "Passou");
           mortes=-1;
            pontoSpanw();

            //voltar ao selecao de niveis
        }
        if (player.getBounds().intersects(lblP10.getBounds())) {
            pontoSpanw();
        } else {
            pulando = true;
        }
    }

}
