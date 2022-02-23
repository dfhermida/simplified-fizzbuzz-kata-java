import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void get_name_should_return_fizz_buzz_game_name() {
		assertEquals("FizzBuzz Game", FizzBuzz.getName());
	}

	@Test
	public void translate_should_return_string_of_number_if_not_multiple_of_3_or_5() {
		assertEquals("1", FizzBuzz.translate(1));
		assertEquals("2", FizzBuzz.translate(2));
	}

	@Test
	public void translate_should_return_fizz_if_number_is_3() {
		assertEquals("Fizz", FizzBuzz.translate(3));
	}
}
