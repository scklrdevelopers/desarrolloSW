package com.scklrSW.demo.repository;
import com.scklrSW.demo.model.Empleado;
import com.scklrSW.demo.model.Empress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
