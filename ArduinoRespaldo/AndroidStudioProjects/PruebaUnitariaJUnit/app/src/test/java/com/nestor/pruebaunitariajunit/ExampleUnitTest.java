package com.nestor.pruebaunitariajunit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        EmailValidator email = new EmailValidator();
        assertEquals(20, email.add(1,2,'*'));
    }

}