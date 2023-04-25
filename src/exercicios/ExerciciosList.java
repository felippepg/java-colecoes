package exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExerciciosList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome:nomes
             ) {
            System.out.println(nome);
        }

        nomes.set(nomes.indexOf("Carlos"), "Roberto");
        System.out.println(nomes);
        System.out.println(nomes.get(1));
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("João");
        System.out.println("Removendo o nome de João: " + nomes);
        System.out.println("Quantidade de itens na lista: " + nomes.size());
        System.out.println("Nome Juliano existe? " + nomes.contains("Juliano"));
        nomes.add("Ismael");
        nomes.add("Rodrigo");
        System.out.println("Adicionando os nomes Ismael e Rodrigo: " + nomes);
        Collections.sort(nomes);
        System.out.println("Ordenação por ordem alfabética: " + nomes);
        System.out.println("A lista está vazia? " + nomes.isEmpty());
    }


}
