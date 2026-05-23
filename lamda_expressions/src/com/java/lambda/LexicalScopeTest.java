package com.java.lambda;

public class LexicalScopeTest {

    public static void main(String[] args) {

    String input = "Hello World";

        //We cannot use same variable names that we have declared inside the method as the input parameter name for your lamda expression
        // for the same reason I cannot use input name as a variable
    Printer printer = input1 -> {
        String msg = "Hi";
        System.out.println(input1+input+msg);
    };
    printer.print(input);
    }
}

