package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

         Long vacios = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria","", "")
                .filter(String::isEmpty).peek(System.out::println).count();

        System.out.println("vacios = " + vacios);
    }
}
