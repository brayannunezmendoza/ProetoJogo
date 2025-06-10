package entidades;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author braya
 */
public class Player extends JLabel{

    private ImageIcon imgPlayer;
    private JLabel lblPlayer;
    private int x = 700;
    private int y = 200;
    private Rectangle retangulo1;

    private boolean pulando = false;
    private int puloMaximo = 100;

    public Player(String Caminho, int x, int y){
    this.x =x;
    this.y =y;
        setIcon(new ImageIcon(getClass().getResource(Caminho)));
        setBounds(x, y, 55, 55);
        setBackground(Color.red);
        setOpaque(true);
    setHorizontalAlignment(SwingConstants.CENTER);
    
    }

public void moverPara(int novoX,int novoY){
    this.x =novoX;
    this.y = novoY;
    setBounds(x, y, getWidth(), getHeight());
    


}    
    
    
    
    
    
    
    
    
    
    
   

    {/* public Player() {

        imgPlayer = new ImageIcon();
        lblPlayer = new JLabel(new ImageIcon(getClass().getResource("/res/boneco.png")));
        lblPlayer.setBounds(x, y, 60, 60);
        lblPlayer.setBackground(Color.black);
        lblPlayer.setOpaque(true);
        lblPlayer.setVisible(true);
        retangulo1 = new Rectangle(x, y, 40, 60);
 
    }
    public JLabel getPlayer() {
        return lblPlayer;
    }
    public Rectangle getRectangle(){
    return retangulo1;
    }*/
    }
}
