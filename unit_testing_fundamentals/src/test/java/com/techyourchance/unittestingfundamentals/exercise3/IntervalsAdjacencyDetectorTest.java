package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setup() {
        SUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void isAdjacent_interval1BeforeInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(8, 12);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1BeforeAndAdjacentToInterval2_trueReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(5, 12);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, true);
    }

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnStart_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1ContainedWithinInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 12);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1ContainsInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(0, 3);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1EqualsInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-1, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1OverlapsInterval2OnEnd_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 4);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isAdjacent_interval1AfterAndAdjacentToInterval2_trueReturned() {
        Interval interval1 = new Interval(12, 15);
        Interval interval2 = new Interval(5, 12);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, true);
    }

    @Test
    public void isAdjacent_interval1AfterInterval2_trueReturned() {
        // should be true...
        // as -1 is after -10
        // changing falseReturned to TrueReturned
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-10, -3);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertEquals(result, true);
    }

}