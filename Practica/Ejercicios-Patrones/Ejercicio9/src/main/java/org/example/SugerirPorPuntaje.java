package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerirPorPuntaje implements Sugerencia{
    @Override
    public List<Pelicula> sugerir(Decodificador deco) {
        return deco.noVistas().stream()
                .sorted(Comparator.comparingDouble(Pelicula::getPuntaje)
                        .thenComparing(Comparator.comparingInt(Pelicula::getAño).reversed())
                        .reversed()
                )
                .limit(3)
                .collect(Collectors.toList());
    }
}
