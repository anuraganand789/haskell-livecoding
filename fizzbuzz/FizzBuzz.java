import java.util.stream.IntStream;
public class FizzBuzz{
    
    private static String fizzBuzz(final int inputNumber){
        boolean divisibleByThree = (inputNumber % 3) == 0;
        boolean divisibleByFive  = (inputNumber % 5) == 0;

        if(divisibleByThree && divisibleByFive) return "FizzBuzz";
        if(divisibleByThree) return "Fizz";
        if(divisibleByFive) return "Buzz";

        return "" + inputNumber;

    }


    public static void main(final String ...args){
        IntStream
        .rangeClosed(1, 100)
        .forEach(inputNumber -> System.out.println(fizzBuzz(inputNumber)));
    }
}

