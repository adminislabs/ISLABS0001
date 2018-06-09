package interfaceExample;

public class CDRom implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Playing CDRom");

	}

	@Override
	public void pause() {
		System.out.println("Pausing CDRom");

	}

}
