package api.stream.examples;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

    String resultado = Stream.of("Julio Hernandez","Julio Hernandez","Julio Hernandez","Juan Jimenez","Julieta Lopez","Jose Lopez","Julian Alegria")
                 .distinct()
                .reduce("cconcatenacion con reduce ", (a,b) -> a + ", " + b);

        System.out.println("resultado = " + resultado);
    }
}
