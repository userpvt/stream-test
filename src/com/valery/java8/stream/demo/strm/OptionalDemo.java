package com.valery.java8.stream.demo.strm;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Student student = new Student(35,"Ivan");
        Optional.of(student)
                .map(Student::getFirstName)
                .ifPresent(System.out::println);
    }
}
