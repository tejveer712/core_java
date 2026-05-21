package com.java.lambda;

public class LamdaExpressionDemo {

    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello");
        Hello hello2 = () -> System.out.println("Hello2"); //Approach 1
        process(hello);
        process(hello2);
        process(() -> System.out.println("Hi ")); //Approach 2

        //Arithemetic Operation

        ArithemeticOperation addition = (a, b) -> a + b;
        System.out.println(addition.operation(10, 20));

        ArithemeticOperation subtraction = (a, b) -> a - b;
        System.out.println(subtraction.operation(10, 20));

        ArithemeticOperation multiplication = (a, b) -> a * b;
        System.out.println(multiplication.operation(10, 20));

        ArithemeticOperation division = (a, b) -> a / b;
        System.out.println(division.operation(10, 20));

    }

    public static void process(Hello h){
        h.sayHello();
    }
}
