package com.techlabs.model;

public class VideoPlayer implements MediaPlayer{

	@Override
	public void supportedFiles() {
		
		System.out.println("Video supported files.");
		
	}

	@Override
	public void start() {
		
		System.out.println("Video player started.");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Video player stopped.");
		
	}

	
	
}
