package com.techlabs.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
	
		Consumer<Integer> consumer = (arg)-> System.out.println(arg);
		
		consumer.accept(50);
		
		BiConsumer<Integer, Integer> biConsumer=(number1, number2)-> System.out.println("Addition is: " + (number1+number2));
		
		biConsumer.accept(20, 50);

	}

}
