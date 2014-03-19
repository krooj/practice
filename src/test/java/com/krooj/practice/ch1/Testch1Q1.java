package com.krooj.practice.ch1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2014-03-18.
 */
public class Testch1Q1 {

    private Ch1Q1 ch1Q1;

    @Before
    public void setUp(){
        ch1Q1 = new Ch1Q1();
    }

    @Test
    public void testLenZero(){
        Assert.assertTrue(ch1Q1.allUnique(""));
    }

    @Test
    public void testLenOne(){
        Assert.assertTrue(ch1Q1.allUnique("a"));
    }


    @Test
    public void testLenGtOneAllUnique(){
        Assert.assertTrue(ch1Q1.allUnique("abc123"));
    }

    @Test
    public void testLenGtOneNonUnique(){
        Assert.assertFalse(ch1Q1.allUnique("abcc123"));
    }

    @Test
    public void testLenZeroV2(){
        Assert.assertTrue(ch1Q1.allUniqueV2(""));
    }

    @Test
    public void testLenOneV2(){
        Assert.assertTrue(ch1Q1.allUniqueV2("a"));
    }


    @Test
    public void testLenGtOneAllUniqueV2(){
        Assert.assertTrue(ch1Q1.allUniqueV2("abc123"));
    }

    @Test
    public void testLenGtOneNonUniqueV2(){
        Assert.assertFalse(ch1Q1.allUniqueV2("abcc123"));
    }
}
