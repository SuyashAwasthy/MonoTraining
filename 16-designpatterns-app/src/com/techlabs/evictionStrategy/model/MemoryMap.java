package com.techlabs.evictionStrategy.model;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MemoryMap {

	 private Map<String, Integer> memoryMap;
	    private Deque<String> accessOrder;
	    private Queue<String> insertionOrder;
	    private IEvictionStrategy evictionStrategy;


	    public MemoryMap(IEvictionStrategy evictionStrategy) {
	        this.evictionStrategy = evictionStrategy;
	        this.memoryMap = new HashMap<>();
	        this.accessOrder = new LinkedList<>();
	        this.insertionOrder = new LinkedList<>();

	    }

	    public Map<String, Integer> getMemoryMap() {
	        return memoryMap;
	    }

	    public Deque<String> getAccessOrder() {
	        return accessOrder;
	    }

	    public Queue<String> getInsertionOrder() {
	        return insertionOrder;
	    }

	    public void setEvictionStrategy(IEvictionStrategy evictionStrategy) {
	        this.evictionStrategy = evictionStrategy;
	    }

	    public void put(String key) {
	        if (memoryMap.size() >= 3) {
	            evictionStrategy.evict(this);
	        }
	        memoryMap.put(key, 0);
	        insertionOrder.add(key);
	        accessOrder.add(key);
	    }

	    public void get(String key) {
	        if (memoryMap.containsKey(key)) {
	            memoryMap.put(key, memoryMap.get(key) + 1);
	            accessOrder.remove(key);
	            accessOrder.add(key);
	        }
	    }

	    public void printMap() {
	        for (Map.Entry<String, Integer> entry : memoryMap.entrySet()) {
	            System.out.println("[" + entry.getKey() + "]" + " = " + entry.getValue());
	        }
	    }
	
}
