package com.porfolioLatorre.mgb.DTO;

import jakarta.validation.constraints.NotBlank;

public class DTOExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    //Constructores

    public DTOExperiencia() {
    }

    public DTOExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
