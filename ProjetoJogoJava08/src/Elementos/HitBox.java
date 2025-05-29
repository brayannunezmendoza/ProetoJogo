
package Elementos;
import javax.swing.*;
  import java.awt.*;


public class HitBox {
    private int x,y,largura,altura;
    
    public HitBox(int x, int y, int largura, int altura){
    this.x = x;
    this.y = y;
    this.largura = largura;
    this.altura = altura;
    }
    //metodos acessores e modificadores

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

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
    public boolean colideCom(HitBox outra) {
        return this.x < outra.x + outra.largura &&
               this.x + this.largura > outra.x &&
               this.y < outra.y + outra.altura &&
               this.y + this.altura > outra.y;
    }

    
    
    
    
    
    
}
