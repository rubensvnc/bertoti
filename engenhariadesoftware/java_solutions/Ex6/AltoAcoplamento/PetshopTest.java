package AltoAcoplamento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetshopTest {
    @Test void testAdicionar() {
        Petshop p = new Petshop();
        p.adicionarNovoAnimal("X", "Y", 1, 1.0);
        assertEquals(1, p.animais.size());
    }

    @Test void testContarCachorros() {
        Petshop p = new Petshop();
        p.adicionarNovoAnimal("A", "Cachorro", 1, 1.0);
        assertEquals(1, p.contarCachorros());
    }

    @Test void testVacina() {
        Petshop p = new Petshop();
        p.adicionarNovoAnimal("A", "B", 1, 1.0);
        p.darVacinaGeral();
        assertTrue(p.animais.get(0).vacinado);
    }

    @Test void testPesoPrimeiro() {
        Petshop p = new Petshop();
        p.adicionarNovoAnimal("A", "B", 1, 55.0);
        assertEquals(55.0, p.pegarPesoDoPrimeiro());
    }

    @Test void testLimpar() {
        Petshop p = new Petshop();
        p.adicionarNovoAnimal("A", "B", 1, 1.0);
        p.limparLoja();
        assertEquals(0, p.animais.size());
    }
}