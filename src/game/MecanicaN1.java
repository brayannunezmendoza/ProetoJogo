package game;

import entidades.Player;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import nivel.Nivel1;
import java.util.ArrayList;

/**
 *
 * @author braya
 */
public class MecanicaN1 extends JPanel {
  /*  private boolean status=false;
boolean s =false;
    private Nivel1 nivel1;//
    private Player player;
    private JLabel movPlayer;
    private Timer timer;
    private float velocidadeY, velocidadeX;
    private Set<Integer> teclasPressionadas = new HashSet<>();
    int novoY = 750;
    int novoX = 100;
    private Rectangle hitbox;
     public  int nivela=1;
     private ArrayList <Integer>contadorniveis;
     

    //pulo 
    private boolean pulando = false;
    private boolean caindo = true;
    private int velocidade;
    private JFrame t;

    private int np;

    public MecanicaN1() {
        contadorniveis = new ArrayList<>();
        int qwe = 1;
        contadorniveis.add(qwe);
     
//instanciando
        //janela = new JPanel();
        nivel1 = new Nivel1();
        player = new Player();
    

        //configurando tela principaç
        setSize(1600, 900);
        setLayout(null);
        //janela.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Adicionando objetos a tela
        add(player.getPlayer());

        //adicionando as plataformas ao nibel
        add(nivel1.getLblPlataforma1());
        add(nivel1.getLblPlataforma2());
        add(nivel1.getLblPlataforma3());
        add(nivel1.getLblPlataforma4());
        add(nivel1.getLblPlataforma5());

        add(nivel1.getNivel1());

        setVisible(true);
        setFocusable(true);
       
        
        
        //criando timer repaticao
        timer = new Timer(15, e -> tick());
        timer.start();
        
       movPlayer = player.getPlayer; //variavel mov player recebe metodo get da classe player instanciada

    

    /////janela Game recebe comando teclado para mov
        ///
        ///
    }
    
    
    
    public void mov() {
     
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int tecla = e.getKeyCode();
                novoX = movPlayer.getX();
                novoY = movPlayer.getY();

                //movimentação de tecla pressionada
                if (tecla == KeyEvent.VK_D) {
                    //variavel tem sua localização definida
                    //(movp getX + velocidade , Y) precissa ser definido X e Y para mover
                    velocidadeX = 8;
                    System.out.println(velocidadeX);

                }
                if (tecla == KeyEvent.VK_A) {
                    velocidadeX = -8;
                }
                if (tecla == KeyEvent.VK_W) {
                    velocidadeY = -8;
                }

                if (caindo == true) {
                    if (tecla == KeyEvent.VK_SPACE && caindo == true) {
                        pulando = true;
                        velocidade = 25;
                        System.out.println("spaco");
                        caindo = false;
                    }
                }

            }

            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();

                //movimentação de tecla pressionada
                if (tecla == KeyEvent.VK_D) {
                    //variavel tem sua localização definida
                    //(movp getX + velocidade , Y) precissa ser definido X e Y para mover
                    novoX+=velocidade;
                    velocidadeX = 0;

                }
                if (tecla == KeyEvent.VK_A) {
                    velocidadeX = 0;
                }
                if (tecla == KeyEvent.VK_W) {
                    velocidadeY = 0;
                    novoY -= velocidadeY;
                }
                if (caindo == true) {
                    if (tecla == KeyEvent.VK_SPACE) {
                        pulando = false;
                        velocidade = 0;
                        caindo = false;
                        status=true;
                        // System.out.println("a");
                    }
                }
            }
        }
        );
    }

   /* public void colisaotemp() {
        
        np = nivel1.getRp1().y - movPlayer.getHeight();
        movPlayer.setLocation(movPlayer.getX(), np);
       

        velocidade = 0;
        System.out.println(np);
        System.out.println("ex");
    }*/
/*
    public void colisao() {

        //colisao entre p e n1;
        if (movPlayer.getBounds().intersects(nivel1.getRp1().getBounds())) {
             movPlayer.setLocation(movPlayer.getX(), np);
            novaPosicao(np); np = nivel1.getRp1().y - movPlayer.getHeight();
            movPlayer.setLocation(movPlayer.getX(), np);
            novaPosicao(np);
            

        }
        if (movPlayer.getBounds().intersects(nivel1.getRp2().getBounds())) {
             np = nivel1.getRp2().y - movPlayer.getHeight();
            novaPosicao(np);
        }
        if (movPlayer.getBounds().intersects(nivel1.getRp3().getBounds())) {
             np = nivel1.getRp3().y - movPlayer.getHeight();
            novaPosicao(np);
        }
        if (movPlayer.getBounds().intersects(nivel1.getRp4().getBounds())) {
             np = nivel1.getRp4().y - movPlayer.getHeight();
            novaPosicao(np);
        }
        if (movPlayer.getBounds().intersects(nivel1.getRp5().getBounds())) {

             np = nivel1.getRp5().y - movPlayer.getHeight();
            novaPosicao(np);
        } else {
            fy = 900;
            pulando = true;

        }
    }

   public void novaPosicao(int np) {
        movPlayer.setLocation(novoX, np);
        pulando = false;
        velocidade = 0;
        caindo = true;

    }

    public void tick() {
        System.out.println(caindo);
        movPlayer.setLocation(novoX, novoY);
        novoX += velocidadeX;
        novoY += velocidadeY;
        if (pulando == true) {
            novoY -= velocidade;
            velocidade -= 1;
        }
        if (novoY >= fy) {
            velocidade = 0;

        }
        mov();
        colisao();
        repaint();
     
    }

   
    
  
    
    */

}

//selecionar niveis>dispose>visible>game>condição>if else>niveis>chamar label com os niveis >chamar o palyer>dispensar 

