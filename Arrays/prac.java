package Arrays;

import java.util.*;
import java.math.*;

public class prac {
    public static void main(String[] args) {
        List<Map<String, Object>> lis = new ArrayList<>();

        Map<String, Object> hm1 = new HashMap<>();
        hm1.put("username", "Jayesh");
        hm1.put("userId", "100");
        hm1.put("location", "India");

        Map<String, Object> hm2 = new HashMap<>();
        hm2.put("username", "Lara");
        hm2.put("userId", "101");
        hm2.put("location", "USA");

        Map<String, Object> hm3 = new HashMap<>();
        hm3.put("username", "Martin");
        hm3.put("userId", "102");
        hm3.put("location", "Australia");
        lis.add(hm1);
        lis.add(hm2);
        lis.add(hm3);
        Math mathObj = new Math();
        Collections.sort(lis, new Comparator<Map<String, Object>>() {
            public int compare(Map<String, Object> a, Map<String, Object> b){
                String name1 = (String) a.get("username");
                String name2 = (String) b.get("username");
                return name2.compareTo(name1);
            }
        });
        for(Map<String, Object> map : lis){
            System.out.println(map);
        }
    }
}
