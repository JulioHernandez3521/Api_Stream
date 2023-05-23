package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman","Pato Guzman","Pato Guzman","Papa Gutierres","Pepe Garcia")
                // ** Aqui iria el distinc en  caso de no tener el equials
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[0] ))
                .distinct(); // ** Funciona solo en caso de quie se implemente el equals en la clase usuario

        nombres.forEach(System.out::println);

    }
}
