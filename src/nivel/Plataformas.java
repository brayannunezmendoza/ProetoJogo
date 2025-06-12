package nivel;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Plataformas {

    private JLabel lblPlataforma1;
    private JLabel lblPlataforma2;
    private JLabel lblPlataforma3;
    private JLabel lblPlataforma4;
    private JLabel lblPlataforma5;
    private JLabel lblPlataforma6;
    private JLabel lblPlataforma7;
    private JLabel lblPlataforma8;
    private JLabel lblPlataforma9;
    private JLabel lblPlataforma10;
    private JLabel lblPlataforma11;
    private JLabel lblFundo;
    private JLabel lblFundo1;
    private JLabel lblFundo2;
    private JLabel lblFundo3;
    private Rectangle rec1;
    private Rectangle rec2;
    private Rectangle rec3;
    private Rectangle rec4;
    private Rectangle rec5;
    private Rectangle rec6;
    private Rectangle rec7;
    private Rectangle rec8;
    private Rectangle rec9;
    private Rectangle rec10;
    private ImageIcon moeda;
    private JLabel lblMoeda;

    private int pw = 300;
    private int ph = 35;
    private int lx;
    private int ly;
    private int n;

    public Plataformas() {

         lblFundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundo1.jpeg")));
         lblFundo1 = new JLabel(new ImageIcon(getClass().getResource("/res/fundo2.png")));
         lblFundo2 = new JLabel(new ImageIcon(getClass().getResource("/res/fundo3.png")));
         lblFundo3 = new JLabel(new ImageIcon(getClass().getResource("/res/fundo4.png")));
       // moeda = new ImageIcon(getClass().getResource("/res/moeda.png"));
        lblMoeda = new JLabel(new ImageIcon(getClass().getResource("/res/moeda.png")));
        lblPlataforma1 = new JLabel();
        lblPlataforma2 = new JLabel();
        lblPlataforma3 = new JLabel();
        lblPlataforma4 = new JLabel();
        lblPlataforma5 = new JLabel();
        lblPlataforma5 = new JLabel();
        lblPlataforma6 = new JLabel();
        lblPlataforma7 = new JLabel();
        lblPlataforma8 = new JLabel();
        lblPlataforma9 = new JLabel();
        lblPlataforma10 = new JLabel();
        lblPlataforma11 = new JLabel();
        
        lblMoeda.setSize(50, 50);
       lblMoeda.setVisible(true);

        lblFundo.setSize(1600, 900);
        lblFundo.setLocation(0, 0);
        lblFundo.setVisible(true);

        lblFundo1.setSize(1600, 900);
        lblFundo1.setLocation(0, 0);
        lblFundo1.setVisible(true);

        lblFundo2.setSize(1600, 900);
        lblFundo2.setLocation(0, 0);
        lblFundo2.setVisible(true);

        lblFundo3.setSize(1600, 900);
        lblFundo3.setLocation(0, 0);
        lblFundo3.setVisible(true);

        lblPlataforma1.setBackground(Color.black);
        lblPlataforma1.setBounds(lx, ly, pw, ph);
        lblPlataforma1.setOpaque(true);
        lblPlataforma1.setVisible(true);

        rec1 = new Rectangle(lblPlataforma1.getX(), lblPlataforma1.getY() + 10);
        rec1.setBounds(lblPlataforma1.getBounds());
        rec1.setLocation(lblPlataforma1.getX(), lblPlataforma1.getY());

        rec2 = new Rectangle(100, lblPlataforma2.getHeight() + 10);
        rec2.setBounds(lblPlataforma2.getBounds());
        rec2.setLocation(lblPlataforma2.getX(), lblPlataforma2.getY());

        rec3 = new Rectangle(lblPlataforma3.getX(), lblPlataforma3.getY() + 10);
        rec3.setBounds(lblPlataforma3.getBounds());
        rec3.setLocation(lblPlataforma3.getX(), lblPlataforma3.getY());

        lblPlataforma2.setBackground(Color.blue);
        lblPlataforma2.setSize(pw, ph);
        lblPlataforma2.setOpaque(true);
        lblPlataforma2.setVisible(true);

        lblPlataforma3.setBackground(Color.GREEN);
        lblPlataforma3.setSize(pw, ph);
        lblPlataforma3.setLocation(500, 500);
        lblPlataforma3.setOpaque(true);
        lblPlataforma3.setVisible(true);

        lblPlataforma4.setBackground(Color.RED);
        lblPlataforma4.setSize(pw, ph);
        lblPlataforma4.setOpaque(true);
        lblPlataforma4.setVisible(true);

        lblPlataforma5.setBackground(Color.YELLOW);
        lblPlataforma5.setSize(pw, ph);
        lblPlataforma5.setOpaque(true);
        lblPlataforma5.setVisible(true);

        lblPlataforma6.setBackground(Color.CYAN);
        lblPlataforma6.setSize(pw, ph);
        lblPlataforma6.setOpaque(true);
        lblPlataforma6.setVisible(true);

        lblPlataforma7.setBackground(Color.PINK);
        lblPlataforma7.setSize(pw, ph);
        lblPlataforma7.setOpaque(true);
        lblPlataforma7.setVisible(true);

        lblPlataforma8.setBackground(Color.black);
        lblPlataforma8.setSize(pw, ph);
        lblPlataforma8.setOpaque(true);
        lblPlataforma8.setVisible(true);

        lblPlataforma9.setBackground(Color.ORANGE);
        lblPlataforma9.setSize(pw, ph);
        lblPlataforma9.setOpaque(true);
        lblPlataforma9.setVisible(true);

        lblPlataforma10.setBackground(Color.BLUE);
        lblPlataforma10.setSize(pw, ph);
        lblPlataforma10.setOpaque(true);
        lblPlataforma10.setVisible(true);
        
        lblPlataforma11.setBackground(Color.magenta);
        lblPlataforma11.setSize(pw, ph);
        lblPlataforma11.setOpaque(true);
        lblPlataforma11.setVisible(true);

    }

    public JLabel getLblPlataforma1() {
        return lblPlataforma1;
    }

    public void setlblPlataforma1(int w, int h) {
        this.pw = w;
        this.ph = h;
        rec1.setBounds(lblPlataforma1.getBounds());

    }

    public JLabel getLblPlataforma2() {
        return lblPlataforma2;
    }

    public JLabel getLblPlataforma3() {
        return lblPlataforma3;
    }

    public JLabel getLblPlataforma4() {
        return lblPlataforma4;
    }

    public JLabel getLblPlataforma5() {
        return lblPlataforma5;
    }

    public JLabel getLblPlataforma6() {
        return lblPlataforma6;
    }

    public JLabel getLblPlataforma7() {
        return lblPlataforma7;
    }

    public JLabel getLblPlataforma8() {
        return lblPlataforma8;
    }

    public JLabel getLblPlataforma9() {
        return lblPlataforma9;
    }

    public JLabel getLblPlataforma10() {
        return lblPlataforma10;
    }

    public JLabel getLblFundo() {
        return lblFundo;
    }

    public Rectangle getRec1() {
        return rec1;
    }

    public Rectangle getRec2() {
        return rec2;
    }

    public Rectangle getRec3() {
        return rec3;
    }

    public void setN(int n) {
        this.n = n;

    }

    public int getN() {
        return n;
    }

    public JLabel getLblFundo1() {
        return lblFundo1;
    }

    public JLabel getLblFundo2() {
        return lblFundo2;
    }

    public JLabel getLblFundo3() {
        return lblFundo3;
    }

    public JLabel getLblMoeda() {
        return lblMoeda;
    }

    public JLabel getLblPlataforma11() {
        return lblPlataforma11;
    }
    
}
