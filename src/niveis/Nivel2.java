
package niveis;
import javax.swing.*;
import java.awt.*;
public class Nivel2 extends JFrame{
    private JFrame janela;
    private ImageIcon img_fundo;
    private JLabel lbl_fundo;
    
    
    public Nivel2(){
        ///instancia de objetos
        janela = new JFrame();
        img_fundo = new ImageIcon(getClass().getResource("/IMG/fundo22.jpeg"));
        lbl_fundo = new JLabel();
        lbl_fundo.setIcon(img_fundo);
        
        ///
    
        ///configurando os elementos
        //janela
        janela.setSize(1600, 900);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        //pausa da configuraçao da janela
        //
        
        //
        //configurando imagem de fundo
        lbl_fundo.setBounds(0, 0, 1600, 900);
        lbl_fundo.setVisible(true);
        janela.add(lbl_fundo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        janela.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
