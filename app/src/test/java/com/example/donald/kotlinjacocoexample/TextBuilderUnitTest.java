package com.example.donald.kotlinjacocoexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextBuilderUnitTest {
    TextBuilder textBuilder = new TextBuilder();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void buttonOneIsCorrect() throws Exception {
        assertEquals(textBuilder.getReturnString("one"), "You returned 1");
    }
    @Test
    public void buttonTwoIsCorrect() throws Exception {
        assertEquals(textBuilder.getReturnString("two"), "You returned 2");
    }
}