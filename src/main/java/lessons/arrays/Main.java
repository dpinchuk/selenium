package lessons.arrays;

import lessons.oop.Cars;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int []arr = new int[12];

        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        System.out.println(arr);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12); //0
        integerList.add(12); //1
        integerList.add(-10); //2

        integerList.remove(0);
        integerList.get(0);

        integerList.forEach(System.out::println);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }


        Set<String> stringSet = new HashSet<>();
        stringSet.add("1212212");
        stringSet.add("wqdwqdqd");
        stringSet.remove("1212212");

        stringSet.forEach(e -> System.out.println(e));

        Map<String, Double> stringDoubleMap = new HashMap<>();
        stringDoubleMap.put("Length", 123.3);
        stringDoubleMap.put("Width", 23.3);

        stringDoubleMap.forEach((k, v) -> {
            if (k.length() > 5) {
                v += k.length();
            }
            System.out.println(k + ": " + v);
        });
    }
}