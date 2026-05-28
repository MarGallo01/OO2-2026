package org.example;

import java.time.LocalDate;

public class Mamifero implements IMamifero{
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private IMamifero padre;
    private IMamifero madre;


    public Mamifero() {
        this.fechaNacimiento  = LocalDate.now();
        this.madre = new NullMamifero();
        this.padre = new NullMamifero();
    }

    public Mamifero(String id) {
        this.identificador = id;
        this.fechaNacimiento  = LocalDate.now();
    }

    public String getIdentificador() {
        return this.identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public IMamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }
    public IMamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public IMamifero getAbueloMaterno() {//Revisar metodo
        return this.madre.getPadre();

    }

    public IMamifero getAbuelaMaterna() {//Revisar metodo
        return this.madre.getMadre();
    }

    public IMamifero getAbueloPaterno() {//Revisar metodo
        return this.padre.getPadre();
    }

    public IMamifero getAbuelaPaterna() {//Revisar metodo
        return this.padre.getMadre();
    }


    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        if(unMamifero.equals(this.padre) || unMamifero.equals(this.madre))
            return true;
        return this.padre.tieneComoAncestroA(unMamifero) ||
                this.madre.tieneComoAncestroA(unMamifero);
    }
}
