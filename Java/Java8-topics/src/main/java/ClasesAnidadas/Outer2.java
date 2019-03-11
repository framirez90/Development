package ClasesAnidadas;

public class Outer2 {

    private static int dato;

    public static class Inner {

        private int dato;

        public Inner(int dato) {
            this.dato = dato;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

    }
}
