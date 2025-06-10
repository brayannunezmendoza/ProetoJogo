/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import game.TelaFrame;

public class EscolhaNivel extends JFrame {

    private int nivel;
    private JLabel escolha1;
    private JLabel escolha2;
    private JLabel escolha3;
    private JLabel escolha4;
    private JLabel escolha5;
    private JLabel escolha6;
    private JLabel escolha7;
    private JLabel escolha8;
    private JLabel escolha9;
    private JLabel escolha10;
    private JLabel fundo;
    private int x = 200, y = 300;
    private int h = 200;
    private int w = 400;
    private ArrayList<Integer> l1;
    private int levels;
//private TelaFrame t;

    //enviar valor de nivel para fora
    public EscolhaNivel() {

        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        escolhas();
        fundo();
        setVisible(true);
        l1 = new ArrayList<>();
        l1.add(0, 0);//valores 
        l1.add(1, 0);
        l1.add(2, 0);
        l1.add(3, 0);
        l1.add(4, 0);
        l1.add(5, 0);

    }

    public void fundo() {
        fundo = new JLabel(new ImageIcon(getClass().getResource("/res/fundoescolha.png")));
        fundo.setBounds(0, 0, 1600, 900);
        fundo.setVisible(true);
        add(fundo);

    }

    public void escolhas() {
        escolha1 = new JLabel("Nivel 1 Bloquedo");
        escolha2 = new JLabel("Nivel 2 Bloquedo");
        escolha3 = new JLabel("Nivel 3 Bloquedo");
        escolha4 = new JLabel("Nivel 4 Bloquedo");
        escolha5 = new JLabel("Nivel 5 Bloquedo");
        escolha6 = new JLabel("Nivel 6 Bloquedo");
        escolha7 = new JLabel("Nivel 7 Bloquedo");
        escolha8 = new JLabel("Nivel 8 Bloquedo");
        escolha9 = new JLabel("Nivel 9 Bloquedo");
        escolha10 = new JLabel("Nivel 10 Bloquedo");

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

        add(escolha1);
        add(escolha2);
        add(escolha3);
        add(escolha4);
        add(escolha5);
        add(escolha6);

        clique();
    }

    public void clique() {
        escolha1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(0, 1);

                System.out.println(l1);

            }
        });
        escolha2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(1, 2);
                System.out.println(l1);

            }
        });
        escolha3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(2, 3);
                System.out.println(l1);

            }
        });
        escolha4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(3, 4);
                System.out.println(l1);

            }
        });
        escolha5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(4, 5);
                System.out.println(l1);

            }
        });
        escolha6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l1.set(5, 6);
                System.out.println(l1);
            }
        });
    }

    public ArrayList<Integer> getlista() {

        return l1;

    }
}
