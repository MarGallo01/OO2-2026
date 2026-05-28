package org.example;

import java.util.Arrays;
import java.util.List;

public class MockWeatherStation implements WeatherData{
    @Override
    public double getTemperatura() {
        return 86;
    }

    @Override
    public double getPresion() {
        return 1008;
    }

    @Override
    public double getRadiacionSolar() {
        return 200;
    }

    @Override
    public List<Double> getTemperaturas() {
        return Arrays.asList(27.0, 32.0, 30.0); // valores históricos del ejemplo
    }
    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
                "; Presión atmosf: " + this.getPresion() +
                "; Radiación solar: " + this.getRadiacionSolar();
    }

    public String displayDataCelsius() {
        return "Temperatura C: " + ((this.getTemperatura() - 32) / 1.8) +
                "; Presión atmosf: " + this.getPresion() +
                "; Radiación solar: " + this.getRadiacionSolar();
    }
}
