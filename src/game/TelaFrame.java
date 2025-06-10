/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import entidades.Player;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import nivel.Nivel2;

/**
 *
 * @author braya
 */
public class TelaFrame extends JFrame {

    private JLabel lblFundo;
    private Nivel2 nivel2;
    private Player player;
    private int pX = 1, pY = 700;
    private int novoX, novoY;
    private Timer timer;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private Rectangle r1;
    private int fy = 1000;
    private JLabel moeda1;
    private JLabel moeda2;
    private JLabel moeda3;
    private JLabel moeda4;
    private JLabel moeda5;
    private JLabel moeda;
    private JLabel lblP1 = new Nivel2().getLblPlataforma1(),
            lblP2 = new Nivel2().getLblPlataforma2(), lblP3 = new Nivel2().getLblPlataforma3(),
            lblP4 = new Nivel2().getLblPlataforma4(), lblP5 = new Nivel2().getLblPlataforma5(),
            lblP6 = new Nivel2().getLblPlataforma6(), lblP7 = new Nivel2().getLblPlataforma7(),
            lblP8 = new Nivel2().getLblPlataforma8(), lblP9 = new Nivel2().getLblPlataforma9(),
            lblP10 = new Nivel2().getLblPlataforma10();

    private int nivelNivel = 0;
    //adicionar cenario nivel 5
    //definir spaw em cada nivel
    private ArrayList<Integer> lista;
//receber valor de nivel

    public TelaFrame() {

        mostrarLista();

        //GerenciadorNiveis gerente = new GerenciadorNiveis();
        //gerente.setLevelsLista(listaNiveis);
        lblFundo = new JLabel();
        nivel2 = new Nivel2();
        moeda = new Nivel2().getLblMoeda();
        moeda1 = new Nivel2().getLblMoeda();
        moeda2 = new Nivel2().getLblMoeda();
        moeda3 = new Nivel2().getLblMoeda();
        moeda4 = new Nivel2().getLblMoeda();
        moeda5 = new Nivel2().getLblMoeda();

        player = new Player("/res/boneco.png", pX, pY);
        add(player);
        //tela Frame
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        if(nivelNivel==0){
    
        }
        if (nivelNivel == 1) {

            moeda.setVisible(true);
            moeda1.setLocation(600, 600);

            System.out.println(moeda.getLocation());

            //conf Plataformas nivel 1
            lblFundo = new Nivel2().getLblFundo();
            lblFundo.setVisible(true);

            add(lblP1);
            add(lblP2);
            add(lblP3);
            add(lblP4);
            add(lblP5);
            add(lblP6);
            add(lblP7);
            add(lblP8);
            add(lblP9);
            // add(lblP10);
            add(moeda);
            add(moeda1);
            lblP1.setLocation(0, 800);
            lblP2.setLocation(700, 700);
            lblP3.setLocation(1300, 600);
            lblP4.setBounds(1550, 400, 40, 200);
            lblP5.setLocation(1000, 500);
            lblP6.setLocation(300, 400);
            lblP7.setLocation(500, 100);
            lblP8.setLocation(0, 250);
            lblP9.setLocation(1300, 100);
            moeda.setLocation(lblP2.getX() + (lblP2.getWidth() / 2) - 20, lblP2.getY() - 100);
            add(lblFundo);

        } else if (nivelNivel == 2) {
            //conf Plataformas nivel 2
            lblFundo = new Nivel2().getLblFundo1();
            add(lblP1);
            add(lblP2);
            add(lblP3);
            add(lblP4);
            add(lblP5);
            add(lblFundo);
            nivel2.getLblPlataforma1().setLocation(1000, 800);
            lblP2.setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } else if (nivelNivel == 3) {
            //conf Plataformas nivel 3
            lblFundo = new Nivel2().getLblFundo2();
            add(lblP1);
            add(lblP2);
            add(lblP3);
            add(lblP4);
            add(lblP5);
            add(lblFundo);
            nivel2.getLblPlataforma1().setLocation(0, 800);
            lblP2.setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } else if (nivelNivel == 4) {
            //conf Plataformas nivel 4
            lblFundo = new Nivel2().getLblFundo3();
            add(lblP1);
            add(lblP2);
            add(lblP3);
            add(lblP4);
            add(lblP5);
            add(lblFundo);
            nivel2.getLblPlataforma1().setLocation(0, 800);
            lblP2.setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } else if (nivelNivel == 5) {
            //conf Plataformas nivel 5
            add(lblP1);
            add(lblP2);
            add(lblP3);
            add(lblP4);
            add(lblP5);
            add(lblFundo);
            lblP1.setLocation(0, 800);
            lblP2.setLocation(700, 700);
            lblP3.setLocation(400, 500);
            lblP4.setLocation(10, 400);
            lblP5.setLocation(500, 300);
        } //erro de tela
        else {
            System.out.println("Sem nivel disponivel");
            System.out.println("Nivel nao carregado");
        }

        setResizable(true);
        setVisible(true);
        timer = new Timer(0, e -> update());
        timer.start();
        //teclado

    }

    public void receberLista(ArrayList<Integer> novaLista) {
        lista.addAll(novaLista);//adiciona todos os elementos 

    }

    public void mostrarLista() {

        System.out.println(lista);
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

    public void novaPos(int np) {
        pulando = false;
        velocidade = 0;
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
        if (player.getBounds().intersects(lblP4.getBounds())) {
            if (nivelNivel == 1) {
            } else {
                velocidade = -10;
            }
        }
        if (player.getBounds().intersects(lblP5.getBounds())) {
            velocidade = -5;
        }
        if (player.getBounds().intersects(lblP6.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(lblP7.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(lblP8.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(lblP9.getBounds())) {
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
                velocidade = 0;
                pulando = false;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP2.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP2.getY() + 20) {
                player.setLocation(player.getX(), lblP2.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP3.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP3.getY() + 20) {
                player.setLocation(player.getX(), lblP3.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP4.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP4.getY() + 20) {
                player.setLocation(player.getX(), lblP4.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP5.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP5.getY() + 20) {
                player.setLocation(player.getX(), lblP5.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            } else {
            }
        }
        if (player.getBounds().intersects(lblP6.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP6.getY() + 20) {
                player.setLocation(player.getX(), lblP6.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            } else {
            }
        }
        if (player.getBounds().intersects(lblP7.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP7.getY() + 20) {
                player.setLocation(player.getX(), lblP7.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP8.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP8.getY() + 20) {
                player.setLocation(player.getX(), lblP8.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP9.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP9.getY() + 20) {
                player.setLocation(player.getX(), lblP9.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(lblP10.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP10.getY() + 20) {
                player.setLocation(player.getX(), lblP10.getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        } else {
            pulando = true;
        }

    }

    public void update() {
        mover();
        colbaixo();
        pulando();
        mover();
        pX += novoX;
        pY += novoY;
        player.setLocation(pX, pY);
        colisao();
        repaint();
        barreira();
    }

    public void mover() {
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
    }

    public int getNivelNivel() {
        return nivelNivel;
    }

    public void setNivelNivel(int nivelNivel) {
        this.nivelNivel = nivelNivel;
    }

    public void pontoSpanw() {
        if (nivelNivel == 1) {
            pY = 700;
            pX = 1;
            player.setLocation(pX, pY);
        }
        if (nivelNivel == 2) {
            pY = 700;
            pX = 1;
            player.setLocation(pX, pY);
        }
        if (nivelNivel == 3) {
            pY = 700;
            pX = 1;
            player.setLocation(pX, pY);
        }
        if (nivelNivel == 4) {
            pY = 700;
            pX = 1;
            player.setLocation(pX, pY);
        }
        if (nivelNivel == 5) {
            pY = 700;
            pX = 1;
            player.setLocation(pX, pY);
        }

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

}
