package com.porfolioLatorre.mgb.Repository;

import com.porfolioLatorre.mgb.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IReEducacion extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
