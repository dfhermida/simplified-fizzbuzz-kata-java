import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

    @Test
    public void translate_should_return_same_number_as_string() {
        assertEquals("1", FizzBuzz.translate(1));
    }
}
