package exercicios;

import exercicios.dominio.Estudante;

import java.util.Optional;

public class ExerciciosOptional {
    public static void main(String[] args) {
        //Estudante estudante = new Estudante("Marcos", 35);
        Estudante estudante = null;


        Optional<Estudante> optional = Optional.ofNullable(estudante);

        if(optional.isPresent()) {
            System.out.println(optional.get().getNome());
        } else {
            System.out.println("vazio");
        }

//        if(optional.isPresent()) {
//            System.out.println(optional.get().getNome());
//        } else {
//            throw new IllegalStateException();
//        }


    }
}
