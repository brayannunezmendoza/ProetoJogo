package jogo;
//jogador/personagem

public class Jogador {

    //atributos do personagem
    private int vida;
    private double tamanhoPulo;
    private String nome;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getTamanhoPulo() {
        return tamanhoPulo;
    }

    public void setTamanhoPulo(double tamanhoPulo) {
        this.tamanhoPulo = tamanhoPulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos do personagem
    ///
    ///mover(pular,andar)
    ///alteração nos pontos de vida
    ///sistema de dano(dar dano padrao e ter chance de critico com o random)
    
    
    

}
