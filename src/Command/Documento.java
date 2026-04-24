package Command;

public class Documento {

    private StringBuilder conteudo = new StringBuilder();

    public void inserirTexto(String texto) {
        conteudo.append(texto);
        System.out.println("Texto inserido: " + texto);
    }

    public void apagarUltimosCaracteres(int quantidade) {
        int inicio = Math.max(conteudo.length() - quantidade, 0);
        String removido = conteudo.substring(inicio);
        conteudo.delete(inicio, conteudo.length());
        System.out.println("Texto removido: " + removido);
    }

    public String getConteudo() {
        return conteudo.toString();
    }
}
