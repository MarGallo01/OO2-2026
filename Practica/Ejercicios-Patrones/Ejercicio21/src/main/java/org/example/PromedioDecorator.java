package org.example;

public class PromedioDecorator extends WeatherDecorator{
    public PromedioDecorator(WeatherData weather) {
        super(weather);
    }


    private double getPromedio() {
        return this.getTemperaturas().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String displayData() {
        return super.displayData()
                + "; Temperatura historica: " + String.format("%.2f", this.getPromedio());
    }
}
