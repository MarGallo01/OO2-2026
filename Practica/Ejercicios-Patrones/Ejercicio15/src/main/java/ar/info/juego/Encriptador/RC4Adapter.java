package ar.info.juego.Encriptador;

public class RC4Adapter implements TipoCifrado{
    private RC4 rc4;
    private String clave;

    public RC4Adapter(RC4 rc4, String clave)
    {
        this.rc4 = rc4;
        this.clave = clave;
    }

    public String cifrar(String mensaje)
    {
        return this.rc4.encriptar(mensaje, clave);
    }

    @Override
    public String descifrar(String mensaje) {
        return this.rc4.desencriptar(mensaje, clave);
    }
}
