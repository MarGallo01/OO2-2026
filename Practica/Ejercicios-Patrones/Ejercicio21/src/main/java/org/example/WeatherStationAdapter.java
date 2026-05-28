package org.example;

import java.util.List;

public class WeatherStationAdapter implements WeatherData{
    private WeatherData station;

    public WeatherStationAdapter(WeatherData station) {
        this.station = station;
    }

    @Override
    public double getTemperatura() {
        return station.getTemperatura();
    }

    @Override
    public double getPresion() {
        return station.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return station.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return station.getTemperaturas();
    }

    @Override
    public String displayData() {
        return "Presión atmosf: " + station.getPresion()
                + "; Radiación solar: " + station.getRadiacionSolar();
        // sin temperatura, la agrega el decorator
    }
}
