package com.krooj.practice.ch1;

import java.util.Arrays;

/**
 * Created by admin on 2014-03-18.
 */
public class Ch1Q3 {

    public boolean isPermutation(String source, String target){
        if(source == null || target == null || (source.length()==0 && target.length()==0)){
            return true;
        }
        source = source.trim();
        target = target.trim();
        if(source.length()!=target.length()){
            return false;
        }

        char[] sourceCharArray = source.toCharArray();
        char[] targetArray = target.toCharArray();

        Arrays.sort(sourceCharArray);
        Arrays.sort(targetArray);

        for(int i=0;i<sourceCharArray.length;i++){
            if(sourceCharArray[i]!=targetArray[i]){
                return false;
            }
        }
        return true;
    }

}
