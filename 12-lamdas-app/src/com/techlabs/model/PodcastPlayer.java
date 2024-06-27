package com.techlabs.model;

public class PodcastPlayer implements MediaPlayer{

	@Override
	public void supportedFiles() {
		System.out.println("Podcast supported files.");
		
	}

	@Override
	public void start() {

		System.out.println("Podcast player started.");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Podcast player stopped.");
		
	}

	
	
}
