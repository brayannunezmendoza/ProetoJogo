package meuJogoModelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase1 extends JPanel implements ActionListener {

    private Image fundo;
    private Jogador jogador;
    private Timer timer;

    //construtor da Fase 1
    public Fase1() {

        setFocusable(true);
        setDoubleBuffered(true);

        //importação da imagem de fundo para a tela
        ImageIcon referencia = new ImageIcon(getClass().getResource("/jogoImagem/Prancheta 1_1.png"));
        fundo = referencia.getImage();

        //jogador
        jogador = new Jogador();
        jogador.load();

        //entrada do teclado
        addKeyListener(new TecladoAdapter());

        //velocidade
        timer = new Timer(5, this);
        timer.start();

    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(jogador.getImagem(), jogador.getX(), jogador.getY(), this);
        g.dispose();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        jogador.update();
        repaint();

    }

    private class TecladoAdapter extends KeyAdapter {

        public void KeyPressed(KeyEvent seta) {
            jogador.KeyPressed(seta);
        }

        public void KeyReleased(KeyEvent seta) {
            jogador.KeyReleased(seta);
        }

    }

}
