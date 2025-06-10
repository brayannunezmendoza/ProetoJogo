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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Entrar extends JFrame {

    private JFrame container;           //
    //labels
    private JLabel lbl_nomeJogo;
    private JLabel lbl_instrucaoJogo;
    private JLabel lbl_email;           //
    private JLabel lbl_senha;           //
    //
    private JTextField txt_email;       //
    private JPasswordField psw_senha;   //
    private JButton btn_entrar;         //
    //

    private JLabel lbl_container;
    private ImageIcon img_image1;       //
    //imagem
    private ImageIcon img_imagem;       //
    private JLabel lbl_fundo;           //

    //dados do jogador
    private String email;
    private String senha;

    ///
    ///
    ///
     public Entrar() {
        //instanciando objetos
        container = new JFrame();
        container.setLayout(null);
        lbl_fundo = new JLabel();
        lbl_container = new JLabel();
        lbl_email = new JLabel();
        lbl_senha = new JLabel();
        txt_email = new JTextField();
        psw_senha = new JPasswordField();
        btn_entrar = new JButton();
        lbl_nomeJogo = new JLabel();
        lbl_instrucaoJogo = new JLabel();
        ///
        ///
        ///
        ///
        ///
        ///
        ///
        
        
        //configurando o containe frame
        container.setSize(1600, 900);
        container.setDefaultCloseOperation(EXIT_ON_CLOSE);
        container.setLocationRelativeTo(null);
        container.setResizable(false);
        ///
        ///
        ///
        ///
        ///
        ///

        //lbl
        //nome jogo
        lbl_nomeJogo.setBounds(500, 0, 100, 40);
        lbl_nomeJogo.setText("Arlot");
        lbl_nomeJogo.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_nomeJogo.setBackground(Color.BLACK);
        lbl_nomeJogo.setOpaque(true);
        lbl_nomeJogo.setForeground(Color.WHITE);
        lbl_nomeJogo.setVisible(true);
        container.add(lbl_nomeJogo);

        //instrução ao jogador
        lbl_instrucaoJogo.setBounds(400, 100, 480, 30);
        lbl_instrucaoJogo.setText("Complete os campos abaixo para entrar na sua conta");
        lbl_instrucaoJogo.setFont(new Font("Arial", NORMAL, 20));
        lbl_instrucaoJogo.setForeground(Color.WHITE);
        lbl_instrucaoJogo.setBackground(Color.gray);
        lbl_instrucaoJogo.setOpaque(true);
        lbl_instrucaoJogo.setVisible(true);
        container.add(lbl_instrucaoJogo);

        //email
        lbl_email.setBounds(600, 500, 100, 50);
        lbl_email.setText("Email: ");
        lbl_email.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_email.setForeground(Color.white);
        lbl_email.setBackground(Color.red);
        lbl_email.setOpaque(true);
        lbl_email.setVisible(true);
        container.add(lbl_email);
        //senha
        lbl_senha.setBounds(600, 600, 100, 50);
        lbl_senha.setText("Senha: ");
        lbl_senha.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_senha.setForeground(Color.white);
        lbl_senha.setBackground(Color.red);
        lbl_senha.setOpaque(true);
        lbl_senha.setVisible(true);
        container.add(lbl_senha);

        //txt email
        txt_email.setBounds(700, 500, 300, 50);
        txt_email.setFont(new Font("Arial", NORMAL, 20));
        txt_email.setBackground(Color.blue);
        txt_email.setOpaque(true);
        txt_email.setForeground(Color.WHITE);
        txt_email.setVisible(true);
        container.add(txt_email);

        //psw
        psw_senha.setBounds(700, 600, 300, 50);
        psw_senha.setFont(new Font("Arial", NORMAL, 20));
        psw_senha.setBackground(Color.blue);
        psw_senha.setOpaque(true);
        psw_senha.setForeground(Color.WHITE);
        psw_senha.setVisible(true);
        container.add(psw_senha);

        //button
        btn_entrar.setBounds(700, 800, 100, 50);
        btn_entrar.setFont(new Font("Arial", NORMAL, 20));
        btn_entrar.setBackground(Color.yellow);
        btn_entrar.setOpaque(true);
        btn_entrar.setText("Entrar");
        btn_entrar.setForeground(Color.WHITE);
        btn_entrar.setVisible(true);
        container.add(btn_entrar);
        ///
        ///
        ///
        ///
        ///
        ///
        ///
        
        
        img_image1 = new ImageIcon(getClass().getResource("/res/fundo1.jpeg"));
        lbl_container.setIcon(img_image1);
        lbl_container.setBounds(500, 500, 500, 500);
        lbl_container.setVisible(true);
        container.add(lbl_container);

        img_imagem = new ImageIcon(getClass().getResource("/res/fundo4.png"));
        lbl_fundo.setIcon(img_imagem);
        lbl_fundo.setBounds(0, 0, 1600, 900);
        lbl_fundo.setVisible(true);
        container.add(lbl_fundo);
        ///
        ///
        ///
        ///
        ///
        container.setVisible(true);
        armazenarDados();
    }

    public void armazenarDados() {
        btn_entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicado");
                email = txt_email.getText();
                System.out.println(email);
                senha = psw_senha.getText();
                System.out.println(senha);

                JOptionPane.showMessageDialog(null, "Email: " + email + "\nSenha: " + senha);

            }

        }
        );

    }

///Adicionar banco de dados
            ///banco de dados ira verificar se existem dados relacionados e se são iguais
            ///depois de confirmar deve dar um Entrar.setvisble=false e um dispose
            ///e depois um selecionarniveis.setvisible= true
            ///
            ///
            ///extra adicionar o comando enter para ser igual ao botao
            ///
            ///arrumar as posições dos objetos na tela
            ///
    
    
}
