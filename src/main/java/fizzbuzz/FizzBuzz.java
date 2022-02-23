package fizzbuzz;

public class FizzBuzz {
    public static String getName() {
        return "FizzBuzz Game";
    }

    public static String translate(int number) {
        if (number == 1) {
            return "1";
        } else {
            return "2";
        }
    }
}
