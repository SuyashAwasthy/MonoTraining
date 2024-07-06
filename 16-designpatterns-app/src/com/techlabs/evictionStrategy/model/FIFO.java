package com.techlabs.evictionStrategy.model;

import java.util.Queue;

public class FIFO implements IEvictionStrategy{

	@Override
    public void evict(MemoryMap memoryMap) {
        Queue<String> insertionOrder = memoryMap.getInsertionOrder();
        if (!insertionOrder.isEmpty()) {
            String key = insertionOrder.poll();
            memoryMap.getMemoryMap().remove(key);
            memoryMap.getAccessOrder().remove(key);
        }

    }
	
}
