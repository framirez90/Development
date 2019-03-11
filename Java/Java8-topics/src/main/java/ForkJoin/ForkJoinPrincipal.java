package ForkJoin;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ForkJoinPrincipal {

    public static void main(String[] args) {
        int[] enteros = new int[10000000];

        IntStream.range(0, 1000000).forEach(t -> enteros[t] = t);
        Arrays.stream(enteros).forEach(t -> System.out.println(t + ", "));

        TareaPesada tareaPesada = new TareaPesada(0, enteros.length, enteros);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(tareaPesada);
        forkJoinPool.shutdown();

        do {
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        } while (!tareaPesada.isDone());

        try {
            System.out.println(tareaPesada.get());
        } catch (InterruptedException | ExecutionException e) {
        }
    }
}
