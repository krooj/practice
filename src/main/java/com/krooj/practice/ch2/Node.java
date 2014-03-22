package com.krooj.practice.ch2;

import java.util.Stack;

/**
 * Impl for a linked list node
 */
public class Node<T> {

    private T data;

    private Node<T> next;

    private Node<T> prev;

    public Node(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void appendToTail(T data){
        Node<T> tailNode = new Node<T>(data);

        Node<T> existingTail = this;
        while(existingTail.getNext()!=null){
            //Seek to the end
            existingTail = existingTail.getNext();
        }
        existingTail.setNext(tailNode);
        tailNode.setPrev(existingTail);
    }

    public void removeNode(Node targetNode){
        Node<T> removalCandidate = this;
        Node<T> prevNode = null;

        while(removalCandidate.getNext()!=null){
            if(removalCandidate.equals(targetNode) && prevNode!=null){
                Node<T> successor = removalCandidate.getNext();
                prevNode.setNext(successor);
                successor.setPrev(prevNode);
                nullifyLinks(removalCandidate);
                removalCandidate = prevNode;
            }else if(removalCandidate.equals(targetNode)){
                Node<T> successor = removalCandidate.getNext();
                nullifyLinks(removalCandidate);
            }else{
                prevNode = removalCandidate;
            }
            removalCandidate = removalCandidate.getNext();
        }
    }

    private void nullifyLinks(Node<T> node){
        node.setNext(null);
        node.setPrev(null);
    }

    public void removeDuplicateVals(){
        //Start at the head and proceed, checking each value to see if dup.
        Node<T> nextNode = this;

       while(nextNode!=null){

           Node<T> n2NextNode = this;

           while(n2NextNode!=null){
               if((n2NextNode!=nextNode) && nextNode.equals(n2NextNode)){
                   Node<T> n2Ancestor = n2NextNode.getPrev();
                   Node<T> n2Successor = n2NextNode.getNext();
                   n2Ancestor.setNext(n2Successor);
                   if(n2Successor!=null){
                       n2Successor.setPrev(n2Ancestor);
                   }
                   nullifyLinks(n2NextNode);
                   n2NextNode = n2Ancestor;
                   continue;
               }
               n2NextNode = n2NextNode.getNext();
           }

           nextNode = nextNode.getNext();
       }
    }

    public Node<T> findKthNodeFromLast(int k){
        Stack<Node<T>> nodeStack = new Stack<Node<T>>();
        Node<T> currentNode = this;
        while(currentNode!=null){
            nodeStack.push(currentNode);
            currentNode = currentNode.getNext();
        }
        Node<T> targetNode = null;
        for(int i=1;i<=k;i++){
            targetNode = nodeStack.pop();
        }
        return targetNode;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (!data.equals(node.data)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
