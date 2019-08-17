package interviewbit.arrays;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervalsTest {

    @Test
    public void insert() {
        MergeIntervals m = new MergeIntervals();
        m.insert(new ArrayList<>(Arrays.asList(
                new MergeIntervals.Interval(3, 6),
                new MergeIntervals.Interval(8, 9))), new MergeIntervals.Interval(7, 10));
    }
}
