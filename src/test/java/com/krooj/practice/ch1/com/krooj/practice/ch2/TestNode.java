package com.krooj.practice.ch1.com.krooj.practice.ch2;

import com.krooj.practice.ch2.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 2014-03-22.
 */
public class TestNode {

    @Test
    public void testAppendToEnd(){
        Node<Integer> first = new Node<>(Integer.valueOf(1));
        for(int i=2;i<5;i++){
            first.appendToTail(Integer.valueOf(i));
        }

        //Let'seek to assert there 4 nodes
        int expectedCount = 1;
        while(first.getNext()!=null){
            expectedCount++;
            first=first.getNext();
        }
        Assert.assertEquals(4, expectedCount);

    }

    @Test
    public void testRemoveNode(){
        Node<Integer> first = new Node<>(Integer.valueOf(1));
        for(int i=2;i<5;i++){
            first.appendToTail(Integer.valueOf(i));
        }

        first.removeNode(new Node<Integer>(Integer.valueOf(2)));

        int expectedCount=1;
        while (first.getNext()!=null){
            expectedCount++;
            first = first.getNext();
        }
        Assert.assertEquals(3, expectedCount);

    }

    @Test
    public void testRemoveDuplicates(){
        //Add some nodes
        Node<Integer> first = new Node<>(Integer.valueOf(1));
        for(int i=2;i<5;i++){
            first.appendToTail(Integer.valueOf(i));
        }
        //node[1]->node[2]->node[3]->node[4]

        //Add some duplicates
        for(int i=3;i<5;i++){
            first.appendToTail(Integer.valueOf(i));
        }
        //node[1]->node[2]->node[3]->node[4]->node[3]->node[4]

        //Remove duplicates
        first.removeDuplicateVals();

        int expectedCount=1;
        while (first.getNext()!=null){
            expectedCount++;
            first = first.getNext();
        }
        Assert.assertEquals(4,expectedCount);



    }

    @Test
    public void testFindKthNode(){
        //Add some nodes
        Node<Integer> first = new Node<>(Integer.valueOf(1));
        for(int i=2;i<5;i++){
            first.appendToTail(Integer.valueOf(i));
        }
        Node<Integer>  lastNode = first.findKthNodeFromLast(3);
        Assert.assertNotNull(lastNode);
        Assert.assertEquals(Integer.valueOf(2),lastNode.getData());
    }

}
