package meuJogo;

import javax.swing.JFrame;
import meuJogoModelo.Fase1;
import meuJogoModelo.Jogador;

public class Container1 extends JFrame { //classe recebe tudo do JFrame
    //construtor

    public Container1() {
        //adiciona fase 1
        add(new Fase1());
        //titluro
        setTitle("Nivel 1");
        //definir tamanho da tela
        setSize(1210, 755);  //1080,1920 tela cheia //1500, 1000 tela telmporaria
        //ação do container apos clicar no X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Definir localização do spawn da tela
        setLocationRelativeTo(null);
        //possibilidade de redimensionar a tela
        this.setResizable(true);
        //Visibilidade da tela
        setVisible(true);
    }

    //metodo main
    public static void main(String[] args) {
        new Container1();
        new Fase1();
        
        
        
        
        ////////////////TESTEANDO
        
        
        
        
    }

}
