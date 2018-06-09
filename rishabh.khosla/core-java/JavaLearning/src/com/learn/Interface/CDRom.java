package com.learn.Interface;

public class CDRom implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("the song played from Cdrom is :  Hawayein.mp3 ");
		
	}

	@Override
	public void pause() {
		System.out.println("The song Hawayein is being paused");
		
	}

}
