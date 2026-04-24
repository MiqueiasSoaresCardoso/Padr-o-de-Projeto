package Command;

public class ApagarTextoCommand implements Command {

    private Documento documento;
    private int quantidade;
    private String textoRemovido = "";

    public ApagarTextoCommand(Documento documento, int quantidade) {
        this.documento = documento;
        this.quantidade = quantidade;
    }

    @Override
    public void execute() {
        String conteudoAtual = documento.getConteudo();
        int inicio = Math.max(conteudoAtual.length() - quantidade, 0);
        textoRemovido = conteudoAtual.substring(inicio);
        documento.apagarUltimosCaracteres(quantidade);
    }

    @Override
    public void undo() {
        documento.inserirTexto(textoRemovido);
    }
}