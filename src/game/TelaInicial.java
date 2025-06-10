/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TelaInicial extends JFrame {

    private JLabel fundo;
    private JLabel lblTextoEntrada;
    private EscolhaNivel escolhanivel;

    public TelaInicial() {
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        comp();
        telaFundo();
        setVisible(true);
        clique();

    }

    public void telaFundo() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundoescolha.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        add(fundo);
    }

    public void comp() {
        lblTextoEntrada = new JLabel("CLIQUE NA TELA AGORA");
        lblTextoEntrada.setBounds(380, 400, 800, 100);
        lblTextoEntrada.setBackground(Color.yellow);
        lblTextoEntrada.setForeground(Color.WHITE);
        lblTextoEntrada.setFont(new Font("Arial", NORMAL, 60));
        lblTextoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
        lblTextoEntrada.setOpaque(true);
        lblTextoEntrada.setVisible(true);
        add(lblTextoEntrada);

    }

    public void clique() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("clicado1");
                new EscolhaNivel();
                dispose();

            }
        });
    }
}
