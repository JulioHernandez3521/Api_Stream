package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

         boolean existe = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                 .peek(System.out::println)
                .anyMatch(e -> e.getId() == 3);
        System.out.println("existe = " + existe);
    }
}
