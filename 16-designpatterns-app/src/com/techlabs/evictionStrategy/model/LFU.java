package com.techlabs.evictionStrategy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LFU implements IEvictionStrategy{
	@Override
    public void evict(MemoryMap memoryMap) {
        int minValue = Integer.MAX_VALUE;
        String lfuElement;
        List<String> candidates = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : memoryMap.getMemoryMap().entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                candidates.clear();
                candidates.add(entry.getKey());
            }
            if (entry.getValue() == minValue) {
                candidates.add(entry.getKey());
            }
        }
        
        lfuElement = candidates.get(0);

        if (candidates.size() > 1) {
            for (String candidate : memoryMap.getInsertionOrder()) {
                if (candidates.contains(candidate)) {
                    lfuElement = candidate;
                    break;
                }
            }
        }

        if (lfuElement != null) {
            memoryMap.getMemoryMap().remove(lfuElement);
            memoryMap.getInsertionOrder().remove(lfuElement);
            memoryMap.getAccessOrder().remove(lfuElement);
        }
    }
}
