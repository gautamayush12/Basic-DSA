package JavaConceptsPrac;

import java.util.*;
import java.io.*;

public class CoreJavaDeepDive {

    /* =====================================
       1. ORDER OF EXECUTION (VERY IMPORTANT)
    ====================================== */

    static {
        System.out.println("1️⃣ Static block executed.");
    }

    {
        System.out.println("2️⃣ Instance block executed.");
    }

    public CoreJavaDeepDive() {
        System.out.println("3️⃣ Constructor executed.");
    }

    /* =====================================
       2. PASS BY VALUE (CRITICAL QUESTION)
    ====================================== */

    static void changePrimitive(int x) {
        x = 100;
    }

    static void changeObject(Person p) {
        p.name = "Changed Name";
    }

    static void reassignObject(Person p) {
        p = new Person("New Object");
    }

    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }

    /* =====================================
       3. STRING IMMUTABILITY DEMO
    ====================================== */

    static void stringExample() {
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1.concat(" World");

        System.out.println(s1); // Hello World
        System.out.println(s2); // Hello
    }

    /* =====================================
       4. IMMUTABLE CLASS CREATION
    ====================================== */

    final static class ImmutableEmployee {
        private final String name;
        private final List<String> skills;

        public ImmutableEmployee(String name, List<String> skills) {
            this.name = name;
            this.skills = new ArrayList<>(skills); // defensive copy
        }

        public String getName() {
            return name;
        }

        public List<String> getSkills() {
            return new ArrayList<>(skills); // defensive copy
        }
    }

    /* =====================================
       5. HASHMAP INTERNAL BEHAVIOR DEMO
    ====================================== */

    static class BadHash {
        int value;
        BadHash(int value) { this.value = value; }

        @Override
        public int hashCode() {
            return 1; // forcing collision
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof BadHash)) return false;
            return this.value == ((BadHash)o).value;
        }
    }

    static void hashmapCollisionDemo() {
        HashMap<BadHash, String> map = new HashMap<>();
        map.put(new BadHash(1), "One");
        map.put(new BadHash(2), "Two");
        map.put(new BadHash(3), "Three");

        System.out.println("Map size: " + map.size());
    }

    /* =====================================
       6. COMPARABLE VS COMPARATOR
    ====================================== */

    static class Student implements Comparable<Student> {
        int marks;
        Student(int marks) { this.marks = marks; }

        @Override
        public int compareTo(Student s) {
            return this.marks - s.marks;
        }
    }

    static void sortingExample() {
        List<Student> list = Arrays.asList(
                new Student(50),
                new Student(80),
                new Student(30)
        );

        Collections.sort(list);
        list.forEach(s -> System.out.println(s.marks));
    }

    /* =====================================
       7. TRY WITH RESOURCES
    ====================================== */

    static void tryWithResourcesExample() {
        try (BufferedReader br = new BufferedReader(new StringReader("Hello"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* =====================================
       8. STATIC VS INSTANCE MEMORY DEMO
    ====================================== */

    static int staticCount = 0;
    int instanceCount = 0;

    void increment() {
        staticCount++;
        instanceCount++;
    }

    /* =====================================
       9. METHOD OVERLOADING EDGE CASE
    ====================================== */

    static void print(int a) {
        System.out.println("int method");
    }

    static void print(long a) {
        System.out.println("long method");
    }

    /* =====================================
       10. MAIN METHOD
    ====================================== */

    public static void main(String[] args) {

        System.out.println("---- Order of Execution ----");
        new CoreJavaDeepDive();

        System.out.println("\n---- Pass By Value ----");
        int x = 10;
        changePrimitive(x);
        System.out.println(x); // still 10

        Person p = new Person("Original");
        changeObject(p);
        System.out.println(p.name); // Changed Name

        reassignObject(p);
        System.out.println(p.name); // still Changed Name

        System.out.println("\n---- String Example ----");
        stringExample();

        System.out.println("\n---- HashMap Collision ----");
        hashmapCollisionDemo();

        System.out.println("\n---- Sorting ----");
        sortingExample();

        System.out.println("\n---- Try With Resources ----");
        tryWithResourcesExample();

        System.out.println("\n---- Overloading Edge Case ----");
        print(10); // which method?
    }
}