package Elementos;

import Elementos.HitBox;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Personagem extends JFrame {

    public void Perosnagem() {
        // importando imagem do boneco
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/boneco.png"));
        //colocando a imagem no JLabel
        JLabel objBoneco = new JLabel(icon);

        add(objBoneco);
        
         setSize(300, 300);
    }
    private int x, y;
    private HitBox hitbox;

    private Image imagem;


    /*public Personagem(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.hitbox = new HitBox(x, y, largura, altura);
    }*/
    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        this.hitbox = new HitBox(x, y, hitbox.getLargura(), hitbox.getAltura());
    }

    public HitBox getHitbox() {
        return hitbox;
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        int tecla = evt.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT) {
            x = x - 20;
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            x = x + 10;
        }

        if (tecla == KeyEvent.VK_DOWN) {
            y = y + 20;
        }

    }

    public static void main(String[] args) {
        new Personagem().setVisible(true);
    }
}
