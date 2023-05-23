package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingleOptional {
    public static void main(String[] args) {

         Stream<Usuario> usuarios = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(e -> e.getId() == 3)
                .peek(System.out::println);
        Optional<Usuario> usuario = usuarios.findFirst();

        System.out.println("usuario.orElseGet( ()-> new Usuario(\"John\",\"N\")).getNombre() = " +
                            usuario.orElseGet( ()-> new Usuario("John","N")).getNombre());

    }
}
