package org.example;

public class I2CDriver {
    private int SCL;
    private int SDL;

    public I2CDriver(int sCL, int sDL) {
        this.SCL = sCL;
        this.SDL = sDL;
    }

    public boolean sendStarSend()
    {
        return true;
    }

    public boolean sendAddress(String address)
    {
        return true;
    }

    public boolean sendCommand(String command)
    {
        return true;
    }

    public boolean sendStopSeq()
    {
        return true;
    }
}
