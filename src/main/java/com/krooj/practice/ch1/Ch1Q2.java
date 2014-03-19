package com.krooj.practice.ch1;

/**
 * Created by admin on 2014-03-18.
 */
public class Ch1Q2 {

    public String reverse(String target){
        if(null == target || "".equals(target) || target.length()==1){
            return target;
        }
        if(target.length()==2){
            return new String(new char[]{target.charAt(1),target.charAt(0)});
        }
        return reverseRecursive(target);
    }

    private String reverseRecursive(String target){
        if(target.length()==1){
            return target;
        }
        if(target.length()==2){
            return new String(new char[]{target.charAt(1),target.charAt(0)});
        }
        String left = target.substring(0,target.length()/2);
        String right = target.substring((target.length()/2), target.length());

        String result = reverseRecursive(right) + reverseRecursive(left);
        return result;
    }

    public String reverseV2(String target){
        if(null == target || "".equals(target) || target.length()==1){
            return target;
        }
        if(target.length()==2){
            return new String(new char[]{target.charAt(1),target.charAt(0)});
        }
        char[] targetArray = target.toCharArray();
        for(int i=0;i<targetArray.length/2;i++){
            char x = targetArray[i];
            char y = targetArray[targetArray.length-1-i];
            targetArray[i]=y;
            targetArray[targetArray.length-1-i] =x;
        }
        return new String(targetArray);
    }

    public String reverseV3(String target){
        if(null == target || "".equals(target) || target.length()==1){
            return target;
        }
        if(target.length()==2){
            return new String(new char[]{target.charAt(1),target.charAt(0)});
        }
        int start = 0;
        int end = target.length()-1;
        char[] targetArray = target.toCharArray();
        while(start<end){
            targetArray[start]^=targetArray[end];
            targetArray[end]^=targetArray[start];
            targetArray[start]^=targetArray[end];
            start++;
            end--;
        }
        return new String(targetArray);
    }

}
