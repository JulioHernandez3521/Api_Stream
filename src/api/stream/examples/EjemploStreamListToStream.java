package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

            List<Usuario> lista = new ArrayList<>();
            lista.add(new Usuario("Juan","Romero"));
            lista.add(new Usuario("Julio","Lopez"));
            lista.add(new Usuario("Pedro","Sabas"));
            lista.add(new Usuario("David","Landeros"));
            lista.add(new Usuario("Saul","Ramirez"));
            lista.add(new Usuario("Sergio","Perez"));
            lista.add(new Usuario("Jose","Sanchez"));

            Stream<String> nombres = lista.stream()
                    .map(usuario -> usuario.getNombre().toUpperCase()
                            .concat(" ")
                            .concat(usuario.getApellido().toUpperCase()))
                    .flatMap(n-> {
                        if(n.contains("JU")){
                            return Stream.of(n);
                        }
                        return  Stream.empty();
                    })
                    .peek(System.out::println);

        System.out.println(nombres.count());
    }
}
