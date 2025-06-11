package nivel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import nivel.Plataformas;
import entidades.Player;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.Timer;
import nivel.gerenciadorNivel;

/**
 *
 * @author braya
 */
public class Nivel4 extends JFrame {

    private JLabel fundo;
    private Timer time;
    private JFrame nivel4;
    private Player player;
    private JLabel lblP1 = new Plataformas().getLblPlataforma1(), lblP2 = new Plataformas().getLblPlataforma2(),
            lblP3 = new Plataformas().getLblPlataforma3(), lblP4 = new Plataformas().getLblPlataforma4(), lblP5 = new Plataformas().getLblPlataforma5(),
            lblP6 = new Plataformas().getLblPlataforma6(), lblP7 = new Plataformas().getLblPlataforma7(), lblP8 = new Plataformas().getLblPlataforma8(),
            lblP9 = new Plataformas().getLblPlataforma9(), lblP10 = new Plataformas().getLblPlataforma10();
    private int pX = 100, pY = 700;
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private int fy = 1000;
    private int novoX, novoY;

    public Nivel4() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundo4.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        

        nivel4 = new JFrame("nivel4");
        player = new Player("/res/boneco.png", pX, pY);
        player.setBackground(Color.red);
        nivel4.setResizable(false);
        nivel4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nivel4.add(player);
        carregarLabels();

        nivel4.add(fundo);
        nivel4.setBackground(Color.BLACK);
        nivel4.setSize(1600, 900);
        nivel4.setLayout(null);
        nivel4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nivel4.setVisible(true);
        time = new Timer(0, e -> atualização());
        time.start();
    }

    public void carregarLabels() {
        nivel4.add(lblP1);
        nivel4.add(lblP2);
        nivel4.add(lblP3);
        nivel4.add(lblP4);
        //nivel4.add(lblP5);
       // nivel4.add(lblP6);
        nivel4.add(lblP7);
        nivel4.add(lblP8); //platafoma apoio
        nivel4.add(lblP9); //plataforma final
        
        lblP1.setBounds(0, 800, 400, 30);
        lblP2.setBounds(400, 800, 400, 30);
        lblP3.setBounds(1000, 800, 400, 30);
        lblP4.setBounds(400, 125, 400, 30);//armadilha
        lblP5.setBounds(1600, 800, 50, 30);
        
        
        
       // lblP6.setLocation(300, 400);
        lblP7.setLocation(450, 100);
        lblP8.setLocation(0, 250);
        lblP9.setLocation(1200, 100);

    }

    
    public void moverPlat(){
    

        lblP2.setLocation(400,lblP2.getY()-3);
        if(lblP2.getY()<=0){
         lblP2.setLocation(400, 900);
        }
            
    
    
    
    }
    private void atualização() {
        moverPlat();
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
            velocidade = 4;
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
            if (player.getY() + player.getHeight() <= lblP10.getY() + 20) {
                player.setLocation(player.getX(), lblP10.getY() - player.getHeight());
                novaPos();
            }
        } else {
            pulando = true;
        }
    }

}
