package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

         Usuario usuarios = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(e -> e.getId() == 3)
                .peek(System.out::println).findAny().get();
        System.out.println("usuarios = " + usuarios);

    }
}
