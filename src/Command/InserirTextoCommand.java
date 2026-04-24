package Command;

public class InserirTextoCommand implements Command {

    private Documento documento;
    private String texto;

    public InserirTextoCommand(Documento documento, String texto) {
        this.documento = documento;
        this.texto = texto;
    }

    @Override
    public void execute() {
        documento.inserirTexto(texto);
    }

    @Override
    public void undo() {
        documento.apagarUltimosCaracteres(texto.length());
    }
}