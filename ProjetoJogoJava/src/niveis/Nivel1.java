package niveis;

import java.awt.Color;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Nivel1 extends JFrame implements KeyListener {

    //atributos 
    private JFrame tela_nivel1;
    private ImageIcon fundo_imagem;
    private JLabel lbl_fundo;
    private ImageIcon imgboneco;
    private JLabel lbl_boneco;
    int x = 100, y = 800;
    int dx, dy;
    int tecla;
    private JLabel lbl_prataforma1;
    private int velocity;
    private boolean isJumping = false;
    private int fy = 800;

    public Nivel1() {
        {
            //instanciando objetos
            tela_nivel1 = new JFrame();
            ImageIcon fundo_imagem = new ImageIcon(getClass().getResource("/IMG/fundo_telaAbertura.png"));
            lbl_fundo = new JLabel();
            ImageIcon imgboneco = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
            lbl_boneco = new JLabel();
            lbl_prataforma1 = new JLabel();

            //configurações da janela
            tela_nivel1.setSize(1600, 900);
            tela_nivel1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            tela_nivel1.setResizable(false);
            tela_nivel1.setLocationRelativeTo(null);

            new Timer(15, e -> update()).start();

            //configurando boneco
            lbl_boneco.setIcon(imgboneco);
            lbl_boneco.setBackground(Color.red);
            lbl_boneco.setOpaque(true);
            lbl_boneco.setBounds(x, y, 60, 60);
            lbl_boneco.setSize(60, 60);
            lbl_boneco.setVisible(true);
            tela_nivel1.add(lbl_boneco);

            //configuração da plataforma
            lbl_prataforma1.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma1.setOpaque(true);
            lbl_prataforma1.setBounds(100, 750, 1400, 50);
            lbl_prataforma1.setVisible(true);
            tela_nivel1.add(lbl_prataforma1);

            //fundo
            lbl_fundo.setIcon(fundo_imagem);
            lbl_fundo.setBounds(0, 0, 1600, 900);
            lbl_fundo.setVisible(true);
            tela_nivel1.add(lbl_fundo);
        }

        tela_nivel1.setVisible(true);
        tela_nivel1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int tecla = e.getKeyCode();

                switch (tecla) {
                    //Direita
                    case KeyEvent.VK_D -> {
                        dx = +15;
                        System.out.println("d");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                    //Esquerda
                    case KeyEvent.VK_A -> {
                        dx = -15;
                        System.out.println("a");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D || tecla == KeyEvent.VK_A) {
                    dx = 0;
                    System.out.println(tecla);
                }

                //Pulo
                if (tecla == KeyEvent.VK_SPACE) {
                    isJumping = true;
                    velocity = 20;
                }
            }
            
        }
        );
    }

    public void update() {

        if (lbl_boneco.getBounds().intersects(lbl_prataforma1.getBounds())) {
            System.out.println(" encostou");

        }
        if (isJumping) {
            

            y -= velocity;
            velocity -= 1;
            x = x + dx;

        }
        if (y >= fy) {
            isJumping = false;
            velocity = 0;

        }
        
        
        
        
        lbl_boneco.setLocation(x, y);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("event e");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("event e");

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("event e");

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/**
 * o boneco fica planando ate o -1 if
 * (lbl_boneco.getBounds().intersects(lbl_prataforma1.getBounds())) { y =
 * lbl_prataforma1.getY() - 100; lbl_boneco.setLocation(x, y);
 * lbl_boneco.setLocation(x, lbl_prataforma1.getY());
 * System.out.println("encostou"); }
 */
