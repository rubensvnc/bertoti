package AltoAcoplamento;

public class MainAltoAcoplamento {
    public static void main(String[] args) {
        Petshop loja = new Petshop();

        // O Main não envia objetos, envia dados soltos.
        // Se Animal mudar, todas essas linhas quebram.
        loja.adicionarNovoAnimal("Fifi", "Poodle", 5, 3.0);

        System.out.println("Cachorros: " + loja.contarCachorros());
        loja.darVacinaGeral();

        // Acesso direto à lista pública (Quebra o encapsulamento)
        System.out.println("Nome do animal: " + loja.animais.get(0).nome);
    }
}