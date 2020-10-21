package com.ydy.easypoi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("d","d-他");
        map.put("c","c-我");
        map.put("a","a-你");
        map.put("b","b-他");


        for (String key : map.keySet()){
            System.out.println(key+"\t"+map.get(key));
        }

        System.out.println("-------------------------");

        Map<String,String> treeMap = new TreeMap<>(map);
        for (String key : treeMap.keySet()){
            System.out.println(key+"\t"+treeMap.get(key));
        }
    }
}
