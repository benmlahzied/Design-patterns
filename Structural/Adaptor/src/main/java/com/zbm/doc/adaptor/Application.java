package com.zbm.doc.adaptor;
import java.util.Arrays;

public class Application {

	public static void main(String... args) {
		Integer[] numbers = new Integer[]{34, 2, 4, 12, 1};            
		Sorter sorter = new NumbersSorterAdapter();
		sorter.sort(numbers);
		System.out.println(String.format("Sorted array : %s", Arrays.toString(numbers)));
	}
}
