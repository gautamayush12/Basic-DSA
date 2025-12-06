package JavaConceptsPrac;

import java.util.ArrayList;
import java.util.function.*;

public class functionalInterfaces{
    public static void main(String[] args) {
        //Predicate, Consumer, Supplier, Function
        Predicate<Integer> checkCondition = x -> x%2==0;
        Function<Integer, Integer> myFxn = x-> x*x;
        Consumer<Integer> cons = x->System.out.println(x);
        Supplier<Integer> printFxn = () -> 100;
        if(checkCondition.test(printFxn.get())){
            cons.accept(myFxn.apply(printFxn.get()));
        }

        //Bi-Predicate, Bi-Consumer, Bi-Supplier, Bi-Function
        BiPredicate<Integer, String> biPred = (x, str) -> {
            return str.length() == x;
        };
        BiFunction<Integer, Integer, Integer> biFxn = (x, y) -> x+y;
        BiConsumer<String, Integer> biCons = (str, x) -> {
            System.out.println(str + " " + x);
        };
        if(biPred.test(4, "Test")){
            biCons.accept("Sum is:", biFxn.apply(10, 20));  
        }

        //Unary Operator, Binary Operator
        UnaryOperator<Integer> unaryOp = x -> x*x;
        BinaryOperator<Integer> binaryOp = (x, y) -> x+y;
        cons.accept(unaryOp.apply(binaryOp.apply(10, 20)));//900
        
        //Method References
        ArrayList<String> lis = new ArrayList<>();
        lis.add("Ram");
        lis.add("Shyam");
        lis.add("Arvind");
        lis.forEach(x -> System.out.println(x));
        lis.forEach(System.out::println); //Method Reference -> ::
    }
}