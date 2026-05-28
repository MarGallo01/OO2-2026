package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {
    MockWeatherStation mock;
    MaxMinDecorator maxMin;
    PromedioDecorator promedio;
    WeatherStationAdapter adapter;
    StationCelsius celsius;

    @BeforeEach
    void setUp() throws Exception
    {
        mock = new MockWeatherStation();
        maxMin = new MaxMinDecorator(new MockWeatherStation());
        promedio = new PromedioDecorator(new MockWeatherStation());
        adapter = new WeatherStationAdapter(mock);
    }

    @Test
    public void testMock()
    {
        assertEquals("Temperatura F: " + 86.0 + "; Presión atmosf: " + 1008.0 + "; Radiación solar: " + 200.0, mock.displayData());
    }
    @Test
    public void testMaxMin()
    {
        assertEquals("Temperatura F: " + 86.0 + "; Presión atmosf: " + 1008.0 + "; Radiación solar: " + 200.0
                + "; Mínimo: " + 27.0 + " Máximo: " + 32.0, maxMin.displayData());
    }

    @Test
    public void testPromedio()
    {
        assertEquals("Temperatura F: " + 86.0 + "; Presión atmosf: " + 1008.0 + "; Radiación solar: " + 200.0
                + "; Temperatura historica: " + 29.67, promedio.displayData());
    }
    @Test
    public void testCeulcius()
    {
        assertEquals("Temperatura C: " + 30.0 + "; Presión atmosf: " + 1008.0 + "; Radiación solar: " + 200.0, mock.displayDataCelsius());
    }
}
