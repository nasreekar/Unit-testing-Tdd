package com.techyourchance.unittestingfundamentals.example3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class IntervalsOverlapDetectorTest {

    IntervalsOverlapDetector SUT;

    @Before
    public void setup() {
        SUT = new IntervalsOverlapDetector();
    }

    // interval1 is before interval2

    @Test
    public void isOverlap_interval1BeforeInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(8, 12);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, false);
    }

    // interval1 overlaps interval2 on start

    @Test
    public void isOverlap_interval1OverlapsInterval2OnStart_trueReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, true);
    }
    // interval1 is contained within interval2

    @Test
    public void isOverlap_interval1ContainedWithinInterval2_trueReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 12);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, true);
    }
    // interval1 contains interval2

    @Test
    public void isOverlap_interval1ContainsInterval2_trueReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(0, 3);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, true);
    }
    // interval1 overlaps interval2 on end

    @Test
    public void isOverlap_interval1OverlapsInterval2OnEnd_trueReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 4);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, true);
    }
    // interval1 is after interval2

    @Test
    public void isOverlap_interval1AfterInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-10, -3);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isOverlap_interval1BeforeAdjacentInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(5, 8);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, false);
    }

    @Test
    public void isOverlap_interval1AfterAdjacentInterval2_falseReturned() {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-3, -1);
        boolean result = SUT.isOverlap(interval1, interval2);
        assertEquals(result, false);
    }
}