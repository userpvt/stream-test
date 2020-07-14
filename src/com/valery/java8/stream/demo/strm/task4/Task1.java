package com.valery.java8.stream.demo.strm.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 4, 2, 1);
        String collect = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
