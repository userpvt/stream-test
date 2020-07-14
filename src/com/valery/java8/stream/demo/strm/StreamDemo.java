package com.valery.java8.stream.demo.strm;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        IntSummaryStatistics intSummaryStatistics = Stream.of("11", "22", "33", "44", "55", "36", "31")
                .map(Integer::valueOf)
                .mapToInt(StreamDemo::convert)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

    }

    private static int convert(Integer value) {
        return value;
    }

    private static void test2() {
        IntSummaryStatistics sum = Stream.of("1", "2", "3", "5", "4", "7", "6")
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(sum);
    }


    private static void test1(List<String> strings) {
        strings.stream()
                .map(s -> s + s)
                .map(Integer::valueOf)
                .filter(value -> value > 3000)
                .sorted()
                .forEach(System.out::println);
    }

}
