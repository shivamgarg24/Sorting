package com.test;

public class SelectionSort {
	
	public void Sort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min_index=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_index])
					min_index=j;
			
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
	
	public void printArray(int arr[]){
		int n=arr.length;
		System.out.println("Sorted Array");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int arr[]={23,54,76,24,65,98,12,4,8,49,99};
		SelectionSort ob=new SelectionSort();
		ob.Sort(arr);
		ob.printArray(arr);
	}

}