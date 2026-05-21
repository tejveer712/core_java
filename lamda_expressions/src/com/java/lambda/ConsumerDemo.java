package com.java.lambda;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main() {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Hello");

        Consumer<Integer> squareOf = num -> System.out.println(num*num);
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<String> appendInput = input -> System.out.println("with appended input: hello " + input);
        appendInput.andThen(convertAndDisplay).accept("Lambda Expression");
    }
}
