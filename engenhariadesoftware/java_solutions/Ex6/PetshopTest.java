import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PetshopTest {

	@Test
	void test() {
		List<Animal> animais_iniciais = new LinkedList<Animal>();
		
		Animal animal = new Animal("Cachorro Alemão", 3);
		Animal animal2 = new Animal("Papagaio shin", 4);
		Animal animal3 = new Animal("Cachorro Dobermann", 6);
		Animal animal4 = new Animal("Gato Siberiano", 1);
		Animal animal5 = new Animal("Jabuti", 2);
		Animal animal6 = new Animal("Serpente", 6);
		
		animais_iniciais.add(animal);
		animais_iniciais.add(animal2);
		animais_iniciais.add(animal3);
		animais_iniciais.add(animal4);
		animais_iniciais.add(animal5);
		
		Petshop petshop = new Petshop(animais_iniciais);
		
		
		
		petshop.cadastrarAnimal(animal6);
		
		assertEquals(petshop.retornarAnimais().size(), 6);
		
	}
	
	
	

}
