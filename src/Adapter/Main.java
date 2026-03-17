package Adapter;

public class Main {
    public static void main(String[] args) {

        // Controlando uma Samsung
        ControleUniversal samsung = new SamsungAdapter(new TvSamsungApi());
        MiRemoteApp app1 = new MiRemoteApp(samsung);
        app1.assistir();
        app1.encerrar();

        System.out.println();

        // Controlando uma LG
        ControleUniversal lg = new LgAdapter(new TvLgApi());
        MiRemoteApp app2 = new MiRemoteApp(lg);
        app2.assistir();
        app2.encerrar();
    }
}
