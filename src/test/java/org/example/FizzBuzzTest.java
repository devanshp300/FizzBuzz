package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_3_ReturnsFizz() {
        assertEquals("Fizz", FizzBuzzGame.play(3));
    }
    //

    @Test
    public void testFizzBuzz_5_ReturnsBuzz() {
        assertEquals("Buzz", FizzBuzzGame.play(5));
    }
}