package api.stream.examples;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

    Integer numeros = Stream.of(5,4,3,4,23,44,5)
                .reduce(0, Integer::sum);
//                .reduce(0, (a,b) -> a + b);

        System.out.println("resultado = " + numeros);
    }
}
