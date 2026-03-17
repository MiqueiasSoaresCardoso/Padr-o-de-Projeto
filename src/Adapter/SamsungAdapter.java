package Adapter;

public class SamsungAdapter implements ControleUniversal {

    private final TvSamsungApi tv;

    public SamsungAdapter(TvSamsungApi tv) {
        this.tv = tv;
    }

    @Override
    public void ligar() { tv.powerOn(); }

    @Override
    public void desligar() { tv.powerOff(); }

    @Override
    public void aumentarVolume() { tv.volUp(); }

    @Override
    public void diminuirVolume() { tv.volDown(); }
}