package org.example;

public class Dispositivo {
    private CalculatorCRC crcCalculator;
    private Ringer ringer;
    private Display display;
    private Connection connection;

    public Dispositivo(CalculatorCRC crcCalculator, Ringer ringer, Display display, Connection connection) {
        this.crcCalculator = crcCalculator;
        this.ringer = ringer;
        this.display = display;
        this.connection = connection;
    }

    public String send(String data)
    {
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }
    public void conectarCon(Connection conect)
    {
        this.connection = conect;
        this.display.showBanner(conect.pict());
        this.ringer.ring();//Emite sonido
    }

    public void configurarCRC(CalculatorCRC calculator)
    {
        this.crcCalculator = calculator;
    }
}
