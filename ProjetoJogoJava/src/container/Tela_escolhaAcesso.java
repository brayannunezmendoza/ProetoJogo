package container;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela_escolhaAcesso extends javax.swing.JFrame {

    private JFrame telaEscolha;     //
    private JLabel lbl_Entrar;      //
    private JLabel lbl_Cadastrar;   //
    private ImageIcon imagem;       //
    private JLabel fundo;           //
    private JLabel lbl_nomeJogo;    //
    private JLabel  lbl_menagemescolha;//
    

    public Tela_escolhaAcesso() {
        //Instanciando objetos
        telaEscolha = new JFrame();
        lbl_Entrar = new JLabel("Entrar");
        lbl_Cadastrar = new JLabel("Cadastrar-se");
        fundo = new JLabel();
        lbl_nomeJogo = new JLabel("Arlot");
        lbl_menagemescolha = new JLabel("Escolha uma das duas opções para continuar");

        //configurando a tela de escolha
        telaEscolha.setSize(1600, 900);
        telaEscolha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaEscolha.setLocationRelativeTo(null);
        telaEscolha.setLayout(null);
        telaEscolha.setResizable(false);
        

        //Confugaração do texto com o nome do jogo
        lbl_nomeJogo.setBounds(675, 100, 250, 100);
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        lbl_nomeJogo.setForeground(Color.RED);
        lbl_nomeJogo.setVisible(true);
        telaEscolha.add(lbl_nomeJogo);
        
        //configurando o label de mensagem
        lbl_menagemescolha.setBounds(530, 250, 550, 50);
        lbl_menagemescolha.setFont(new Font("Arial", Font.BOLD, 25));
        lbl_menagemescolha.setForeground(Color.white);
        lbl_menagemescolha.setVisible(true);
        telaEscolha.add(lbl_menagemescolha);
        
        //configurando o label de Entrar
        lbl_Entrar.setBounds(740, 400, 120, 50);
        lbl_Entrar.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_Entrar.setForeground(Color.white);
        lbl_Entrar.setVisible(true);
        telaEscolha.add(lbl_Entrar);

        //confugurando o label Cadastrar
        lbl_Cadastrar.setBounds(680, 500, 250, 50);
        lbl_Cadastrar.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_Cadastrar.setForeground(Color.white);
        lbl_Cadastrar.setVisible(true);
        telaEscolha.add(lbl_Cadastrar);

        //configurando a imegem de fundo
        ImageIcon imagem = new ImageIcon(getClass().getResource("/IMG/fundo_telaAbertura.png"));
        fundo.setIcon(imagem);
        fundo.setBounds(0, 0, 1600, 900);
        telaEscolha.add(fundo);

        //visibiliadde da tela
        telaEscolha.setVisible(true);

    }

}
