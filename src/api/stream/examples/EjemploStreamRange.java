package api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

    Integer numeros = IntStream.range(5, 445)
                .reduce(0, Integer::sum);
        Integer numeros2 = IntStream.range(5, 445).sum();
        IntSummaryStatistics numeros3 = IntStream.range(5, 445).summaryStatistics();
//                .reduce(0, (a,b) -> a + b);

        System.out.println("resultado = " + numeros);
        System.out.println("numeros2  = " + numeros2 );

        System.out.println("numeros3.getMax() = " + numeros3.getMax());
        System.out.println("numeros3.getMax() = " + numeros3.getMin());
        System.out.println("numeros3.getMax() = " + numeros3.getSum());
        System.out.println("numeros3.getMax() = " + numeros3.getAverage());
        System.out.println("numeros3.getMax() = " + numeros3.getCount());

    }
}
