package BaixoAcoplamento;

public class Animal {
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private boolean vacinado;

    public Animal(String nome, String raca, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.vacinado = false;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }
    public boolean isVacinado() { return vacinado; }
    public void setVacinado(boolean vacinado) { this.vacinado = vacinado; }

    @Override
    public String toString() {
        return String.format("Animal: %s (%s), %d anos, %.2fkg - Vacinado: %b", nome, raca, idade, peso, vacinado);
    }
}