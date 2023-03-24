package com.exception.handling;

public class UsingTryCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println("I am in try block");
          int i = 10/0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception catch block executed");
        }catch (Exception e) {
            System.out.println("catch block executed");

        }finally {
            System.out.println("finally");
        }

    }
}
