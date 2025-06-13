package entradas;

import game.EscolhaNivel;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EscolhaAcesso extends JFrame {

    int a;
    private JPanel telaEscolha;
    private JLabel lbl_Entrar;
    private JLabel lbl_Cadastrar;
    private JLabel lbl_menagemescolha;
    private JLabel lbl_nomeJogo;
    private JLabel lbl_nomeJogoI;
    private JLabel fundo;
    private boolean visao = false;
    

    public EscolhaAcesso() {
        
 
        setSize(1600, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        telaEscolha = new JPanel();
        telaEscolha.setBounds(3000, 0, 1600, 900);
        telaEscolha.setBackground(Color.black);
        telaEscolha.setOpaque(true);
        telaEscolha.setVisible(true);
        telaEscolha.setLayout(null);

        lbl_Entrar = new JLabel("Entrar");
        lbl_Cadastrar = new JLabel("Cadastrar-se");
        fundo = new JLabel();
        lbl_nomeJogo = new JLabel("Arlot");
        lbl_nomeJogoI = new JLabel("Arlot");
        lbl_menagemescolha = new JLabel("Escolha uma das duas opções para continuar");

        lbl_menagemescolha.setBounds(530, 250, 550, 50);
        lbl_menagemescolha.setFont(new Font("Arial", Font.BOLD, 25));
        lbl_menagemescolha.setForeground(Color.white);
        lbl_menagemescolha.setVisible(true);

        lbl_Entrar.setBounds(740, 400, 120, 50);
        lbl_Entrar.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_Entrar.setForeground(Color.white);
        lbl_Entrar.setVisible(true);

        lbl_Cadastrar.setBounds(680, 500, 250, 50);
        lbl_Cadastrar.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_Cadastrar.setForeground(Color.white);
        lbl_Cadastrar.setVisible(true);

        ImageIcon imagem = new ImageIcon(getClass().getResource("/res/fundo3.png"));
        fundo.setIcon(imagem);
        fundo.setBounds(0, 0, 1600, 900);

        lbl_nomeJogo.setBounds(675, 100, 250, 100);
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        lbl_nomeJogo.setForeground(Color.RED);
        lbl_nomeJogo.setVisible(true);

        telaEscolha.add(lbl_nomeJogo);
        telaEscolha.add(lbl_menagemescolha);
        telaEscolha.add(lbl_Entrar);
        telaEscolha.add(lbl_Cadastrar);
        telaEscolha.add(fundo);
        telaEscolha.setVisible(true);
        add(telaEscolha);
        // add(lbl_nomeJogo);

        JLabel inicialInstrução = new JLabel("Clique na tela para começar");
        inicialInstrução.setBounds(1600 / 2 - 255, 500, 500, 50);
        inicialInstrução.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 38));
        inicialInstrução.setForeground(Color.WHITE);
        add(inicialInstrução);

        JLabel inicialNome = new JLabel("Arlot");
        inicialNome.setBounds(675, 100, 250, 100);
        inicialNome.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        inicialNome.setForeground(Color.RED);
        inicialNome.setVisible(true);
        add(inicialNome);

        ImageIcon inicialimg = new ImageIcon(getClass().getResource("/res/fundo3.png"));
        JLabel inicialfundo = new JLabel(inicialimg);
        inicialfundo.setBounds(0, 0, 1600, 900);
        inicialfundo.setVisible(true);
        add(inicialfundo);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                a += 1;
                System.out.println("Clicado");
                System.out.println(a);
                telaEscolha.setBounds(0, 0, 1600, 900);
                if (a == 40) {
                    JOptionPane.showMessageDialog(null, "???");
                }
            
        
        /////////ADICIONAR CAMINHO ENTRAR E CADASTRAR  
            }
        });

        lbl_Entrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Entrar");
                dispose();
                new Entrar();
            }
        });
        lbl_Cadastrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Entrar");
                dispose();
                new CriarConta();
            }
        });

        setVisible(true);

    }

}
