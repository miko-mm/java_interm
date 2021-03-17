/* FizzBuzz
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”. Share your code (also with each other) using git.
1, 2, Fizz, 4, Buzz, 6, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
 */

import java.util.stream.IntStream;

public class ss21_fizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
            }

    public static void fizzBuzz(int num) {
        for (int i=1; i<=num; i++){
            // multiply of 3 & 5
            if(((i % 3)== 0) && ((i % 5)== 0))
                System.out.println("FizzBuzz");
            // multiply of 3
            else if((i % 3)== 0)
                System.out.println("Fizz");
            // multiply of 5
            else if((i % 5) == 0)
                System.out.println("Buzz");
            else
            // all other numbers
                System.out.println(i);
        }
    }
}
