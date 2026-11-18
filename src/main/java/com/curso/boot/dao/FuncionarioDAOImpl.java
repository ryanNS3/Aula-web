package com.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDAOImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDAO {

    @Override
    public List<Funcionario> findByNome(String nome) {
        return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
    }

    @Override
    public List<Funcionario> findByCargoId(Long id) {
        return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
    }

    @Override
    public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
        return createQuery(
                "select f from Funcionario f where f.dataEntrada >= ?1 and f.dataSaida <= ?2 order by f.dataEntrada asc",
                entrada, saida);
    }

    @Override
    public List<Funcionario> findByDataEntrada(LocalDate entrada) {
        return createQuery("select f from Funcionario f where f.dataEntrada = ?1 order by f.dataEntrada asc", entrada);
    }

    @Override
    public List<Funcionario> findByDataSaida(LocalDate saida) {
        return createQuery("select f from Funcionario f where f.dataSaida = ?1 order by f.dataEntrada asc", saida);
    }

}
