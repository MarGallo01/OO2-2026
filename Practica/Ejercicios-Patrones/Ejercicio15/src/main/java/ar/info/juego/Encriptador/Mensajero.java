package ar.info.juego.Encriptador;

public class Mensajero {
    private TipoCifrado estrategia;

    public Mensajero(TipoCifrado estrategia)
    {
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(TipoCifrado estrategia)
    {
        this.estrategia = estrategia;
    }

    public String enviar(String mensaje)
    {
        return this.estrategia.cifrar(mensaje);
    }

    public String recibir(String mensaje)
    {
        return this.estrategia.descifrar(mensaje);
    }
}
