package Command;

public class Documento {

    private StringBuilder conteudo = new StringBuilder();

    public void inserirTexto(String texto) {
        conteudo.append(texto);
        System.out.println("Texto inserido: " + texto);
    }

    public void apagarUltimosCaracteres(int quantidade) {
        int inicio = Math.max(conteudo.length() - quantidade, 0); //O Inicio nunca será menor que zero
        String removido = conteudo.substring(inicio);
        conteudo.delete(inicio, conteudo.length()); //Aqui você de onde até aonde você deseja apagar
        System.out.println("Texto removido: " + removido);
    }

    public String getConteudo() {
        return conteudo.toString();
    }
}
