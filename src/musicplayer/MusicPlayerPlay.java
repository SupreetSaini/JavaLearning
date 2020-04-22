package musicplayer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.*;
import javazoom.jl.player.*;

public class MusicPlayerPlay {

	public static void main(String[] args) throws JavaLayerException {
		try {
		FileInputStream fileInputStream = new FileInputStream("Hss.mp3 ");
		Player player = new Player (fileInputStream);
		System.out.println("Song is Playing");
		player.play();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
