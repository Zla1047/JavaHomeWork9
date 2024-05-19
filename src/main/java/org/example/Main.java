package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.example.TimeTest.testPut;
import static org.example.TimeTest.testRandom;


public class Main {
    public static void main(String[] args) {

        List<String> bothTask = new ArrayList<>();
        bothTask.add("kiwi");
        bothTask.add("apple");
        bothTask.add("banana");

        Map<String, Integer> resultMap = NewHashMap.mapStringsToLengthk(bothTask);
        System.out.println("Result first task: " + resultMap);

        Map<Integer,List<String>> resultMap2 = NewHashMap.mapLengthToStrings(bothTask);
        System.out.println("Result second task: " + resultMap2);

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList: ");
        long addTime = testPut(arrayList);
        System.out.println("Put 1000000 elements: " + addTime + "Nanoseconds");
        long accessTime = testRandom(arrayList);
        System.out.println("Randomy access 1000000 elements: " + accessTime + "Nanoseconds");

        System.out.println("LinkedList: ");
        long timeAdd = testPut(linkedList);
        System.out.println("Put 1000000 elements: "+ timeAdd + "Nanoseconds");
        long timeAccess = testRandom(linkedList);
        System.out.println("Randomy access 1000000 elements: " + timeAccess + "Nanoseconds");


    }
}