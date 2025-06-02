package elementos;

import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jogador extends JFrame implements KeyListener {

   

    private int vida;
private JPanel p;
    public Jogador() {
       //ImageIcon ImagemBoneco = new ImageIcon(getClass().getResource("/IMG/boneco.png"));
       // lbl_boneco.setIcon(ImagemBoneco);
        
    
        /* lbl_boneco.setIcon(ImagemBoneco);
        lbl_boneco.setBackground(Color.red);
        lbl_boneco.setOpaque(true);
        lbl_boneco.setBounds(200, 200, 60, 60);
        lbl_boneco.setVisible(true);*/
        
        System.out.println("importado");
        
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
