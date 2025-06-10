package game;

import java.util.ArrayList;

public class GerenciadorArray {

//metodo para obter o Array
    private int levels;
    private ArrayList<Integer> levelsLista;

    public GerenciadorArray() {

        levelsLista = new ArrayList<>();
        levelsLista.add(0, 0);
        System.out.println(levelsLista);
        //EscolhaNivel e = new EscolhaNivel();
       // e.getlista();
        //System.out.println(e.getlista());
        levelsLista.add(0, 1);
        levelsLista.add(1, 1);
    }

    public ArrayList<Integer> getLevelsLista() {
        return new ArrayList<>(1);
    }

    public void setLevelsLista(int levels) {
        levelsLista.add(levels);
        this.levelsLista = levelsLista;
    }}
