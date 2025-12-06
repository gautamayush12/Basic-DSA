package Streams;

import java.util.Arrays;
import java.util.List;

public class combinedExp{
    public static void main(String[] args) {
        List<String> lis = Arrays.asList("ABC", "PQR", "XYZ", "BNM","AYU");
        //Intermediate Operations
        long res = lis.stream().filter(x->x.startsWith("A")).count();
        System.out.println(res);
    }
}