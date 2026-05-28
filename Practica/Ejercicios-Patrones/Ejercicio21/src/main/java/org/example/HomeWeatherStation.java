package org.example;

import java.util.List;

public class HomeWeatherStation implements WeatherData{
    @Override
    public double getTemperatura() {
        return 0;
    }

    @Override
    public double getPresion() {
        return 0;
    }

    @Override
    public double getRadiacionSolar() {
        return 0;
    }

    @Override
    public List<Double> getTemperaturas() {
        return null;
    }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
                "Presión atmosf: " + this.getPresion() +
                "Radiación solar: " + this.getRadiacionSolar();

    }
}
