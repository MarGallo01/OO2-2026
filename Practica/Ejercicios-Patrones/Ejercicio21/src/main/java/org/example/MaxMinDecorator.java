package org.example;

public class MaxMinDecorator extends WeatherDecorator{
    public MaxMinDecorator(WeatherData weather) {
        super(weather);
    }

    private double getTemperaturaMinima()
    {
        return this.getTemperaturas().stream()
                .min(Double::compare)
                .orElse(0.0);
    }

    private double getTemperaturaMaxima()
    {
        return this.getTemperaturas().stream()
                .max(Double::compare)
                .orElse(0.0);
    }

    @Override
    public String displayData() {
        return super.displayData()
                + "; Mínimo: " + this.getTemperaturaMinima()
                + " Máximo: " + this.getTemperaturaMaxima();
    }
}
