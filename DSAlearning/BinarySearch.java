package com.DSAlearning;

import java.util.Scanner;

public class BinarySearch {
	public static int BinarySearch(int[] arr, int target) {
		int low = 0, high = arr.length-1,mid=0;
		while(low <= high) {
			mid = low+(high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				low = mid+1;
			}else {
				low = mid -1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target element:");
		int target = sc.nextInt();
		int result = BinarySearch(arr,target);
		if(result == 0) {
			System.out.println("The target elementis not present in the array:");
		}else {
			System.out.println("The "+target+" number is found at index:"+result);
		}
		
	}

}
