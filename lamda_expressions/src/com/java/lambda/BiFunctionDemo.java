package com.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1+num2) % 2 == 0;
        System.out.println(isSumEven.test(1, 2)); //false

        BiFunction<Double, Double, Double> calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(3.0, 3.0));

        BiConsumer<String, String> appendAndConvert = (word1, word2) ->
                System.out.println((word1 + word2).toUpperCase());
        appendAndConvert.accept("hello", "world");

        BinaryOperator<Double> calculatepowerWithBO = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatepowerWithBO.apply(3.0, 3.0));

        BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(maxOperation.apply(5, 3));

        BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a,b) -> Integer.compare(a,b));
        System.out.println(minOperation.apply(5, 3));
    }
}
