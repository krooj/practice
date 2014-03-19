package com.krooj.practice.ch1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2014-03-18.
 */
public class TestCh1Q2 {

    private Ch1Q2 ch1Q2;

    @Before
    public void setUp(){
        ch1Q2 = new Ch1Q2();
    }

    @Test
    public void testReverseZeroLen(){
        Assert.assertEquals("", ch1Q2.reverse(""));
    }

    @Test
    public void testReverseNull(){
        Assert.assertEquals(null, ch1Q2.reverse(null));
    }

    @Test
    public void testReverse1Char(){
        Assert.assertEquals("a", ch1Q2.reverse("a"));
    }

    @Test
    public void testReverse2Char(){
        Assert.assertEquals("ba", ch1Q2.reverse("ab"));
    }

    @Test
    public void testReverse6Char(){
        Assert.assertEquals("fedcba", ch1Q2.reverse("abcdef"));
    }

    @Test
    public void testReverseSentence(){
        Assert.assertEquals("I like cake", ch1Q2.reverse("ekac ekil I"));
    }

    @Test
    public void testReverseZeroLenV2(){
        Assert.assertEquals("", ch1Q2.reverseV2(""));
    }

    @Test
    public void testReverseNullV2(){
        Assert.assertEquals(null, ch1Q2.reverseV2(null));
    }

    @Test
    public void testReverse1CharV2(){
        Assert.assertEquals("a", ch1Q2.reverseV2("a"));
    }

    @Test
    public void testReverse2CharV2(){
        Assert.assertEquals("ba", ch1Q2.reverseV2("ab"));
    }

    @Test
    public void testReverse6CharV2(){
        Assert.assertEquals("fedcba", ch1Q2.reverseV2("abcdef"));
    }

    @Test
    public void testReverseSentenceV2(){
        Assert.assertEquals("I like cake", ch1Q2.reverseV2("ekac ekil I"));
    }

    @Test
    public void testReverseZeroLenV3(){
        Assert.assertEquals("", ch1Q2.reverseV3(""));
    }

    @Test
    public void testReverseNullV3(){
        Assert.assertEquals(null, ch1Q2.reverseV3(null));
    }

    @Test
    public void testReverse1CharV3(){
        Assert.assertEquals("a", ch1Q2.reverseV3("a"));
    }

    @Test
    public void testReverse2CharV3(){
        Assert.assertEquals("ba", ch1Q2.reverseV3("ab"));
    }

    @Test
    public void testReverse6CharV3(){
        Assert.assertEquals("fedcba", ch1Q2.reverseV3("abcdef"));
    }

    @Test
    public void testReverseSentenceV3(){
        Assert.assertEquals("I like cake", ch1Q2.reverseV3("ekac ekil I"));
    }
}
