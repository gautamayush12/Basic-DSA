package JavaConceptsPrac;

import java.util.*;
import java.util.function.Function;

/*
 This file covers:
 - static keyword
 - constructors
 - this / super
 - final keyword
 - abstraction
 - interfaces
 - diamond problem
 - exception handling
 - equals & hashCode
 - String immutability
 - functional interface
 - lambda
 - Optional
 - collections basics
*/

public class CoreJavaMaster {

    /* ===============================
       1. STATIC KEYWORD
    =============================== */

    static int staticCounter = 0; // shared across objects
    int instanceCounter = 0;      // per object

    static {
        System.out.println("Static block executed once when class loads.");
    }

    public CoreJavaMaster() {
        staticCounter++;
        instanceCounter++;
    }

    static void staticMethod() {
        System.out.println("Inside static method.");
        // Cannot access instance variables directly
    }

    /* ===============================
       2. FINAL KEYWORD
    =============================== */

    final int finalVariable = 10;

    final void finalMethod() {
        System.out.println("Final method cannot be overridden.");
    }

    /* ===============================
       3. CONSTRUCTOR + THIS
    =============================== */

    int number;

    public CoreJavaMaster(int number) {
        this.number = number; // this differentiates instance variable
    }

    /* ===============================
       4. EQUALS & HASHCODE
    =============================== */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CoreJavaMaster)) return false;

        CoreJavaMaster other = (CoreJavaMaster) obj;
        return this.number == other.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    /* ===============================
       5. EXCEPTION HANDLING
    =============================== */

    public static void exceptionExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally always runs.");
        }
    }

    /* ===============================
       6. INTERFACE + DIAMOND PROBLEM
    =============================== */

    interface A {
        default void show() {
            System.out.println("Interface A");
        }
    }

    interface B {
        default void show() {
            System.out.println("Interface B");
        }
    }

    static class DiamondExample implements A, B {
        @Override
        public void show() {
            A.super.show(); // resolving diamond problem
        }
    }

    /* ===============================
       7. FUNCTIONAL INTERFACE
    =============================== */

    @FunctionalInterface
    interface MyFunctional {
        int operate(int a, int b);
    }

    public static void lambdaExample() {
        MyFunctional add = (a, b) -> a + b;
        System.out.println("Lambda result: " + add.operate(5, 3));
    }

    /* ===============================
       8. OPTIONAL
    =============================== */

    public static void optionalExample() {
        Optional<String> value = Optional.ofNullable(null);
        System.out.println(value.orElse("Default Value"));
    }

    /* ===============================
       9. COLLECTIONS BASICS
    =============================== */

    public static void collectionsExample() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");

        for (String s : list) {
            System.out.println(s);
        }
    }

    /* ===============================
       MAIN METHOD
    =============================== */

    public static void main(String[] args) {

        CoreJavaMaster obj1 = new CoreJavaMaster(10);
        CoreJavaMaster obj2 = new CoreJavaMaster(10);

        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Equals check: " + obj1.equals(obj2));

        exceptionExample();
        lambdaExample();
        optionalExample();
        collectionsExample();

        DiamondExample d = new DiamondExample();
        d.show();
    }
}