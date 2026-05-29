package BaixoAcoplamento;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PetshopTest {
    @Test void testCadastrar() {
        Petshop p = new Petshop(new ArrayList<>());
        p.cadastrarAnimal(new Animal("Rex", "Poodle", 2, 5.0));
        assertEquals(1, p.retornarTodos().size());
    }

    @Test void testFiltrarRaca() {
        Petshop p = new Petshop(new ArrayList<>());
        p.cadastrarAnimal(new Animal("Rex", "Poodle", 2, 5.0));
        p.cadastrarAnimal(new Animal("Thor", "Doberman", 3, 20.0));
        assertEquals(1, p.filtrarPorRaca("Poodle").size());
    }

    @Test void testVacinarTodos() {
        Petshop p = new Petshop(new ArrayList<>());
        p.cadastrarAnimal(new Animal("Rex", "Poodle", 2, 5.0));
        p.vacinarTodos();
        assertTrue(p.retornarTodos().get(0).isVacinado());
    }

    @Test void testPesoTotal() {
        Petshop p = new Petshop(new ArrayList<>());
        p.cadastrarAnimal(new Animal("A", "R1", 1, 10.0));
        p.cadastrarAnimal(new Animal("B", "R2", 1, 5.5));
        assertEquals(15.5, p.calcularPesoTotal());
    }

    @Test void testRemoverIdosos() {
        Petshop p = new Petshop(new ArrayList<>());
        p.cadastrarAnimal(new Animal("Velho", "R1", 15, 10.0));
        p.removerIdosos(10);
        assertEquals(0, p.retornarTodos().size());
    }
}