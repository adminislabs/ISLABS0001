package learn.Interface;

public class CdRoom implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("the song is played from cdrom");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("the song is pause from cdrom");
		
	}

}