package com.valery.java8.stream.demo.strm.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9, 22, 33, 35);
        Optional<Integer> average = list.stream()
                .filter(Task2::isOdd)
                .findFirst();
        average.ifPresent(System.out::println);


    }

    private static boolean isOdd(Integer it) {
        System.out.println("/2");
        return it % 2 != 0;
    }
}
