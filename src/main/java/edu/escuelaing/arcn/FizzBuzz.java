package edu.escuelaing.arcn;

/**
 * Hello world!
 *
 */
public class FizzBuzz{
    public static String fizzbuzz(int n) {
        StringBuilder fizzBuzzResult = new StringBuilder();
        if(n % 3 == 0){
            fizzBuzzResult.append("Fizz");
        }
        if(n % 5 == 0){
            fizzBuzzResult.append("Buzz");
        }
        return fizzBuzzResult.isEmpty() ? String.valueOf(n) : fizzBuzzResult.toString();
        
    }
}
