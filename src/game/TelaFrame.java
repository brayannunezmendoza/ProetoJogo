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
public class TelaFrame extends JFrame implements KeyListener {


    private JLabel lblp2;
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
 
    private int nivelNivel = 2;
    //adicionar cenario nivel 5
    //definir spaw em cada nivel
    private ArrayList<Integer> lista;
//receber valor de nivel
    

    public TelaFrame() {

        mostrarLista();

        //GerenciadorNiveis gerente = new GerenciadorNiveis();
        //gerente.setLevelsLista(listaNiveis);
        lblp2 = new JLabel();
        nivel2 = new Nivel2();

        player = new Player("/res/boneco.png", pX, pY);
        add(player);
        //tela Frame
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //ADD ao Frame
        /*add(nivel2.getLblPlataforma1());
        add(nivel2.getLblPlataforma2());
        add(nivel2.getLblPlataforma3());
        add(nivel2.getLblPlataforma4());
        add(nivel2.getLblPlataforma5());
        add(lblp2);*/
        //Posivionando Labels
        /* nivel2.getLblPlataforma1().setLocation(0, 800);
        nivel2.getLblPlataforma2().setLocation(700, 700);
        nivel2.getLblPlataforma3().setLocation(400, 500);
        nivel2.getLblPlataforma4().setLocation(10, 400);
        nivel2.getLblPlataforma5().setLocation(500, 300);*/
        if (nivelNivel == 1) {

            //conf Plataformas nivel 1
            lblp2 = new Nivel2().getLblFundo();
            lblp2.setVisible(true);
            add(nivel2.getLblPlataforma1());
            add(nivel2.getLblPlataforma2());
            add(nivel2.getLblPlataforma3());
            add(nivel2.getLblPlataforma4());
            add(nivel2.getLblPlataforma5());
            add(nivel2.getLblPlataforma6());
            add(nivel2.getLblPlataforma7());
            add(nivel2.getLblPlataforma8());
            add(nivel2.getLblPlataforma9());

            nivel2.getLblPlataforma1().setLocation(0, 800);
            nivel2.getLblPlataforma2().setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(1300, 600);
            nivel2.getLblPlataforma4().setBounds(1550, 400, 40, 200);
            nivel2.getLblPlataforma5().setLocation(1000, 300);
            nivel2.getLblPlataforma6().setLocation(300, 300);
            nivel2.getLblPlataforma7().setLocation(500, 100);
            nivel2.getLblPlataforma8().setLocation(0, 10);
            nivel2.getLblPlataforma9().setLocation(1500, 100);
            nivel2.getLblPlataforma9().setVisible(true);
            add(lblp2);

        }
        else if (nivelNivel == 2) {
            //conf Plataformas nivel 2
            lblp2 = new Nivel2().getLblFundo1();
            add(nivel2.getLblPlataforma1());
            add(nivel2.getLblPlataforma2());
            add(nivel2.getLblPlataforma3());
            add(nivel2.getLblPlataforma4());
            add(nivel2.getLblPlataforma5());
            add(lblp2);
            nivel2.getLblPlataforma1().setLocation(1000, 800);
            nivel2.getLblPlataforma2().setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        }
        else if (nivelNivel == 3) {
            //conf Plataformas nivel 3
            lblp2 = new Nivel2().getLblFundo2();

            add(nivel2.getLblPlataforma1());
            add(nivel2.getLblPlataforma2());
            add(nivel2.getLblPlataforma3());
            add(nivel2.getLblPlataforma4());
            add(nivel2.getLblPlataforma5());
            add(lblp2);
            nivel2.getLblPlataforma1().setLocation(0, 800);
            nivel2.getLblPlataforma2().setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } 
        else if (nivelNivel == 4) {
            //conf Plataformas nivel 4
            lblp2 = new Nivel2().getLblFundo3();

            add(nivel2.getLblPlataforma1());
            add(nivel2.getLblPlataforma2());
            add(nivel2.getLblPlataforma3());
            add(nivel2.getLblPlataforma4());
            add(nivel2.getLblPlataforma5());
            add(lblp2);
            nivel2.getLblPlataforma1().setLocation(0, 800);
            nivel2.getLblPlataforma2().setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } 
        else if (nivelNivel == 5) {
            //conf Plataformas nivel 5
            add(nivel2.getLblPlataforma1());
            add(nivel2.getLblPlataforma2());
            add(nivel2.getLblPlataforma3());
            add(nivel2.getLblPlataforma4());
            add(nivel2.getLblPlataforma5());
            add(lblp2);
            nivel2.getLblPlataforma1().setLocation(0, 800);
            nivel2.getLblPlataforma2().setLocation(700, 700);
            nivel2.getLblPlataforma3().setLocation(400, 500);
            nivel2.getLblPlataforma4().setLocation(10, 400);
            nivel2.getLblPlataforma5().setLocation(500, 300);
        } //erro de tela
        else {
            System.out.println("Sem nivel disponivel");
            System.out.println("Nivel nao carregado");
        }

        { //configurando Recs
            //nivel2.getRec2().setBounds(nivel2.getLblPlataforma2().getBounds());
            //nivel2.getRec1().setLocation(nivel2.getLblPlataforma1().getX(), nivel2.getLblPlataforma1().getY()+10);
            //nivel2.getRec2().setLocation(nivel2.getLblPlataforma2().getX(), nivel2.getLblPlataforma2().getY() + 100);
            // nivel2.getRec3().setLocation(nivel2.getLblPlataforma3().getX(), nivel2.getLblPlataforma3().getY() + 100);
            // nivel2.getRec1().setBounds(nivel2.getLblPlataforma1().getBounds());
            //System.out.println("a"+nivel2.getRec2().getLocation());
            // System.out.println("a"+nivel2.getRec2().getBounds());
            //System.out.println("b"+nivel2.getLblPlataforma2().getLocation());
            //System.out.println(nivel2.getRec2());
            //System.out.println(nivel2.getLblPlataforma2());}

        }

        setResizable(true);
        setVisible(true);
        timer = new Timer(0, e -> update());
        timer.start();
        //teclado
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

        // nY = 10;
        // nivel2.setN(nY);
        //nivel2.getN();
        //System.out.println(nivel2.getN());
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void novaPos(int np) {
        pulando = false;
        velocidade = 0;
        caindo = true;
    }

    public void colbaixo() {
        if (player.getBounds().intersects(nivel2.getLblPlataforma1().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma2().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma3().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma4().getBounds())) {
        if (nivelNivel == 1) {
            }
        else {
                velocidade = -10;
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma5().getBounds())) {
            velocidade = -5;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma6().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma7().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma8().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma9().getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma10().getBounds())) {
            velocidade = -10;
        }
    }

    public void colisao() {
        if (player.getBounds().intersects(nivel2.getLblPlataforma1().getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= nivel2.getLblPlataforma1().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma1().getY() - player.getHeight());
                velocidade = 0;
                pulando = false;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma2().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma2().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma2().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma3().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma3().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma3().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma4().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma4().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma4().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma5().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma5().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma5().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            } else {
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma6().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma6().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma6().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            } else {
            }
        }
        if (player.getBounds().intersects(nivel2.getLblPlataforma7().getBounds())) {
            if (player.getY() + player.getHeight() <= nivel2.getLblPlataforma7().getY() + 20) {
                player.setLocation(player.getX(), nivel2.getLblPlataforma7().getY() - player.getHeight());
                pulando = false;
                velocidade = 0;
                caindo = true;
            } else {
            }
        } // }
        //if (player.getBounds().intersects(nivel2.getRec1().getBounds())) {
        //  player.setLocation(player.getX(), (int) (nivel2.getRec1().getY() - player.getHeight()));
        // pulando = true;
        // }
        //if (player.getBounds().intersects(nivel2.getRec2().getBounds())) {
        //     player.setLocation(player.getX(), (int) (nivel2.getRec2().getY() +player.getHeight()));
        //  velocidade=0;
        // }
        //if (player.getBounds().intersects(nivel2.getRec3().getBounds())) {
        //player.setLocation(player.getX(), (int) (nivel2.getRec3().getY() - player.getHeight()));
        else {
            pulando = true;
        }

    }

    public void update() {
        colbaixo();
        System.out.println(player.getY());
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
