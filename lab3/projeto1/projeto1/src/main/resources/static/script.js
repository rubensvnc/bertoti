const API_URL = 'http://localhost:8080/produtos';

// Carregar produtos ao abrir a página
document.addEventListener('DOMContentLoaded', carregarProdutos);

async function carregarProdutos() {
    try {
        const response = await fetch(API_URL);
        const produtos = await response.json();

        const tbody = document.getElementById('tabelaProdutos');
        tbody.innerHTML = '';

        produtos.forEach(p => {
            const id = p.id_produto;

            tbody.innerHTML += `
                <tr>
                    <td>${id}</td>
                    <td>${p.nome}</td>
                    <td>R$ ${p.preco.toFixed(2)}</td>
                    <td>${p.quantidade_estoque}</td>
                    <td>
                        <button onclick="prepararEdicao(${id}, '${p.nome}', ${p.preco}, ${p.quantidade_estoque})">Editar</button>
                        <button onclick="deletarProduto(${id})">Excluir</button>
                    </td>
                </tr>
            `;
        });
    } catch (error) {
        console.error('Erro ao carregar produtos:', error);
    }
}

// Salvar (Criar ou Atualizar)
document.getElementById('produtoForm').addEventListener('submit', async (e) => {
    e.preventDefault();

    const id = document.getElementById('idProduto').value;
    const nome = document.getElementById('nome').value;
    const preco = parseFloat(document.getElementById('preco').value);
    const quantidadeEstoque = parseInt(document.getElementById('quantidadeEstoque').value);

    const produto = { nome, preco, quantidadeEstoque };

    const metodo = id ? 'PUT' : 'POST';
    const url = id ? `${API_URL}/${id}` : API_URL;

    await fetch(url, {
        method: metodo,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(produto)
    });

    limparFormulario();
    carregarProdutos();
});

function prepararEdicao(id, nome, preco, quantidadeEstoque) {
    document.getElementById('idProduto').value = id;
    document.getElementById('nome').value = nome;
    document.getElementById('preco').value = preco;
    document.getElementById('quantidadeEstoque').value = quantidadeEstoque;
}

async function deletarProduto(id) {
    if (confirm('Deseja realmente excluir este produto?')) {
        await fetch(`${API_URL}/${id}`, { method: 'DELETE' });
        carregarProdutos();
    }
}

function limparFormulario() {
    document.getElementById('idProduto').value = '';
    document.getElementById('produtoForm').reset();
}