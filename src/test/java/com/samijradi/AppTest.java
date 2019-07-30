package com.samijradi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test(expected = Exception.class)
    public void shouldGetExceptionWhenTailleIsNegative() throws Exception {
        App.partition(Arrays.asList(1,2,3,4,5), -2);
    }

    @Test(expected = Exception.class)
    public void shouldGetExceptionWhenTailleIsEqualToZero() throws Exception {
        App.partition(Arrays.asList(1,2,3,4,5), 0);
    }

    @Test(expected = Exception.class)
    public void shouldGetExceptionWhenListeIsNull() throws Exception {
        App.partition(null, 3);
    }

    @Test
    public void shouldGetEmptyListPartitionWhenListeIsEmpty() throws Exception {
        Collection<List<Integer>> listOfList = App.partition(Arrays.asList(), 3);
        Assert.assertEquals(listOfList, Arrays.asList());
    }

    @Test
    public void shouldGetListPartitionWhenTailleIsPositive() throws Exception {
        Collection<List<Integer>> listOfList = App.partition(Arrays.asList(1,2,3,4,5), 3);
        Assert.assertEquals(listOfList, Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5)));
    }
}
