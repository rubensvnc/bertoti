import java.util.List;
import java.util.LinkedList;


public class Petshop {


	private List<Animal> animais = new LinkedList<Animal>();
	
	public Petshop(List<Animal> animais) {
		this.animais = animais;
	}

	
	public void cadastrarAnimal(Animal animal) {
		this.animais.add(animal);
	}
	
	public List<Animal> retornarAnimais() {
		return this.animais;
	}
}
