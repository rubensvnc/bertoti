package AltoAcoplamento;

import java.util.LinkedList;

public class Petshop {
    // Instanciação rígida: fixo em LinkedList
    public LinkedList<Animal> animais = new LinkedList<>();

    // O método recebe parâmetros e CRIA o animal (Péssimo: Petshop sabe criar Animais)
    public void adicionarNovoAnimal(String nome, String raca, int idade, double peso) {
        Animal a = new Animal(nome, raca, idade, peso);
        this.animais.add(a);
    }

    public int contarCachorros() {
        int c = 0;
        for(Animal a : animais) {
            if(a.raca.equals("Cachorro")) c++; // Acesso direto a atributo público
        }
        return c;
    }

    public void darVacinaGeral() {
        for(int i=0; i<animais.size(); i++) {
            animais.get(i).vacinado = true;
        }
    }

    public double pegarPesoDoPrimeiro() {
        return animais.get(0).peso;
    }

    public void limparLoja() {
        this.animais = new LinkedList<>(); // Recria a lista internamente
    }
}