package com.krooj.practice.ch1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2014-03-18.
 */
public class TestCh1Q3 {

    private Ch1Q3 ch1Q3;

    @Before
    public void setUp(){
        ch1Q3 = new Ch1Q3();
    }

    @Test
    public void testNull(){
        Assert.assertTrue(ch1Q3.isPermutation(null, null));
    }

    @Test
    public void testZeroLen(){
        Assert.assertTrue(ch1Q3.isPermutation("",""));
    }

    @Test
    public void testAllSpace(){
        Assert.assertTrue(ch1Q3.isPermutation("  ","   "));
    }

    @Test
    public void testNonEqualLen(){
        Assert.assertFalse(ch1Q3.isPermutation("abc","a"));
    }

    @Test
    public void testPermutation(){
        Assert.assertTrue(ch1Q3.isPermutation("amp","map"));
    }

}
