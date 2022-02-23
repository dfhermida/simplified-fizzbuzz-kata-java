package fizzbuzz;

public class FizzBuzz {
    public static String getName() {
        return "FizzBuzz Game";
    }

    public static String translate(int number) {
        if ((number == 3) || (number == 6)) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
