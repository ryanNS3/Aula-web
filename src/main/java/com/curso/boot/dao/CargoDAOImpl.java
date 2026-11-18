package com.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.curso.boot.domain.Cargo;

@Repository
public class CargoDAOImpl extends AbstractDao<Cargo, Long> implements CargoDAO {

    @Override
    public boolean cargoTemFuncionarios(Long id) {
        Long count = getEntityManager()
                .createQuery("SELECT COUNT(f) FROM Funcionario f WHERE f.cargo.id = :id", Long.class)
                .setParameter("id", id)
                .getSingleResult();
        return count > 0;
    }
}
