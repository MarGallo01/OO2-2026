package org.example;

public class Direccion {
    private String localidad;
    private String calle;
    private String numero;
    private String departamento;

    public String getLocalidad(){
        return this.localidad;
    }
    public String getCalle(){
        return this.calle;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getDepartamento(){
        return this.departamento;
    }

    public String getDireccionFormateada(){
        return localidad + "," + calle + "," + numero + "," + departamento;
    }
}
