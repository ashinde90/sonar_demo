package com.pedro.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void whenInputIs1_Return1(){


        assertEquals("1", fizzBuzz.getOutput("1"));
    }

    @Test
    public void whenInputIs3_ReturnFizz(){
        assertEquals("Fizz", fizzBuzz.getOutput("3"));
    }
}
