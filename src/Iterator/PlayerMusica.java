package Iterator;

import java.awt.Desktop;
import java.net.URI;

public class PlayerMusica {

    public void tocar(Musica musica) {
        try {
            System.out.println("Tocando: " + musica);

            Desktop.getDesktop().browse(new URI(musica.getLink()));

        } catch (Exception e) {
            System.out.println("Erro ao abrir a música: " + e.getMessage());
        }
    }
}