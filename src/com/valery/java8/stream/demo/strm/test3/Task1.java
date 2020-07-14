package com.valery.java8.stream.demo.strm.test3;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("first",10);
        map.put("secondsecond",46);
        map.put("third",4);
        map.put("fourth",99);

        Integer reduce = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(0, Integer::sum);
        System.out.println(reduce);

    }

    private static void test1(HashMap<String, Integer> map) {
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
