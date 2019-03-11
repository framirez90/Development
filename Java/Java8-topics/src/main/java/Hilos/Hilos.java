package Hilos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Hilos {
    public static void main(String[] args) {
        //Java6
        Runnable runnable = ()-> System.out.println("hola "+Thread.currentThread());
        new Thread(runnable).start();
        System.out.println("hola main "+Thread.currentThread());
        
        //Java 7 - ExecutorService
        //newCachedThreadPool
        Runnable runnable1 = ()-> System.out.println("hola "+Thread.currentThread());
        ExecutorService pool1 = Executors.newCachedThreadPool();
        IntStream.range(0, 1000).forEach(p -> pool1.submit(runnable1));
        pool1.shutdown();
        
        //newFixedThreadPool
        Runnable runnable2 = ()-> System.out.println("hola "+Thread.currentThread());
        ExecutorService pool2 = Executors.newFixedThreadPool(2);
        IntStream.range(0, 3).forEach(p -> pool2.submit(runnable2));
        pool2.shutdown();
        
        //Callable
        Runnable runnable3 = ()-> System.out.println("hola "+Thread.currentThread());
        Callable<String> tareaR = () -> "hola "+Thread.currentThread();
        ExecutorService pool3 = Executors.newSingleThreadExecutor();
        Future<String> future = pool3.submit(tareaR);
        pool3.submit(runnable3);
        pool3.shutdown();
        
        LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        System.out.println(LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE));
        
        try {
            System.out.println(future.get()); 
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }
   }
}
