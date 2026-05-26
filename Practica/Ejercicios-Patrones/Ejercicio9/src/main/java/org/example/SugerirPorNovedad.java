package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SugerirPorNovedad implements Sugerencia {
    @Override
    public List<Pelicula> sugerir(Decodificador deco) {
        return deco.noVistas().stream()
                .sorted(Comparator.comparingInt(Pelicula::getAño).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
