package com.techyourchance.unittestingfundamentals.example2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    StringReverser SUT;

    // UNIT TEST NAMING PATTERN
    // <unitOfWork>_<stateUnderTest>_<expectedBehavior>

    @Before
    public void setup() {
        SUT = new StringReverser();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned() {
        String result = SUT.reverse("");
        assertEquals(result, "");
    }

    @Test
    public void reverse_singleCharacter_sameStringReturned() {
        String result = SUT.reverse("a");
        assertEquals(result, "a");
    }

    @Test
    public void reverse_longString_reversedStringReturned() {
        String result = SUT.reverse("Vasiliy Zukanov");
        assertEquals(result, "vonakuZ yilisaV");
    }
}