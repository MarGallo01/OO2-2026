package org.example;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
    private String nombre;
    private String extension;
    private String permisos;
    private double tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;

    public FileOO2(String nombre, String extension, String permisos, double tamaño, LocalDate fechaModificacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.permisos = permisos;
        this.tamaño = tamaño;
        this.fechaModificacion = fechaModificacion;
        this.fechaCreacion = LocalDate.now();
    }

    @Override
    public String prettyPrint() {
        return "Nombre: " + this.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public String getPermisos() {
        return permisos;
    }

    public double getTamaño() {
        return tamaño;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }
}
