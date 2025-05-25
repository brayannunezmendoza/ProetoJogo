package meuJogoModelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

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
        this.x = 500;
        this.y = 200;
        System.out.println("posição inicia" + x + y);
    }

    public void load() {
        ImageIcon referencia = new ImageIcon(getClass().getResource("/jogoImagem/Prancheta 1.png"));
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
        System.out.println("boneco carregado");

    }

    //movimentação do boneco 
    public void update() {
        x += dx;
        y += dy;
        //System.out.println("update");

    }

    //entrada do teclado 
    public void KeyPressed(KeyEvent seta) {
        int codigo = seta.getKeyCode();    //recebe o comando das setas
        if (codigo == KeyEvent.VK_UP) {
            dy = -30;
        } else if (codigo == KeyEvent.VK_DOWN) {
            dy = 30;
        } else if (codigo == KeyEvent.VK_LEFT) {
            dx = - 30;
        } else if (codigo == KeyEvent.VK_RIGHT) {
            dx = 30;
        }
    }

    public void KeyReleased(KeyEvent seta) {
        int codigo = seta.getKeyCode();    //recebe o comando das setas
        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        } else if (codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        } else if (codigo == KeyEvent.VK_LEFT) {
            dx = 0;
        } else if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    public void KeyTyped(KeyEvent seta) {
    }

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

}
