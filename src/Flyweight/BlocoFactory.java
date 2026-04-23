package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BlocoFactory {

    //Cria um MAP que armazena os tipos de Bloco existentes e uma chave para identificar cada um deles
    private static final Map<String, TipoBloco> blocos = new HashMap<>();

    public static TipoBloco getBloco(String nome, String textura, boolean solido) {
        //Montando o nome do Bloco com base nas características
        String chave = nome + "-" + textura + "-" + solido;
        System.out.println(chave);
        /*Verifica se já existe algum bloco com essa chave, se não existir editamos a lista e inserimos
        um novo tipo de Bloco utilizando a chave criada anteriormente */
        if (!blocos.containsKey(chave)) {
            blocos.put(chave, new TipoBloco(nome, textura, solido));
        }
        //Retorna o bloco com base na chave passada
        return blocos.get(chave);
    }
}