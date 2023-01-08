/*package com.porfolioLatorre.mgb.Service;

import com.porfolioLatorre.mgb.Entity.Persona;
import com.porfolioLatorre.mgb.Interface.IPersonaService;
import com.porfolioLatorre.mgb.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);

    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.delete(id);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
}
*/
 package com.porfolioLatorre.mgb.Service;


 import com.porfolioLatorre.mgb.Entity.Persona;
 import com.porfolioLatorre.mgb.Interface.IPersonaService;
 import com.porfolioLatorre.mgb.Repository.IPersonaRepository;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.cache.annotation.Cacheable;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;

 import java.util.List;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    @Override
    @Cacheable("personas")
    public List<Persona> getPersona() {
        return ipersonaRepository.findAll();
    }

    @Override
    @Transactional
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    @Transactional
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return ipersonaRepository.findById(id).orElse(null);
    }
}