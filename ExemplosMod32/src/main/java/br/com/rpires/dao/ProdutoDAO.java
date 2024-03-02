package br.com.rpires.dao;

import br.com.rpires.domain.Produto;

public interface ProdutoDAO {
    void salvar(Produto produto);

    Produto buscarPorId(Long id);

    void atualizar(Produto produto);

    void deletar(Produto produto);
}