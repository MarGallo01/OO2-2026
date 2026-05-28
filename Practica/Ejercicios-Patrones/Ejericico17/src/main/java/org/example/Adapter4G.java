package org.example;

public class Adapter4G implements Connection{
    private Connection4G conect4G;

    public Adapter4G(Connection4G conect4g) {
        conect4G = conect4g;
    }

    @Override
    public String sendData(String data, long crc) {
        return this.conect4G.transmit(data, crc);
    }

    @Override
    public String pict() {
        return this.conect4G.getSymb();
    }
}
