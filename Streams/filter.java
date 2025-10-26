package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter{
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(1);
        ls.add(2);
        ls.add(4);
        //Filter
        List<Integer> filteredList = ls.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
        //Map
        List<Integer> mappedList = filteredList.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(mappedList);
        //Distinct
        List<Integer> distinctList = filteredList.stream().distinct().map(x -> x*2).collect(Collectors.toList());
        System.out.println(distinctList);
    }
}