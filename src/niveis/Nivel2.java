package niveis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Nivel2 extends JFrame implements KeyListener {

    //atributos 
    private JFrame tela_nivel1;
    private ImageIcon fundo_imagem;
    private JLabel lbl_fundo;
    private ImageIcon imgboneco;
    private JLabel lbl_boneco;
    int x = 100, y = 720;
    int dx, dy;
    int tecla;
    private JLabel lbl_chao;
    private JLabel lbl_guia;
    private JLabel lbl_plataforma;
    private JLabel lbl_escada;
    private JLabel lbl_escada2;
    private JLabel lbl_gui2;
    private JLabel lbl_plataformaWind;
    private JLabel lbl_obstaculo;
    private JLabel lbl_derrota;
    private JLabel lbl_indicadorMortes;
    private JLabel lbl_barreira;
    private JLabel lbl_barreira1;
    private JLabel lbl_plataforma2;
    private int contadorMortes;
    
    private int velocity;
    private boolean isJumping = false;
    private int fy = 800;
    private boolean nochao = false;
    
    private JLabel bixo1;
    private JLabel bixo2;
    private int bx = 0, by = 553;
    
    boolean movbic = true;
    
    private int bx1 = 200;
    private int by1 = 300;
    boolean movbic1 = false;
    
    public Nivel2() {
        {
            //instanciando objetos
            tela_nivel1 = new JFrame();
            ImageIcon fundo_imagem = new ImageIcon(getClass().getResource("/IMG/fundo22.jpeg"));
            lbl_fundo = new JLabel();
            ImageIcon imgboneco = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
            lbl_boneco = new JLabel();
            lbl_chao = new JLabel();
            lbl_guia = new JLabel();
            lbl_plataforma = new JLabel();
            lbl_escada = new JLabel();
            lbl_escada2 = new JLabel();
            lbl_gui2 = new JLabel();
            lbl_plataformaWind = new JLabel();
            lbl_obstaculo = new JLabel();
            lbl_derrota = new JLabel();
            lbl_barreira = new JLabel();
            lbl_barreira1 = new JLabel();
            lbl_indicadorMortes = new JLabel();
            lbl_plataforma2 = new JLabel();
            bixo1 = new JLabel();
            bixo2 = new JLabel();

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
            lbl_boneco.setBounds(x, y, 50, 100);
            lbl_boneco.setSize(60, 60);
            lbl_boneco.setVisible(true);
            tela_nivel1.add(lbl_boneco);

            //configurando chao
            lbl_chao.setBackground(Color.GRAY);
            lbl_chao.setOpaque(true);
            lbl_chao.setBounds(-100, 800, 1800, 50);
            lbl_chao.setVisible(true);
            tela_nivel1.add(lbl_chao);
            
            bixo1.setBackground(Color.PINK);
            bixo1.setOpaque(true);
            bixo1.setBounds(bx, by, 30, 30);
            bixo1.setVisible(true);
            tela_nivel1.add(bixo1);
            
            bixo2.setBackground(Color.PINK);
            bixo2.setOpaque(true);
            bixo2.setBounds(bx1, by1, 30, 30);
            bixo2.setVisible(true);
            tela_nivel1.add(bixo2);

            //guia
            lbl_guia.setBackground(Color.BLACK);
            lbl_guia.setOpaque(true);
            lbl_guia.setBounds(0, 550, 1200, 1);
            lbl_guia.setVisible(false);
            tela_nivel1.add(lbl_guia);
            //guia 2
            lbl_gui2.setBackground(Color.black);
            lbl_gui2.setOpaque(false);
            lbl_gui2.setBounds(100, 302, 1400, 1);
            lbl_gui2.setVisible(true);
            tela_nivel1.add(lbl_gui2);

            //plataforma
            lbl_plataforma.setBackground(Color.red);
            lbl_plataforma.setOpaque(true);
            lbl_plataforma.setBounds(0, 583, 1200, 20);
            lbl_plataforma.setVisible(true);
            tela_nivel1.add(lbl_plataforma);
            //plataforma 2
            lbl_plataforma2.setBackground(Color.MAGENTA);
            lbl_plataforma2.setOpaque(true);
            lbl_plataforma2.setBounds(100, 329, 1400, 20);
            lbl_plataforma2.setVisible(true);
            tela_nivel1.add(lbl_plataforma2);

            //escada
            lbl_escada.setBackground(new Color(139, 69, 19));
            lbl_escada.setOpaque(true);
            lbl_escada.setBounds(1500, 550, 10, 300);
            lbl_escada.setVisible(true);
            tela_nivel1.add(lbl_escada);
            //escada2
            lbl_escada2.setBackground(new Color(139, 69, 19));
            lbl_escada2.setOpaque(true);
            lbl_escada2.setBounds(20, 300, 10, 200);
            lbl_escada2.setVisible(true);
            tela_nivel1.add(lbl_escada2);

            //platataforma obstaculo 
            lbl_obstaculo.setBounds(-80, 0, 1, 1000);
            lbl_obstaculo.setVisible(true);
            tela_nivel1.add(lbl_obstaculo);
            //plataforma win
            lbl_plataformaWind.setBackground(Color.GREEN);
            lbl_plataformaWind.setOpaque(true);
            lbl_plataformaWind.setBounds(1530, 200, 50, 50);
            lbl_plataformaWind.setVisible(true);
            tela_nivel1.add(lbl_plataformaWind);
            //plataforma lost
            lbl_derrota.setBackground(Color.RED);
            lbl_derrota.setOpaque(true);
            lbl_derrota.setBounds(0, 750, 30, 30);
            lbl_derrota.setVisible(true);
            tela_nivel1.add(lbl_derrota);
            //indicador de mortes          
            lbl_indicadorMortes.setBounds(1400, 35, 250, 100);
            lbl_indicadorMortes.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
            lbl_indicadorMortes.setForeground(Color.BLACK);
            lbl_indicadorMortes.setVisible(true);
            tela_nivel1.add(lbl_indicadorMortes);
            //configuração barreira 
            lbl_barreira.setBackground(Color.getHSBColor(30, 100, 58));
            lbl_barreira.setOpaque(true);
            lbl_barreira.setBounds(1700, 0, 10, 1000);
            lbl_barreira.setVisible(true);
            tela_nivel1.add(lbl_barreira);

            //fundo
            lbl_fundo.setIcon(fundo_imagem);
            lbl_fundo.setBounds(0, 0, 1600, 900);
            lbl_fundo.setVisible(true);
            tela_nivel1.add(lbl_fundo);
            
            
        }
        
        tela_nivel1.setVisible(true);
        tela_nivel1.addKeyListener(new KeyAdapter() {
            //movimentação
            //teclado pressioando a d space
            @Override
            public void keyPressed(KeyEvent e) {
                int tecla = e.getKeyCode();
                
                switch (tecla) {
                    //Direita
                    case KeyEvent.VK_D -> {
                        dx = +14;
                        //System.out.println("d");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                    //Esquerda
                    case KeyEvent.VK_A -> {
                        dx = -14;
                       //System.out.println("a");
                        x = x + dx;
                        lbl_boneco.setLocation(x, y);
                    }
                }
            }

            //teclado a d space
            @Override
            public void keyReleased(KeyEvent e) {
                tecla = e.getKeyCode();
                if (tecla == KeyEvent.VK_D || tecla == KeyEvent.VK_A) {
                    dx = 0;
                    
                }

                //Pulo
                if (isJumping == false) {
                    if (tecla == KeyEvent.VK_SPACE) {
                       //System.out.println("pulou");
                        isJumping = true;
                        velocity = 18;
                    }
                }
                if (isJumping == true) {
                    //System.out.println("nao pula");
                }
                
            }
        }
        );
        
    }

    //metodo que é responsavel pelas morte
    public void mortes() {
        if (lbl_boneco.getBounds().intersects(lbl_barreira.getBounds())) {
            contadorMortes++;
            x = 100;
            y = 750;
            lbl_indicadorMortes.setText("Mortes: " + contadorMortes);
            bx = 0;
            movbic = true;
        }
        if (lbl_boneco.getBounds().intersects(lbl_obstaculo.getBounds())) {
            contadorMortes++;
            x = 100;
            y = 750;
            lbl_indicadorMortes.setText("Mortes: " + contadorMortes);
            bx = 0;
            movbic = true;
        }
        if (lbl_boneco.getBounds().intersects(lbl_derrota.getBounds())) {
            contadorMortes++;
            x = 100;
            y = 750;
            lbl_indicadorMortes.setText("Mortes: " + contadorMortes);
            bx = 0;
            movbic = true;
        }
        if (lbl_boneco.getBounds().intersects(bixo1.getBounds())) {
            contadorMortes++;
            x = 100;
            y = 750;
            lbl_indicadorMortes.setText("Mortes: " + contadorMortes);
            bx = 0;
            movbic = true;
            
        }
        if (lbl_boneco.getBounds().intersects(bixo2.getBounds())) {
            contadorMortes++;
            x = 100;
            y = 750;
            lbl_indicadorMortes.setText("Mortes: " + contadorMortes);
            bx1 = 200;
            movbic = true;
            
        }
        
    }
    
    public void colisao() {
        
        if (lbl_boneco.getBounds().intersects(lbl_chao.getBounds())) {
            dy = lbl_chao.getY();
            lbl_boneco.setLocation(x, lbl_chao.getY());
           // System.out.println("encostou");
            
            fy = lbl_chao.getY() - 30;
            
            x = x + dx;
            
        } else if (lbl_boneco.getBounds().intersects(lbl_guia.getBounds())) {
            
            dy = lbl_guia.getY();
            lbl_boneco.setLocation(x, lbl_guia.getY());
            //System.out.println("encostou");
            
            fy = lbl_guia.getY() - 30;
            x = x + dx;
            
        } else if (lbl_boneco.getBounds().intersects(lbl_escada.getBounds())) {
            
            dy = lbl_escada.getY();
            lbl_boneco.setLocation(x, lbl_escada.getY());
            //System.out.println("encostou");
            
            fy = lbl_escada.getY() - 30;
            x = x + dx;
            
        } else if (lbl_boneco.getBounds().intersects(lbl_escada2.getBounds())) {
            
            dy = lbl_escada2.getY();
            lbl_boneco.setLocation(x, lbl_escada2.getY());
            //System.out.println("encostou");
            
            fy = lbl_escada2.getY() - 30;
            x = x + dx;
            
        } else if (lbl_boneco.getBounds().intersects(lbl_gui2.getBounds())) {
            
            dy = lbl_gui2.getY();
            lbl_boneco.setLocation(x, lbl_gui2.getY());
            //System.out.println("encostou");
            
            fy = lbl_gui2.getY() - 30;
            x = x + dx;
            
        } else {
            isJumping = true;
            fy = 900;
        }
        
    }
    
    public void ganhou() {
        if (lbl_boneco.getBounds().intersects(lbl_plataformaWind.getBounds())) {
            JOptionPane.showMessageDialog(null, "VICTORY");
            x = 100;
            y = 720;
            
            boolean win = false;
            win = true;
            if (win) {

                //tela_nivel1.dispose();
                //win = false;
                tela_nivel1.dispatchEvent(new WindowEvent(tela_nivel1, WindowEvent.WINDOW_CLOSING));
                
            }
        }
    }
    
    public void pular() {
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
    
    public void movimntaçãoBixo() {
        if (movbic == true) {
            bx += 10;
            //System.out.println("bixo a direita");
            if (bx == 1100) {
                movbic = false;
            }
        } else if (movbic == false) {
            bx -= 10;
            //System.out.println("biso a esquerda");
            if (bx == 0) {
                movbic = true;
            }
        }
        bixo1.setLocation(bx, by);
        
        if (movbic1 == true) {
            bx1 += 10;
            //System.out.println("bixo a direita");
            if (bx1 == 1400) {
                movbic1 = false;
            }
        } else if (movbic1 == false) {
            bx1 -= 10;
            //System.out.println("biso a esquerda");
            if (bx1 == 100) {
                movbic1 = true;
            }
        }
        bixo2.setLocation(bx1, by1);
        
    }
    
    public void update() {
        mortes();
        colisao();
        pular();
        ganhou();
        movimntaçãoBixo();
        
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
