package com.zbm.doc.decorator;

public abstract class ShapeDecorator implements Shape {

	/**
	 * Uses composition to hold an instance of the decorated object.
	 */
	protected Shape decoratedShape;

	/**
	 * Injection of decorated object.
	 */
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	/**
	 * Wrapping the method to be decorated.
	 */
	public void draw() {
		decoratedShape.draw();
	}
}