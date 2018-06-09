package interfaceExample;

public class WynkApp implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Playing WynkApp");

	}

	@Override
	public void pause() {
		System.out.println("Pausing WynkApp");

	}

}
