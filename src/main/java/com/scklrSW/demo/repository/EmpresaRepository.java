package com.scklrSW.demo.repository;

import com.scklrSW.demo.model.Empress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empress, Long> {
    void set();
}
