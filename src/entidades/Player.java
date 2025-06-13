package entidades;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author brayan & enzo
 */
public class Player extends JLabel {

    private ImageIcon imgPlayer;
    private JLabel lblPlayer;
    private int x = 700;
    private int y = 200;
    private Rectangle retangulo1;
    private boolean pulando = false;
    private int puloMaximo = 100;

    public Player(String Caminho, int x, int y) {
        this.x = x;
        this.y = y;
        setIcon(new ImageIcon(getClass().getResource(Caminho)));
        setBounds(x, y, 55, 55);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
