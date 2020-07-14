package com.valery.java8.stream.demo.strm;

import java.util.stream.IntStream;

public class ReduceDemo {
    public static void main(String[] args) {
        int reduce = IntStream.of(1, 4, 5, 6, 7)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
