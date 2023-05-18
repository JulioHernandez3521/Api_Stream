package api.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

//        Stream<String> nombres = Stream.of("Julio","Juan","Julieta","Jose","Julian");
//        nombres.forEach(System.out::println);

//        String[] arr = {"Juan","Jose","Julio"};
//        Stream<String> nombres = Arrays.stream(arr);
//        nombres.forEach(System.out::println);


        Stream<String> nombres = Stream.<String>builder().add("Pato").add("Pepe").add("Pedro").build();
        nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        lista.stream().forEach(System.out::println);

    }
}
