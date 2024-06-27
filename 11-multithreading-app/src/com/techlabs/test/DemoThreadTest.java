package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.techlabs.model.NewTask;
import com.techlabs.model.Task;

public class DemoThreadTest {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(5);

		List<NewTask> tasks = new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		//System.out.println(service.invokeAny(tasks));
		
	}

}
