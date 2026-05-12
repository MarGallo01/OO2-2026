package org.example;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Union implements ElementoQuimico{

    private List<ElementoQuimico> elementos;

    public Union(List<ElementoQuimico> elementos){
        this.elementos = new LinkedList<ElementoQuimico>(elementos);
    }

    public String formula(){
        HashMap<String, Integer> conteo = new HashMap<>();
        elementos.stream().forEach(e -> conteo.put(e.formula(), conteo.getOrDefault(e.formula(), 0) + 1));
        String formula = conteo.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(entry -> entry.getValue() > 1
                        ? entry.getKey() + entry.getValue()
                        : entry.getKey())
                .collect(Collectors.joining());
        return formula;
    }

    public int pesoMolecular(){
        return this.elementos.stream().mapToInt(E -> E.pesoMolecular()).sum();
    }

    public int carga(){
        return this.elementos.stream().mapToInt((E -> E.carga())).sum();
    }

    /*
    public boolean esValida(){
        return this.elementos.
    }
    */
}
