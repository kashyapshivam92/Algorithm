package com.sk.Algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SortingAlgorithmsTest {

	@Test
	void testBubbleSort() {

		SortingAlgorithms bSort = new SortingAlgorithms();
		int arr[] = { 30, 10, 50, 20, 60, 40 };
		int result[] = { 10, 20, 30, 40, 50, 60 };
		bSort.bubbleSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	void testSelectionSort() {
		SortingAlgorithms selectionSort = new SortingAlgorithms();
		int arr[] = { 30, 10, 50, 20, 60, 40 };
		int result[] = { 10, 20, 30, 40, 50, 60 };
		selectionSort.selectionSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	void testInsertionSort() {
		SortingAlgorithms insertionSort = new SortingAlgorithms();
		int arr[] = { 30, 10, 50, 20, 60, 40 };
		int result[] = { 10, 20, 30, 40, 50, 60 };
		insertionSort.insertionSort(arr);
		assertArrayEquals(result, arr);
	}
	@Test
	@Disabled
	void testBucketSort() {
		SortingAlgorithms bucketSort = new SortingAlgorithms();
		int arr[] = {30,50,80,64,75,102,1};
		int result[] = {1,30,50,64,75,80,102};
		bucketSort.bucketSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	void testMergeSort() {
		SortingAlgorithms sort = new SortingAlgorithms();
		int arr[] = {30,50,80,64,75,102,1};
		int result[] = {1,30,50,64,75,80,102};
		sort.mergeSort(arr);
		assertArrayEquals(result, arr);
	}
	@Test
	void testQuickSort() {
		SortingAlgorithms sort = new SortingAlgorithms();
		int arr[] = {30,50,80,64,75,102,1};
		int result[] = {1,30,50,64,75,80,102};
		sort.quickSort(arr,0,arr.length-1);
		assertArrayEquals(result, arr);
	}
	
	@Test
	void testHeapSort() {
		SortingAlgorithms sort = new SortingAlgorithms();
		int arr[] = {30,50,80,64,75,102,1};
		int result[] = {1,30,50,64,75,80,102};
		sort.heapSort(arr);
		assertArrayEquals(result, arr);
	}
	
	
	
	

}
