package org.example;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CalculatorCRC{
    @Override
    public long crcFor(String data) {
        // TODO Auto-generated method stub
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
}
