package lab.bertoti.projeto1.Controllers;

import lab.bertoti.projeto1.Entities.Produto;
import lab.bertoti.projeto1.Repositories.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:8080", "http://127.0.0.1:5500"})
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        Produto novoProduto = produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoDetalhes) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produtoDetalhes.getNome());
            produto.setPreco(produtoDetalhes.getPreco());
            produto.setQuantidade_estoque(produtoDetalhes.getQuantidade_estoque());

            Produto atualizado = produtoRepository.save(produto);
            return ResponseEntity.ok(atualizado);
        }).orElseGet(() -> {
            produtoDetalhes.setId_produto(id);
            Produto salvo = produtoRepository.save(produtoDetalhes);
            return new ResponseEntity<>(salvo, HttpStatus.CREATED);
        });
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
