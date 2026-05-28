package org.example;

public class StationCelsius extends HomeWeatherStation{
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
