/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

import java.awt.Image;

/**
 *
 * @author ENZO
 */
public class Inimigos {
    private int x, y;
    private HitBox hitbox;
    
    private Image imagem;


    public Inimigos(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.hitbox = new HitBox(x, y, largura, altura);
    }

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        this.hitbox = new HitBox(x, y, hitbox.getLargura(), hitbox.getAltura());
    }

    public HitBox getHitbox() {
        return hitbox;
    }
    
    
    
    
}
