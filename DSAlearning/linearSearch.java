package com.DSAlearning;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,5,2,6,7,8,3,2};
		System.out.println("Enter the element you want to search:");
		int ele = sc.nextInt();
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ele) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("The element is not found:");
		}else {
			System.out.println("The element is found at index:"+index);
	    }
	}

}
