package com.zbm.doc.facade;

import com.zbm.doc.facade.item.Amplifier;
import com.zbm.doc.facade.item.CdPlayer;
import com.zbm.doc.facade.item.DvdPlayer;
import com.zbm.doc.facade.item.PopcornPopper;
import com.zbm.doc.facade.item.Projector;
import com.zbm.doc.facade.item.Screen;
import com.zbm.doc.facade.item.TheaterLights;
import com.zbm.doc.facade.item.Tuner;

public class Application {

	public static void main(String[] args) {
		
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvdPlayer = new DvdPlayer();
		CdPlayer cpPlayer = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights theaterLights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();
		
		HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cpPlayer, projector,
				theaterLights, screen, popcornPopper);
		facade.watchMovie("Catch me if you can");
		
		System.out.println("\n");
		facade.endMovie();
	}
}