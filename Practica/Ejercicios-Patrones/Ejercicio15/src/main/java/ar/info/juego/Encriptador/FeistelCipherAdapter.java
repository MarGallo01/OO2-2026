package ar.info.juego.Encriptador;

public class FeistelCipherAdapter implements TipoCifrado{
    private FeistelCipher feistel;

    public FeistelCipherAdapter(FeistelCipher feistel) {
        this.feistel = feistel;
    }

    public String cifrar(String mensaje)
    {
        return this.feistel.encode(mensaje);
    }

    public String descifrar(String mensaje)
    {
        return this.feistel.encode(mensaje);
    }
}
