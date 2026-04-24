package State;

public interface EstadoPersonagem {

    void atacar(Personagem p);
    void pular(Personagem p);
    void receberDano(Personagem p);
    void atualizar(Personagem p);
}