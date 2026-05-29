package AltoAcoplamento;

public class Animal {
    public String nome; // Atributos públicos facilitam alto acoplamento
    public String raca;
    public int idade;
    public double peso;
    public boolean vacinado;

    public Animal(String nome, String raca, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
}