package com.krooj.practice.ch1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by admin on 2014-03-19.
 */
public class TestCh1Q4 {

    private Ch1Q4 ch1Q4;

    @Before
    public void setUp(){
        ch1Q4 = new Ch1Q4();
    }

    @Test
    public void testNullTarget(){
        Assert.assertNull(ch1Q4.replaceSpaces(null));
    }

    @Test
    public void testEmptyTarget(){
        Assert.assertEquals("", ch1Q4.replaceSpaces(""));
    }

    @Test
    public void testReplaceSingleSpace(){
        Assert.assertEquals("%20",ch1Q4.replaceSpaces(" "));
    }

    @Test
    public void testReplaceSpaces(){
        Assert.assertEquals("The%20truth%20is%20out%20there",ch1Q4.replaceSpaces("The truth is out there"));
    }

    @Test
    public void testReplaceSpacesV2(){
        Assert.assertEquals("The%20truth%20is%20out%20there",ch1Q4.replaceSpacesV2("The truth is out there"));
    }
}
