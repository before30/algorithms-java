package cc.before30.algorithms.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by before30 on 08/05/2017.
 */
@Slf4j
public class CircularCounterTest {

    @Test
    public void skipValueIsLargerThanOrEqualToOneTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> result = CircularCounter.apply(list, 3);
        Assert.assertEquals(Arrays.asList(3, 6, 9, 4, 8, 5, 2, 7, 1), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void skipValueIsLessThanOneTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> result = CircularCounter.apply(list, -1);
    }

}