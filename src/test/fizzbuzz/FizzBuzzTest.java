import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void get_name_should_return_fizz_buzz_game_name() {
		assertEquals("FizzBuzz Game", FizzBuzz.getName());
	}

	@Test
	public void translate_should_return_string_1_if_number_1_is_passed() {
		assertEquals("1", FizzBuzz.translate(1));
	}

}
