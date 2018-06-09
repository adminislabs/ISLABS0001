package com.learn.Interface;

public class WynkApp implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("the song played in wynkapp: delicate.mp3");
		
		
	}

	@Override
	public void pause() {
		System.out.println("the delicate song is being paused");
		
	}

}
