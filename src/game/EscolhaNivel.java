
package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class EscolhaNivel  {

    
    private JLabel escolha1;
    private JLabel escolha2;
    private JLabel escolha3;
    private JLabel escolha4;
    private JLabel escolha5;
    private JLabel escolha6;
    private JLabel fundo;
    private int x = 200, y = 300;
    private int h = 200;
    private int w = 400;
    //private ArrayList<Integer> l1;
    private int levels;
    private JFrame janela;
    int a =1;
   
//private TelaFrame t;
    //enviar valor de nivel para fora
    
    public EscolhaNivel() {
        janela = new JFrame("ARLOT");
        janela.setSize(1600, 900);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(1);
        janela.setResizable(false);
        escolhas();
        fundo();
        janela.setVisible(true);
        
        
      
        

    }

    
    public void fundo() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundoescolha.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        janela.add(fundo);

    }

    public void escolhas() {
        escolha1 = new JLabel("Nivel 1 ");
        escolha2 = new JLabel("Nivel 2 ");
        escolha3 = new JLabel("Nivel 3 ");
        escolha4 = new JLabel("Nivel 4 ");
        escolha5 = new JLabel("Nivel 5 ");
        escolha6 = new JLabel("Nivel 6 Bloquedo");
       

        escolha1.setBackground(Color.BLACK);
        escolha1.setForeground(Color.WHITE);
        escolha1.setFont(new Font("Arial", Font.BOLD, 30));
        escolha1.setHorizontalAlignment(SwingConstants.CENTER);
        escolha1.setBounds(x, y, w, h);
        escolha1.setOpaque(true);
        escolha1.setVisible(true);

        escolha2.setBackground(Color.BLACK);
        escolha2.setForeground(Color.WHITE);
        escolha2.setFont(new Font("Arial", Font.BOLD, 30));
        escolha2.setHorizontalAlignment(SwingConstants.CENTER);
        escolha2.setBounds(x + w + 20, y, w, h);
        escolha2.setOpaque(true);
        escolha2.setVisible(true);

        escolha3.setBackground(Color.black);
        escolha3.setForeground(Color.WHITE);
        escolha3.setFont(new Font("Arial", Font.BOLD, 30));
        escolha3.setHorizontalAlignment(SwingConstants.CENTER);
        escolha3.setBounds(x + (w * 2) + 40, y, w, h);
        escolha3.setOpaque(true);
        escolha3.setVisible(true);

        escolha4.setBackground(Color.blue);
        escolha4.setForeground(Color.WHITE);
        escolha4.setFont(new Font("Arial", Font.BOLD, 30));
        escolha4.setHorizontalAlignment(SwingConstants.CENTER);
        escolha4.setBounds(x, y + h + 50, w, h);
        escolha4.setOpaque(true);
        escolha4.setVisible(true);

        escolha5.setBackground(Color.blue);
        escolha5.setForeground(Color.WHITE);
        escolha5.setFont(new Font("Arial", Font.BOLD, 30));
        escolha5.setHorizontalAlignment(SwingConstants.CENTER);
        escolha5.setBounds(x + w + 20, y + h + 50, w, h);
        escolha5.setOpaque(true);
        escolha5.setVisible(true);

        escolha6.setBackground(Color.blue);
        escolha6.setForeground(Color.WHITE);
        escolha6.setFont(new Font("Arial", Font.BOLD, 30));
        escolha6.setHorizontalAlignment(SwingConstants.CENTER);
        escolha6.setBounds(x + (w * 2) + 40, y + h + 50, w, h);
        escolha6.setOpaque(true);
        escolha6.setVisible(true);

        janela.add(escolha1);
        janela.add(escolha2);
        janela.add(escolha3);
        janela.add(escolha4);
        janela.add(escolha5);
        janela.add(escolha6);
        clique();
    }  

    
    
    
  
  
  
    

    public void clique() {
        escolha1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               // System.out.println(a);
               new nivel.Nivel1();
               janela.dispose();

            }
        });
        escolha2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                janela.dispose();
                new nivel.Nivel2();
            }
        });
        escolha3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                janela.dispose();
                new nivel.Nivel3();
            }
        });
        escolha4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                 janela.dispose();
                new nivel.Nivel4();
            }
        });
        escolha5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                 janela.dispose();
                new nivel.Nivel6();
            }
        });
        escolha6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Disponivel na proxima atualização");
              
            }
        });
    }

   
   
        
    
    
}
