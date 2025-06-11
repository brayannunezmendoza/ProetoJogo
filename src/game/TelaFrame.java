package game;

import entidades.Player;
//import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
////import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import nivel.Plataformas;
import nivel.gerenciadorNivel;
import game.EscolhaNivel;

/**
 *
 * @author braya
 */
public class TelaFrame extends JFrame {

    private EscolhaNivel newn;
    private JLabel lblFundo;
    private Plataformas nivel2;
    private Player player;
    private int pX = 1, pY = 700;
    private int novoX, novoY;
    private Timer timer;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private JLabel moeda1;
    private JLabel moeda2;
    private JLabel moeda3;
    private JLabel moeda4;
    private JLabel moeda5;
    private JLabel moeda;
    private JLabel lblP1 = new Plataformas().getLblPlataforma1(),
            lblP2 = new Plataformas().getLblPlataforma2(), lblP3 = new Plataformas().getLblPlataforma3(),
            lblP4 = new Plataformas().getLblPlataforma4(), lblP5 = new Plataformas().getLblPlataforma5(),
            lblP6 = new Plataformas().getLblPlataforma6(), lblP7 = new Plataformas().getLblPlataforma7(),
            lblP8 = new Plataformas().getLblPlataforma8(), lblP9 = new Plataformas().getLblPlataforma9(),
            lblP10 = new Plataformas().getLblPlataforma10();
    private int nivelNivel = 1;

    //adicionar cenario nivel 5
    //definir spaw em cada nivel
//receber valor de nivel
    public TelaFrame() {
        //receberValor();
        // System.out.println(receberValor());
        //m=new EscolhaNivel();

        //nivelNivel = m.mandarValor();
        //System.out.println("tem: "+m);
        // nivelNivel=receberValor();
        // System.out.println(receberValor());
        //gerenciadorNivel.setValor(3);
        //nivelNivel = receberValor();
        //GerenciadorNiveis gerente = new GerenciadorNiveis();
        //gerente.setLevelsLista(listaNiveis);
        lblFundo = new JLabel();
        nivel2 = new Plataformas();
        moeda = new Plataformas().getLblMoeda();
        moeda1 = new Plataformas().getLblMoeda();
        moeda2 = new Plataformas().getLblMoeda();
        moeda3 = new Plataformas().getLblMoeda();
        moeda4 = new Plataformas().getLblMoeda();
        moeda5 = new Plataformas().getLblMoeda();
        player = new Player("/res/boneco.png", pX, pY);
        add(player);
        //tela Frame
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //System.out.println("TelaFrame"+gerente.getLevels());
        mapa();

        setResizable(true);
        setVisible(true);
        timer = new Timer(0, e -> update());
        timer.start();
        //teclado
        setFocusable(true);

    }

    public void mapa() {
        if (nivelNivel == 0) {
            System.out.println("nivel obrigado 0");

        }
        if (nivelNivel == 1) {

            moeda.setVisible(true);
            moeda1.setLocation(600, 600);

            System.out.println(moeda.getLocation());

            //conf Plataformas nivel 1
            lblFundo = new Plataformas().getLblFundo();
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
            lblFundo = new Plataformas().getLblFundo1();
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
            lblFundo = new Plataformas().getLblFundo2();
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
            lblFundo = new Plataformas().getLblFundo3();
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
            if (player.getY() + player.getHeight() <= lblP4.getY() + 20) {
                player.setLocation(player.getX(), lblP4.getY() - player.getHeight());
                novaPos();
            }
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
            if (player.getY() + player.getHeight() <= lblP7.getY() + 20) {
                player.setLocation(player.getX(), lblP7.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(lblP8.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP8.getY() + 20) {
                player.setLocation(player.getX(), lblP8.getY() - player.getHeight());
               novaPos();
            }
        }
        if (player.getBounds().intersects(lblP9.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP9.getY() + 20) {
                player.setLocation(player.getX(), lblP9.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(lblP10.getBounds())) {
            if (player.getY() + player.getHeight() <= lblP10.getY() + 20) {
                player.setLocation(player.getX(), lblP10.getY() - player.getHeight());
               novaPos();
            }
        } else {
            pulando = true;
        }
    }

    public void update() {
        //   teste();
        mover();
        colbaixo();
        pulando();
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

    public void teste() {

    }

   
}
