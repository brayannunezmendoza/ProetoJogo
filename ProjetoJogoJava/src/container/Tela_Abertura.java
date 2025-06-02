/*
Obs.: Ao desenhar o fundo o programa que é escrito primeiro fica encima
se codar a imagem primeiro e depois o texto, o texto ficara embaixo
 */
package container;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela_Abertura extends JFrame {

    //atributos
    private JFrame telaAbertura;                    //
    private ImageIcon imagem;                       //
    private JLabel fundo;                           //
    private JLabel lbl_nomeJogo;                    //
    private JLabel lbl_MensagemTelaAbertura;        //

    public Tela_Abertura() {
        //instanciando objetos
        telaAbertura = new JFrame("Tela inicial");

        lbl_nomeJogo = new JLabel("Arlot");
        lbl_MensagemTelaAbertura = new JLabel("Clique na tela pra avançar");
        fundo = new JLabel();

        //configurar o JFrame
        telaAbertura.setSize(1600, 900);
        telaAbertura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaAbertura.setLocationRelativeTo(null);
        telaAbertura.setLayout(null);
        telaAbertura.setResizable(false);

        //configurando a mensagem que aparecera na tela
        lbl_MensagemTelaAbertura.setBounds(560, 500, 470, 50);
        lbl_MensagemTelaAbertura.setFont(new Font("arial", Font.ITALIC, 40));
        lbl_MensagemTelaAbertura.setForeground(Color.WHITE);
        lbl_MensagemTelaAbertura.setVisible(true);
        telaAbertura.add(lbl_MensagemTelaAbertura);

        //Confugaração do texto com o nome do jogo
        lbl_nomeJogo.setBounds(675, 100, 250, 100);
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        lbl_nomeJogo.setForeground(Color.RED);
        lbl_nomeJogo.setVisible(true);
        telaAbertura.add(lbl_nomeJogo);

        //configurando a imegem de fundo
        ImageIcon imagem = new ImageIcon(getClass().getResource("/IMG/fundo_telaAbertura.png"));
        fundo.setIcon(imagem);
        fundo.setBounds(0, 0, 1600, 900);
        telaAbertura.add(fundo);

        //definindo a visibilade da tela JFrame  
        telaAbertura.setVisible(true);


       
    }

}
