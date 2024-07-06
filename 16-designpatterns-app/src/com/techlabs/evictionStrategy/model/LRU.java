package com.techlabs.evictionStrategy.model;

public class LRU implements IEvictionStrategy{

	@Override
    public void evict(MemoryMap memoryMap) {
        if (!memoryMap.getAccessOrder().isEmpty()) {
            String lruElement = memoryMap.getAccessOrder().pollFirst();
            memoryMap.getMemoryMap().remove(lruElement);
            memoryMap.getInsertionOrder().remove(lruElement);
        }
    }
	
}
