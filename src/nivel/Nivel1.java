package nivel;

import entidades.Player;
import game.EscolhaNivel;
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
public class Nivel1 extends JFrame {

    private JLabel fundo;
    private Timer time;
    private JFrame nivel4;
    private Player player;
    private JLabel lblP1 = new Plataformas().getLblPlataforma1(), lblP2 = new Plataformas().getLblPlataforma2(),
            lblP3 = new Plataformas().getLblPlataforma3(), lblP4 = new Plataformas().getLblPlataforma4(), lblP5 = new Plataformas().getLblPlataforma5(),
            lblP6 = new Plataformas().getLblPlataforma6(), lblP7 = new Plataformas().getLblPlataforma7(), lblP8 = new Plataformas().getLblPlataforma8(),
            lblP9 = new Plataformas().getLblPlataforma9();
    JLabel lblP10 = new Plataformas().getLblPlataforma10(), lblP11 = new Plataformas().getLblPlataforma11();
    private int pX = 100, pY = 700;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private int novoX, novoY;
    private int mortes = 0;
    private JLabel placar;

    public Nivel1() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundo1.jpeg")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);

        nivel4 = new JFrame("ARLOT - Nivel 1");
        player = new Player("/res/boneco.png", pX, pY);
        player.setBackground(Color.red);
        nivel4.add(player);

        placar = new JLabel("Mortes: " + mortes);
        placar.setFont(new Font("Arial", Font.BOLD, 35));
        placar.setBounds(1400, 0, 200, 100);
        placar.setVisible(true);
        nivel4.add(placar);

        carregarLabels();

        nivel4.add(fundo);
        nivel4.setSize(1600, 900);
        nivel4.setLayout(null);
        nivel4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nivel4.setResizable(false);
        nivel4.setVisible(true);
        time = new Timer(15, e -> atualização());
        time.start();

    }

    public void carregarLabels() {

        lblP1.setLocation(0, 800);
        lblP2.setLocation(700, 700);
        lblP3.setLocation(1300, 600);
        lblP4.setBounds(1550, 400, 40, 200);
        lblP5.setLocation(1000, 400);
        lblP6.setLocation(300, 400);
        lblP7.setLocation(500, 100);
        lblP8.setLocation(0, 250);
        lblP9.setLocation(1300, 100);
        lblP10.setLocation(1000, 100);
        lblP11.setLocation(1500, 850);

        lblP10.setBackground(Color.GREEN);
        lblP10.setOpaque(true);
        lblP10.setBounds(1550, 50, 50, 50);
        lblP11.setBackground(Color.red);
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
        nivel4.add(lblP11);

    }

    private void atualização() {
        mover();
        colbaixo();
        pulando();
        pX += novoX;
        pY += novoY;
        player.setLocation(pX, pY);
        colisao();
        barreira();
        repaint();
    }

    public void pontoSpanw() {
        pY = 700;
        pX = 1;
        player.setLocation(pX, pY);
    }

    private void barreira() {
        if (player.getY() >= 900) {
            velocidade = 0;
            pY = 700;
            pX = 10;
            mortes += 1;
            placar.setText("Mortes: " + mortes);
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
            lblP10.setBackground(Color.red);
            lblP11.setBackground(Color.GREEN);
            pontoSpanw();

        }
        if (player.getBounds().intersects(lblP11.getBounds())) {
            lblP10.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, """
                                                Passou
                                                depois de: """ + mortes + " mortes");
            pontoSpanw();
            nivel4.dispose();
            new EscolhaNivel();
        } else {
            pulando = true;
        }
    }
}
