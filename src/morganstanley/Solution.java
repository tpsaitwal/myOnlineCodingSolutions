package morganstanley;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter array elements");
		for(int i =0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j< arr.length-i-1; j++) {
				//System.out.println("(arr["+i+"],arr["+j+"]) = ("+arr[i]+","+arr[j]+")");
				if(arr[j] > 0) {
				//	System.out.println("Swap (arr["+i+"],arr["+j+"]) = ("+arr[i]+","+arr[j]+")");
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
					break;
				}
			}
			
//			System.out.println("turn " + i);
//			for(int ele : arr) {
//				System.out.print(ele + " ");
//			}
		}
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
			

	}

}
