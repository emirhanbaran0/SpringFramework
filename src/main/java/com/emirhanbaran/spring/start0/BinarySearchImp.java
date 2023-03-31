package com.emirhanbaran.spring.start0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	// 1)Bind with constructor
/*	public BinarySearchImp(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
*/
	
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}
																
	//2)Bind with setter
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	//Sorting an array
	//Search the array
	//Return the result

	public int binarySearch(int[] numbers, int numberToSearchFor) {
	
		int[]sortedNumbers=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//Searching the array		
		
				return 3;
	}

	
}
