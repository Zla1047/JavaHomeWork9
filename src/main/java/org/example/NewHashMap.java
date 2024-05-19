package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewHashMap {
    public static Map<String, Integer> mapStringsToLengthk(List<String> strings) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : strings) {
            newMap.put(s, s.length());
        }
        return newMap;
    }

    public static Map<Integer,List<String>> mapLengthToStrings(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
