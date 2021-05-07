package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup(){
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicator_emptyString_emptyStringReturned(){
        String result = SUT.duplicate("");
        assertEquals(result, "");
    }

    @Test
    public void duplicator_singleCharacterString_singleCharacterIsDoubled(){
        String result = SUT.duplicate("a");
        assertEquals(result, "aa");
    }

    @Test
    public void duplicator_multiCharacterString_inputIsDoubled(){
        String result = SUT.duplicate("abhi");
        assertEquals(result, "abhiabhi");
    }
}