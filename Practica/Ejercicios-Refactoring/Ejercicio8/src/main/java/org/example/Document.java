package org.example;

import java.util.List;

public class Document {
    List<String> words;
    public long characterCount() {
        return calcular();
    }
    public long calculateAvg() {
        return calcular() / this.words.size();
    }
    // Resto del código que no importa

    public long calcular(){
        return this.words.stream().mapToLong(w -> w.length()).sum();
    }

}


/*
--Code Smells
-- Codigo repetido -- extract method
-- uso de variables temporales innecesarias - ?



 */
