package InterzasFuncional;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.UnaryOperator;

public class InterfazFuncionalPrincipal {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (l) -> l>18;
        System.out.println("Predicate:\t" + predicate.test(20));
        
        Function<String, Boolean> function = (r) -> r.length()>10;
        System.out.println("Function:\t" + function.apply("function"));
        
        UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();
        System.out.println("UnaryOperator:\t" + unaryOperator.apply("eJemPlo unArY"));
        
        Supplier<String> supplier = () -> "supplier";
        System.out.println("Supplier:\t" + supplier.get());
        
        BiFunction<String, String, Boolean> biFunction = (t,u) -> t.equals(u);
        System.out.println("BiFunction:\t" + biFunction.apply("biFunction", "Bifunction"));
        
        ToDoubleBiFunction<Double,Double> toDoubleBiFunction = (t,u) -> t+u;
        System.out.println("ToDoubleBiFunction: "+ toDoubleBiFunction.applyAsDouble(2.0, 3.6));
    }
}
