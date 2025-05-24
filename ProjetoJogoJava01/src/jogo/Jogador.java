package jogo;
//jogador/personagem

import java.util.Scanner;
import javax.swing.text.Position;

public class Jogador {

    //atributos do personagem
    private int positionx, positiony ;
    
    private int vida;
    private double tamanhoPulo;
    private String nome;

  
    //metodos do personagem
    ///
    ///mover(pular,andar)-------------------
    ///alteração nos pontos de vida
    ///sistema de dano(dar dano padrao e ter chance de critico com o random)
    
     private int x; // Coordenada X
    private int y; // Coordenada Y

    // Construtor para definir posição inicial
    public Jogador(int xInicial, int yInicial) {
        this.x = xInicial;
        this.y = yInicial;
    }

    // Métodos para movimentação
    public void moverCima(int distancia) {
        y += distancia;
    }

    public void moverBaixo(int distancia) {
        y -= distancia;
    }

    public void moverEsquerda(int distancia) {
        x -= distancia;
    }

    public void moverDireita(int distancia) {
        x += distancia;
    }

    // Método para mostrar posição atual
    public void mostrarPosicao() {
        System.out.println("Posição atual: (" + x + ", " + y + ")");
    }


    }


