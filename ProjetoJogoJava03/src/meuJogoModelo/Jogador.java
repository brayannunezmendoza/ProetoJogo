package meuJogoModelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Jogador {

    //valores de movimentação do jogador
    private int x, y;
    private int dx, dy;

    //imagem do boneco
    private Image imagem;
    //dimensoes do boneco
    private int altura, largura;

    //posição do boneco
    public Jogador() {
    
        this.x = y;
        this.y = y;
        System.out.println("posição inicia" + x + y);
    
    
    }

    //Carega o boneco
    public void load() {
        ImageIcon referencia = new ImageIcon(getClass().getResource("/jogoImagem/Prancheta 1.png"));
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);//Altura 
        largura = imagem.getWidth(null);//Largura
        System.out.println("boneco carregado");

    }

    //movimentação do boneco 
    public void update() {
        x += dx;
        y += dy;
        //System.out.println("update");
        //dx = 1;
        System.out.println(dx);
        
        
        
        
    }
//entrada do teclado  JFrame frame = new JFrame("Captura de Teclas");
    

   
   


   
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public static void main(String[] args) {
         JFrame frame = new JFrame("Captura de Teclas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Pressione uma tecla", SwingConstants.CENTER);
        frame.add(label);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Tecla liberada: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // Captura o caractere digitado
            }
        });

        frame.setVisible(true);
    }
}
