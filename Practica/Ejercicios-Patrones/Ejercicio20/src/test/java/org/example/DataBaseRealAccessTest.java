package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataBaseRealAccessTest {
    private DataBaseAccess database;
    private DataBaseAccessProxy proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DataBaseAccessProxy(new DataBaseRealAccess(), true);
        this.proxy = new DataBaseAccessProxy(new DataBaseRealAccess(), false);
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    @Test
    void testGetSearchResultsSinAutenticacion() {
        assertThrows(RuntimeException.class, () -> {
            proxy.getSearchResults("select * from comics where id=1");
        });
    }

    @Test
    void testInsertNewRowSinAutenticacion() {
        assertThrows(RuntimeException.class, () -> {
            proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        });
    }
}
