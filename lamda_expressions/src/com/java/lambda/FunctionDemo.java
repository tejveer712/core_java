package com.java.lambda;

import java.util.function.Function;

public class FunctionDemo {

    public static void main() {

        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("hello"));

        Function<String, Integer> getStrLnegth = input -> input.length();
        System.out.println(getStrLnegth.apply("hello"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("hello function"));

        Function<Integer, Integer> doubleValue = num -> num*2;
        Function<Integer, Integer> addThree = num -> num+3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);

        System.out.println(output1.apply(2)); // 7
        System.out.println(output2.apply(2)); // 10
    }
}
