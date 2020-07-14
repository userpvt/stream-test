package com.valery.java8.stream.demo.strm.task7;

import com.valery.test.strm.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

public class Task1 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(18, "Ivan", "Ivanov"),
                new Student(25, "Брюс", "Ли"),
                new Student(30, "Petr", "Petrov"),
                new Student(50, "Sidor", "Sidorov"),
                new Student(40, "Sidor", "Sidorovsidorov")
        );

        Map<String, Student> collect = students.parallelStream()
                .peek( it -> System.out.println(Thread.currentThread().getName() + " " + it))
                .sequential()
                .collect(Collectors.toMap(Student::getFirstName, identity(),
                        (first, second) -> first.getAge() > second.getAge() ? first : second));
        System.out.println(collect);

    }

    private static void test1(List<Student> students) {
        Map<String, Student> collect = students.stream()
                .collect(Collectors.toMap(Student::getFirstName, identity(),
                        (first, second) -> first.getAge() > second.getAge() ? first : second));
        System.out.println(collect);

        //узнать сколько ядер на компе:-) System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
