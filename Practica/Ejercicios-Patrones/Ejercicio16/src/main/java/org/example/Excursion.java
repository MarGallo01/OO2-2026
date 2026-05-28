package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuntro;
    private double costo;
    private int cupoMin;
    private int cupoMax;
    private List<Usuario> usuarios;
    private List<Usuario> enEspera;
    private Estado estado;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuntro, double costo,
                     int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuntro = puntoEncuntro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.usuarios = new ArrayList<Usuario>();
        this.enEspera = new ArrayList<Usuario>();
        this.estado = new Provisorio();
    }

    protected boolean hayLugar()
    {
        return this.usuarios.size() < this.cupoMax;
    }

    protected boolean superoCupoMinimo()
    {
        return this.usuarios.size() >= this.cupoMin;
    }

    protected void agregarUsuario(Usuario usuario)
    {
        this.usuarios.add(usuario);
    }

    protected void agregarUsuarioEnEspera(Usuario usuario)
    {
        this.enEspera.add(usuario);
    }

    protected String armarMensaje()
    {
        return "Nombre: " + this.nombre + ", Costo: " + this.costo +
                ", Fechas:"+ this.fechaInicio + " - " + this.fechaFin
                + ", Punto de encuentro: " + this.puntoEncuntro + ", ";
    }

    protected int cantidadParaCupoMin() {
        return this.cupoMin - this.usuarios.size();
    }

    protected int cantidadParaCupoMax() {
        return this.cupoMax - this.usuarios.size();
    }

    protected String obtenerEmails()
    {
        return "Emails: " + this.usuarios.stream().map(Usuario::getEmail).collect(Collectors.joining(", "));
    }

    protected void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public void inscribir(Usuario usuario)
    {
        this.estado.inscribir(this, usuario);
    }

    public String obtenerInformacion()
    {
        return this.estado.obtenerInformacion(this);
    }

    public boolean estaEnEspera(Usuario usuario) {
        return this.enEspera.contains(usuario);
    }

}
