package com.krooj.practice.ch1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Determines if a string has all unique characters
 */
public class Ch1Q1 {


    /**
     * Runs in O(n^2)
     * @param target
     * @return
     */
    public boolean allUnique(String target){
        //Extremely naive approach to finding if all characters in a string are unique
        if(null == target || "".equals(target)){
            return true;
        }
        if(target.length()==1){
            return true;
        }

        for(int i=0;i<target.length();i++){
            char x = target.charAt(i);
            for(int k=0;k<target.length();k++){
                if(k!=i){
                    if(target.charAt(i)==target.charAt(k)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Runs in O(n)
     * @param target
     * @return
     */
    public boolean allUniqueV2(String target){
        if(null == target || "".equals(target)){
            return true;
        }
        if(target.length()==1){
            return true;
        }

        Map<Character, Integer> characterHistogram = new HashMap<>();
        for(int i=0;i<target.length();i++){
            if(characterHistogram.get(target.charAt(i))!=null){
                return false;
            }else{
                characterHistogram.put(target.charAt(i),Integer.valueOf(1));
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ch1Q1 ch1Q1 = new Ch1Q1();
        String target = null;
        while((target=scanner.next())!=null){
            System.out.println(ch1Q1.allUnique(target));
        }
    }

}
