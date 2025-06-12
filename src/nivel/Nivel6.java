package nivel;

import entidades.Player;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author braya
 */
public class Nivel6 extends JFrame {

    private Random random;
    private JFrame nivel6;
    private JLabel fundo;
    private JLabel plataforma1;
    private JLabel plataforma2;
    private JLabel plataforma3;
    private JLabel plataforma4;
    private JLabel perigo;
    private JLabel boss;
    private int bx = 1600, by = 150;
    private boolean movBoss = true;
    private boolean movBossX = true;
    private Timer time;
    private Timer timejogo;

    private int pX = 100, pY = 100;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private int novoX, novoY;
    private Player player;
    int ran;
    boolean teste = false;
    boolean tiro = false;
    int perigoX = 1000;
    int perigoY = -50;

    public Nivel6() {
        nivel6 = new JFrame("ARLOT - Boss");
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundo6.jpg")));
        perigo = new JLabel();

        plataforma1 = new JLabel();
        plataforma2 = new JLabel();
        plataforma3 = new JLabel();
        plataforma4 = new JLabel();
        boss = new JLabel(new ImageIcon(getClass().getResource("/res/chefe.png")));
        player = new Player("/res/boneco.png", pX, pY);
        player.setBackground(Color.red);
        nivel6.add(player);

        nivel6.setBounds(0, 0, 1600, 900);
        nivel6.setLocationRelativeTo(null);
        nivel6.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nivel6.setLayout(null);

        boss.setSize(500, 500);
        boss.setLocation(2000, 0);
        // boss.setAlignmentX(CENTER_ALIGNMENT);
        boss.setBackground(Color.red);
        boss.setOpaque(false);
        boss.setVisible(true);
        nivel6.add(boss);

        perigo.setBounds(perigoX, perigoY, 1600, 20);
        perigo.setBackground(Color.red);
        perigo.setOpaque(true);
        nivel6.add(perigo);
        plataforma1.setBounds(0, 300, 1300, 40);
        plataforma1.setBackground(Color.white);
        plataforma1.setOpaque(true);
        nivel6.add(plataforma1);
        plataforma2.setBounds(300, 600, 1300, 40);
        plataforma2.setBackground(Color.black);
        plataforma2.setOpaque(true);
        nivel6.add(plataforma2);
        plataforma3.setBounds(0, 800, 1000, 40);
        plataforma3.setBackground(Color.black);
        plataforma3.setOpaque(true);
        nivel6.add(plataforma3);
        plataforma4.setBounds(1300, 800, 300, 40);
        plataforma4.setBackground(Color.black);
        plataforma4.setOpaque(true);
        nivel6.add(plataforma4);

        fundo.setSize(1600, 900);
        fundo.setVisible(true);
        nivel6.add(fundo);
        nivel6.setVisible(true);

        movBoss();

        time = new Timer(30, e -> movBoss());
        time.stop();
        timejogo = new Timer(20, e -> update());
        timejogo.start();
        //time.stop();
        //boss.setSize(500, 500);
        random = new Random();

    }

    private void update() {
        ran = random.nextInt(1, 9);
        perigoX -= 10;
        perigo.setLocation(perigoX, perigoY);

        atac();
        //movBoss();
        pX += novoX;
        pY += novoY;
        mover();
        colbaixo();
        pulando();

        player.setLocation(pX, pY);
        colisao();
        barreira();
        repaint();

    }

    public void atac() {
        if (tiro == true) {
        }

        if (ran == 4) {

            teste = true;
        }
        if (teste == true) {

        }
        if (perigoX == -100) {

        }

    }

    public void pisos() {

    }

    public void movBoss() {
        if (movBoss == true) {
            by += 3;

            if (by >= 250) {
                movBoss = false;
            }
        } else if (movBoss == false) {
            by -= 3;

            if (by <= 60) {
                movBoss = true;
            }
        }
        //
        if (movBossX == true) {
            bx -= 2;

            if (bx <= 1200) {
                movBossX = false;
            }
        } else if (movBossX == false) {
            bx += 2;

            if (bx >= 1300) {
                movBossX = true;
            }
        }

        boss.setLocation(bx, by);

    }

    private void barreira() {
        if (player.getY() >= 900) {
            velocidade = 0;
            pY = 100;
            pX = 100;
        }
        if (player.getX() >= 1540 || player.getX() <= 10) {
            novoX = 0;
        }
    }

    public void mover() {
        nivel6.addKeyListener(new KeyAdapter() {
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

    private void colisao() {

        if (player.getBounds().intersects(plataforma1.getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= plataforma1.getY() + 20) {
                player.setLocation(player.getX(), plataforma1.getY() - player.getHeight());
                novaPos();

            }
        }
        if (player.getBounds().intersects(plataforma2.getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= plataforma2.getY() + 20) {
                player.setLocation(player.getX(), plataforma2.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(plataforma3.getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= plataforma3.getY() + 20) {
                player.setLocation(player.getX(), plataforma3.getY() - player.getHeight());
                novaPos();
            }
        }
        if (player.getBounds().intersects(plataforma4.getBounds())) {
            if (player.getY() + player.getHeight() - 10 <= plataforma4.getY() + 20) {
                player.setLocation(player.getX(), plataforma4.getY() - player.getHeight());
                pX = 100;
                pY = 100;
                boss.setVisible(true);
                time.start();
                player.setLocation(50, 580);
                plataforma1.setBounds(0, 610, 1000, 40);
                plataforma2.setLocation(0, -200);
                plataforma3.setLocation(0, -200);
                plataforma4.setLocation(0, -200);
              perigo.setLocation(perigoX, 500);

//novaPos();
            }
        } else {
            pulando = true;
        }
    }

    public void colbaixo() {
        if (player.getBounds().intersects(plataforma1.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(plataforma2.getBounds())) {
            velocidade = -10;
        }
        if (player.getBounds().intersects(plataforma3.getBounds())) {
            velocidade = -10;
        }
    }
//verificar 
}
