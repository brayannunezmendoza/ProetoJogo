/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entradas;

/**
 *
 * @author braya
 */
import DAO.PlayerDAO;
import DTO.JogadorDTO;
import game.EscolhaNivel;
import game.Tela;
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
import java.sql.SQLException;
import java.sql.ResultSet;

public class Entrar extends JFrame {

    private JFrame login;           //
    //labels
    private JLabel lbl_nomeJogo;
    private JLabel lbl_instrucaoJogo;
    private JLabel lbl_email;           //
    private JLabel lbl_senha;           //
    //
    private JTextField txt_email;       //
    private JTextField psw_senha;   //
    private JButton btn_entrar;         //
    //

    private ImageIcon img_image1;       //
    //imagem
    private ImageIcon img_imagem;       //
    private JLabel lbl_fundo;           //

    //dados do jogador
    private String email = "123";
    private String senha = "123";
    // private String email;
    //private String senha;

    public Entrar() {
        //instanciando objetos
        login = new JFrame();
        login.setLayout(null);
        lbl_fundo = new JLabel();
        lbl_email = new JLabel();
        lbl_senha = new JLabel();
        txt_email = new JTextField();
        psw_senha = new JPasswordField();
        btn_entrar = new JButton();
        lbl_nomeJogo = new JLabel();
        lbl_instrucaoJogo = new JLabel();
        //configurando o containe frame
        login.setSize(1600, 900);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        //lbl
        //nome jogo
        lbl_nomeJogo.setText("Arlot");
        lbl_nomeJogo.setSize(170, 60);
        lbl_nomeJogo.setLocation(login.getWidth() / 2 - (lbl_nomeJogo.getWidth() / 2), 150);
        lbl_nomeJogo.setFont(new Font("Ubuntu", Font.BOLD, 70));
        lbl_nomeJogo.setForeground(Color.red);
        lbl_nomeJogo.setVisible(true);
        //instru??o ao jogador
        lbl_instrucaoJogo.setSize(480, 30);
        lbl_instrucaoJogo.setLocation(login.getWidth() / 2 - (lbl_instrucaoJogo.getWidth() / 2), 300);
        lbl_instrucaoJogo.setText("Complete os campos abaixo para entrar na sua conta");
        lbl_instrucaoJogo.setFont(new Font("Arial", NORMAL, 20));
        lbl_instrucaoJogo.setForeground(Color.WHITE);
        lbl_instrucaoJogo.setBackground(Color.gray);
        lbl_instrucaoJogo.setOpaque(false);
        lbl_instrucaoJogo.setVisible(true);
        //email
        lbl_email.setBounds(600, lbl_instrucaoJogo.getY() + 140, 100, 50);
        lbl_email.setText("Email: ");
        lbl_email.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_email.setForeground(Color.BLACK);
        lbl_email.setBackground(Color.white);
        lbl_email.setOpaque(true);
        lbl_email.setVisible(true);
        //senha
        lbl_senha.setBounds(600, lbl_email.getY() + 80, 110, 50);
        lbl_senha.setText("Senha: ");
        lbl_senha.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_senha.setForeground(Color.black);
        lbl_senha.setBackground(Color.white);
        //lbl_senha.setBackground(new Color(246, 190, 0));
        lbl_senha.setOpaque(true);
        lbl_senha.setVisible(true);
        //txt email
        txt_email.setBounds(700, lbl_instrucaoJogo.getY() + 140, 300, 50);
        txt_email.setFont(new Font("Arial", NORMAL, 20));
        txt_email.setBackground(Color.white);
        txt_email.setOpaque(true);
        txt_email.setForeground(Color.black);
        txt_email.setVisible(true);
        //psw
        psw_senha.setBounds(700, lbl_email.getY() + 80, 300, 50);
        psw_senha.setFont(new Font("Arial", NORMAL, 20));
        psw_senha.setBackground(Color.white);
        psw_senha.setOpaque(true);
        psw_senha.setForeground(Color.black);
        psw_senha.setVisible(true);

        //btn
        btn_entrar.setSize(150, 60);
        btn_entrar.setLocation(login.getWidth() / 2 - (btn_entrar.getWidth() / 2), psw_senha.getY() + 80);
        btn_entrar.setFont(new Font("Arial", NORMAL, 35));
        btn_entrar.setBackground(new Color(246, 190, 0));
        btn_entrar.setOpaque(true);
        btn_entrar.setText("Entrar");
        btn_entrar.setForeground(Color.WHITE);
        btn_entrar.setVisible(true);
        //img
        img_imagem = new ImageIcon(getClass().getResource("/res/fundo4.png"));
        lbl_fundo.setIcon(img_imagem);
        lbl_fundo.setBounds(0, 0, 1600, 900);
        lbl_fundo.setVisible(true);
        //container
        login.add(btn_entrar);
        login.add(txt_email);
        login.add(psw_senha);
        login.add(lbl_email);
        login.add(lbl_senha);
        login.add(lbl_nomeJogo);
        login.add(lbl_instrucaoJogo);
        login.add(lbl_fundo);

        login.setVisible(true);

//inputDados();
        btn_entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    String email_player, senha_player;
                    email_player = txt_email.getText();
                    senha_player = psw_senha.getText();

                    JogadorDTO objDTO = new JogadorDTO();
                    objDTO.setEmail(email_player);
                    objDTO.setSenha(senha_player);

                    PlayerDAO objdao = new PlayerDAO();
                    ResultSet rsplayerdao = objdao.autenticacao(objDTO);

                    if (rsplayerdao.next()) {
                        System.out.println("Abrir trla");
                        login.dispose();
                        new EscolhaNivel();
                    } else {
                        JOptionPane.showMessageDialog(null, "credenciais erradas");
                        System.out.println("erro entrar");
                    }

                } catch (SQLException ex) {
                    System.getLogger(Entrar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }

            }

        });
    }}
