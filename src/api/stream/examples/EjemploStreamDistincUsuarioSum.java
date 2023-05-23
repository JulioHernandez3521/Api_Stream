package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuarioSum {
    public static void main(String[] args) {

        IntStream nombres = Stream.of("Pato Guzman","Pato Guzman","Pato Guzman","Papa Gutierres","Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1] ))
                .distinct() // ** Funciona solo en caso de quie se implemente el equals en la clase usuario
//                .peek(System.out::println)
                .mapToInt( u -> u.getApellido().length());


//        nombres.forEach(System.out::println);
        IntSummaryStatistics stats = nombres.summaryStatistics();
//        System.out.println(nombres.sum());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getMin() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getAverage());

    }
}
