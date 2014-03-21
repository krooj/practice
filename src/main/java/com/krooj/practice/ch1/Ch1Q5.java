package com.krooj.practice.ch1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by admin on 2014-03-19.
 */
public class Ch1Q5 {

    public String rle(String target){
        if(null==target){
            return null;
        }
        if("".equals(target)){
            return "";
        }
        if(target.length()==1){
            return target;
        }
        Map<Integer,Integer> indexCountMap = new HashMap<>();
        indexCountMap.put(0,1);
        int lastChangeIndex=0;
        for(int i=1;i<target.length();i++){
            if(target.charAt(i-1)==target.charAt(i)){
                Integer ctr =  indexCountMap.get(lastChangeIndex);
                ctr+=1;
                indexCountMap.put(lastChangeIndex,ctr);
            }else{
                lastChangeIndex=i;
                indexCountMap.put(lastChangeIndex,1);
            }
        }
        String rtn = new String();
        Iterator<Integer> iterator = indexCountMap.keySet().iterator();
        while(iterator.hasNext()){
            Integer index = iterator.next();
            Integer count = indexCountMap.get(index);
            Character c = target.charAt(index);
            if(count>1){
                rtn+=c;
                rtn+=count;
            }else{
                rtn+=c;
            }
              
        }
        if(rtn.length()<target.length()){
            return rtn;
        }else{
            return target;
        }
    }
}
