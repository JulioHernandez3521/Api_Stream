package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamCount {
    public static void main(String[] args) {

         Long numero = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                   .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                 .peek(System.out::println)
                .count();
        System.out.println("numero = " + numero);    }
}
