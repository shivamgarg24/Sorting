package com.test;

public class InsertionSort {
	
	public void Sort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public void printArray(int arr[]){
		int n=arr.length;
		System.out.println("Sorted Array");
		for(int i=0;i<n-1;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		InsertionSort ins=new InsertionSort();
		int arr[]={23,43,22,56,232,565,32,4,553};
		ins.Sort(arr);
		ins.printArray(arr);

}
}