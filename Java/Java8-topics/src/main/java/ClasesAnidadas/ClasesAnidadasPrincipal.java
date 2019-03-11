package ClasesAnidadas;

public class ClasesAnidadasPrincipal {

    public static void main(String[] args) {
        //Clase anidada miembro
        Outer1 outer1 = new Outer1();
        Outer1.Inner inner1 = outer1.new Inner();
        Outer1.Inner inner = new Outer1().new Inner();

        //Clase anida estatica
        Outer2.Inner inner2 = new Outer2.Inner(0);

        //Clase anidada anonima
        Persona persona = new Persona() {
            @Override
            public void mostrarInfo() {
                System.out.println("ahora soy de Anonima");
            }
        };
        persona.mostrarInfo();

        //Enum
        Trabajador trabajador = new Trabajador(
                "Fernando",
                Semana.DOMINGO,
                "6"
        );

        System.out.println(trabajador.getDiaDescanso());
    }
}
