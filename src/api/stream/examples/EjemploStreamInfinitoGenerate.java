package api.stream.examples;

import api.stream.examples.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        AtomicInteger contador = new AtomicInteger();
        Stream.generate(()->{
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        }).limit(5).forEach(System.out::println);
    }
}
