package com.test;

public class BubbleSort {
	
	void bubbleSort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}
	
	void printlist(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		BubbleSort B=new BubbleSort();
		int arr[]={45,65,34,22,78,87,98,67};
		B.bubbleSort(arr);
		System.out.println("Sorted Array:");
		B.printlist(arr);
	}

}
