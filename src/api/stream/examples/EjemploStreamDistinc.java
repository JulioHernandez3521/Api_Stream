package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinc {
    public static void main(String[] args) {

    Stream.of("Julio Hernandez","Julio Hernandez","Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                 .distinct()
                .forEach(System.out::println);

    }
}
