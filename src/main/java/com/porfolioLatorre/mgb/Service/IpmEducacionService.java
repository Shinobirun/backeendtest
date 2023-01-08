package com.porfolioLatorre.mgb.Service;


import com.porfolioLatorre.mgb.Entity.Educacion;
import com.porfolioLatorre.mgb.Repository.IReEducacion;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IpmEducacionService {
    @Autowired
    IReEducacion rEducacion;

    public List<Educacion> list(){
        return rEducacion.findAll();
    }

    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }

    public Optional<Educacion> getByNmbreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }

    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }

    public void delete(int id){
        rEducacion.deleteById(id);
    }

    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }

    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    }
}
