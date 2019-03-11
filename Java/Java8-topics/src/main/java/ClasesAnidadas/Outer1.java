package ClasesAnidadas;

public class Outer1 {

    private int dato;

    public class Inner {

        private int dato;

        public Inner() {
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

    }
}
