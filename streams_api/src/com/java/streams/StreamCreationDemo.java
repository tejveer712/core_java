package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Engineering");

        // Normal Stream
        Stream<String> deptStream = departmentList.stream();
        deptStream.forEach(System.out::println);

        Stream<String> inputStream =Stream.of("Java", "C++", "Python");
        inputStream.forEach(System.out::println);

        // Elements are processed parallely, they are executed in order
        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);
    }
}
