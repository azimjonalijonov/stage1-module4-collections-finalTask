package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> setMap = new LinkedHashMap<>();
        for (String e : sourceMap.keySet()) {
            int temp = e.length();
            if (setMap.containsKey(temp)) {
                setMap.get(temp).add(e);
            }else {
                Set<String> value = new HashSet<>();
                value.add(e);
                setMap.put(temp, value);
            }
        }
        return setMap;
    }
}
