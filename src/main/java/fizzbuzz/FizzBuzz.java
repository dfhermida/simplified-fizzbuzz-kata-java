package fizzbuzz;

public class FizzBuzz {
    public static String getName() {
        return "FizzBuzz Game";
    }

    public static String translate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
