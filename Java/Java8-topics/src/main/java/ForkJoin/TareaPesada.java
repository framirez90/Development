package ForkJoin;

import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class TareaPesada extends RecursiveTask<Integer> {

    private int inicio;
    private int fin;
    private int[] elementos;

    public TareaPesada(int inicio, int fin, int[] elementos) {
        this.inicio = inicio;
        this.fin = fin;
        this.elementos = elementos;
    }

    @Override
    protected Integer compute() {
        int resultado = 0;

        if ((fin - inicio) < 10) {
            resultado = suma();
            System.out.println("procesando: " + inicio + " fin: " + fin);
        } else {
            int mitad = (fin + inicio) / 2;
            TareaPesada t1 = new TareaPesada(inicio, mitad, elementos);
            TareaPesada t2 = new TareaPesada(mitad, fin, elementos);
            invokeAll(t1, t2);

            try {
                resultado += t1.get();
                resultado += t2.get();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return resultado;
    }

    private int res;

    private int suma() {
        IntStream.range(inicio, fin)
                .forEach(t -> res += elementos[t]);
        return res;
    }

}
