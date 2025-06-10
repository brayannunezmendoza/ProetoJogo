/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entradas;

/**
 *
 * @author braya
 */

import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class CriarConta {
    
      private JFrame telaCadastro;                //
    private ImageIcon imagem;                   //
    private JLabel fundo;

    //atributos lbl
    private JLabel lbl_nomeJogo;                //
    private JLabel lbl_mensagem;
    private JLabel lbl_nome;
    private JLabel lbl_gmail;
    private JLabel lbl_celular;
    private JLabel lbl_username;
    private JLabel lbl_senha;
    private JLabel lbl_senhaConfirmar;

    //atributos txt
    private JTextField txt_nome;
    private JTextField txt_gmail;
    private JTextField txt_celular;
    private JTextField txt_username;
    private JPasswordField txt_senha;
    private JPasswordField txt_senhaConfirmar;
    //atributos btn
    private JButton btn_Cadastrar;
    private JPanel p;
    private ImageIcon tp;
    JLabel tpl;

    //contrutor
    
    public CriarConta(){
    telaCadastro = new JFrame();
        fundo = new JLabel();
        lbl_nomeJogo = new JLabel("Arlot");
        p = new JPanel();
        lbl_mensagem = new JLabel("Preencha suas informações para se cadastrar");
        //configurando tela de cadastro

        
        p.setSize(580, 300);
        p.setLocation(500, 280);
        p.setLayout(null);
        p.setBackground(Color.white);

        telaCadastro.add(p);
        p.setVisible(true);

        //instanciando lbl
        lbl_nome = new JLabel("Nome: ");
        lbl_gmail = new JLabel("Email: ");
        lbl_celular = new JLabel("Celular: ");
        lbl_username = new JLabel("Username: ");
        lbl_senha = new JLabel("Senha: ");
        lbl_senhaConfirmar = new JLabel("Confirmar senha: ");
        //instanciando txt
        txt_nome = new JTextField();
        txt_gmail = new JTextField();
        txt_celular = new JTextField();
        txt_username = new JTextField();
        txt_senha = new JPasswordField();
        txt_senhaConfirmar = new JPasswordField();
        //instanciando btn
        btn_Cadastrar = new JButton("Cadastrar");

        //configurando a tela
        telaCadastro.setSize(1600, 900);
        telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaCadastro.setLocationRelativeTo(null);
        telaCadastro.setLayout(null);
        telaCadastro.setResizable(false);

        //mensagem
        lbl_mensagem.setBackground(Color.red);
        lbl_mensagem.setOpaque(true);

        lbl_mensagem.setBounds(620, 230, 360, 25);
        lbl_mensagem.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        lbl_mensagem.setForeground(Color.WHITE);
        lbl_mensagem.setVisible(true);
        telaCadastro.add(lbl_mensagem);

        //configurando os txt
        //nome
        txt_nome.setBounds(270, 10, 300, 25);
        txt_nome.setBackground(Color.WHITE);
        txt_nome.setVisible(true);
        p.add(txt_nome);
        //gmail
        txt_gmail.setBounds(270, 40, 300, 25);
        txt_gmail.setBackground(Color.WHITE);
        txt_gmail.setVisible(true);
        p.add(txt_gmail);
        //celular
        txt_celular.setBounds(270, 70, 300, 25);
        txt_celular.setBackground(Color.WHITE);
        txt_celular.setVisible(true);
        p.add(txt_celular);
        //username
        txt_username.setBounds(270, 100, 300, 25);
        txt_username.setBackground(Color.WHITE);
        txt_username.setVisible(true);
        p.add(txt_username);
        //senha
        txt_senha.setBounds(270, 130, 300, 25);
        txt_senha.setBackground(Color.WHITE);
        txt_senha.setVisible(true);
        p.add(txt_senha);
        //repetir senha
        txt_senhaConfirmar.setBounds(270, 160, 300, 25);
        txt_senhaConfirmar.setBackground(Color.WHITE);
        txt_senhaConfirmar.setVisible(true);
        p.add(txt_senhaConfirmar);

        //configurando lbl
        //nome
        lbl_nome.setBackground(Color.WHITE);
        lbl_nome.setOpaque(true);

        lbl_nome.setBounds(10, 10, 260, 25);
        lbl_nome.setFont(new Font("Arial", NORMAL, 25));
        lbl_nome.setForeground(Color.BLACK);
        lbl_nome.setVisible(true);
        p.add(lbl_nome);
        //email
        lbl_gmail.setBackground(Color.white);
        lbl_gmail.setOpaque(true);

        lbl_gmail.setBounds(10, 40, 260, 25);
        lbl_gmail.setFont(new Font("Arial", NORMAL, 25));
        lbl_gmail.setForeground(Color.BLACK);
        lbl_gmail.setVisible(true);
        p.add(lbl_gmail);
        //celular
        lbl_celular.setBackground(Color.white);
        lbl_celular.setOpaque(true);

        lbl_celular.setBounds(10, 70, 260, 25);
        lbl_celular.setFont(new Font("Arial", NORMAL, 25));
        lbl_celular.setForeground(Color.BLACK);
        lbl_celular.setVisible(true);
        p.add(lbl_celular);
        //username
        lbl_username.setBackground(Color.white);
        lbl_username.setOpaque(true);

        lbl_username.setBounds(10, 100, 260, 25);
        lbl_username.setFont(new Font("Arial", NORMAL, 25));
        lbl_username.setForeground(Color.BLACK);
        lbl_username.setVisible(true);
        p.add(lbl_username);
        //senha
        lbl_senha.setBackground(Color.white);
        lbl_senha.setOpaque(true);

        lbl_senha.setBounds(10, 130, 260, 25);
        lbl_senha.setFont(new Font("Arial", NORMAL, 25));
        lbl_senha.setForeground(Color.BLACK);
        lbl_senha.setVisible(true);
        p.add(lbl_senha);
        //confirmar senha
        lbl_senhaConfirmar.setBackground(Color.WHITE);
        lbl_senhaConfirmar.setOpaque(true);

        lbl_senhaConfirmar.setBounds(10, 160, 260, 25);
        lbl_senhaConfirmar.setFont(new Font("Arial", NORMAL, 25));
        lbl_senhaConfirmar.setForeground(Color.BLACK);
        lbl_senhaConfirmar.setVisible(true);
        p.add(lbl_senhaConfirmar);

        //btm
        //cadastrar
        btn_Cadastrar.setBounds(190, 200, 200, 40);
        btn_Cadastrar.setFont(new Font("Arial", NORMAL, 25));
        btn_Cadastrar.setBackground(Color.white);
        btn_Cadastrar.setVisible(true);
        p.add(btn_Cadastrar);

        //Confugaração do texto com o nome do jogo
        lbl_nomeJogo.setBounds(675, 100, 250, 100);
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 100));
        lbl_nomeJogo.setForeground(Color.RED);
        lbl_nomeJogo.setVisible(true);
        telaCadastro.add(lbl_nomeJogo);

        //configurando container de cadastro
        //configurando a imegem de fundo
        ImageIcon imagem = new ImageIcon(getClass().getResource("/res/fundo3.png"));
        fundo.setIcon(imagem);
        fundo.setBounds(0, 0, 1600, 900);
        telaCadastro.add(fundo);

        //visibilidade da janela
        telaCadastro.setVisible(true);
    
    
    }
    
    
    
}
