package exercicios;

import exercicios.dominio.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosJavaStream {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Joao", 15);
        Estudante estudante2 = new Estudante("Rafael", 29);
        Estudante estudante3 = new Estudante("Vinicius", 25);
        Estudante estudante4 = new Estudante("Manuel", 22);
        Estudante estudante5 = new Estudante("Pedro", 17);
        Estudante estudante6 = new Estudante("Bruna", 30);

        List<Estudante> lista = new ArrayList<>();
        lista.add(estudante);
        lista.add(estudante2);
        lista.add(estudante3);
        lista.add(estudante4);
        lista.add(estudante5);
        lista.add(estudante6);

        //Mostrar cada atributo dos estudantes
        lista.stream().forEach((aluno) -> System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade()));

        //Total de itens na lista
        System.out.println("Total de itens na lista: " + lista.stream().count());

        //Filtrar estudantes maiores de 18 anos e exibir
        lista.stream().filter((aluno) -> aluno.getIdade() > 18)
                .collect(Collectors.toList())
                .forEach(item -> System.out.println(item.getNome() + " Idade: " + item.getIdade()));

        //Estudantes com a letra B no nome
        lista.stream().filter((aluno) -> aluno.getNome().contains("B")).peek(System.out::println);

        //Estudantes com a letra D no nome
        boolean existe = lista.stream().anyMatch((aluno) -> aluno.getNome().contains("D"));
        System.out.println("Existe algum estudante com a letra D no nome? " + existe);

        //Estudante mais novo
        Estudante estudanteMaisNovo = lista.stream().min((aluno1, aluno2) -> aluno1.getIdade() - aluno2.getIdade()).get();
        System.out.println("O estudante mais novo tem: " + estudanteMaisNovo.getIdade() + " e se chama " + estudanteMaisNovo.getNome());

        //Estudante mais velho
        Estudante estudanteMaisVelho = lista.stream().max(Comparator.comparingInt(Estudante::getIdade)).get();
        System.out.println("O estudante mais velho tem: " + estudanteMaisVelho.getIdade() + " e se chama "+ estudanteMaisVelho.getNome());

    }
}
