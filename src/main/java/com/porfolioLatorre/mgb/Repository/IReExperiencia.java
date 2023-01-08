package com.porfolioLatorre.mgb.Repository;


import com.porfolioLatorre.mgb.Entity.ExperienciaL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IReExperiencia extends JpaRepository<ExperienciaL, Integer> {
    public Optional<ExperienciaL> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}