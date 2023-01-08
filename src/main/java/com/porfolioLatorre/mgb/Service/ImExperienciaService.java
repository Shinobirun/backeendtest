package com.porfolioLatorre.mgb.Service;


import com.porfolioLatorre.mgb.Entity.ExperienciaL;
import com.porfolioLatorre.mgb.Repository.IReExperiencia;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImExperienciaService {
    @Autowired
    IReExperiencia iReExperiencia;

    public List<ExperienciaL> list(){
        return iReExperiencia.findAll();
    }

    public Optional<ExperienciaL> getOne(int id){
        return iReExperiencia.findById(id);
    }

    public Optional<ExperienciaL> getByNombreE(String nombreE){
        return iReExperiencia.findByNombreE(nombreE);
    }

    public void save(ExperienciaL expe){
        iReExperiencia.save(expe);
    }

    public void delete(int id){
        iReExperiencia.deleteById(id);
    }

    public boolean existsById(int id){
        return iReExperiencia.existsById(id);
    }

    public boolean existsByNombreE(String nombreE){
        return iReExperiencia.existsByNombreE(nombreE);
    }
}
