package BaixoAcoplamento;

import java.util.ArrayList;

public class MainBaixoAcoplamento {
    public static void main(String[] args) {
        // O Main decide qual lista usar (Flexibilidade)
        Petshop petshop = new Petshop(new ArrayList<>());

        Animal a1 = new Animal("Bibi", "Gato", 3, 4.2);
        petshop.cadastrarAnimal(a1);

        System.out.println("Peso Total: " + petshop.calcularPesoTotal());
        petshop.vacinarTodos();
        System.out.println("Animais: " + petshop.retornarTodos());
    }
}