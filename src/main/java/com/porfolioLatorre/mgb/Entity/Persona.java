package com.porfolioLatorre.mgb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size( min=1, max=50, message="No cumple con la longitud")
    private String nombre;

    @NotNull
    @Size( min=1, max=50, message="No cumple con la longitud")
    private String apellido;

    @Size( min=1, max=50, message="No cumple con la longitud")
    private String img;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Entity
    public static class Educacion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nombreE;
        private String nombreE;
        private String descripcionE;

        public Educacion() {
        }

        public Educacion(String nombreE, String descripcionE) {
            this.nombreE = nombreE;
            this.descripcionE = descripcionE;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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
}
