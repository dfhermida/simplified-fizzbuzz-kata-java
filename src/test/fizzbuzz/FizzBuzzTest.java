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
	public void translate_should_return_fizz_if_number_is_multiple_of_3() {
		assertEquals("Fizz", FizzBuzz.translate(3));
		assertEquals("Fizz", FizzBuzz.translate(6));
	}

	@Test
	public void translate_should_return_buzz_if_number_is_multiple_of_5() {
		assertEquals("Buzz", FizzBuzz.translate(5));
		assertEquals("Buzz", FizzBuzz.translate(10));
	}

	@Test
	public void translate_should_return_fizzbuzz_if_number_is_multiple_of_3_and_5() {
		assertEquals("FizzBuzz", FizzBuzz.translate(15));
		assertEquals("FizzBuzz", FizzBuzz.translate(30));
	}


}
