package br.com.rpires.dao;

import br.com.rpires.domain.Produto;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDAOImpl implements ProdutoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void salvar(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public Produto buscarPorId(Long id) {
        return entityManager.find(Produto.class, id);
    }

    @Override
    public void atualizar(Produto produto) {
        entityManager.merge(produto);
    }

    @Override
    public void deletar(Produto produto) {
        entityManager.remove(produto);
    }
}