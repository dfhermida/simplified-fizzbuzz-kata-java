import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void get_name_should_return_fizz_buzz_game_name() {
		assertEquals("FizzBuzz Game", FizzBuzz.getName());
	}
}
