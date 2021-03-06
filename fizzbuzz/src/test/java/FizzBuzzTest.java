import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Fizz Buzz Tests 😇")
class FizzBuzzTest {

    private FizzBuzz main;


    @ParameterizedTest
    @DisplayName("should have list of integer of size length")
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testListBuild(int length) {
        main = new FizzBuzz(length);
        assertEquals(main.getIntegerList().count(), length);
    }

    @Test
    @DisplayName("should verify length positiv sign")
    void testNegativeLength() {
        assertThrows(AssertionError.class, () -> main = new FizzBuzz(-1));
    }

    @Test
    @DisplayName("should show 'fizz' on multiples of 3")
    void testRule2(){
        main = new FizzBuzz(100);
        List<String> fizzBuzzed = main.fizzBuzz();

        System.out.println(fizzBuzzed.stream().map(String::toString).collect(Collectors.joining(", ")));

        assertEquals("2", fizzBuzzed.get(2));
        assertEquals("Fizz", fizzBuzzed.get(3));
        assertEquals("Buzz", fizzBuzzed.get(5));
        assertEquals("Fizz", fizzBuzzed.get(6));
        assertEquals("It's a trap", fizzBuzzed.get(7));
        assertEquals("Buzz", fizzBuzzed.get(10));
        assertEquals("It's a trap", fizzBuzzed.get(14));
        assertEquals("Fizz Buzz", fizzBuzzed.get(15));
        assertEquals("It's a trap", fizzBuzzed.get(21));
        assertEquals("Fizz Buzz", fizzBuzzed.get(30));
        assertEquals("La grande question sur la vie, l'univers et le reste", fizzBuzzed.get(42));
    }
}