package com.techlabs.model;

@FunctionalInterface
public interface Consumer<T> {

	void accept(T arg);
}
