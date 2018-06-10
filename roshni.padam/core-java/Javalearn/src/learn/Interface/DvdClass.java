package learn.Interface;

public class DvdClass implements MediaPlayer{

	@Override
	public void play() {
		System.out.println("the song play from dvd");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("the song is paused from dvd");
		
	}

}
