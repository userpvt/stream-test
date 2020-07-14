package com.valery.java8.stream.demo.strm.task6;

import com.valery.test.strm.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(18, "Ivan", "Ivanov"),
                new Student(25, "Брюс", "Ли"),
                new Student(30, "Petr", "Petrov"),
                new Student(50, "Sidor", "Sidorov"),
                new Student(40, "Sidor", "Sidorovsidorov")
        );

        Map<String, Set<String>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName,Collectors.mapping(Student::fullName, Collectors.toSet())));
        System.out.println(collect);

    }

    private static void testMap(List<Student> students) {
        Map<String, List<String>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName,Collectors.mapping(Student::fullName, Collectors.toList())));
        System.out.println(collect);
    }

    private static void test1(List<Student> students) {
        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName, Collectors.toList()));
        System.out.println(collect);
    }
}
