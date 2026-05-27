package ar.info.juego.Encriptador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MensajeroTest {
    private Mensajero mensajero;
    private String mensaje = "Hola mundo";

    @Test
    public void testEnviarConFeistel() {
        FeistelCipher feistel = new FeistelCipher("claveSecreta");
        mensajero = new Mensajero(new FeistelCipherAdapter(feistel));

        String cifrado = mensajero.enviar(mensaje);

        assertNotNull(cifrado);
        assertNotEquals(mensaje, cifrado); // mensajes distintos
    }

    @Test
    public void testRecibirConFestel()
    {
        FeistelCipher feistel = new FeistelCipher("claveSecreta");
        mensajero = new Mensajero(new FeistelCipherAdapter(feistel));

        String cifrado = mensajero.enviar(mensaje);
        assertEquals(mensaje, mensajero.recibir(cifrado));
    }

    @Test
    public void testEnviarConRC4() {
        RC4Adapter rc4Adapter = new RC4Adapter(new RC4(), "claveSecreta");
        mensajero = new Mensajero(rc4Adapter);

        String cifrado = mensajero.enviar(mensaje);

        assertNotNull(cifrado);
        assertNotEquals(mensaje, cifrado); // mensajes distintos
    }

    @Test
    public void testRecibirConRC4() {
        RC4Adapter rc4Adapter = new RC4Adapter(new RC4(), "claveSecreta");
        mensajero = new Mensajero(rc4Adapter);

        String cifrado = mensajero.enviar(mensaje);
        String descifrado = mensajero.recibir(cifrado);

        assertEquals(mensaje, descifrado);
    }
}
