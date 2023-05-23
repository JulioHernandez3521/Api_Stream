package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {


        Stream<Usuario> usuarios = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(e -> {
                    if(e.getNombre().equalsIgnoreCase("Julio")){
                        return Stream.of(e);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);
        List<Usuario> usuarios1 = usuarios.collect(Collectors.toList());
        usuarios1.forEach(System.out::println);

    }
}
