package gamecode;

import java.io.File;
import javax.sound.sampled.*;

public class Sound {
	
	public static void bulletHitSound(){
		
		try{
			
			File sound = new File("sounds//eatghost.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
		}
		catch(Exception e){
			
			
		}
		
		
	}
	

}
