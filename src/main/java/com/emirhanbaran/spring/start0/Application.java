package com.emirhanbaran.spring.start0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	//Spring will do that for us --> BinarySearchImp binarySearch=new BinarySearchImp(new BubbleSortAlgorithm());
	
		ApplicationContext appCtx=SpringApplication.run(Application.class, args);
		BinarySearchImp binarySearch=appCtx.getBean(BinarySearchImp.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
		
	}

}
