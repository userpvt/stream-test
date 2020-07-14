package com.valery.java8.stream.demo.strm.test1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9, 22, 33, 35);
        OptionalDouble average = list.stream()
                .filter(Task1::isOdd)
                .sorted()
                .filter(Task1::isDividedOnFive)
                .mapToInt(Integer::intValue)
                .average();
        average.ifPresent(System.out::println);


    }

    private static boolean isDividedOnFive(Integer it) {
        System.out.println("/5");
        return it % 5 == 0;
    }

    /*private static Predicate<Integer> isOdd() {
        return it -> it % 2 != 0;
    }*/

    private static boolean isOdd(Integer it) {
        System.out.println("/2");
        return it % 2 != 0;
    }
}
