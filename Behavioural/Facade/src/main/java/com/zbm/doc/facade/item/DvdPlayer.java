package com.zbm.doc.facade.item;

public class DvdPlayer {

	public void on() {
		System.out.println("DvdPlayer on");
	}

	public void play(String movie) {
		System.out.println(String.format("DvdPlayer playing movie %s", movie));
	}

	public void stop() {
		System.out.println("DvdPlayer stopping");
	}

	public void eject() {
		System.out.println("DvdPlayer ejecting");
	}

	public void off() {
		System.out.println("DvdPlayer off");
	}

	@Override
	public String toString() {
		return "DvdPlayer [Samsung ...]";
	}
}