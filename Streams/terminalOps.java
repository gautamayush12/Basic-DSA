package Streams;

import java.util.*;

public class terminalOps{
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,2,3,4);
        boolean anyMatch = lis.stream().anyMatch(x -> x%2==0);
        System.out.println(anyMatch);

        boolean noneMatch = lis.stream().noneMatch(x -> x<0);
        System.out.println(noneMatch);

        //Filterning Names
        List<String> mylis = Arrays.asList("Ayush", "Ankit", "Ram", "ABC", "Hello");
        System.out.println(mylis.stream().filter(x -> x.length()>3).toList());

        //Squaring and sorting nos
        List<Integer> nos = Arrays.asList(1,2,3,4,5);
        System.out.println(nos.stream().map(x->x*x).sorted().toList());

        //Counting occurrences of a character
        String sentence = "Hello World";
        long count = sentence.chars().filter(x->x=='l').count();
        System.out.println(count);
    }
}