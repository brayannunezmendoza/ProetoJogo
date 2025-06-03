package niveis;

import java.awt.Color;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.MouseEvent;

public class Nivel1 extends JFrame implements KeyListener {

    //atributos 
    private JFrame tela_nivel1;
    private ImageIcon fundo_imagem;
    private JLabel lbl_fundo;
    private ImageIcon imgboneco;
    private JLabel lbl_boneco;
    int x = 100, y = 720;
    int dx, dy;
    int tecla;
    private JLabel lbl_prataforma1;
    private JLabel lbl_prataforma2;
    private JLabel lbl_prataforma3;
    private JLabel lbl_prataforma4;
    private JLabel lbl_prataforma5;
    private JLabel lbl_prataforma6;
    private int velocity;
    private boolean isJumping = false;
    private int fy = 800;
    private boolean nochao = false;

    public Nivel1() {
        {
            //instanciando objetos
            tela_nivel1 = new JFrame();
            ImageIcon fundo_imagem = new ImageIcon(getClass().getResource("/IMG/fundo_telaAbertura.png"));
            lbl_fundo = new JLabel();
            ImageIcon imgboneco = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
            lbl_boneco = new JLabel();
            lbl_prataforma1 = new JLabel();
            lbl_prataforma2 = new JLabel();
            lbl_prataforma3 = new JLabel();
            lbl_prataforma4 = new JLabel();
            lbl_prataforma5 = new JLabel();
            lbl_prataforma6 = new JLabel();

            //configurações da janela
            tela_nivel1.setSize(1600, 900);
            tela_nivel1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            tela_nivel1.setResizable(false);
            tela_nivel1.setLocationRelativeTo(null);

            new Timer(20, e -> update()).start();

            //configurando boneco
            lbl_boneco.setIcon(imgboneco);
            lbl_boneco.setBackground(Color.red);
            lbl_boneco.setOpaque(false);
            lbl_boneco.setBounds(x, y, 60, 60);
            lbl_boneco.setSize(60, 60);
            lbl_boneco.setVisible(true);
            tela_nivel1.add(lbl_boneco);

            //configuração da plataforma
            lbl_prataforma1.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma1.setOpaque(true);
            lbl_prataforma1.setBounds(130, 750, 500, 40);
            lbl_prataforma1.setVisible(true);
            tela_nivel1.add(lbl_prataforma1);

            //plataforma 2
            lbl_prataforma2.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma2.setOpaque(true);
            lbl_prataforma2.setBounds(1100, 600, 200, 40);
            lbl_prataforma2.setVisible(true);
            tela_nivel1.add(lbl_prataforma2);
            //plataforma 3
            lbl_prataforma3.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma3.setOpaque(true);
            lbl_prataforma3.setBounds(10, 100, 150, 40);
            lbl_prataforma3.setVisible(true);
            tela_nivel1.add(lbl_prataforma3);
            //plataforma 4
            lbl_prataforma4.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma4.setOpaque(true);
            lbl_prataforma4.setBounds(800, 400, 10, 40);
            lbl_prataforma4.setVisible(true);
            tela_nivel1.add(lbl_prataforma4);
            //plataforma 5
            lbl_prataforma5.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma5.setOpaque(true);
            lbl_prataforma5.setBounds(400, 300, 100, 40);
            lbl_prataforma5.setVisible(true);
            tela_nivel1.add(lbl_prataforma5);
            //plataforma 6
            lbl_prataforma6.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_prataforma6.setOpaque(true);
            lbl_prataforma6.setBounds(1300, 250, 300, 40);
            lbl_prataforma6.setVisible(true);
            tela_nivel1.add(lbl_prataforma6);

            //fundo
            lbl_fundo.setIcon(fundo_imagem);
            lbl_fundo.setBounds(0, 0, 1600, 900);
            lbl_fundo.setVisible(true);
            tela_nivel1.add(lbl_fundo);

            lbl_boneco.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    System.out.println("clciado");
                }
            });

        }

        tela_nivel1.setVisible(true);
        tela_nivel1.addKeyListener(new KeyAdapter() {
            //movimentação
            @Override
            public void keyPressed(KeyEvent e) {
                int tecla = e.getKeyCode();

                switch (tecla) {
                    //Direita
                    case KeyEvent.VK_D -> {
                        dx = +14;
                        System.out.println("d");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                    //Esquerda
                    case KeyEvent.VK_A -> {
                        dx = -14;
                        System.out.println("a");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                }
            }

            public void mouseClicked() {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D || tecla == KeyEvent.VK_A) {
                    dx = 0;
                    System.out.println(tecla);
                }

                //Pulo
                if (isJumping == false) {
                    if (tecla == KeyEvent.VK_SPACE) {
                        System.out.println("pulou");
                        isJumping = true;
                        velocity = 18;
                    }
                }
                if (isJumping == true) {
                    System.out.println("nao pula");
                }

            }
        }
        );

    }

    public void p1() {

        if (lbl_boneco.getBounds().intersects(lbl_prataforma1.getBounds())) {
            dy = lbl_prataforma1.getY();
            lbl_boneco.setLocation(x, lbl_prataforma1.getY());
            System.out.println("encostou");

            fy = lbl_prataforma1.getY() - 40;
            x = x + dx;

        } else if (lbl_boneco.getBounds().intersects(lbl_prataforma2.getBounds())) {

            dy = lbl_prataforma2.getY();
            lbl_boneco.setLocation(x, lbl_prataforma2.getY());
            System.out.println("encostou");

            fy = lbl_prataforma2.getY() - 40;
            x = x + dx;
                        
                      

        } else if (lbl_boneco.getBounds().intersects(lbl_prataforma3.getBounds())) {

            dy = lbl_prataforma3.getY();
            lbl_boneco.setLocation(x, lbl_prataforma3.getY());
            System.out.println("encostou");

            fy = lbl_prataforma3.getY() - 40;
            x = x + dx;

        }else if (lbl_boneco.getBounds().intersects(lbl_prataforma4.getBounds())) {

            dy = lbl_prataforma4.getY();
            lbl_boneco.setLocation(x, lbl_prataforma4.getY());
            System.out.println("encostou");

            fy = lbl_prataforma4.getY() - 40;
            x = x + dx;

        }  else if (lbl_boneco.getBounds().intersects(lbl_prataforma5.getBounds())) {

            dy = lbl_prataforma5.getY();
            lbl_boneco.setLocation(x, lbl_prataforma5.getY());
            System.out.println("encostou");

            fy = lbl_prataforma5.getY() - 40;
            x = x + dx;

        } else if (lbl_boneco.getBounds().intersects(lbl_prataforma6.getBounds())) {

            dy = lbl_prataforma6.getY();
            lbl_boneco.setLocation(x, lbl_prataforma6.getY());
            System.out.println("encostou");

            fy = lbl_prataforma6.getY() - 40;
            x = x + dx;

        } 
        
        
        else {
            isJumping = true;
            fy = 850;
        }

    }

    public void andar() {
        ////pulo
        if (isJumping) {
            y -= velocity;
            velocity -= 1;
            x = x + dx;
        }
        if (y >= fy) {
            isJumping = false;
            velocity = 0;
        }

    }

    public void update() {
        p1();
        andar();

        lbl_boneco.setLocation(x, y);
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

/**
 * o boneco fica planando ate o -1 if
 * (lbl_boneco.getBounds().intersects(lbl_prataforma1.getBounds())) { y =
 * lbl_prataforma1.getY() - 100; lbl_boneco.setLocation(x, y);
 * lbl_boneco.setLocation(x, lbl_prataforma1.getY());
 * System.out.println("encostou"); }
 */
