package interfaceExample;

public class DVD implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Playing DVD");

	}

	@Override
	public void pause() {
		System.out.println("Pausing DVD");

	}

}
