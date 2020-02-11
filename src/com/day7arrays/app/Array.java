package com.day7arrays.app;

import java.util.Arrays;
import java.util.Random;

public class Array 
{

	public static void main(String[] args) 
	{
		
		int[] array1 = new int[5];
		
		// Object for random numbers
		Random number = new Random(System.nanoTime());
		
		//Putting random numbers in my array
		for(int i=0;i<array1.length;i++)
		{
			array1[i] = number.nextInt(6);
		}
		
		// Printing the array
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]);
			System.out.print(" ");
		}
		
		//Printing the array backwards
		System.out.println(" ");
		for(int i=array1.length-1;i>=0;i--)
		{
			System.out.print(array1[i]);
			System.out.print(" ");
		}
	}

}
