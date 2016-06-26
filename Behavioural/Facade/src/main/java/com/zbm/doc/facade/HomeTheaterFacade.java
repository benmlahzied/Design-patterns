package com.zbm.doc.facade;

import com.zbm.doc.facade.item.Amplifier;
import com.zbm.doc.facade.item.CdPlayer;
import com.zbm.doc.facade.item.DvdPlayer;
import com.zbm.doc.facade.item.PopcornPopper;
import com.zbm.doc.facade.item.Projector;
import com.zbm.doc.facade.item.Screen;
import com.zbm.doc.facade.item.TheaterLights;
import com.zbm.doc.facade.item.Tuner;

public class HomeTheaterFacade {
	
	/**
	 * Uses composition for the subsystem components to use.
	 */
	Amplifier amplifier;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cpPlayer;
	Projector projector;
	TheaterLights theaterLights;
	Screen screen;
	PopcornPopper popcornPopper;
	
	/**
	 * Injection of all subsystem components to use.
	 */
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cpPlayer,
			Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cpPlayer = cpPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popcornPopper = popcornPopper;
	}
	
	public void watchMovie(String movie) {
		System.out.println(String.format("Wathching movie %s ...", movie));
		popcornPopper.on();
		popcornPopper.pop();
		theaterLights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theator down...");
		popcornPopper.off();
		theaterLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
}