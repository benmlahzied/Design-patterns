package com.zbm.doc.adaptor;

import java.util.Arrays;
import java.util.List;

public class NumbersSorterAdapter implements Sorter {   
	   
	public Integer[] sort(Integer[] numbersArray) {      
		List<Integer> numbersList = Arrays.asList(numbersArray);
		NumbersSorter sorter = new NumbersSorter();      
		numbersList = sorter.sort(numbersList);
		numbersList.toArray(numbersArray);
		return numbersArray;
	}
}
