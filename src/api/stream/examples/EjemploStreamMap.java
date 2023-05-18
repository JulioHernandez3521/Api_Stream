package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Julio","Juan","Julieta","Jose","Julian").peek(System.out::println).map(String::toUpperCase);
//        Stream<String> nombres = Stream.of("Julio","Juan","Julieta","Jose","Julian").map(nombre -> {
//            return nombre.toUpperCase();
//        });
//        nombres.forEach(System.out::println);
        //STREAM A LIST
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

        Stream<Usuario> usuarios = Stream.of("Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String lo = usuario.getNombre().toUpperCase();
                    usuario.setNombre(lo);
                    return usuario;
                });
        List<Usuario> usuarios1 = usuarios.collect(Collectors.toList());
        usuarios1.forEach(System.out::println);

    }
}
