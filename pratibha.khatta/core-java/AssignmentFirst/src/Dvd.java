public class Dvd implements MediaPlayer
{

	@Override
	public void play() 
	{
		System.out.println("Song will play");
	}

	@Override
	public void pause() 
	{
		System.out.println("Song will pause");
		
	}
   public static void main(String args[])
   {
	   Dvd song =new Dvd();
	   song.play();
	   song.pause();
   }
}
