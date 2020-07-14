package com.valery.java8.stream.demo.strm.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("11111111", "22222222", "22222222", "33333333", "6", "7", "44444444", "55555555");
        List<String> collect = strings.stream()
                .filter(it -> it.length() >= 8)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void test1() {
        List<String> strings = Arrays.asList("11111111", "22222222", "22222222", "33333333", "6", "7", "44444444", "55555555");
        strings.stream()
                .filter(it -> it.length() >= 8)
                .distinct()
                .forEach(System.out::println);
    }
}
