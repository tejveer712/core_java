package com.java.method.reference;

public class StaticMethodReference {

    public static void main(String[] args) {
        ArthemeticOperation operation = (a, b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(3, 2);

        ArthemeticOperation methodReference = StaticMethodReference::performAddition;
        System.out.println(methodReference.performOperation(3, 2));
    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

}
