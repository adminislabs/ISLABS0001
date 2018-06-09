package com.learn.Interface;

public class Dvd implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("the song is play from dvds: badnam.mp3");
		
	}

	@Override
	public void pause() {
		System.out.println("the badnam song is put on pause:");
	}

	
}
