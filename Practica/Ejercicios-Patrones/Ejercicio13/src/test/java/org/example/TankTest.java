package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TankTest {
    MockMixingTank mock;

    @BeforeEach
    public void setUp() throws Exception
    {
        mock = new MockMixingTank(true);
    }

    @Test
    public void testMock()
    {
        assertTrue(mock.heatPower(100));
        assertTrue(mock.mixerPower(100));
        assertEquals(30, mock.upTo());
        assertEquals(30, mock.temperature());
        assertTrue(mock.purge());
    }
}
