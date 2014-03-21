package com.krooj.practice.ch1;

import java.util.Arrays;

/**
 * Created by admin on 2014-03-19.
 */
public class Ch1Q4 {

    public String replaceSpaces(String target){

        if(null == target || ""==target){
            return target;
        }

        String runningCopy = new String();
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)==' '){
                runningCopy+="%20";
            }else{
                runningCopy+=target.charAt(i);
            }
        }
        return runningCopy;
    }

    public String replaceSpacesV2(String target){
        if(null == target || ""==target){
            return target;
        }

        char[] targetArray = target.toCharArray();
        for(int i=0;i<targetArray.length;i++){
            if(targetArray[i]==' '){
                //Grow to accommodate for extra characters
                targetArray = Arrays.copyOf(targetArray,targetArray.length+2);
                while(targetArray[targetArray.length-1]=='\u0000'){
                    for(int k=targetArray.length-1;k>i;k--){
                        targetArray[k]^=targetArray[k-1];
                        targetArray[k-1]^=targetArray[k];
                        targetArray[k]^=targetArray[k-1];
                    }
                }
                targetArray[i]='%';
                targetArray[i+1]='2';
                targetArray[i+2]='0';
            }
        }
        return new String(targetArray);
    }

}
