package niveis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelecionarNiveis extends JFrame {

    private JFrame tela_selecionarNiveis;
    ImageIcon imagem;
    private JLabel fundo;
    private JLabel lbl_nomeJogo;
    private JLabel lbl_nv1, lbl_nv2, lbl_nv3, lbl_nv4, lbl_nv5, lbl_nv6;
    private int x = 420;
    private int y = 300;

    public SelecionarNiveis() {
        //instanciando objetos
        tela_selecionarNiveis = new JFrame();
        fundo = new JLabel();
        lbl_nv1 = new JLabel("Nivel 1");
        lbl_nv2 = new JLabel("Nivel 2");
        lbl_nv3 = new JLabel("Nivel 3");
        lbl_nv4 = new JLabel("Nivel 4");
        lbl_nv5 = new JLabel("Nivel 5");
        lbl_nv6 = new JLabel("Nivel 6");
        lbl_nomeJogo = new JLabel("Arlot");

        ImageIcon imagem = new ImageIcon(getClass().getResource("/IMG/fundo_telaAbertura.png"));

        //configurando tela
        tela_selecionarNiveis.setSize(1600, 900);
        tela_selecionarNiveis.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela_selecionarNiveis.setResizable(false);
        tela_selecionarNiveis.setLocationRelativeTo(null);
        tela_selecionarNiveis.setLayout(null);

        //Confugaração do texto com o nome do jogo
        lbl_nomeJogo.setBounds(675, 100, 250, 100);
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        lbl_nomeJogo.setForeground(Color.RED);
        lbl_nomeJogo.setVisible(true);
        tela_selecionarNiveis.add(lbl_nomeJogo);

        //configurando os quadros
        //quadro1
        lbl_nv1.setBounds(x, y, 250, 150);
        lbl_nv1.setBackground(Color.red);
        lbl_nv1.setOpaque(true);
        lbl_nv1.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv1.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv1);

        //quadro2
        lbl_nv2.setBounds(x + 260, y, 250, 150);
        lbl_nv2.setBackground(Color.red);
        lbl_nv2.setOpaque(true);
        lbl_nv2.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv2.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv2);
        //quadro3
        lbl_nv3.setBounds(x + 520, y, 250, 150);
        lbl_nv3.setBackground(Color.red);
        lbl_nv3.setOpaque(true);
        lbl_nv3.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv3.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv3);
        //quadro4
        lbl_nv4.setBounds(x, y + 160, 250, 150);
        lbl_nv4.setBackground(Color.red);
        lbl_nv4.setOpaque(true);
        lbl_nv4.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv4.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv4);
        //quadro5
        lbl_nv5.setBounds(x + 260, y + 160, 250, 150);
        lbl_nv5.setBackground(Color.red);
        lbl_nv5.setOpaque(true);
        lbl_nv5.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv5.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv5);
        //quadro6
        lbl_nv6.setBounds(x + 520, y + 160, 250, 150);
        lbl_nv6.setBackground(Color.red);
        lbl_nv6.setOpaque(true);
        lbl_nv6.setFont(new Font("Arial", Font.CENTER_BASELINE | NORMAL, 30));
        lbl_nv6.setVisible(true);
        tela_selecionarNiveis.add(lbl_nv6);

        //configurando imagem de fundo
        fundo.setIcon(imagem);
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        tela_selecionarNiveis.add(fundo);
        
        tela_selecionarNiveis.setVisible(true);

        
        //ação de seleção de niveis ao clicar
        lbl_nv1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 1");
            }
        }
        );
        lbl_nv2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 2");
            }
        }
        );
        lbl_nv3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 3");
            }
        }
        );
        lbl_nv4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 4");
            }
        }
        );
        lbl_nv5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 5");
            }
        }
        );
        lbl_nv6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("nivel 6");
            }
        }
        );

    }

}
