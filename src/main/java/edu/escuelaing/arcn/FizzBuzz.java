package edu.escuelaing.arcn;

public class FizzBuzz{
    public static String fizzbuzz(int n) {
        StringBuilder fizzBuzzResult = new StringBuilder();
        fizz(n, fizzBuzzResult);
        buzz(n, fizzBuzzResult);
        return fizzBuzzResult.isEmpty() ? String.valueOf(n) : fizzBuzzResult.toString();
    }

    public static void fizz(int n, StringBuilder fizzBuzzResult){
        if(n % 3 == 0){
            fizzBuzzResult.append("Fizz");
        }
    }

    public static void buzz(int n, StringBuilder fizzBuzzResult){
        if(n % 5 == 0){
            fizzBuzzResult.append("Buzz");
        }
    }
}
