package BaixoAcoplamento;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Petshop {
    private final List<Animal> animais; // Depende da Interface List

    public Petshop(List<Animal> listaInjetada) {
        this.animais = listaInjetada;
    }

    public void cadastrarAnimal(Animal animal) {
        if (animal != null) animais.add(animal);
    }

    public List<Animal> retornarTodos() {
        return List.copyOf(animais);
    }

    public List<Animal> filtrarPorRaca(String raca) {
        return animais.stream()
                .filter(a -> a.getRaca().equalsIgnoreCase(raca))
                .collect(Collectors.toList());
    }

    public void vacinarTodos() {
        animais.forEach(a -> a.setVacinado(true));
    }

    public double calcularPesoTotal() {
        return animais.stream().mapToDouble(Animal::getPeso).sum();
    }

    public void removerIdosos(int idadeLimite) {
        animais.removeIf(a -> a.getIdade() > idadeLimite);
    }
}