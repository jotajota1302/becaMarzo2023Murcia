package edu.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{

}
