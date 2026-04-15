package org.example;

import java.util.List;

public class Document {
    List<String> words;
    public long characterCount() {
        return this.words.stream().mapToLong(w -> w.length()).sum();
    }
    public long calculateAvg() {
        return characterCount() / this.words.size();
    }
    // Resto del código que no importa
}

/*
--Code Smells
-- Codigo repetido -- extract method no, reiventa la rueda 
-- uso de variables temporales innecesarias - ?


 */
