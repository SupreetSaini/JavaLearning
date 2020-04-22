package musicplayer;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.*;
import javazoom.jl.player.*;
public class MusicPlayerMP3 {

	public static void main(String[] args) 
	{
		try {
		FileInputStream fileInputStream = new FileInputStream("ss.mp3");
		Player player = new Player(fileInputStream);
		player.play();
		System.out.println("song is playing");
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(JavaLayerException e) {
			e.printStackTrace();
		}
		
	}
	}


