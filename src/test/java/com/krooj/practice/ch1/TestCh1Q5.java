package com.krooj.practice.ch1;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2014-03-19.
 */
public class TestCh1Q5 {

    private Ch1Q5 ch1Q5;

    @Before
    public void setUp(){
        ch1Q5 = new Ch1Q5();
    }

    @Test
    public void testNull(){
        Assert.assertNull(ch1Q5.rle(null));
    }

    @Test
    public void testEmpty(){
        Assert.assertEquals("",ch1Q5.rle(""));
    }

    @Test
    public void testLenOne(){
        Assert.assertEquals("a",ch1Q5.rle("a"));
    }

    @Test
    public void testRle(){
        Assert.assertEquals("aab",ch1Q5.rle("aab"));
    }

    @Test
    public void testRleLesserResultLength(){
        Assert.assertEquals("a3b3cae2",ch1Q5.rle("aaabbbcaee"));
    }
}
