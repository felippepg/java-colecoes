package exercicios;

import exercicios.dominio.Estudante;

import java.util.*;

public class ExercicioComparacao {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Felippe", 22);
        Estudante estudante2 = new Estudante("Vinicius", 25);
        Estudante estudante3 = new Estudante("Guilherme", 23);
        Estudante estudante4 = new Estudante("Rafael", 29);
        Estudante estudante5 = new Estudante("Alexandre", 34);

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(estudante);
        estudantes.add(estudante2);
        estudantes.add(estudante3);
        estudantes.add(estudante4);
        estudantes.add(estudante5);

        for (Estudante aluno: estudantes
             ) {
            System.out.println(aluno.getNome() + " IDADE: " + aluno.getIdade());
        }
        System.out.println("ORDENANDO.... POR IDADE");

        estudantes.sort((aluno, aluno1) -> aluno.getIdade() - aluno1.getIdade());
        for (Estudante aluno: estudantes
             ) {
            System.out.println(aluno.getNome() + " IDADE: " + aluno.getIdade());
        }

        System.out.println("ORDENANDO NOVAMENTE... POR NOME");
        Collections.sort(estudantes);

        for (Estudante aluno: estudantes
        ) {
            System.out.println(aluno.getNome() + " IDADE: " + aluno.getIdade());
        }


    }
}
