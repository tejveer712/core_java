package com.java.method.reference;

public class InstanceMethodReference {

    public static void main(String[] args) {
        ArthemeticOperation operation = (a, b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(3, 2);

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

        ArthemeticOperation methodReference = instanceMethodReference::performAddition;
        System.out.println(methodReference.performOperation(3, 2));

        ArthemeticOperation methodReferenceSub = instanceMethodReference::performSubstraction;
        System.out.println(methodReferenceSub.performOperation(3, 2));
    }

    public int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public int performSubstraction(int a, int b) {
        int difference = a - b;
        System.out.println(difference);
        return difference;
    }

}
