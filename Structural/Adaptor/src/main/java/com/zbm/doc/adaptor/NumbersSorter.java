package com.zbm.doc.adaptor;
import java.util.Collections;
import java.util.List;

/** 
 * Adapted class, implementation of a number sorter that deals with Lists, not arrays. 
**/
public class NumbersSorter {   
	
	public List<Integer> sort(List<Integer> numbers) {
		  Collections.sort(numbers);
	      return numbers;
	}
}
