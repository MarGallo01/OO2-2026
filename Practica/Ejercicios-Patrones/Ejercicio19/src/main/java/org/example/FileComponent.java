package org.example;

import java.time.LocalDate;

public interface FileComponent {
    public String prettyPrint();
    public double getTamaño();
    public String getExtension();
    public String getPermisos();
    public LocalDate getFechaCreacion();
    public LocalDate getFechaModificacion();
}
