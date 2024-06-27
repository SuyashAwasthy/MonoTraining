package com.techlabs.model;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void supportedFiles() {
	
		System.out.println("Audio supported files.");
		
	}

	@Override
	public void start() {

		System.out.println("Audio player started.");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Audio player stopped.");
		
	}

	
	
}
