package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SugerirPorSimilitud implements Sugerencia{
    @Override
    public List<Pelicula> sugerir(Decodificador deco) {
        Set<Pelicula> similaresNoVistas = new HashSet<Pelicula>();
        //Recorro sobre las peliculas vistas
        deco.getReproducidad().stream().forEach(vista -> {
            deco.noVistas().stream()
                    .filter(p -> vista.esSimilar(p))  // filtro por peliculas similares
                    .forEach(p -> similaresNoVistas.add(p));  // Agrego las similares al Set
        });


        return similaresNoVistas.stream()
                .sorted(Comparator.comparingInt(Pelicula::getAño).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
