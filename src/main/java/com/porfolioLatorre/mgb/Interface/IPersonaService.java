package com.porfolioLatorre.mgb.Interface;

import com.porfolioLatorre.mgb.Entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Traer lista de personas

    public List<Persona> getPersona();

    //Guardar O Tipo Persona
    public void savePersona(Persona persona);

    //Eliminar por ID
    public void deletePersona(Long id);

    //Buscar Peronsa por ID
    public Persona findPersona(Long id);
}
