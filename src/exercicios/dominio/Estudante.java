package exercicios.dominio;

public class Estudante implements Comparable<Estudante>{
    private final String nome;
    private final int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Estudante aluno) {
        return this.getNome().compareToIgnoreCase(aluno.getNome());
    }
}
