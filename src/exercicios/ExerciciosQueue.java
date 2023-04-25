package exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Juliano");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        for (String pessoa: fila
             ) {
            System.out.println(pessoa);
        }

        System.out.println("Primeiro: " + fila.poll());
        fila.peek();
        System.out.println("Primeiro, removendo o mesmo: " + fila);
        fila.add("Daniel");
        System.out.println(fila);
        System.out.println("Tamanho da lista: " + fila.size());
        System.out.println("Está vazia? " + fila.isEmpty());
        System.out.println("O Carlos está na lista? " + fila.contains("Carlos"));
    }
}
