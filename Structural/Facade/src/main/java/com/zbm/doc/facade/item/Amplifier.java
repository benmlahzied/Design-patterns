package com.zbm.doc.facade.item;

public class Amplifier {

	public void on() {
		System.out.println("Amplifier on");
	}

	public void setDvd(DvdPlayer dvdPlayer) {
		System.out.println(String.format("Amplifier setting dvd to %s", dvdPlayer));
	}

	public void setSurroundSound() {
		System.out.println("Amplifier surround sound on ");
	}

	public void setVolume(int volume) {
		System.out.println(String.format("Amplifier setting volume to %s", volume));
	}

	public void off() {
		System.out.println("Amplifier off");
	}
}